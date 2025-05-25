/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.dto;
import app.entity.IngredienteEscolha;
/**
 *
 * @author Dave
 */
public class IngredienteEscolhaDTO {
    public String id; 
    public String ingredienteAdicionarId;
    public String ingredienteRemoverId;

    public IngredienteEscolhaDTO() {}
    
    public IngredienteEscolha builder(){
        IngredienteEscolha ingrediente = new IngredienteEscolha();
        ingrediente.setId(Integer.valueOf(id));
        ingrediente.setIngredienteAdicionalId(Integer.valueOf(ingredienteAdicionarId));
        ingrediente.setIngerienteRemoverId(Integer.valueOf(ingredienteRemoverId));
        return ingrediente;
    }
}
