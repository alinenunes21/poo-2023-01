package com.github.alinenunes21.poo_2023_01.t08;
import java.util.List;
import java.util.ArrayList;

public class Pais {
        private List<Cidade> cidades;

        public Pais() {
            cidades = new ArrayList<>();
        }

        public void adicionarCidade(Cidade cidade) {
            cidades.add(cidade);
        }

        public List<Cidade> getCidades() {
            return cidades;
        }
    }
