package com.github.alinenunes21.poo_2023_01.t11;
import java.util.List;
import java.util.ArrayList;
public class Armario {

        private List<Prateleira> prateleiras;

        public Armario() {
            prateleiras = new ArrayList<>();
        }

        public void adicionarPrateleira(Prateleira prateleira) {
            prateleiras.add(prateleira);
        }

        public List<Prateleira> getPrateleiras() {
            return prateleiras;
        }
    }


