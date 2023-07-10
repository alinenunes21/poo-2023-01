package com.github.alinenunes21.poo_2023_01.t08;
import java.util.ArrayList;
import java.util.List;
class Texto {
    private List<Paragrafo> paragrafos;

    public Texto() {
        paragrafos = new ArrayList<>();
    }

    public void adicionarParagrafo(Paragrafo paragrafo) {
        paragrafos.add(paragrafo);
    }

    public List<Paragrafo> getParagrafos() {
        return paragrafos;
    }
}

