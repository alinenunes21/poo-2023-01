package com.github.alinenunes21.t21;
import java.time.LocalDateTime;
import java.util.List;
public class ItemPedido {
    public ItemPedido(int i, Object pizza, Object sem_cebola) {

    }

    public static void main(String[] args, Cliente dataPedido) throws InterruptedException {
        LocalDateTime agora = LocalDateTime.now ( );

        Pedido pedido = new Pedido (agora, agora.plusHours (1), agora.plusHours (2), dataPedido);

        ItemPedido item1 = new ItemPedido (2, "Pizza", "Sem cebola");
        ItemPedido item2 = new ItemPedido (3, "Bebida", "Com gelo");

        pedido.wait ( );

        List <ItemPedido> itensDoPedido = pedido.getItens ( );
        for (ItemPedido item : itensDoPedido) {
            System.out.println ("Item: " + item.getItem ( ) + " - Quantidade: " + item.getQuantidade ( ) + " - Observação: " + item.getObservacao ( ));
        }
    }

    private String getObservacao() {
        return null;
    }

    private String getQuantidade() {
        return  null;

    }

    private String getItem() {

        return null;
    }

        private int quantidade;
        private Bebida bebida;  // Adição do atributo do tipo Bebida
        private String observacao;

        public ItemPedido(int quantidade, Bebida bebida, String observacao) {
            this.quantidade = quantidade;
            this.bebida = bebida;
            this.observacao = observacao;
        }


    }



