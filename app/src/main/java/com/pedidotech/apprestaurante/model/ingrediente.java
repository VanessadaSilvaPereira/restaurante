package com.pedidotech.apprestaurante.model;

public class ingrediente{
    private int id;
    private String nome;

    public ingrediente() {
    }

    public ingrediente(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
