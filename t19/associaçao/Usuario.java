package com.github.alinenunes21.poo_2023_01.t19.associaçao;

public class Usuario extends Atividade {

    private Atividade atividade;

    public Usuario(String nome) {
        super(nome);
    }

    public Atividade getAtividade() {
        return atividade;
    }

    public void setAtividade(Atividade atividade) {
        this.atividade = atividade;
    }
}
