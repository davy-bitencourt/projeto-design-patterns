/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package app.dao;

import app.entity.Bairro;
import app.interfaces.Entidade;
import app.interfaces.InterfaceDAO;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Dave
 */
public class BairroDAO extends InterfaceDAO {

    @Override
    public Entidade preencheDados(ResultSet res) throws SQLException {
        Bairro b = new Bairro(res.getString("nome"));
        b.setId(res.getInt("id"));
        return b;
    }
}
