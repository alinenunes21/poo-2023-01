package com.github.alinenunes21.poo_2023_01.t19.computador;

public class Estudante {
    private String nome;
    private Computador computadorUFG;
    private Computador computadorForaUFG;

    public Estudante(String nome, Computador computadorUFG, Computador computadorForaUFG) {
        this.nome = nome;
        this.computadorUFG = computadorUFG;
        this.computadorForaUFG = computadorForaUFG;
    }

    public Computador getComputadorUFG() {
        return computadorUFG;
    }

    public void setComputadorUFG(Computador computadorUFG) {
        this.computadorUFG = computadorUFG;
    }

    // Getter e Setter do computador fora da UFG
    public Computador getComputadorForaUFG() {
        return computadorForaUFG;
    }
    public void setComputadorForaUFG(Computador computadorForaUFG) {
        this.computadorForaUFG = computadorForaUFG;
    }
}