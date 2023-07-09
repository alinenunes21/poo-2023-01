package com.github.alinenunes21.poo_2023_01.t11;
import java.util.List;
import java.util.ArrayList;
public class Prateleira {
        public List<Compartimento> compartimentos;

        public Prateleira() {
            compartimentos = new ArrayList<>();
        }

        public void adicionarCompartimento(Compartimento compartimento) {
            compartimentos.add(compartimento);
        }

        public List<Compartimento> getCompartimentos() {
            return compartimentos;
        }
    }


