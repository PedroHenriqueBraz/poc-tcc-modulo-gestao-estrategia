package com.gsl.gestaoestrategia.service;

import com.gsl.gestaoestrategia.client.SAFClient;
import com.gsl.gestaoestrategia.model.RelatorioFinanceiro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RelatorioFinanceiroServiceImpl implements RelatorioFinanceiroService {
    @Autowired
    private SAFClient safClient;

    public RelatorioFinanceiro gerarRelatorio(int mes){
        return new RelatorioFinanceiro();
    }
}
