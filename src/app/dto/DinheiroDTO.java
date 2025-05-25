/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.dto;
import app.entity.Dinheiro;
/**
 *
 * @author Dave
 */
public class DinheiroDTO {
    public String id;
    public String valorEntrega;

    public DinheiroDTO(){}
    
    public Dinheiro builder(){
        Dinheiro dinheiro = new Dinheiro();
        dinheiro.setId(Integer.valueOf(id));
        dinheiro.setValorEntrega(Double.valueOf(valorEntrega));
        return dinheiro;
    }
}
