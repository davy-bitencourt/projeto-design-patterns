/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.dto;
import app.entity.Pedido;
/**
 *
 * @author Dave
 */
public class PedidoDTO {
    public String id;
    public String horaPedido;
    public String clienteId;
    public String numeroPedido;
    public String carrinhoId;
    public String dataPedido;
    public String statusPedido;
    public String entregaId;

    public PedidoDTO(){}
    
    public Pedido builder(){
        Pedido pedido = new Pedido();
        pedido.setId(Integer.valueOf(id));
        pedido.setHoraPedido(horaPedido);
        pedido.setClienteId(Integer.valueOf(clienteId));
        pedido.setNumeroPedido(numeroPedido);
        pedido.setCarrinhoId(Integer.valueOf(carrinhoId));
        pedido.setDataPedido(dataPedido);
        pedido.setStatusPedido(Integer.valueOf(statusPedido));
        pedido.setEntregaId(Integer.valueOf(entregaId));
        return pedido;
    }
}
