/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.entity;

import app.interfaces.Entidade;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
/**
 *
 * @author laboratorio
 */
public class Funcionario extends Entidade {

    private String nome;
    private String cpf;
    private String rg;
    private List<Telefone> telefones;
    private Login login;

    public Funcionario() {
    }

    public Funcionario(Integer id) {
        setId(id);
    }

    public Funcionario(Integer id, String nome, String cpf, String rg, List<Telefone> telefones, Login login) {
        setId(id);
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.telefones = telefones;
        this.login = login;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    @Override
    public String getInsert() {
        return "INSERT INTO funcionario (nome, cpf, rg, login_id) VALUES (?, ?, ?, ?)";
    }

    @Override
    public String getUpdate() {
        return "UPDATE funcionario SET nome = ?, cpf = ?, rg = ?, login_id = ? WHERE id = ?";
    }

    @Override
    public void setParameter(PreparedStatement ps) throws SQLException {
        ps.setString(1, this.nome);
        ps.setString(2, this.cpf);
        ps.setString(3, this.rg);
        ps.setObject(4, login != null && login.getId() != null ? login.getId() : null);

        if (getId() != null && getId() > 0) {
            ps.setInt(5, getId());
        }
    }

    public void setTelefone(Telefone telefone) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}