/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.dao;
import app.entity.Pagamento;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Dave
 */
public class PagamentoDAOImpl implements PagamentoDAO {
    
    private Connection con;

    public PagamentoDAOImpl(Connection con) {
        this.con = con;
    }

    @Override
    public void inserir(Pagamento pagamento) {
        String sql = "INSERT INTO pagamento (met_pagamento_id, cupom_id, pedido_id) VALUES (?, ?, ?)";
        try(PreparedStatement stmt = con.prepareStatement(sql)){
            stmt.setInt(1, pagamento.getMetPagamentoId());
            stmt.setInt(2, pagamento.getCupomId());
            stmt.setInt(3, pagamento.getPedidoId());
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Pagamento> listarPagamento() {
        List<Pagamento> pagamentos = new ArrayList<>();
        String sql = "SELECT * FROM pagamento";
        try(Statement stmt = con.createStatement(); ResultSet rs = stmt.executeQuery(sql)){
            Pagamento pagamento = new Pagamento();
            pagamento.setId(rs.getInt("id"));
            pagamento.setMetPagamentoId(rs.getInt("met_pagamento_id"));
            pagamento.setCupomId(rs.getInt("cupom_id"));
            pagamento.setPedidoId(rs.getInt("pedido_id"));
            pagamentos.add(pagamento);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pagamentos;
    }

    @Override
    public void atualizar(Pagamento pagamento) {
        String sql = "UPDATE pagamento SET met_pagamento_id = ?, cupom_id = ?, pedido_id = ? WHERE id = ?";
        try(PreparedStatement stmt = con.prepareStatement(sql)){
            stmt.setInt(1, pagamento.getMetPagamentoId());
            stmt.setInt(2, pagamento.getCupomId());
            stmt.setInt(3, pagamento.getPedidoId());
            stmt.setInt(4, pagamento.getId());
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deletar(int id) {
        String sql = "DELETE FROM pagamento WHERE id = ?";
        try(PreparedStatement stmt = con.prepareStatement(sql)){
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
