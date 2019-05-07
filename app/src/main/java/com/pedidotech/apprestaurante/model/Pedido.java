package com.pedidotech.apprestaurante.model;

import java.sql.Time;
import java.time.DateTimeException;
import java.util.Date;

public class Pedido {
/*constantes para o status dos pedidos*/
    public static final int REALIZADO = 1;
    public static final int EM_PRODUCAO = 2;
    public static final int PRONTO = 3;
    public static final int ENTREGUE = 4;
    public static final int PAGO = 5;

    private int id;
    private Time hora;
    private String mesa;
    private int Status;

    public Pedido(){

    }

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
