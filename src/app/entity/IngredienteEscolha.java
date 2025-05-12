/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.entity;

/**
 *
 * @author laboratorio
 */
public class IngredienteEscolha {
    private Integer id;
    private Integer ingredienteAdicionalId;
    private Integer ingerienteRemoverId;

    public IngredienteEscolha() {
    }

    public IngredienteEscolha(Integer id, Integer ingredienteAdicionalId, Integer ingerienteRemoverId) {
        this.id = id;
        this.ingredienteAdicionalId = ingredienteAdicionalId;
        this.ingerienteRemoverId = ingerienteRemoverId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIngredienteAdicionalId() {
        return ingredienteAdicionalId;
    }

    public void setIngredienteAdicionalId(Integer ingredienteAdicionalId) {
        this.ingredienteAdicionalId = ingredienteAdicionalId;
    }

    public Integer getIngerienteRemoverId() {
        return ingerienteRemoverId;
    }

    public void setIngerienteRemoverId(Integer ingerienteRemoverId) {
        this.ingerienteRemoverId = ingerienteRemoverId;
    }
    
    
}
