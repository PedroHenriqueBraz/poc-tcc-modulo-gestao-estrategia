package com.gls.gestaoestrategia.httpclient.mic;

import com.gls.gestaoestrategia.httpclient.mic.model.Cliente;
import com.gls.gestaoestrategia.httpclient.mic.model.Fornecedor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name = "MIC", url = "${servicos.mic.url}")
public interface MICClient {
    @RequestMapping(method = RequestMethod.GET,  value = "/cliente")
    List<Cliente> obterClientes();

    @RequestMapping(method = RequestMethod.GET,  value = "/fornecedor")
    List<Fornecedor> obterFornecedores();

    @RequestMapping(method = RequestMethod.GET,  value = "/cliente/{id}")
    @Cacheable("clientes")
    Cliente obterClientePorId(@PathVariable("id") int id);

    @RequestMapping(method = RequestMethod.GET,  value = "/fornecedor/{id}")
    @Cacheable("fornecedores")
    Fornecedor obterFornecedorPorId(@PathVariable("id") int id);

    @RequestMapping(method = RequestMethod.GET,  value = "/actuator/health")
    void health();
}
