package com.github.alinenunes21.poo_2023_01.t11;
import java.util.List;
import java.util.ArrayList;

    public class Frase {
        private String[] palavras;

        public Frase(String frase) {
            palavras = frase.split(" ");
        }

        public String[] getPalavras() {
            return palavras;
        }
    }




