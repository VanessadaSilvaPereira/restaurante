package com.pedidotech.apprestaurante.model;

public class Produto {
    private int id;
    private String nome;
    private Float preco;
    private String descrição;
    private String foto;
    private String ingredientes;
    private String categoria;

    public Produto(int id, String foto, String nome, Float preco, String descrição, String ingredientes, String categoria) {
        this.id = id;
        this.foto = foto;
        this.nome = nome;
        this.preco = preco;
        this.descrição = descrição;
        this.ingredientes = ingredientes;
        this.categoria = categoria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Float getPreco() {
        return preco;
    }

    public void setPreco(Float preco) {
        this.preco = preco;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
