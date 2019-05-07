package com.pedidotech.apprestaurante.model;

public class Config {
    private String numeroMesa;
    private String senha;

    public Config() {
    }

    public Config(String numeroMesa, String senha) {
        this.numeroMesa = numeroMesa;
        this.senha = senha;
    }

    public String getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(String numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
