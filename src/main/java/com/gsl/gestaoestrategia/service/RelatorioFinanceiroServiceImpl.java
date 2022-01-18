package com.gsl.gestaoestrategia.service;

import com.gsl.gestaoestrategia.client.SAFClient;
import com.gsl.gestaoestrategia.model.RelatorioFinanceiro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RelatorioFinanceiroServiceImpl implements RelatorioFinanceiroService {
    @Autowired
    private SAFClient safClient;

    public RelatorioFinanceiro gerarRelatorio(int mes){
        var balanco = safClient.obterBalancoMensal(mes);
        var relatorio = new RelatorioFinanceiro();
        relatorio.setReceitaLiquida(calcularReceitaLiquida(balanco));
        relatorio.setReceitaBruta(calcularReceitaBruta(balanco));
        relatorio.setFolhaPagamentoColaboradores(balanco.getFolhaPagamento().getValor());
        relatorio.setRecebimentoClientes(obterRecebimentos(balanco));
        relatorio.setPagamentos(obterPagamentos(balanco));
        return relatorio;
    }

    private BigDecimal calcularReceitaBruta(BalancoMensal balancoMensal){
        return balancoMensal.getRecebimentoClientes()
                .stream()
                .map(RecebimentoCliente::getValor)
                .reduce(BigDecimal.ZERO, (a,b) -> a.add(b));
    }

    private BigDecimal calcularReceitaLiquida(BalancoMensal balancoMensal){
        var bruto  = calcularReceitaBruta(balancoMensal);
        var somaSaidas = balancoMensal.getPagamentoFornecedores()
                .stream()
                .map(PagamentoFornecedor::getValor)
                .reduce(BigDecimal.ZERO, (a,b) -> a.add(b));
        return bruto.subtract(somaSaidas).subtract(balancoMensal.getFolhaPagamento().getValor());
    }

    private List<Recebimento> obterRecebimentos(BalancoMensal balancoMensal){
        var list = new ArrayList<Recebimento>();

        balancoMensal.getRecebimentoClientes().stream().forEach(recebimentoCliente -> {
            var item = new Recebimento();
            item.setNomeCliente("nome x");
            item.setValor(recebimentoCliente.getValor());
            list.add(item);
        });

        return list;
    }

    private List<Pagamento> obterPagamentos(BalancoMensal balancoMensal){
        var list = new ArrayList<Pagamento>();

        balancoMensal.getPagamentoFornecedores().stream().forEach(recebimentoCliente -> {
            var item = new Pagamento();
            item.setNomeFornecedor("nome y");
            item.setValor(recebimentoCliente.getValor());
            list.add(item);
        });

        return list;
    }
}
