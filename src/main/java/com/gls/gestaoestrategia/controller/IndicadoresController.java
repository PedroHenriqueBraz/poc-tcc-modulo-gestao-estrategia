package com.gls.gestaoestrategia.controller;

import com.gls.gestaoestrategia.model.IndicadoresDTO;
import com.gls.gestaoestrategia.service.IndicadoresService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/evict")
    public ResponseEntity<String> cacheEvictEntregas(){
        indicadoresService.cacheEvict();
        return ResponseEntity.ok("ok");
    }
}
