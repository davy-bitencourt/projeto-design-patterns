/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.controller;

import app.dao.ClienteDAO;
import app.dto.ClienteDTO;
import app.entity.Cliente;
import app.interfaces.InterfaceController;
import app.interfaces.InterfaceDTO;
import java.sql.Connection;
import java.util.List;
/**
 *
 * @author laboratorio
 */
public class ClienteController extends InterfaceController {

    private ClienteDAO dao; 


    public ClienteController() {
        dao = new ClienteDAO();
        dto = new ClienteDTO();
    }

    @Override
    public Boolean salvar() {
        try {
            dao.salvar(dto.buildEntidade()); 
            return true;
        } catch (Exception ex) {
            System.getLogger(ClienteController.class.getName())
                  .log(System.Logger.Level.ERROR, "Erro ao salvar Cliente", ex);
            return false;
        }
    }

    @Override
    public Boolean editar() {
        try {
            dao.editar(dto.buildEntidade()); 
            return true;
        } catch (Exception ex) {
            System.getLogger(ClienteController.class.getName())
                  .log(System.Logger.Level.ERROR, "Erro ao editar Cliente", ex);
            return false;
        }
    }

    @Override
    public List<InterfaceDTO> listar() {
        try {
            List lista = dao.listarTodos(Cliente.class);
            return dto.preencheLista(lista); 
        } catch (Exception ex) {
            System.getLogger(ClienteController.class.getName())
                  .log(System.Logger.Level.ERROR, "Erro ao listar Clientes", ex);
            return null;
        }
    }

    @Override
    public Boolean remover(Integer id) {
        try {
            Cliente cliente = new Cliente(id);
            
            dao.remover(cliente);
            return true;
        } catch (Exception ex) {
            System.getLogger(ClienteController.class.getName())
                  .log(System.Logger.Level.ERROR, "Erro ao remover Cliente", ex);
            return false;
        }
    }
}