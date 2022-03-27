package com.gls.gestaoestrategia.httpclient.msc;

import com.gls.gestaoestrategia.httpclient.msc.model.FluxoEntrega;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name = "MSC", url = "${servicos.msc.url}")
public interface MSCClient {

    @RequestMapping(method = RequestMethod.GET,  value = "/fluxoentrega")
    List<FluxoEntrega> obterEntregas();
}
