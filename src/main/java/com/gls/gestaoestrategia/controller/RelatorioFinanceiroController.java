package com.gls.gestaoestrategia.controller;

import com.gls.gestaoestrategia.model.RelatorioFinanceiro;
import com.gls.gestaoestrategia.service.RelatorioFinanceiroService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/relatorio/financeiro")
public class RelatorioFinanceiroController {

    private final RelatorioFinanceiroService relatorioService;

    public RelatorioFinanceiroController(RelatorioFinanceiroService relatorioService) {
        this.relatorioService = relatorioService;
    }

    @GetMapping(value = "/{mes}")
    public ResponseEntity<RelatorioFinanceiro> obterRelatorio(@PathVariable("mes") int mes){
        var relatorio = relatorioService.gerarRelatorio(mes);
        return ResponseEntity.ok(relatorio);
    }
}
