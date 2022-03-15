package com.gls.gestaoestrategia.controller;

import com.gls.gestaoestrategia.model.IndicadoresDTO;
import com.gls.gestaoestrategia.model.RelatorioFinanceiro;
import com.gls.gestaoestrategia.service.IndicadoresService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/indicadores")
public class IndicadoresController {

    private final IndicadoresService indicadoresService;

    public IndicadoresController(IndicadoresService indicadoresService) {
        this.indicadoresService = indicadoresService;
    }

    @GetMapping
    public ResponseEntity<IndicadoresDTO> obterIndicadores(){
        return ResponseEntity.ok(indicadoresService.obterIndicadores());
    }
}
