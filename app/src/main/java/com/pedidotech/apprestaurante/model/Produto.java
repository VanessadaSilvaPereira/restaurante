package com.pedidotech.apprestaurante.model;

public class Produto {
    private int id;
    private String nome;
    private Float preco;
    private String descrição;
    private String foto;
    //rever se ingrediente e categorias sao int ou String;
    private int ingredientes;
    private int categoria;

    public Produto(int id, String foto, String nome, Float preco, String descrição, int ingredientes, int categoria) {
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

    public int getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(int ingredientes) {
        this.ingredientes = ingredientes;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }
}
