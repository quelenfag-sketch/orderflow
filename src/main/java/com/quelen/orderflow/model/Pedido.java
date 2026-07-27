package com.quelen.orderflow.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.math.BigDecimal;

@Entity
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cliente;
    private String descricao;
    private BigDecimal valor;

    public Pedido() {}

    public Pedido(String cliente, String descricao, BigDecimal valor) {
        this.cliente = cliente;
        this.descricao = descricao;
        this.valor = valor;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getCliente() { return cliente; }
    public void setCliente(String cliente) { this.cliente = cliente; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public BigDecimal getValor() { return valor; }
    public void setValor(BigDecimal valor) { this.valor = valor; }
}