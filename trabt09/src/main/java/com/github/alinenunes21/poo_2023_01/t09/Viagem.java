package com.github.alinenunes21.poo_2023_01.t09;

public class Viagem {
    class Viagem {
        private List<Pedido> pedidos;
        private Armazem armazem;

        public Viagem(Armazem armazem) {
            this.armazem = armazem;
            pedidos = new ArrayList<>();
        }

        public void adicionarPedido(Pedido pedido) {
            pedidos.add(pedido);
        }

        public List<Pedido> getPedidos() {
            return pedidos;
        }

        public Armazem getArmazem() {
            return armazem;
        }
    }







    }
