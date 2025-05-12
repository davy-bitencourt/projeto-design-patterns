/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.dao;

import app.entity.Carrinho;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dave
 */
public class CarrinhoDAOImpl implements CarrinhoDAO {
    
    private Connection con;

    public CarrinhoDAOImpl(Connection con){
        this.con = con;
    }

    @Override
    public void inserir(Carrinho carrinho) {
        String sql = "INSERT INTO carrinho (id, produto_id, quantidade, indrediente_escolha_id) VALUES (?, ?, ?, ?)";
        try(PreparedStatement stmt = con.prepareStatement(sql)){
            stmt.setInt(1, carrinho.getId());
            stmt.setInt(2, carrinho.getProdutoId());
            stmt.setInt(3, carrinho.getQuantidade());
            stmt.setInt(4, carrinho.getIngredienteEscolhaId());
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Carrinho> listarCarrinho() {
        List<Carrinho> carrinhos = new ArrayList<>();
        String sql = "SELECT * FROM carrinho";
        try(Statement stmt = con.createStatement(); ResultSet rs = stmt.executeQuery(sql)) { //é bom dar uma revisda a respeito desse tracho aq
            Carrinho carrinho = new Carrinho();
            carrinho.setId(rs.getInt("id"));
            carrinho.setProdutoId(rs.getInt("produto_id"));
            carrinho.setQuantidade(rs.getInt("quantidade"));
            carrinho.setIngredienteEscolhaId(rs.getInt("ingrediente_escolha_id"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return carrinhos;
    }

    @Override
    public void atualizar(Carrinho carrinho) {
        String sql = "UPDATE carrinho SET id = ?, produto_id = ?, quantidade = ?, ingrediente_escolha_id = ?";
        try(PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setInt(1, carrinho.getId());
            stmt.setInt(2, carrinho.getProdutoId());
            stmt.setInt(3, carrinho.getQuantidade());
            stmt.setInt(4, carrinho.getIngredienteEscolhaId());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deletar(int id) {
        String sql = "DELETE FORM carrinho WHERE id = ?";
        try(PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
