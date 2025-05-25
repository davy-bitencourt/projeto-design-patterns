/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.dto;
import app.entity.Cartao;
/**
 *
 * @author Dave
 */
public class CartaoDTO {
    private String id;
    private String pix;
    private String dinheiroId;
    private String cartaoId;

    public CartaoDTO() {}
    
    public Cartao builder(){
        Cartao cartao = new Cartao();
        cartao.setId(Integer.valueOf(id));
        cartao.setPix(pix);
        cartao.setDinheiroId(Integer.valueOf(dinheiroId));
        cartao.setCartaoId(Integer.valueOf(cartaoId));
        return cartao;
    }
}
