/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.entity;

/**
 *
 * @author laboratorio
 */
public class Pedido {
    private Integer id;
    private String horaPedido;
    private Integer clienteId;
    private String numeroPedido;
    private Integer carrinhoId;
    private String dataPedido;
    private int statusPedido;
    private Integer entregaId;

    public Pedido() {
    }

    public Pedido(Integer id, String horaPedido, Integer clienteId, String numeroPedido, Integer carrinhoId, String dataPedido, int statusPedido, Integer entregaId) {
        this.id = id;
        this.horaPedido = horaPedido;
        this.clienteId = clienteId;
        this.numeroPedido = numeroPedido;
        this.carrinhoId = carrinhoId;
        this.dataPedido = dataPedido;
        this.statusPedido = statusPedido;
        this.entregaId = entregaId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHoraPedido() {
        return horaPedido;
    }

    public void setHoraPedido(String horaPedido) {
        this.horaPedido = horaPedido;
    }

    public Integer getClienteId() {
        return clienteId;
    }

    public void setClienteId(Integer clienteId) {
        this.clienteId = clienteId;
    }

    public String getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(String numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public Integer getCarrinhoId() {
        return carrinhoId;
    }

    public void setCarrinhoId(Integer carrinhoId) {
        this.carrinhoId = carrinhoId;
    }

    public String getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(String dataPedido) {
        this.dataPedido = dataPedido;
    }

    public int getStatusPedido() {
        return statusPedido;
    }

    public void setStatusPedido(int statusPedido) {
        this.statusPedido = statusPedido;
    }

    public Integer getEntregaId() {
        return entregaId;
    }

    public void setEntregaId(Integer entregaId) {
        this.entregaId = entregaId;
    }
    
    
}