package com.github.alinenunes21.poo_2023_01.t09;
import java.util.ArrayList;
import java.util.List;
public class Armazem {

        private List<Pedido> pedidos;

        public Armazem() {
            pedidos = new ArrayList<>();
        }

        public void adicionarPedido(Pedido pedido) {
            pedidos.add(pedido);
        }

        public List<Pedido> getPedidos() {
            return pedidos;
        }
    }

