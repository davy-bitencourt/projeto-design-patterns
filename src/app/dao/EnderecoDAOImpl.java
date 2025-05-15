/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.dao;
import app.entity.Endereco;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Dave
 */
public class EnderecoDAOImpl implements EnderecoDAO{
    
    private Connection con;

    public EnderecoDAOImpl(Connection con) {
        this.con = con;
    }

    @Override
    public void inserir(Endereco endereco) {
        String sql = "INSERT INTO endereco (rua, cep, bairro_id, distancia) VALUES (?, ?, ?, ?)";
        try(PreparedStatement stmt = con.prepareStatement(sql)){
            stmt.setString(1, endereco.getRua());
            stmt.setInt(2, endereco.getCep());
            stmt.setInt(3, endereco.getBairroId());
            stmt.setString(4, endereco.getDistancia());
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Endereco> listarEndereco() {
        List<Endereco> enderecos = new ArrayList<>();
        String sql = "SELECT * FROM endereco";
        try(Statement stmt = con.createStatement(); ResultSet rs = stmt.executeQuery(sql)){
            Endereco endereco = new Endereco();
            endereco.setId(rs.getInt("id"));
            endereco.setRua(rs.getString("rua"));
            endereco.setCep(rs.getInt("cep"));
            endereco.setBairroId(rs.getInt("bairro_id"));
            endereco.setDistancia(rs.getString("distancia"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return enderecos;
    }

    @Override
    public void atualizar(Endereco endereco) {
        String sql = "UPDATE endereco SET rua = ?, cep = ?, bairro_id = ?, distancia = ?";
        try(PreparedStatement stmt = con.prepareStatement(sql)){
            stmt.setString(1, endereco.getRua());
            stmt.setInt(2, endereco.getCep());
            stmt.setInt(3, endereco.getBairroId());
            stmt.setString(4, endereco.getDistancia());
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deletar(int id) {
        String sql = "DELETE FROM endereco WHERE id = ?";
        try(PreparedStatement stmt = con.prepareStatement(sql)){
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }   
    
}
