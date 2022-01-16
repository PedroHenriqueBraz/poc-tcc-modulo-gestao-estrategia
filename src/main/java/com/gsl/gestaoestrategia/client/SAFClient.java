package com.gsl.gestaoestrategia.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.gsl.gestaoestrategia.client.response.*;

@FeignClient(name = "SAF", url = "${servicos.saf.url}")
public interface SAFClient {

    @RequestMapping(method = RequestMethod.GET,  value = "/relatorio/mes/{mes}")
    BalancoMensal obterBalancoMensal(@PathVariable("mes") int mes);
}
