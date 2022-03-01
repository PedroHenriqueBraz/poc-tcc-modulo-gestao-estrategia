package com.gls.gestaoestrategia.model;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Data
public class RelatorioFinanceiro implements Serializable {
    @Serial
    private final static long serialVersionUID = 1223203689505396649L;
    private BigDecimal receitaBruta;
    private BigDecimal receitaLiquida;
    private BigDecimal folhaPagamentoColaboradores;
    private List<EntradaDTO> entradas;
    private List<SaidaDTO> saidas;
}
