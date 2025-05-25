/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.dto;
import app.entity.IngredienteAdicionar;
/**
 *
 * @author Dave
 */
public class IngredienteAdicionarDTO {
    public String id;
    public String nome;
    public String valor;

    public IngredienteAdicionarDTO(){}
    
    public IngredienteAdicionar builder(){
        IngredienteAdicionar ingrediente = new IngredienteAdicionar();
        ingrediente.setId(Integer.valueOf(id));
        ingrediente.setNome(nome);
        ingrediente.setValor(Double.valueOf(valor));
        return ingrediente;
    }
}
