/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.dto;
import app.entity.Cliente;
/**
 *
 * @author laboratorio
 */
public class ClienteDTO {
    public String id;
    public String nome;
    public String telefoneId;
    
    public ClienteDTO() {}
    
    public Cliente builder(){
        Cliente cliente = new Cliente();
        cliente.setId(Integer.valueOf(id));
        cliente.setNome(nome);
        cliente.setTelefoneId(Integer.valueOf(telefoneId));
        return cliente;
    }
}
