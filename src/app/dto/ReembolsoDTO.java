/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.dto;
import app.entity.Reembolso;
/**
 *
 * @author Dave
 */
public class ReembolsoDTO {
    public String id;
    public String pedidoId;
    public String motivo;

    public ReembolsoDTO() {}
    
    public Reembolso builder(){
        Reembolso reembolso = new Reembolso();
        reembolso.setId(Integer.valueOf(id));
        reembolso.setPedidoId(Integer.valueOf(pedidoId));
        reembolso.setMotivo(motivo);
        return reembolso;
    }
}
