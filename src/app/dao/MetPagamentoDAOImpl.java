/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.dao;
import app.entity.MetPagamento;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Dave
 */
public class MetPagamentoDAOImpl implements MetPagamentoDAO {
    
    private Connection con;

    public MetPagamentoDAOImpl(Connection con) {
        this.con = con;
    }

    @Override
    public void inserir(MetPagamento metPagamento) {
        String sql = "INSERT INTO met_pagamento (pix, dinheiro_id, cartao_id) VALUES (?, ?, ?)";
        try(PreparedStatement stmt = con.prepareStatement(sql)){
            stmt.setString(1, metPagamento.getPix());
            stmt.setInt(2, metPagamento.getDinheiroId());
            stmt.setInt(3, metPagamento.getCartaoId());
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<MetPagamento> listarMetPagamento() {
        List<MetPagamento> metPagamentos = new ArrayList<>();
        String sql = "SELECT * FROM met_pagamento";
        try(Statement stmt = con.createStatement(); ResultSet rs = stmt.executeQuery(sql)){
            MetPagamento metPagamento = new MetPagamento();
            metPagamento.setId(rs.getInt("id"));
            metPagamento.setPix(rs.getString("pix"));
            metPagamento.setDinheiroId(rs.getInt("dinheiro_id"));
            metPagamento.setCartaoId(rs.getInt("cartao_id"));
            metPagamentos.add(metPagamento);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return metPagamentos;
    }

    @Override
    public void atualizar(MetPagamento metPagamento) {
        String sql = "UPDATE met_pagamento SET pix = ?, dinheiro_id = ?, cartao_id = ? WHERE id = ?";
        try(PreparedStatement stmt = con.prepareStatement(sql)){
            stmt.setString(1, metPagamento.getPix());
            stmt.setInt(2, metPagamento.getDinheiroId());
            stmt.setInt(3, metPagamento.getCartaoId());
            stmt.setInt(4, metPagamento.getId());
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deletar(int id) {
        String sql = "DELETE FROM met_pagamento WHERE id = ?";
        try(PreparedStatement stmt = con.prepareStatement(sql)){
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
