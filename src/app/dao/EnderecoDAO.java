/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package app.dao;
import app.entity.Endereco;
import app.entity.Bairro;
import app.interfaces.Entidade;
import app.interfaces.InterfaceDAO;
import java.util.List;
import java.sql.SQLException;
import java.sql.ResultSet;
/**
 *
 * @author Dave
 */
public class EnderecoDAO extends InterfaceDAO {

    @Override
    public Entidade preencheDados(ResultSet res) throws SQLException {
        Endereco e = new Endereco();
        e.setId(res.getInt("id"));
        e.setRua(res.getString("rua"));
        e.setCep(res.getString("cep"));
        e.setDistancia(res.getFloat("distancia"));

        // Instancia mínima de Bairro com ID
        Bairro b = new Bairro(res.getInt("bairro_id"));
        e.setBairro(b);

        return e;
    }
}