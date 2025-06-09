/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.controller;

import app.dao.BairroDAO;
import app.dto.BairroDTO;
import app.interfaces.*;
import app.entity.Bairro;
import java.sql.Connection;
import java.util.List;


/**
 *
 * @author laboratorio
 */
public class BairroController extends InterfaceController {
    private BairroDAO dao;

    public BairroController() {
        dao = new BairroDAO();
        dto = new BairroDTO();
    }

    @Override
    public Boolean salvar() {
        try {
            dao.salvar(dto.buildEntidade());
            return true;
        } catch (Exception ex) {
            System.getLogger(BairroController.class.getName())
                  .log(System.Logger.Level.ERROR, "Erro ao salvar Bairro", ex);
            return false;
        }
    }
    
    @Override
    public Boolean editar() {
        try {
            dao.editar(dto.buildEntidade());
            return true;
        } catch (Exception ex) {
            System.getLogger(BairroController.class.getName())
                  .log(System.Logger.Level.ERROR, "Erro Durante Edição", ex);
            return false;
        }
    }
    
    @Override
    public List<InterfaceDTO> listar() {
        try {
            List lista = dao.listarTodos(Bairro.class);
            
            return dto.preencheLista(lista);
        } catch (Exception ex) {
            System.getLogger(BairroController.class.getName())
                  .log(System.Logger.Level.ERROR, "Erro Durante Listamento", ex);
            return null;
        }
    }

  
    @Override
    public Boolean remover(Integer id) {
        try {
            Bairro bairro = new Bairro(id);
            dao.remover(bairro);
            return true;
        } catch (Exception ex) {
            System.getLogger(BairroController.class.getName()).log(System.Logger.Level.ERROR, "Erro ao remover Bairro", ex);
            return false;
        }
    }
}