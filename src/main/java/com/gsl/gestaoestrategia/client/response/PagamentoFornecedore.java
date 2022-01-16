
package com.gsl.gestaoestrategia.client.response;

import java.io.Serializable;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "valor",
    "data",
    "fornecedor_id"
})
@Generated("jsonschema2pojo")
public class PagamentoFornecedore implements Serializable
{

    @JsonProperty("valor")
    private Double valor;
    @JsonProperty("data")
    private String data;
    @JsonProperty("fornecedor_id")
    private Integer fornecedorId;
    private final static long serialVersionUID = 7091301350103199510L;

    @JsonProperty("valor")
    public Double getValor() {
        return valor;
    }

    @JsonProperty("valor")
    public void setValor(Double valor) {
        this.valor = valor;
    }

    @JsonProperty("data")
    public String getData() {
        return data;
    }

    @JsonProperty("data")
    public void setData(String data) {
        this.data = data;
    }

    @JsonProperty("fornecedor_id")
    public Integer getFornecedorId() {
        return fornecedorId;
    }

    @JsonProperty("fornecedor_id")
    public void setFornecedorId(Integer fornecedorId) {
        this.fornecedorId = fornecedorId;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.valor == null)? 0 :this.valor.hashCode()));
        result = ((result* 31)+((this.fornecedorId == null)? 0 :this.fornecedorId.hashCode()));
        result = ((result* 31)+((this.data == null)? 0 :this.data.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PagamentoFornecedore) == false) {
            return false;
        }
        PagamentoFornecedore rhs = ((PagamentoFornecedore) other);
        return ((((this.valor == rhs.valor)||((this.valor!= null)&&this.valor.equals(rhs.valor)))&&((this.fornecedorId == rhs.fornecedorId)||((this.fornecedorId!= null)&&this.fornecedorId.equals(rhs.fornecedorId))))&&((this.data == rhs.data)||((this.data!= null)&&this.data.equals(rhs.data))));
    }

}
