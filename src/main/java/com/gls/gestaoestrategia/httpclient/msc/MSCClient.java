package com.gls.gestaoestrategia.httpclient.msc;

import com.gls.gestaoestrategia.httpclient.msc.model.FluxoEntrega;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@FeignClient(name = "MSC", url = "${servicos.msc.url}")
public interface MSCClient {

    @RequestMapping(method = RequestMethod.GET,  value = "/fluxoentrega")
    @CircuitBreaker(name = "entregas", fallbackMethod = "fallback")
    @Cacheable("entregas")
    List<FluxoEntrega> obterEntregas();

    default List<FluxoEntrega>fallback(Throwable throwable) {
        return new ArrayList<FluxoEntrega>();
    }
}
