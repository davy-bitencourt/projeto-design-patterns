/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.controller;

import app.dao.LoginDAO;
import app.dao.LoginDAOImpl;
import app.dto.LoginDTO;
import app.entity.Login;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author Dave
 */
public class LoginController {
    private LoginDAO loginDAO;

    public LoginController(Connection con) {
        this.loginDAO = new LoginDAOImpl(con);
    }
    
    public void salvar(LoginDTO dto){
        Login login = dto.builder();
        loginDAO.inserir(login);
    }
    
    public void atualizar(LoginDTO dto){
        Login login = dto.builder();
        loginDAO.atualizar(login);
    }
    
    public void remover(LoginDTO dto){
        Login login = dto.builder();
        loginDAO.deletar(login.getId());
    }
    
    public List<Login> listarTodos(){
        return loginDAO.listarLogin();
    }
}
