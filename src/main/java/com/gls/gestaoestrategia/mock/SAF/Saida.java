package com.gls.gestaoestrategia.mock.SAF;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name="saida")
public class Saida {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "saida_id", nullable = false)
    private Long id;

    @Column(name = "valor")
    private BigDecimal valor;

    @Column(name = "data")
    private LocalDate data;

    @Column(name = "fornecedor_id")
    private Long fornecedorId;

    public Saida() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Long getFornecedorId() {
        return fornecedorId;
    }

    public void setFornecedorId(Long fornecedorId) {
        this.fornecedorId = fornecedorId;
    }
}
