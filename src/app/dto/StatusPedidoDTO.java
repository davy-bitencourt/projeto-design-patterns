/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.dto;
import app.entity.StatusPedido;
/**
 *
 * @author Dave
 */
public class StatusPedidoDTO {
    public String id;
    public String pedidoId;
    public String progresso;

    public StatusPedidoDTO() {}
    
    public StatusPedido builder(){
        StatusPedido status = new StatusPedido();
        status.setId(Integer.valueOf(id));
        status.setPedidoId(Integer.valueOf(pedidoId));
        status.setProgresso(progresso);
        return status;
    }
}
