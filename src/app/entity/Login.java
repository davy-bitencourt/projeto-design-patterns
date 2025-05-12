/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.entity;

/**
 *
 * @author laboratorio
 */
public class Login {
    private Integer id;
    private String senha;
    private int loginFuncionario;

    public Login() {
    }

    public Login(Integer id, String senha, int loginFuncionario) {
        this.id = id;
        this.senha = senha;
        this.loginFuncionario = loginFuncionario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getLoginFuncionario() {
        return loginFuncionario;
    }

    public void setLoginFuncionario(int loginFuncionario) {
        this.loginFuncionario = loginFuncionario;
    }
    
    
}
