
package com.gsl.gestaoestrategia.client.response;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "valor",
    "data"
})
public class FolhaPagamento implements Serializable
{

    @JsonProperty("valor")
    private BigDecimal valor;
    @JsonProperty("data")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate data;
    private final static long serialVersionUID = -369011451907654065L;

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

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.valor == null)? 0 :this.valor.hashCode()));
        result = ((result* 31)+((this.data == null)? 0 :this.data.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FolhaPagamento) == false) {
            return false;
        }
        FolhaPagamento rhs = ((FolhaPagamento) other);
        return (((this.valor == rhs.valor)||((this.valor!= null)&&this.valor.equals(rhs.valor)))&&((this.data == rhs.data)||((this.data!= null)&&this.data.equals(rhs.data))));
    }

}
