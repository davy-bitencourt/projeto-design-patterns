/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.controller;

import app.dao.EnderecoDAO;
import app.dto.EnderecoDTO;
import app.entity.Endereco;
import app.interfaces.InterfaceController;
import app.interfaces.InterfaceDTO;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author laboratorio
 */
public class EnderecoController extends InterfaceController {
    private EnderecoDAO dao;
    
    public EnderecoController() {
        dao = new EnderecoDAO();
        dto = new EnderecoDTO();
    }

    @Override
    public Boolean salvar() {
        try {
            dao.salvar(dto.buildEntidade());
            return true;
        } catch (Exception ex) {
            System.getLogger(EnderecoController.class.getName())
                  .log(System.Logger.Level.ERROR, "Erro ao salvar Endereco", ex);
            return false;
        }
    }

    @Override
    public Boolean editar() {
        try {
            dao.editar(dto.buildEntidade()); 
            return true;
        } catch (Exception ex) {
            System.getLogger(EnderecoController.class.getName())
                  .log(System.Logger.Level.ERROR, "Erro ao editar Endereco", ex);
            return false;
        }
    }

    @Override
    public List<InterfaceDTO> listar() {
        try {
            List lista = dao.listarTodos(Endereco.class); 
            return dto.preencheLista(lista); 
        } catch (Exception ex) {
            System.getLogger(EnderecoController.class.getName())
                  .log(System.Logger.Level.ERROR, "Erro ao listar Enderecos", ex);
            return null;
        }
    }

    @Override
    public Boolean remover(Integer id) {
        try {
            Endereco endereco = new Endereco(id);
            dao.remover(endereco); 
            return true;
        } catch (Exception ex) {
            System.getLogger(EnderecoController.class.getName())
                  .log(System.Logger.Level.ERROR, "Erro ao remover Endereco", ex);
            return false;
        }
    }
}