/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.dto;
import app.entity.Delivery;
/**
 *
 * @author Dave
 */
public class DeliveryDTO {
    public String id;
    public String chaveEntrega;
    public String numero;
    public String complemento;
    public String enderecoId;

    public DeliveryDTO(){}
    
    public Delivery builder(){
        Delivery delivery = new Delivery();
        delivery.setId(Integer.valueOf(id));
        delivery.setChaveEntrega(chaveEntrega);
        delivery.setNumero(numero);
        delivery.setComplemento(complemento);
        delivery.setEnderecoId(Integer.valueOf(enderecoId));
        return delivery;
    }
}
