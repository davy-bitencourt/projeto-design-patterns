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
public class Endereco extends Entidade {

    private String rua;
    private String cep;
    private float distancia;
    private Bairro bairro;

    public Endereco() {
    }
    
    public Endereco(Integer id) {
        setId(id);
    }

    public Endereco(Integer id, String rua, String cep, Bairro bairro, float distancia) {
        setId(id); // herdado da classe Entidade
        this.rua = rua;
        this.cep = cep;
        this.bairro = bairro;
        this.distancia = distancia;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public float getDistancia() {
        return distancia;
    }

    public void setDistancia(float distancia) {
        this.distancia = distancia;
    }

    public Bairro getBairro() {
        return bairro;
    }

    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }

    @Override
    public String getInsert() {
        return "INSERT INTO endereco (rua, cep, distancia, bairro_id) VALUES (?, ?, ?, ?)";
    }

    @Override
    public void setParameter(PreparedStatement ps) throws SQLException {
        ps.setString(1, rua);
        ps.setString(2, cep);
        ps.setFloat(3, distancia);
        ps.setInt(4, bairro != null && bairro.getId() != null ? bairro.getId() : 0);

        if (getId() != null && getId() > 0) {
            ps.setInt(5, getId());
        }
    }

    @Override
    public String getUpdate() {
        return "UPDATE endereco SET rua = ?, cep = ?, distancia = ?, bairro_id = ? WHERE id = ?";
    }
}