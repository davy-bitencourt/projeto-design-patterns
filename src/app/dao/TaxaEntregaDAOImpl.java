/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.dao;
import app.entity.TaxaEntrega;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Dave
 */
public class TaxaEntregaDAOImpl implements TaxaEntregaDAO{
    
    private Connection con;

    public TaxaEntregaDAOImpl(Connection con) {
        this.con = con;
    }

    @Override
    public void inserir(TaxaEntrega taxa) {
        String sql = "INSERT INTO taxa_entrega (endereco_id, taxa_entrega) VALUES (?, ?)";
        try(PreparedStatement stmt = con.prepareStatement(sql)){
            stmt.setInt(1, taxa.getEnderecoId());
            stmt.setDouble(2, taxa.getTraxaEntrega());
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<TaxaEntrega> listarTaxaEntrega() {
        List<TaxaEntrega> entregas = new ArrayList<>();
        String sql = "SELECT * FROM taxa_entrega";
        try(Statement stmt = con.createStatement(); ResultSet rs = stmt.executeQuery(sql)){
            TaxaEntrega entrega = new TaxaEntrega();
            entrega.setId(rs.getInt("id"));
            entrega.setEnderecoId(rs.getInt("endereco_id"));
            entrega.setTraxaEntrega(rs.getDouble("taxa_entrega"));
            entregas.add(entrega);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return entregas;
    }

    @Override
    public void atualizar(TaxaEntrega taxa) {
        String sql = "UPDATE taxa_entrega SET endereco_id = ?, taxa_entrega = ? WHERE id = ?";
        try(PreparedStatement stmt = con.prepareStatement(sql)){
            stmt.setInt(1, taxa.getEnderecoId());
            stmt.setDouble(2, taxa.getTraxaEntrega());
            stmt.setInt(3, taxa.getId());
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deletar(int id) {
        String sql = "DELETE FROM taxa_entrega WHERE id = ?";
        try(PreparedStatement stmt = con.prepareStatement(sql)){
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
}
