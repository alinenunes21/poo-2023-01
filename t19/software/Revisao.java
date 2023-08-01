package com.github.alinenunes21.poo_2023_01.t19.software;



    class Revisao extends Versao {
        private String dataRevisao;

        // Construtor
        public Revisao(int numero, String descricao, String dataRevisao) {
            super(numero, descricao);
            this.dataRevisao = dataRevisao;
        }
        public String getDataRevisao() {
            return dataRevisao;
        }
        public void setDataRevisao(String dataRevisao) {
            this.dataRevisao = dataRevisao;
        }
    }

