/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.dao;
import app.entity.Funcionario;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Dave
 */
public class FuncionarioDAOImpl implements FuncionarioDAO{
    
    private Connection con;

    public FuncionarioDAOImpl(Connection con) {
        this.con = con;
    }

    @Override
    public void inserir(Funcionario funcionario) {
        String sql = "INSERT INTO funcionario (nome, login_id, telefone_id, cpf, rg) VALUES (?, ?, ?, ?, ?)";
        try(PreparedStatement stmt = con.prepareStatement(sql)){
            stmt.setString(1, funcionario.getNome());
            stmt.setInt(2, funcionario.getLoginId());
            stmt.setInt(3, funcionario.getTelefoneId());
            stmt.setString(4, funcionario.getCpf());
            stmt.setString(5, funcionario.getRg());
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Funcionario> listarFuncionario() {
        List<Funcionario> funcionarios = new ArrayList<>();
        String sql = "SELECT * FROM funcionario";
        try(Statement stmt = con.createStatement(); ResultSet rs = stmt.executeQuery(sql)){
            Funcionario funcionario = new Funcionario();
            funcionario.setId(rs.getInt("id"));
            funcionario.setNome(rs.getString("nome"));
            funcionario.setLoginId(rs.getInt("login_id"));
            funcionario.setTelefoneId(rs.getInt("telefone_id"));
            funcionario.setCpf(rs.getString("cpf"));
            funcionario.setRg(rs.getString("rg"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return funcionarios;
    }

    @Override
    public void atualizar(Funcionario funcionario) {
        String sql = "UPDATE funcionario SET id = ?, nome = ?, login_id = ?, telefone_id = ?, cpf = ?, rg = ?";
        try(PreparedStatement stmt = con.prepareStatement(sql)){
            stmt.setInt(1, funcionario.getId());
            stmt.setString(2, funcionario.getNome());
            stmt.setInt(3, funcionario.getLoginId());
            stmt.setInt(4, funcionario.getTelefoneId());
            stmt.setString(5, funcionario.getCpf());
            stmt.setString(6, funcionario.getRg());
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deletar(int id) {
        String sql = "DELETE FROM funcionario WHERE id = ?";
        try(PreparedStatement stmt = con.prepareStatement(sql)){
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
