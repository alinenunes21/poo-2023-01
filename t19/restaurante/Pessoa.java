package com.github.alinenunes21.poo_2023_01.t19.restaurante;

    abstract class Pessoa {
        private String nome;

        // Construtor
        public Pessoa(String nome) {
            this.nome = nome;
        }


        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }
    }
