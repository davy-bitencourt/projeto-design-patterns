/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.dao;
import app.entity.Login;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Dave
 */
public class LoginDAOImpl implements LoginDAO {
    
    private Connection con;

    public LoginDAOImpl(Connection con) {
        this.con = con;
    }

    @Override
    public void inserir(Login login) {
        String sql = "INSERT INTO login (senha, login_funcionario) VALUES (?, ?)";
        try(PreparedStatement stmt = con.prepareStatement(sql)){
            stmt.setString(1, login.getSenha());
            stmt.setInt(2, login.getLoginFuncionario());
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Login> listarLogin() {
        List<Login> logins = new ArrayList<>();
        String sql = "SELECT * FROM login";
        try(Statement stmt = con.createStatement(); ResultSet rs = stmt.executeQuery(sql)){
            Login login =  new Login();
            login.setId(rs.getInt("id"));
            login.setSenha(rs.getString("senha"));
            login.setLoginFuncionario(rs.getInt("login_funcionario"));
            logins.add(login);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return logins;
    }

    @Override
    public void atualizar(Login login) {
        String sql = "UPDATE login SET senha = ?, login_funcionario = ? WHERE id = ?";
        try(PreparedStatement stmt = con.prepareStatement(sql)){
            stmt.setString(1, login.getSenha());
            stmt.setInt(2, login.getLoginFuncionario());
            stmt.setInt(3, login.getId());
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deletar(int id) {
        String sql = "DELETE FROM login WHERE id = ?";
        try(PreparedStatement stmt = con.prepareStatement(sql)){
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    
}
