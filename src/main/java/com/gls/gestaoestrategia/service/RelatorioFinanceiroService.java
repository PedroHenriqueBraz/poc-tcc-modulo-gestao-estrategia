package com.gls.gestaoestrategia.service;

import com.gls.gestaoestrategia.model.RelatorioFinanceiro;

public interface RelatorioFinanceiroService {
    RelatorioFinanceiro gerarRelatorio(int mes);
}
