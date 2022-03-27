package com.gls.gestaoestrategia.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EntradaDTO implements Serializable {
    @Serial
    private final static long serialVersionUID = 1026630061402273745L;
    private String nomeCliente;
    private BigDecimal valor;
    private LocalDate data;
}
