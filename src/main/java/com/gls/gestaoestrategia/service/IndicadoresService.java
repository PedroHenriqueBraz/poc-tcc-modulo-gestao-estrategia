package com.gls.gestaoestrategia.service;

import com.gls.gestaoestrategia.model.IndicadoresDTO;

public interface IndicadoresService {
    IndicadoresDTO obterIndicadores();
    void cacheEvict();
}
