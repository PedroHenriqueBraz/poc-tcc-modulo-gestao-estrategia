package com.gls.gestaoestrategia.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class IndicadoresDTO {
    private Map.Entry<Integer, Double> clienteRentavel;
    private BigDecimal percentualCancelamento;
}
