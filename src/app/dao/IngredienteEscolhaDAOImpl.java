/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.dao;
import java.sql.*;
import app.entity.IngredienteEscolha;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Dave
 */
public class IngredienteEscolhaDAOImpl implements IngredienteEscolhaDAO{
    
    private Connection con;

    public IngredienteEscolhaDAOImpl(Connection con) {
        this.con = con;
    }

    @Override
    public void inserir(IngredienteEscolha ingrediente) {
        String sql = "INSERT INTO ingrediente_escolha (ingrediente_adicionar_id, ingrediente_remover_id) VALUES (?, ?)";
        try(PreparedStatement stmt = con.prepareStatement(sql)){
            stmt.setInt(1, ingrediente.getIngredienteAdicionalId());
            stmt.setInt(2, ingrediente.getIngerienteRemoverId());
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<IngredienteEscolha> listarIngredienteEscolha() {
        List<IngredienteEscolha> ingredientes = new ArrayList<>();
        String sql = "SELECT * FROM ingrediente_escolha";
        try(Statement stmt = con.createStatement(); ResultSet rs = stmt.executeQuery(sql)){
            IngredienteEscolha ingrediente = new IngredienteEscolha();
            ingrediente.setId(rs.getInt("id"));
            ingrediente.setIngredienteAdicionalId(rs.getInt("ingrediente_adicionar"));
            ingrediente.setIngredienteAdicionalId(rs.getInt("ingrediente_remover"));
            ingredientes.add(ingrediente);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ingredientes;
    }

    @Override
    public void atualizar(IngredienteEscolha ingrediente) {
        String sql = "UPDATE ingrediente_escolha SET ingrediente_adicionar_id = ?, ingrediente_remover_id = ?";
        try(PreparedStatement stmt = con.prepareStatement(sql)){
            stmt.setInt(1, ingrediente.getId());
            stmt.setInt(2, ingrediente.getIngredienteAdicionalId());
            stmt.setInt(3, ingrediente.getIngerienteRemoverId());
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deletar(int id) {
        String sql = "DELETE FROM ingrediente_escolha WHERE id = ?";
        try(PreparedStatement stmt = con.prepareStatement(sql)){
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
