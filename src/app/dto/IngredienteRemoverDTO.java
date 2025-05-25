/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.dto;
import app.entity.IngredienteRemover;
/**
 *
 * @author Dave
 */
public class IngredienteRemoverDTO {
    public String id;
    public String nome;

    public IngredienteRemoverDTO() {}
    
    public IngredienteRemover builder(){
        IngredienteRemover ingrediente = new IngredienteRemover();
        ingrediente.setId(Integer.valueOf(id));
        ingrediente.setNome(nome);
        return ingrediente;
    }
}
