/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.dao;
import app.entity.Telefone;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Dave
 */
public class TelefoneDAOImpl implements TelefoneDAO{
    
    private Connection con;

    public TelefoneDAOImpl(Connection con) {
        this.con = con;
    }

    @Override
    public void inserir(Telefone telefone) {
        String sql = "INSERT INTO telefone (dd, numero, funcionario_id, cliente_id) VALUES (?, ?, ?, ?)";
        try(PreparedStatement stmt = con.prepareStatement(sql)){
            stmt.setInt(1, telefone.getDd());
            stmt.setInt(2, telefone.getNumero());
            stmt.setInt(3, telefone.getFuncionarioId());
            stmt.setInt(4, telefone.getClienteId());
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Telefone> listarTelefone() {
        List<Telefone> telefones = new ArrayList<>();
        String sql = "SELECT * FROM telefone";
        try(Statement stmt = con.createStatement(); ResultSet rs = stmt.executeQuery(sql)){
            Telefone telefone = new Telefone();
            telefone.setId(rs.getInt("id"));
            telefone.setDd(rs.getInt("dd"));
            telefone.setNumero(rs.getInt("numero"));
            telefone.setFuncionarioId(rs.getInt("funcionario_id"));
            telefone.setClienteId(rs.getInt("cliente_id"));
            telefones.add(telefone);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return telefones;
    }

    @Override
    public void atualizar(Telefone telefone) {
        String sql = "UPDATE telefone SET dd = ?, numero = ?, funcionario_id = ?, cliente_id = ? WHERE id = ?";
        try(PreparedStatement stmt = con.prepareStatement(sql)){
            stmt.setInt(1, telefone.getDd());
            stmt.setInt(2, telefone.getNumero());
            stmt.setInt(3, telefone.getFuncionarioId());
            stmt.setInt(4, telefone.getClienteId());
            stmt.setInt(5, telefone.getId());
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deletar(int id) {
        String sql = "DELETE FROM telefone WHERE id = ?";
        try(PreparedStatement stmt = con.prepareStatement(sql)){
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }    
}
