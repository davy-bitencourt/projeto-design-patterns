/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.dto;
import app.entity.Entrega;
/**
 *
 * @author Dave
 */
public class EntregaDTO {
    public String id;
    public String clienteId;
    public String tipoEntrga;
    public String deliveryId;
    public String pedidoId;
    public String statusPedidoId;

    public EntregaDTO(){}
    
    public Entrega builder(){
        Entrega entrega = new Entrega();
        entrega.setId(Integer.valueOf(id));
        entrega.setClienteId(Integer.valueOf(clienteId));
        entrega.setTipoEntrega(Boolean.valueOf(tipoEntrga));
        entrega.setDeliveryId(Integer.valueOf(deliveryId));
        entrega.setPedidoId(Integer.valueOf(pedidoId));
        entrega.setStatusPedidosId(Integer.valueOf(statusPedidoId));
        return entrega;
    }
}
