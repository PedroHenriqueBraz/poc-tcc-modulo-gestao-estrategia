
package com.gsl.gestaoestrategia.client.response;

import java.io.Serializable;
import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "recebimento_clientes",
    "pagamento_fornecedores",
    "folha_pagamento"
})
@Generated("jsonschema2pojo")
public class BalancoMensal implements Serializable
{

    @JsonProperty("recebimento_clientes")
    private List<RecebimentoCliente> recebimentoClientes = null;
    @JsonProperty("pagamento_fornecedores")
    private List<PagamentoFornecedore> pagamentoFornecedores = null;
    @JsonProperty("folha_pagamento")
    private FolhaPagamento folhaPagamento;
    private final static long serialVersionUID = -4513043616467223484L;

    @JsonProperty("recebimento_clientes")
    public List<RecebimentoCliente> getRecebimentoClientes() {
        return recebimentoClientes;
    }

    @JsonProperty("recebimento_clientes")
    public void setRecebimentoClientes(List<RecebimentoCliente> recebimentoClientes) {
        this.recebimentoClientes = recebimentoClientes;
    }

    @JsonProperty("pagamento_fornecedores")
    public List<PagamentoFornecedore> getPagamentoFornecedores() {
        return pagamentoFornecedores;
    }

    @JsonProperty("pagamento_fornecedores")
    public void setPagamentoFornecedores(List<PagamentoFornecedore> pagamentoFornecedores) {
        this.pagamentoFornecedores = pagamentoFornecedores;
    }

    @JsonProperty("folha_pagamento")
    public FolhaPagamento getFolhaPagamento() {
        return folhaPagamento;
    }

    @JsonProperty("folha_pagamento")
    public void setFolhaPagamento(FolhaPagamento folhaPagamento) {
        this.folhaPagamento = folhaPagamento;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.folhaPagamento == null)? 0 :this.folhaPagamento.hashCode()));
        result = ((result* 31)+((this.pagamentoFornecedores == null)? 0 :this.pagamentoFornecedores.hashCode()));
        result = ((result* 31)+((this.recebimentoClientes == null)? 0 :this.recebimentoClientes.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BalancoMensal) == false) {
            return false;
        }
        BalancoMensal rhs = ((BalancoMensal) other);
        return ((((this.folhaPagamento == rhs.folhaPagamento)||((this.folhaPagamento!= null)&&this.folhaPagamento.equals(rhs.folhaPagamento)))&&((this.pagamentoFornecedores == rhs.pagamentoFornecedores)||((this.pagamentoFornecedores!= null)&&this.pagamentoFornecedores.equals(rhs.pagamentoFornecedores))))&&((this.recebimentoClientes == rhs.recebimentoClientes)||((this.recebimentoClientes!= null)&&this.recebimentoClientes.equals(rhs.recebimentoClientes))));
    }

}
