package com.github.alinenunes21.poo_2023_01.t19.restaurante;
class Mesa extends Pessoa {
    private int numero;
    private int capacidade;

    public Mesa(String nome, int numero, int capacidade) {
        super (nome);
        this.numero = numero;
        this.capacidade = capacidade;
    }
}
