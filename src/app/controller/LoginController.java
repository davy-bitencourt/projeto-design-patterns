/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.controller;

import app.dao.LoginDAO;
import app.dto.LoginDTO;
import app.entity.Login;
import app.interfaces.InterfaceController;
import app.interfaces.InterfaceDTO;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author Dave
 */
public class LoginController extends InterfaceController {
    private LoginDAO dao;


    public LoginController() {
        dao = new LoginDAO();
        dto = new LoginDTO();
    }

    @Override
    public Boolean salvar() {
        try {
            dao.salvar(dto.buildEntidade()); 
            return true;
        } catch (Exception ex) {
            System.getLogger(LoginController.class.getName())
                  .log(System.Logger.Level.ERROR, "Erro ao salvar Login", ex);
            return false;
        }
    }

    @Override
    public Boolean editar() {
        try {
            dao.editar(dto.buildEntidade()); 
            return true;
        } catch (Exception ex) {
            System.getLogger(LoginController.class.getName())
                  .log(System.Logger.Level.ERROR, "Erro ao editar Login", ex);
            return false;
        }
    }

    @Override
    public List<InterfaceDTO> listar() {
        try {
            List lista = dao.listarTodos(Login.class);
            return dto.preencheLista(lista);
        } catch (Exception ex) {
            System.getLogger(LoginController.class.getName())
                  .log(System.Logger.Level.ERROR, "Erro ao listar Logins", ex);
            return null;
        }
    }

    @Override
    public Boolean remover(Integer id) {
        try {
            Login login = new Login(id);
            
            dao.remover(login); 
            return true;
        } catch (Exception ex) {
            System.getLogger(LoginController.class.getName())
                  .log(System.Logger.Level.ERROR, "Erro ao remover Login", ex);
            return false;
        }
    }
}