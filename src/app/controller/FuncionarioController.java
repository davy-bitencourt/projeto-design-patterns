/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.controller;

import app.dao.FuncionarioDAO;
import app.dto.FuncionarioDTO;
import app.entity.Funcionario;
import app.interfaces.InterfaceController;
import app.interfaces.InterfaceDTO;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author laboratorio
 */
public class FuncionarioController extends InterfaceController {
    private FuncionarioDAO dao; 
    
    public FuncionarioController() {
        dao = new FuncionarioDAO();
        dto = new FuncionarioDTO();
    }

    @Override
    public Boolean salvar() {
        try {
            dao.salvar(dto.buildEntidade());
            return true;
        } catch (Exception ex) {
            System.getLogger(FuncionarioController.class.getName())
                  .log(System.Logger.Level.ERROR, "Erro ao salvar Funcionario", ex);
            return false;
        }
    }

    @Override
    public Boolean editar() {
        try {
            dao.editar(dto.buildEntidade()); 
            return true;
        } catch (Exception ex) {
            System.getLogger(FuncionarioController.class.getName())
                  .log(System.Logger.Level.ERROR, "Erro ao editar Funcionario", ex);
            return false;
        }
    }

    @Override
    public List<InterfaceDTO> listar() {
        try {
            List lista = dao.listarTodos(Funcionario.class);
            return dto.preencheLista(lista); 
        } catch (Exception ex) {
            System.getLogger(FuncionarioController.class.getName())
                  .log(System.Logger.Level.ERROR, "Erro ao listar Funcionarios", ex);
            return null;
        }
    }

    @Override
    public Boolean remover(Integer id) {
        try {
            Funcionario funcionario = new Funcionario(id);
            
            dao.remover(funcionario);
            return true;
        } catch (Exception ex) {
            System.getLogger(FuncionarioController.class.getName())
                  .log(System.Logger.Level.ERROR, "Erro ao remover Funcionario", ex);
            return false;
        }
    }
}