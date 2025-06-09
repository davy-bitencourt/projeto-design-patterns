/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package app.dao;
import app.entity.Login;
import app.interfaces.Entidade;
import app.interfaces.InterfaceDAO;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author Dave
 */
public class LoginDAO extends InterfaceDAO {

    @Override
    public Entidade preencheDados(ResultSet res) throws SQLException {
        Login login = new Login();
        login.setId(res.getInt("id"));
        login.setUsuario(res.getString("usuario"));
        login.setSenha(res.getString("senha"));

        return login;
    }
}
