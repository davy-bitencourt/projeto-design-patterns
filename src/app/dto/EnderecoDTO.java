/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.dto;
import app.entity.Endereco;
/**
 *
 * @author laboratorio
 */
public class EnderecoDTO {
    public String id;
    public String rua;
    public String cep;
    public String bairroId;
    public String distancia;
    
    public EnderecoDTO() {}
    
    public Endereco builder(){
        Endereco endereco = new Endereco();
        endereco.setId(Integer.valueOf(id));
        endereco.setRua(rua);
        endereco.setCep(Integer.valueOf(cep));
        endereco.setBairroId(Integer.valueOf(bairroId));
        endereco.setDistancia(distancia);
        return endereco;
    }
}
