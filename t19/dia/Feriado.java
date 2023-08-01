package com.github.alinenunes21.poo_2023_01.t19.dia;


    class Feriado extends Dia {
        private String descricao;
        public Feriado(int dia, int mes, String descricao) {
            super(dia, mes);
            this.descricao = descricao;
        }

        public String getDescricao() {
            return descricao;
        }

        public void setDescricao(String descricao) {
            this.descricao = descricao;
        }
    }
