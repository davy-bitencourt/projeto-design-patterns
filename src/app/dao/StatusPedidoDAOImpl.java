/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.dao;
import app.entity.StatusPedido;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Dave
 */
public class StatusPedidoDAOImpl implements StatusPedidoDAO{
    
    private Connection con;

    public StatusPedidoDAOImpl(Connection con) {
        this.con = con;
    }

    @Override
    public void inserir(StatusPedido status) {
        String sql = "INSERT INTO status_pedido (pedido_id, progresso) VALUES (?, ?)";
        try(PreparedStatement stmt = con.prepareStatement(sql)){
            stmt.setInt(1, status.getPedidoId());
            stmt.setString(2, status.getProgresso());
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<StatusPedido> listarStatusPedido() {
        List<StatusPedido> pedidos = new ArrayList<>();
        String sql = "SELECT * FROM status_pedido";
        try(Statement stmt = con.createStatement(); ResultSet rs = stmt.executeQuery(sql)){
            StatusPedido pedido = new StatusPedido();
            pedido.setId(rs.getInt("id"));
            pedido.setPedidoId(rs.getInt("pedido_id"));
            pedido.setProgresso(rs.getString("progresso"));
            pedidos.add(pedido);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pedidos;
    }

    @Override
    public void atualizar(StatusPedido status) {
        String sql = "UPDATE status_pedido SET pedido_id = ?, progresso = ? WHERE id = ?";
        try(PreparedStatement stmt = con.prepareStatement(sql)){
            stmt.setInt(1, status.getPedidoId());
            stmt.setString(2, status.getProgresso());
            stmt.setInt(3, status.getId());
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deletar(int id) {
        String sql = "DELETE FROM status_pedido WHERE id = ?";
        try(PreparedStatement stmt = con.prepareStatement(sql)){
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
}
