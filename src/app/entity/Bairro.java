/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.entity;

import app.interfaces.Entidade;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author laboratorio
 */
public class Bairro extends Entidade {
    private Integer id;
    private String nome;
    private List<Endereco> endereco;

    public Bairro() {
    }

    public Bairro(Integer id) {
        setId(id);
    }
    
    public Bairro(String nome) {
        this.nome = nome;
    }

    public Bairro(Integer id, String nome, List<Endereco> endereco) {
        this.setId(id);
        this.nome = nome;
        this.endereco = endereco;
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
    
    @Override
    public String getInsert() {
        return "INSERT INTO bairro (nome) VALUES (?)";
    }

    @Override
    public void setParameter(PreparedStatement ps) throws SQLException {
        ps.setString(1, this.nome);
        
        // Se o ID estiver definido, é uma operação de UPDATE
        if (getId() != null && getId() > 0) {
            ps.setInt(2, getId());
        }
    }

    @Override
    public String getUpdate() {
        return "UPDATE bairro SET nome = ? WHERE id = ?";
    }
    
    @Override
    public String toString() {
        return "Bairro{" + "id=" + getId() + ", nome=" + nome + '}';
    }
}
