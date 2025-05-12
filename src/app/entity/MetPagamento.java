/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.entity;

/**
 *
 * @author laboratorio
 */
public class MetPagamento {
    private Integer id;
    private String pix;
    private Integer dinheiroId;
    private Integer cartaoId;

    public MetPagamento() {
    }

    public MetPagamento(Integer id, String pix, Integer dinheiroId, Integer cartaoId) {
        this.id = id;
        this.pix = pix;
        this.dinheiroId = dinheiroId;
        this.cartaoId = cartaoId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPix() {
        return pix;
    }

    public void setPix(String pix) {
        this.pix = pix;
    }

    public Integer getDinheiroId() {
        return dinheiroId;
    }

    public void setDinheiroId(Integer dinheiroId) {
        this.dinheiroId = dinheiroId;
    }

    public Integer getCartaoId() {
        return cartaoId;
    }

    public void setCartaoId(Integer cartaoId) {
        this.cartaoId = cartaoId;
    }
    
    
}
