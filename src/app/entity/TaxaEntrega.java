/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.entity;

/**
 *
 * @author laboratorio
 */
public class TaxaEntrega {
    private Integer id;
    private Integer enderecoId;
    private float traxaEntrega;

    public TaxaEntrega() {
    }

    public TaxaEntrega(Integer id, Integer enderecoId, float traxaEntrega) {
        this.id = id;
        this.enderecoId = enderecoId;
        this.traxaEntrega = traxaEntrega;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEnderecoId() {
        return enderecoId;
    }

    public void setEnderecoId(Integer enderecoId) {
        this.enderecoId = enderecoId;
    }

    public float getTraxaEntrega() {
        return traxaEntrega;
    }

    public void setTraxaEntrega(float traxaEntrega) {
        this.traxaEntrega = traxaEntrega;
    }
    
    
}
