package com.gls.gestaoestrategia.httpclient.mic.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {
    private String nomeCliente;
    private String cnpj;
}
