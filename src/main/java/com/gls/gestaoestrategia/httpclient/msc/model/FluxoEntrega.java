package com.gls.gestaoestrategia.httpclient.msc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FluxoEntrega {
    private Integer id;
    private Integer clienteId;
    private Integer mercadoriaId;
    private BigDecimal valorFrete;
    private LocalDate dataPrevisao;
    private LocalDate dataEntrega;
    private List<Etapa> etapas;
}
