/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.controller;

import app.dao.ClienteDAO;
import app.dto.ClienteDTO;
import app.entity.Cliente;
import java.util.List;
/**
 *
 * @author laboratorio
 */
public class ClienteController {
    
    private ClienteDAO clienteDAO;

    public ClienteController(ClienteDAO clienteDAO) {
        this.clienteDAO = clienteDAO;
    }
    
    public void salvar(ClienteDTO dto){
        Cliente cliente = dto.builder();
        clienteDAO.inserir(cliente);
    }
    
    public void atualizar(ClienteDTO dto){
        Cliente cliente = dto.builder();
        clienteDAO.atualizar(cliente);
    }
    
    public void remover(ClienteDTO dto){
        Cliente cliente = dto.builder();
        if(cliente.getId() != null){
            clienteDAO.deletar(cliente.getId());
        }
    }    
    
    public List<Cliente> listarTodos(){
        return clienteDAO.listarCliente();
    }
}
