/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.controller;

import app.dao.TelefoneDAO;
import app.dto.TelefoneDTO;
import app.entity.Telefone;
import app.interfaces.InterfaceController;
import app.interfaces.InterfaceDTO;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author Dave
 */
public class TelefoneController extends InterfaceController {
    private TelefoneDAO dao;

    public TelefoneController() {
        dao = new TelefoneDAO();
        dto = new TelefoneDTO();
    }
    
    @Override
    public Boolean salvar() {
        try {
            dao.salvar(dto.buildEntidade());
            return true;
        } catch (Exception ex) {
            System.getLogger(TelefoneController.class.getName())
                  .log(System.Logger.Level.ERROR, "Erro ao salvar Telefone", ex);
            return false;
        }
    }

    @Override
    public Boolean editar() {
        try {
            dao.editar(dto.buildEntidade());
            return true;
        } catch (Exception ex) {
            System.getLogger(TelefoneController.class.getName())
                  .log(System.Logger.Level.ERROR, "Erro ao editar Telefone", ex);
            return false;
        }
    }

    @Override
    public List<InterfaceDTO> listar() {
        try {
            List lista = dao.listarTodos(Telefone.class);
            
            return dto.preencheLista(lista);
        } catch (Exception ex) {
            System.getLogger(TelefoneController.class.getName())
                  .log(System.Logger.Level.ERROR, "Erro ao listar Telefones", ex);
            return null;
        }
    }

    @Override
    public Boolean remover(Integer id) {
        try {
            Telefone telefone = new Telefone(id);
            
            dao.remover(telefone);
            return true;
        } catch (Exception ex) {
            System.getLogger(TelefoneController.class.getName())
                  .log(System.Logger.Level.ERROR, "Erro ao remover Telefone", ex);
            return false;
        }
    }
}