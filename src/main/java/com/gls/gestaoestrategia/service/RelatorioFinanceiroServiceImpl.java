package com.gls.gestaoestrategia.service;

import com.gls.gestaoestrategia.httpclient.mic.MICClient;
import com.gls.gestaoestrategia.mock.SAF.Entrada;
import com.gls.gestaoestrategia.mock.SAF.Saida;
import com.gls.gestaoestrategia.mock.SAF.repository.EntradaRepository;
import com.gls.gestaoestrategia.mock.SAF.repository.FolhaPagamentoRepository;
import com.gls.gestaoestrategia.mock.SAF.repository.SaidaRepository;
import com.gls.gestaoestrategia.model.EntradaDTO;
import com.gls.gestaoestrategia.model.RelatorioFinanceiro;
import com.gls.gestaoestrategia.model.SaidaDTO;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class RelatorioFinanceiroServiceImpl implements RelatorioFinanceiroService{
    private final EntradaRepository entradaRepository;
    private final SaidaRepository saidaRepository;
    private final FolhaPagamentoRepository folhaPagamentoRepository;
    private final MICClient micClient;

    public RelatorioFinanceiroServiceImpl(EntradaRepository entradaRepository, SaidaRepository saidaRepository, FolhaPagamentoRepository folhaPagamentoRepository, MICClient micClient) {
        this.entradaRepository = entradaRepository;
        this.saidaRepository = saidaRepository;
        this.folhaPagamentoRepository = folhaPagamentoRepository;
        this.micClient = micClient;
    }

    @Override
    public RelatorioFinanceiro gerarRelatorio(int mes) {
        var folhas = folhaPagamentoRepository.findAll();

        var relatorio = new RelatorioFinanceiro();
        relatorio.setEntradas(obterEntradas(mes));
        relatorio.setSaidas(obterSaidas(mes));
        relatorio.setFolhaPagamentoColaboradores(folhas.stream().filter(f -> f.getData().getMonthValue() == mes).findFirst().get().getValor());
        relatorio.setReceitaBruta(calcularReceitaBruta(relatorio));
        relatorio.setReceitaLiquida(calcularReceitaLiquida(relatorio));
        return relatorio;
    }

    private List<EntradaDTO> obterEntradas(int mes){
        var entradas = entradaRepository.findAll();
        return entradas.stream()
                .filter(entrada -> entrada.getData().getMonthValue() == mes)
                .map(this::EntradaToEntradaDTO).toList();
    }

    private List<SaidaDTO> obterSaidas(int mes){
        var saidas = saidaRepository.findAll();
        return saidas.stream()
                .filter(saida -> saida.getData().getMonthValue() == mes)
                .map(this::SaidaToSaidaDTO).toList();
    }

    private BigDecimal calcularReceitaBruta(RelatorioFinanceiro relatorio){
        return relatorio.getEntradas()
                .stream()
                .map(e -> e.getValor())
                .reduce(BigDecimal.ZERO, (a,b) -> a.add(b));
    }

    private BigDecimal calcularReceitaLiquida(RelatorioFinanceiro relatorio){
        var bruto  = relatorio.getReceitaBruta();
        var somaSaidas = relatorio.getSaidas()
                .stream()
                .map(s -> s.getValor())
                .reduce(BigDecimal.ZERO, (a,b) -> a.add(b));
        return bruto.subtract(somaSaidas).subtract(relatorio.getFolhaPagamentoColaboradores());
    }


    private EntradaDTO EntradaToEntradaDTO(Entrada e) {
        var entrada = new EntradaDTO();
        entrada.setData(e.getData());
        entrada.setValor(e.getValor());
        entrada.setNomeCliente(micClient.obterClientePorId(e.getClienteId().intValue()).getNomeCliente());
        return entrada;
    }

    private SaidaDTO SaidaToSaidaDTO(Saida e) {
        var saida = new SaidaDTO();
        saida.setData(e.getData());
        saida.setValor(e.getValor());
        saida.setNomeFornecedor(micClient.obterFornecedorPorId(e.getFornecedorId().intValue()).getNomeFornecedor());
        return saida;
    }
}
