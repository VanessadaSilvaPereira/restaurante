package com.pedidotech.apprestaurante.model;

import java.sql.Time;
import java.util.Date;

public class Pedido {
    private int id;
    private String mesa;
    private Date data;
    private Time hora;
    private Produto produto;

    public Pedido(int id, String mesa, Date data, Time hora, Produto produto) {
        this.id = id;
        this.mesa = mesa;
        this.data = data;
        this.hora = hora;
        this.produto = produto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMesa() {
        return mesa;
    }

    public void setMesa(String mesa) {
        this.mesa = mesa;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}
