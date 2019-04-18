package com.pedidotech.apprestaurante.model;

import java.sql.Time;
import java.time.DateTimeException;
import java.util.Date;

public class Pedido {
    private int id;
    private Time hora;
    private String mesa;
    private int Status;

    public Pedido(int id, Time hora, String mesa, int status) {
        this.id = id;
        this.hora = hora;
        this.mesa = mesa;
        Status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public String getMesa() {
        return mesa;
    }

    public void setMesa(String mesa) {
        this.mesa = mesa;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int status) {
        Status = status;
    }
}
