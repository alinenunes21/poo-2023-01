package com.github.alinenunes21.t21;
import java.time.LocalDateTime;
import java.util.List;
import java.util.ArrayList;
public class Pedido {
    private final LocalDateTime horaPedido;
    private final Object horaEntrega;
    public final Object dataPedido;
    private final ArrayList <Object> itens;
    private final Object cliente;
    private Colaborador requisitadoPor;

    public Pedido(LocalDateTime agora, LocalDateTime localDateTime, LocalDateTime localDateTime1, LocalDateTime horaPedido, Object horaEntrega, Object dataPedido, ArrayList <Object> itens, Colaborador requisitadoPor) {
        this.horaPedido = horaPedido;
        this.horaEntrega = horaEntrega;
        this.dataPedido = dataPedido;
        this.itens = itens;
        this.requisitadoPor = requisitadoPor;
        cliente = null;
    }


    public Pedido(LocalDateTime dataPedido, LocalDateTime horaPedido, LocalDateTime horaEntrega, Cliente cliente) {
        this.dataPedido = dataPedido;
        this.horaPedido = horaPedido;
        this.horaEntrega = horaEntrega;
        this.itens = new ArrayList <Object> ();
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        Cliente cliente;
        cliente = null;
        return cliente;
    }

    public void adicionarItem(ItemPedido item) {
        itens.add(item);
    }

    public List<ItemPedido> getItens() {
        return null;
    }
}
