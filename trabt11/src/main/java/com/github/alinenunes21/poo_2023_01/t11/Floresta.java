package com.github.alinenunes21.poo_2023_01.t11;
import java.util.List;
import java.util.ArrayList;
public class Floresta {

        private List<Arvore> arvores;

        public Floresta() {
            arvores = new ArrayList<>();
        }

        public void adicionarArvore(Arvore arvore) {
            arvores.add(arvore);
        }

        public List<Arvore> getArvores() {
            return arvores;
        }
    }


