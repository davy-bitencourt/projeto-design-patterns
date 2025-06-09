/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.entity;

import app.interfaces.Entidade;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author laboratorio
 */
public class Telefone extends Entidade {

    private String ddd;
    private String numero;
    private Funcionario funcionario;  
    private Cliente cliente;
    
    public Telefone() {
    }

    public Telefone(Integer id) {
        setId(id);
    }

    public Telefone(String ddd, String numero) {
        this(null, ddd, numero);
    }

    public Telefone(Integer id, String ddd, String numero) {
        setId(id);
        this.ddd = ddd;
        this.numero = numero;
    }

    public Telefone(Integer id, String ddd, String numero, Funcionario funcionario, Cliente cliente) {
        setId(id);
        this.ddd = ddd;
        this.numero = numero;
        this.funcionario = funcionario;
        this.cliente = cliente;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String getInsert() {
        return "INSERT INTO telefone (ddd, numero, funcionario_id, cliente_id) VALUES (?, ?, ?, ?)";
    }

    @Override
    public String getUpdate() {
        return "UPDATE telefone SET ddd = ?, numero = ?, funcionario_id = ?, cliente_id = ? WHERE id = ?";
    }

    @Override
    public void setParameter(PreparedStatement ps) throws SQLException {
        ps.setString(1, ddd);
        ps.setString(2, numero);
        ps.setObject(3, funcionario != null && funcionario.getId() != null ? funcionario.getId() : null);
        ps.setObject(4, cliente != null && cliente.getId() != null ? cliente.getId() : null);

        if (getId() != null && getId() > 0) {
            ps.setInt(5, getId());
        }
    }
}