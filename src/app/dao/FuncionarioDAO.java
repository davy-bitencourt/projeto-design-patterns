/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package app.dao;
import app.entity.Funcionario;
import app.entity.Login;
import app.interfaces.Entidade;
import app.interfaces.InterfaceDAO;
import java.util.List;
import java.sql.SQLException;
import java.sql.ResultSet;

/**
 *
 * @author Dave
 */
public class FuncionarioDAO extends InterfaceDAO {

    @Override
    public Entidade preencheDados(ResultSet res) throws SQLException {
        Funcionario f = new Funcionario(res.getInt("id"), res.getString("nome"), res.getString("cpf"), res.getString("rg"), null, null 
        );

        Integer loginId = res.getObject("login_id") != null ? res.getInt("login_id") : null;
        if (loginId != null) {
            f.setLogin(new Login(loginId));
        }

        return f;
    }
}