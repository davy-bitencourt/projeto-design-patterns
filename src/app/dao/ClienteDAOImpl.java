/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.dao;
import java.sql.*;
import app.entity.Cliente;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Dave
 */
public class ClienteDAOImpl implements ClienteDAO{
    
    private Connection con;
    
    public ClienteDAOImpl(Connection con){
        this.con = con;
    }

    @Override
    public void inserir(Cliente cliente) {
        String sql = "INSERT INTO cliente (nome, telefone_id) VALUES (?, ?)";
        try(PreparedStatement stmt = con.prepareStatement(sql)){
            stmt.setString(1, cliente.getNome());
            stmt.setInt(2, cliente.getTelefoneId());
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
        

    @Override
    public List<Cliente> listarCliente() {
        List<Cliente> clientes = new ArrayList<>();
        String sql = "SELECT * FROM cliente";
        try(Statement stmt = con.createStatement(); ResultSet rs = stmt.executeQuery(sql)){
            Cliente cliente = new Cliente();
            cliente.setId(rs.getInt("id"));
            cliente.setNome(rs.getString("nome"));
            cliente.setTelefoneId(rs.getInt("telefone_id"));
        } catch(Exception e) {
            e.printStackTrace();
        } 
        return clientes;
    }

    @Override
    public void atualizar(Cliente cliente) {
        String sql = "UPDATE cliente SET id = ?, nome = ?, telefone_id = ?";
        try(PreparedStatement stmt = con.prepareStatement(sql)){
            stmt.setInt(1, cliente.getId());
            stmt.setString(2, cliente.getNome());
            stmt.setInt(3, cliente.getTelefoneId());
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deletar(int id) {
        String sql = "DELETE FROM cliente WHERE id = ?";
        try(PreparedStatement stmt = con.prepareStatement(sql)){
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
        
}
