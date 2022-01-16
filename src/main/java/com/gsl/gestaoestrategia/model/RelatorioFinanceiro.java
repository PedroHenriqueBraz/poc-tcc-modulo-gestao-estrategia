
package com.gsl.gestaoestrategia.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "receita_bruta",
    "receita_liquida",
    "recebimento_clientes",
    "pagamento_fornecedores",
    "folha_pagamento_colaboradores"
})
public class RelatorioFinanceiro implements Serializable
{

    @JsonProperty("receita_bruta")
    private BigDecimal receitaBruta;
    @JsonProperty("receita_liquida")
    private BigDecimal receitaLiquida;
    @JsonProperty("recebimento_clientes")
    private List<RecebimentoCliente> recebimentoClientes = null;
    @JsonProperty("pagamento_fornecedores")
    private List<PagamentoFornecedor> pagamentoFornecedores = null;
    @JsonProperty("folha_pagamento_colaboradores")
    private BigDecimal folhaPagamentoColaboradores;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -3761484613333891959L;

    @JsonProperty("receita_bruta")
    public BigDecimal getReceitaBruta() {
        return receitaBruta;
    }

    @JsonProperty("receita_bruta")
    public void setReceitaBruta(BigDecimal receitaBruta) {
        this.receitaBruta = receitaBruta;
    }

    @JsonProperty("receita_liquida")
    public BigDecimal getReceitaLiquida() {
        return receitaLiquida;
    }

    @JsonProperty("receita_liquida")
    public void setReceitaLiquida(BigDecimal receitaLiquida) {
        this.receitaLiquida = receitaLiquida;
    }

    @JsonProperty("recebimento_clientes")
    public List<RecebimentoCliente> getRecebimentoClientes() {
        return recebimentoClientes;
    }

    @JsonProperty("recebimento_clientes")
    public void setRecebimentoClientes(List<RecebimentoCliente> recebimentoClientes) {
        this.recebimentoClientes = recebimentoClientes;
    }

    @JsonProperty("pagamento_fornecedores")
    public List<PagamentoFornecedor> getPagamentoFornecedores() {
        return pagamentoFornecedores;
    }

    @JsonProperty("pagamento_fornecedores")
    public void setPagamentoFornecedores(List<PagamentoFornecedor> pagamentoFornecedores) {
        this.pagamentoFornecedores = pagamentoFornecedores;
    }

    @JsonProperty("folha_pagamento_colaboradores")
    public BigDecimal getFolhaPagamentoColaboradores() {
        return folhaPagamentoColaboradores;
    }

    @JsonProperty("folha_pagamento_colaboradores")
    public void setFolhaPagamentoColaboradores(BigDecimal folhaPagamentoColaboradores) {
        this.folhaPagamentoColaboradores = folhaPagamentoColaboradores;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.folhaPagamentoColaboradores == null)? 0 :this.folhaPagamentoColaboradores.hashCode()));
        result = ((result* 31)+((this.pagamentoFornecedores == null)? 0 :this.pagamentoFornecedores.hashCode()));
        result = ((result* 31)+((this.recebimentoClientes == null)? 0 :this.recebimentoClientes.hashCode()));
        result = ((result* 31)+((this.receitaLiquida == null)? 0 :this.receitaLiquida.hashCode()));
        result = ((result* 31)+((this.receitaBruta == null)? 0 :this.receitaBruta.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RelatorioFinanceiro) == false) {
            return false;
        }
        RelatorioFinanceiro rhs = ((RelatorioFinanceiro) other);
        return (((((((this.folhaPagamentoColaboradores == rhs.folhaPagamentoColaboradores)||((this.folhaPagamentoColaboradores!= null)&&this.folhaPagamentoColaboradores.equals(rhs.folhaPagamentoColaboradores)))&&((this.pagamentoFornecedores == rhs.pagamentoFornecedores)||((this.pagamentoFornecedores!= null)&&this.pagamentoFornecedores.equals(rhs.pagamentoFornecedores))))&&((this.recebimentoClientes == rhs.recebimentoClientes)||((this.recebimentoClientes!= null)&&this.recebimentoClientes.equals(rhs.recebimentoClientes))))&&((this.receitaLiquida == rhs.receitaLiquida)||((this.receitaLiquida!= null)&&this.receitaLiquida.equals(rhs.receitaLiquida))))&&((this.receitaBruta == rhs.receitaBruta)||((this.receitaBruta!= null)&&this.receitaBruta.equals(rhs.receitaBruta))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
