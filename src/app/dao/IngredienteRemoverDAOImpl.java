/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.dao;
import java.sql.*;
import app.entity.IngredienteRemover;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Dave
 */
public class IngredienteRemoverDAOImpl implements IngredienteRemoverDAO{
    
    private Connection con;

    public IngredienteRemoverDAOImpl(Connection con) {
        this.con = con;
    }

    @Override
    public void inserir(IngredienteRemover ingrediente) {
        String sql = "INSERT INTO ingrediente_remover (nome) VALUES (?)";
        try(PreparedStatement stmt = con.prepareStatement(sql)){
            stmt.setString(1, ingrediente.getNome());
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<IngredienteRemover> listarIngredienteRemover() {
        List<IngredienteRemover> ingredientes = new ArrayList<>();
        String sql = "SELECT * FROM ingrediente_remover";
        try(Statement stmt = con.createStatement(); ResultSet rs = stmt.executeQuery(sql)){
            IngredienteRemover ingrediente = new IngredienteRemover();
            ingrediente.setId(rs.getInt("id"));
            ingrediente.setNome(rs.getString("nome"));
            ingredientes.add(ingrediente);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ingredientes;
    }

    @Override
    public void atualizar(IngredienteRemover ingrediente) {
        String sql = "UPDATE ingrediente_remover SET id = ?, nome = ?";
        try(PreparedStatement stmt = con.prepareStatement(sql)){
            stmt.setInt(1, ingrediente.getId());
            stmt.setString(2, ingrediente.getNome());
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deletar(int id) {
        String sql = "DELETE FROM ingrediente_remover WHERE id = ?";
        try(PreparedStatement stmt = con.prepareStatement(sql)){
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
}
