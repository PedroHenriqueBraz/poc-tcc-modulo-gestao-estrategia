
package com.gsl.gestaoestrategia.client.response;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "valor",
    "data",
    "fornecedor_id"
})
public class PagamentoFornecedor implements Serializable
{

    @JsonProperty("valor")
    private BigDecimal valor;
    @JsonProperty("data")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate data;
    @JsonProperty("fornecedor_id")
    private Integer fornecedorId;
    private final static long serialVersionUID = 7091301350103199510L;

    @JsonProperty("valor")
    public BigDecimal getValor() {
        return valor;
    }

    @JsonProperty("valor")
    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    @JsonProperty("data")
    public LocalDate getData() {
        return data;
    }

    @JsonProperty("data")
    public void setData(LocalDate data) {
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
        if ((other instanceof PagamentoFornecedor) == false) {
            return false;
        }
        PagamentoFornecedor rhs = ((PagamentoFornecedor) other);
        return ((((this.valor == rhs.valor)||((this.valor!= null)&&this.valor.equals(rhs.valor)))&&((this.fornecedorId == rhs.fornecedorId)||((this.fornecedorId!= null)&&this.fornecedorId.equals(rhs.fornecedorId))))&&((this.data == rhs.data)||((this.data!= null)&&this.data.equals(rhs.data))));
    }

}
