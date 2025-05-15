/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.entity;

/**
 *
 * @author laboratorio
 */
public class Entrega {
    private Integer id;
    private Integer clienteId;
    private Boolean tipoEntrega;
    private Integer deliveryId;
    private Integer pedidoId;
    private Integer statusPedidosId;

    public Entrega() {
    }

    public Entrega(Integer id, Integer clienteId, Boolean tipoEntrega, Integer deliveryId, Integer pedidoId, Integer statusPedidosId) {
        this.id = id;
        this.clienteId = clienteId;
        this.tipoEntrega = tipoEntrega;
        this.deliveryId = deliveryId;
        this.pedidoId = pedidoId;
        this.statusPedidosId = statusPedidosId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getClienteId() {
        return clienteId;
    }

    public void setClienteId(Integer clienteId) {
        this.clienteId = clienteId;
    }

    public Boolean isTipoEntrega() {
        return tipoEntrega;
    }

    public void setTipoEntrega(Boolean tipoEntrega) {
        this.tipoEntrega = tipoEntrega;
    }

    public Integer getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(Integer deliveryId) {
        this.deliveryId = deliveryId;
    }

    public Integer getPedidoId() {
        return pedidoId;
    }

    public void setPedidoId(Integer pedidoId) {
        this.pedidoId = pedidoId;
    }

    public Integer getStatusPedidosId() {
        return statusPedidosId;
    }

    public void setStatusPedidosId(Integer statusPedidosId) {
        this.statusPedidosId = statusPedidosId;
    }

    public void isTipoEntrega(boolean aBoolean) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
