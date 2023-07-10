package com.github.alinenunes21.poo_2023_01.t11;
import java.util.List;
import java.util.ArrayList;
public class Arvore {

        private List<Folha> folhas;

        public Arvore() {
            folhas = new ArrayList<>();
        }

        public void adicionarFolha(Folha folha) {
            folhas.add(folha);
        }

        public List<Folha> getFolhas() {
            return folhas;
        }
    }
