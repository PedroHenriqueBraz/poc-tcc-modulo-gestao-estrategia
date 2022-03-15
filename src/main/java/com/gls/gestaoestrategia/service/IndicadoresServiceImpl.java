package com.gls.gestaoestrategia.service;

import com.gls.gestaoestrategia.httpclient.msc.MSCClient;
import com.gls.gestaoestrategia.httpclient.msc.model.Etapa;
import com.gls.gestaoestrategia.httpclient.msc.model.FluxoEntrega;
import com.gls.gestaoestrategia.httpclient.msc.model.StatusEtapa;
import com.gls.gestaoestrategia.model.IndicadoresDTO;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class IndicadoresServiceImpl implements IndicadoresService{

    private final MSCClient mscClient;

    public IndicadoresServiceImpl(MSCClient mscClient) {
        this.mscClient = mscClient;
    }

    @Override
    public IndicadoresDTO obterIndicadores() {
        var entregas = mscClient.obterEntregas();

        var indicadores = new IndicadoresDTO();
        indicadores.setPercentualCancelamento(obterPercentualCancelados(entregas));
        indicadores.setClienteRentavel(obterClienteMaisRentavel(entregas));

        return indicadores;
    }

    private BigDecimal obterPercentualCancelados(List<FluxoEntrega> entregas){
        var total = entregas.stream().count();

        var canceladas = entregas.stream().map(e -> e.getEtapas().stream().filter(e1 -> e1.getStatusEtapa().getId() == 4).count())
                .reduce(0L, (x,y) -> x + y).floatValue();

        return new BigDecimal (canceladas /(double) total);
    }

    private Map.Entry<Integer, Double> obterClienteMaisRentavel(List<FluxoEntrega> entregas){
        var teste = obterEntregasCanceladas(entregas);

        var cliente = entregas.stream()
                .filter(e -> !obterEntregasCanceladas(entregas).contains(e.getId()))
                .collect(Collectors.groupingBy(cli -> cli.getClienteId(),
                        Collectors.summingDouble(cli->cli.getValorFrete().doubleValue())));
        var max = cliente.entrySet().stream().max(Map.Entry.comparingByValue()).get();
        return max;
    }

    private List<Integer> obterEntregasCanceladas(List<FluxoEntrega> entregas){
        var idList = new ArrayList<Integer>();
        for (var e:entregas){
            if (e.getEtapas().stream().anyMatch(et -> et.getStatusEtapa().getId() == 4)){
                idList.add(e.getId());
            }
        }
        return idList;
    }
}
