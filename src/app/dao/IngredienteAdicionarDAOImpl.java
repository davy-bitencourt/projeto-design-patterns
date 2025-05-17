/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.dao;
import java.sql.*;
import app.entity.IngredienteAdicionar;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Dave
 */
public class IngredienteAdicionarDAOImpl implements IngredienteAdicionarDAO{
        
    private Connection con;

    public IngredienteAdicionarDAOImpl(Connection con) {
        this.con = con;
    }

    @Override
    public void inserir(IngredienteAdicionar ingrediente) {
        String sql = "INSERT INTO ingrediente_adicionar (nome, valor) VALUES (?, ?)";
        try(PreparedStatement stmt = con.prepareStatement(sql)){
            stmt.setString(1, ingrediente.getNome());
            stmt.setDouble(2, ingrediente.getValor());
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<IngredienteAdicionar> listarIngredienteAdicionar() {
        List<IngredienteAdicionar> ingredientes = new ArrayList<>();
        String sql = "SELECT * FROM ingrediente_adicionar";
        try(Statement stmt = con.createStatement(); ResultSet rs = stmt.executeQuery(sql)){
            IngredienteAdicionar ingrediente = new IngredienteAdicionar();
            ingrediente.setId(rs.getInt("id"));
            ingrediente.setNome(rs.getString("nome"));
            ingrediente.setValor(rs.getDouble("valor"));
            ingredientes.add(ingrediente);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ingredientes;
    }

    @Override
    public void atualizar(IngredienteAdicionar ingrediente) {
        String sql = "UPDATE ingrediente_adicionar SET id = ?, nome = ?, valor = ?";
        try(PreparedStatement stmt = con.prepareStatement(sql)){
            stmt.setInt(1, ingrediente.getId());
            stmt.setString(2, ingrediente.getNome());
            stmt.setDouble(3, ingrediente.getValor());
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deletar(int id) {
        String sql = "DELETE FROM ingrediente_adicionar WHERE id = ?";
        try(PreparedStatement stmt = con.prepareStatement(sql)){
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
}
