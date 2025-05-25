/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.dto;
import app.entity.Telefone;
/**
 *
 * @author Dave
 */
public class TelefoneDTO {
    public String id;
    public String dd;
    public String numero;
    public String funcionarioId;
    public String clienteId;

    public TelefoneDTO() {}
    
    public Telefone builder(){
        Telefone telefone = new Telefone();
        telefone.setId(Integer.valueOf(id));
        telefone.setDd(Integer.valueOf(dd));
        telefone.setNumero(Integer.valueOf(numero));
        telefone.setFuncionarioId(Integer.valueOf(funcionarioId));
        telefone.setClienteId(Integer.valueOf(clienteId));
        return telefone;
    }
}
