/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.dto;
import app.entity.Login;
/**
 *
 * @author Dave
 */
public class LoginDTO {
    public String id;
    public String senha;
    public String loginFuncionario;

    public LoginDTO(){}
    
    public Login builder(){
        Login login = new Login();
        login.setId(Integer.valueOf(id));
        login.setSenha(senha);
        login.setLoginFuncionario(Integer.valueOf(loginFuncionario));
        return login;
    }
}
