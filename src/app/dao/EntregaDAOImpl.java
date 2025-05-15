/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.dao;
import app.entity.Entrega;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Dave
 */
public class EntregaDAOImpl implements EntregaDAO{
    
    private Connection con;

    public EntregaDAOImpl(Connection con) {
        this.con = con;
    }

    @Override
    public void inserir(Entrega entrega) {
        String sql = "INSERT INTO entrega (cliente_id, tipo_entrega, delivery_id, pedido_id, status_pedidos_id) VALUES (?, ?, ?, ?, ?)";
        try(PreparedStatement stmt = con.prepareStatement(sql)){
            stmt.setInt(1, entrega.getClienteId());
            stmt.setBoolean(2, entrega.isTipoEntrega());
            stmt.setInt(3, entrega.getDeliveryId());
            stmt.setInt(4, entrega.getPedidoId());
            stmt.setInt(5, entrega.getStatusPedidosId());
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Entrega> listarEntrega() {
        List<Entrega> entregas = new ArrayList<>();
        String sql = "SELECT * FROM entrega";
        try(Statement stmt = con.createStatement(); ResultSet rs = stmt.executeQuery(sql)){
            Entrega entrega = new Entrega();
            entrega.setClienteId(rs.getInt("cliente_id"));
            entrega.isTipoEntrega(rs.getBoolean("tipo_entrega"));
            entrega.setDeliveryId(rs.getInt("delivery_id"));
            entrega.setPedidoId(rs.getInt("pedido_id"));
            entrega.setStatusPedidosId(rs.getInt("status_pedidos_id"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return entregas;
    }

    @Override
    public void atualizar(Entrega entrega) {
        String sql = "UPDATE entrega SET id = ?, cliente_id = ?, tipo_entrega = ?, delivery_id = ?, pedido_id = ?, status_pedidos_id = ?";
        try(PreparedStatement stmt = con.prepareStatement(sql)){
            stmt.setInt(1, entrega.getId());
            stmt.setInt(2, entrega.getClienteId());
            stmt.setBoolean(3, entrega.isTipoEntrega());
            stmt.setInt(4, entrega.getDeliveryId());
            stmt.setInt(5, entrega.getPedidoId());
            stmt.setInt(6, entrega.getStatusPedidosId());
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deletar(int id) {
        String sql = "DELETE FROM entrega WHERE id = ?";
        try(PreparedStatement stmt = con.prepareStatement(sql)){
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    } 
    
    
}
