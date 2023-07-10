package com.github.alinenunes21.poo_2023_01.t11;

public class Preco {

        private double valor;
        private String moeda;

        public Preco(double valor, String moeda) {
            this.valor = valor;
            this.moeda = moeda;
        }

        public double getValor() {
            return valor;
        }

        public String getMoeda() {
            return moeda;
        }

        @Override
        public String toString() {
            return valor + " " + moeda;
        }
    }