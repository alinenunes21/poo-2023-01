package com.github.alinenunes21.t21;

public class Cliente extends Pessoa {
    private Mesa mesa;
    private Pedido pedido;

    public Cliente(String nome, Mesa mesa) {
        super(nome);
        this.mesa = mesa;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
}


