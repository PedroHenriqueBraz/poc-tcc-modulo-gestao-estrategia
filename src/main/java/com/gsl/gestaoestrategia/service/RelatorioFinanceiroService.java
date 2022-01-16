package com.gsl.gestaoestrategia.service;

import com.gsl.gestaoestrategia.model.RelatorioFinanceiro;

public interface RelatorioFinanceiroService {
    RelatorioFinanceiro gerarRelatorio(int mes);
}
