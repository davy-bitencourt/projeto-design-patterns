/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.dao;
import app.entity.Pedido;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Dave
 */
public class PedidoDAOImpl implements PedidoDAO {
    
    private Connection con;

    public PedidoDAOImpl(Connection con) {
        this.con = con;
    }

    @Override
    public void inserir(Pedido pedido) {
        String sql = "INSERT INTO pedido (hora_pedido, cliente_id, numero_pedido, carrinho_id, data_pedido, status_pedido, entrega_id) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try(PreparedStatement stmt = con.prepareStatement(sql)){
            stmt.setString(1, pedido.getHoraPedido());
            stmt.setInt(2, pedido.getClienteId());
            stmt.setString(3, pedido.getNumeroPedido());
            stmt.setInt(4, pedido.getCarrinhoId());
            stmt.setString(5, pedido.getDataPedido());
            stmt.setInt(6, pedido.getStatusPedido());
            stmt.setInt(7, pedido.getEntregaId());
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Pedido> listarPedido() {
        List<Pedido> pedidos = new ArrayList<>();
        String sql = "SELECT * FROM pedido";
        try(Statement stmt = con.createStatement(); ResultSet rs = stmt.executeQuery(sql)){
            Pedido pedido = new Pedido();
            pedido.setId(rs.getInt("id"));
            pedido.setHoraPedido(rs.getString("hora_pedido"));
            pedido.setClienteId(rs.getInt("cliente_id"));
            pedido.setNumeroPedido(rs.getString("numero_pedido"));
            pedido.setCarrinhoId(rs.getInt("carrinho_id"));
            pedido.setDataPedido(rs.getString("data_pedido"));
            pedido.setStatusPedido(rs.getInt("status_id"));
            pedido.setEntregaId(rs.getInt("entrega_id"));
            pedidos.add(pedido);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pedidos;
    }

    @Override
    public void atualizar(Pedido pedido) {
        String sql = "UPDATE pedido SET hora_pedido = ?, cliente_id = ?, numero_pedido = ?, carrinho_id = ?, data_pedido = ?, status_pedido = ?, entrega_id = ? WHERE id = ?";
        try(PreparedStatement stmt = con.prepareStatement(sql)){
            stmt.setString(1, pedido.getHoraPedido());
            stmt.setInt(2, pedido.getClienteId());
            stmt.setString(3, pedido.getNumeroPedido());
            stmt.setInt(4, pedido.getCarrinhoId());
            stmt.setString(5, pedido.getDataPedido());
            stmt.setInt(6, pedido.getStatusPedido());
            stmt.setInt(7, pedido.getEntregaId());
            stmt.setInt(8, pedido.getId());
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deletar(int id) {
        String sql = "DELETE FROM pedido WHERE id = ?";
        try(PreparedStatement stmt = con.prepareStatement(sql)){
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }    
}
