package com.github.alinenunes21.poo_2023_01.t19.pessoa;
class Cliente extends Pessoa {
    private int idade;

    // Construtor
    public Cliente(String nome, int idade) {
        super (nome);
        this.idade = idade;
    }
}