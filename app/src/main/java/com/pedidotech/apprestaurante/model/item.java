package com.pedidotech.apprestaurante.model;

public class item {
    private int id;
    private float quantidade;
    private float preco;
    private int codPedido;
    private int codProduto;

    public item(){

    }

    public item(int id, float quantidade, float preco, int codPedido, int codProduto) {
        this.id = id;
        this.quantidade = quantidade;
        this.preco = preco;
        this.codPedido = codPedido;
        this.codProduto = codProduto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(float quantidade) {
        this.quantidade = quantidade;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getCodPedido() {
        return codPedido;
    }

    public void setCodPedido(int codPedido) {
        this.codPedido = codPedido;
    }

    public int getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }
}
