/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.dao;
import app.entity.Reembolso;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Dave
 */
public class ReembolsoDAOImpl implements ReembolsoDAO {
    
    private Connection con;

    public ReembolsoDAOImpl(Connection con) {
        this.con = con;
    }

    @Override
    public void inserir(Reembolso reembolso) {
        String sql = "INSERT INTO reembolso (pedido_id, motivo) VALUES (?, ?)";
        try(PreparedStatement stmt = con.prepareStatement(sql)){
            stmt.setInt(1, reembolso.getPedidoId());
            stmt.setString(2, reembolso.getMotivo());
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Reembolso> listarReembolso() {
        List<Reembolso> reembolsos = new ArrayList<>();
        String sql = "SELECT * FROM reembolso";
        try(Statement stmt = con.createStatement(); ResultSet rs = stmt.executeQuery(sql)){
            Reembolso reembolso = new Reembolso();
            reembolso.setId(rs.getInt("id"));
            reembolso.setPedidoId(rs.getInt("pedido_id"));
            reembolso.setMotivo(rs.getString("motivo"));
            reembolsos.add(reembolso);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return reembolsos;
    }

    @Override
    public void atualizar(Reembolso reembolso) {
        String sql = "UPDATE reembolso SET pedido_id = ?, motivo = ? WHERE id = ?";
        try(PreparedStatement stmt = con.prepareStatement(sql)){
            stmt.setInt(1, reembolso.getPedidoId());
            stmt.setString(2, reembolso.getMotivo());
            stmt.setInt(3, reembolso.getId());
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deletar(int id) {
        String sql = "DELETE FROM reembolso WHERE id = ?";
        try(PreparedStatement stmt = con.prepareStatement(sql)){
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }        
}