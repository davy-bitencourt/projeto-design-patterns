/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.dao;
import app.entity.Delivery;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Dave
 */
public class DeliveryDAOImpl implements DeliveryDAO {
    
    private Connection con;

    public DeliveryDAOImpl(Connection con) {
        this.con = con;
    }

    @Override
    public void inserir(Delivery delivery) {
        String sql = "INSERT INTO delivery (chave_entrega, numero, complemento, endereco_id) VALUES (?, ?, ?, ?)";
        try(PreparedStatement stmt = con.prepareStatement(sql)){
            stmt.setString(1, delivery.getChaveEntrega());
            stmt.setString(2, delivery.getNumero());
            stmt.setString(3, delivery.getComplemento());
            stmt.setInt(4, delivery.getEnderecoId());
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Delivery> listarDelivery() {
        List<Delivery> deliverys = new ArrayList<>();
        String sql = "SELECT * FROM delivery";
        try(Statement stmt = con.createStatement(); ResultSet rs = stmt.executeQuery(sql)){
            Delivery delivery = new Delivery();
            delivery.setId(rs.getInt("id"));
            delivery.setChaveEntrega(rs.getString("chave_entrega"));
            delivery.setNumero(rs.getString("numero"));
            delivery.setComplemento(rs.getString("complemento"));
            delivery.setEnderecoId(rs.getInt("endereco_id"));
        } catch (Exception e) {
            e.printStackTrace();
        } return deliverys;
    }

    @Override
    public void atualizar(Delivery delivery) {
        String sql = "UPDATE delivery SET chave_entrega = ?, numero = ?, complemento = ?, endereco_id = ?";
        try(PreparedStatement stmt = con.prepareStatement(sql)){
            stmt.setString(1, delivery.getChaveEntrega());
            stmt.setString(2, delivery.getNumero());
            stmt.setString(3, delivery.getComplemento());
            stmt.setInt(4, delivery.getEnderecoId());
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deletar(int id) {
        String sql = "DELETE FROM delivery WHERE id = ?";
        try(PreparedStatement stmt = con.prepareStatement(sql)){
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    
}
