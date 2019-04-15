package com.pedidotech.apprestaurante.model;

public class Config {
    private String mesa;
    private String senha;

    public Config(String mesa, String senha) {
        this.mesa = mesa;
        this.senha = senha;
    }

    public String getMesa() {
        return mesa;
    }

    public void setMesa(String mesa) {
        this.mesa = mesa;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
