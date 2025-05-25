/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.dto;
import app.entity.Bairro;
/**
 *
 * @author laboratorio
 */
public class BairroDTO {
    public String id;
    public String nome;
    
    public BairroDTO() {}
    
    public Bairro builder(){
        Bairro bairro = new Bairro();
        bairro.setId(Integer.valueOf(id));
        bairro.setNome(nome);
        return bairro;
    }
}
