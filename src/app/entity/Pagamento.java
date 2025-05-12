/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.entity;

/**
 *
 * @author laboratorio
 */
public class Pagamento {
    private Integer metPagamentoId;
    private Integer cupomId;
    private Integer pedidoId;

    public Pagamento() {
    }

    public Pagamento(Integer metPagamentoId, Integer cupomId, Integer pedidoId) {
        this.metPagamentoId = metPagamentoId;
        this.cupomId = cupomId;
        this.pedidoId = pedidoId;
    }

    public Integer getMetPagamentoId() {
        return metPagamentoId;
    }

    public void setMetPagamentoId(Integer metPagamentoId) {
        this.metPagamentoId = metPagamentoId;
    }

    public Integer getCupomId() {
        return cupomId;
    }

    public void setCupomId(Integer cupomId) {
        this.cupomId = cupomId;
    }

    public Integer getPedidoId() {
        return pedidoId;
    }

    public void setPedidoId(Integer pedidoId) {
        this.pedidoId = pedidoId;
    }
    
    
}
