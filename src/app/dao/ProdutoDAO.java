/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package app.dao;

import app.entity.Produto;
import app.interfaces.Entidade;
import app.interfaces.InterfaceDAO;
import java.util.List;
import java.sql.SQLException;
import java.sql.ResultSet;

/**
 *
 * @author Dave
 */
public class ProdutoDAO extends InterfaceDAO {

    @Override
    public Entidade preencheDados(ResultSet res) throws SQLException {
        Produto p = new Produto();
        p.setId(res.getInt("id"));
        p.setNome(res.getString("nome"));
        p.setValorUnitario(res.getDouble("valor_unitario"));

        return p;
    }
}

