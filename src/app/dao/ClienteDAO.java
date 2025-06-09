/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package app.dao;
import app.entity.Cliente;
import app.entity.Telefone;
import app.interfaces.Entidade;
import app.interfaces.InterfaceDAO;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author Dave
 */
public class ClienteDAO extends InterfaceDAO {

    @Override
    public Entidade preencheDados(ResultSet res) throws SQLException {
        Cliente c = new Cliente(
            res.getInt("id"),
            res.getString("nome")
        );

        Integer telefoneId = res.getObject("telefone_id") != null ? res.getInt("telefone_id") : null;
        if (telefoneId != null) {
            c.setTelefone(new Telefone(telefoneId));
        }

        return c;
    }
}