package com.gsl.gestaoestrategia.controller;

import com.gsl.gestaoestrategia.model.RelatorioFinanceiro;
import com.gsl.gestaoestrategia.service.RelatorioFinanceiroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/relatorio/financeiro")
public class RelatorioFinanceiroController {

   @Autowired
   private RelatorioFinanceiroService relatorioService;

    @GetMapping(value = "/{mes}")
    public ResponseEntity<RelatorioFinanceiro> obterRelatorio(@PathVariable("mes") int mes){
        var relatorio = relatorioService.gerarRelatorio(mes);
        return ResponseEntity.ok(relatorio);
    }
}
