/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.entity;

/**
 *
 * @author laboratorio
 */
public class Funcionario {
    private Integer id;
    private String nome;
    private Integer loginId;
    private Integer telefoneId;
    private String cpf;
    private String rg;

    public Funcionario() {
    }

    public Funcionario(Integer id, String nome, Integer loginId, Integer telefoneId, String cpf, String rg) {
        this.id = id;
        this.nome = nome;
        this.loginId = loginId;
        this.telefoneId = telefoneId;
        this.cpf = cpf;
        this.rg = rg;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getLoginId() {
        return loginId;
    }

    public void setLoginId(Integer loginId) {
        this.loginId = loginId;
    }

    public Integer getTelefoneId() {
        return telefoneId;
    }

    public void setTelefoneId(Integer telefoneId) {
        this.telefoneId = telefoneId;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
    
    
}
