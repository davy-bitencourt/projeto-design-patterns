/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.dto;
import app.entity.MetPagamento;
/**
 *
 * @author Dave
 */
public class MetPagamentoDTO {
    public String id;
    public String pix;
    public String dinheiroId;
    public String cartaoId;

    public MetPagamentoDTO(){}
    
    public MetPagamento builder(){
        MetPagamento metodo = new MetPagamento();
        metodo.setId(Integer.valueOf(id));
        metodo.setPix(pix);
        metodo.setDinheiroId(Integer.valueOf(dinheiroId));
        metodo.setCartaoId(Integer.valueOf(cartaoId));
        return metodo;
    }
}
