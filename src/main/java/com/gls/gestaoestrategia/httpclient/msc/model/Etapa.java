package com.gls.gestaoestrategia.httpclient.msc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Etapa {
    private Integer id;
    private TipoEtapa tipoEtapa;
    private StatusEtapa statusEtapa;
    private LocalDateTime iniciadaEm;
    private LocalDateTime finalizadaEm;
}
