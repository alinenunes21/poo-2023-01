package com.github.alinenunes21.poo_2023_01.t19.dia;


    class AcontecimentoRelevante extends Dia {
        private String descricao;

        // Construtor
        public AcontecimentoRelevante(int dia, int mes, String descricao) {
            super(dia, mes);
            this.descricao = descricao;
        }

        // Getter e Setter da descrição
        public String getDescricao() {
            return descricao;
        }

        public void setDescricao(String descricao) {
            this.descricao = descricao;
        }
    }
