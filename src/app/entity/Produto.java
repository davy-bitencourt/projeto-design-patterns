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
public class Produto extends Entidade {

    private String nome;
    private Double valorUnitario;

    public Produto() {
    }

    public Produto(Integer id) {
        setId(id);
    }

    public Produto(Integer id, String nome, Double valorUnitario) {
        setId(id);
        this.nome = nome;
        this.valorUnitario = valorUnitario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(Double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    @Override
    public String getInsert() {
        return "INSERT INTO produto (nome, valor_unitario) VALUES (?, ?)";
    }

    @Override
    public String getUpdate() {
        return "UPDATE produto SET nome = ?, valor_unitario = ? WHERE id = ?";
    }

    @Override
    public void setParameter(PreparedStatement ps) throws SQLException {
        ps.setString(1, nome);
        ps.setDouble(2, valorUnitario);
        if (getId() != null && getId() > 0) {
            ps.setInt(3, getId());
        }
    }
}