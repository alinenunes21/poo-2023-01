package com.github.alinenunes21.poo_2023_01.t19.pessoa;
import java.util.ArrayList;
import java.util.List;

class Fila {
    private List <Cliente> clientes;
    public Fila() {
        this.clientes = new ArrayList <> ( );
    }

    public void adicionarCliente(Cliente cliente) {
        clientes.add (cliente);
    }

    public void removerCliente(Cliente cliente) {
        clientes.remove (cliente);
    }
}