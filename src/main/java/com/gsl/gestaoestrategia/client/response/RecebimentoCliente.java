
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
    "cliente_id"
})
@Generated("jsonschema2pojo")
public class RecebimentoCliente implements Serializable
{

    @JsonProperty("valor")
    private Double valor;
    @JsonProperty("data")
    private String data;
    @JsonProperty("cliente_id")
    private Integer clienteId;
    private final static long serialVersionUID = 1953152984736597419L;

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

    @JsonProperty("cliente_id")
    public Integer getClienteId() {
        return clienteId;
    }

    @JsonProperty("cliente_id")
    public void setClienteId(Integer clienteId) {
        this.clienteId = clienteId;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.valor == null)? 0 :this.valor.hashCode()));
        result = ((result* 31)+((this.data == null)? 0 :this.data.hashCode()));
        result = ((result* 31)+((this.clienteId == null)? 0 :this.clienteId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RecebimentoCliente) == false) {
            return false;
        }
        RecebimentoCliente rhs = ((RecebimentoCliente) other);
        return ((((this.valor == rhs.valor)||((this.valor!= null)&&this.valor.equals(rhs.valor)))&&((this.data == rhs.data)||((this.data!= null)&&this.data.equals(rhs.data))))&&((this.clienteId == rhs.clienteId)||((this.clienteId!= null)&&this.clienteId.equals(rhs.clienteId))));
    }

}
