package com.github.alinenunes21.poo_2023_01.t19.cartas;

import java.util.List;

public class Carta {
    private String valor;
    private String naipe;
    private ConfiguracaoCartas configuracao;

    public Carta(ConfiguracaoCartas configuracao) {
        this.configuracao = configuracao;
    }
}