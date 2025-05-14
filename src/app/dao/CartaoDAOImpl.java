/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.dao;
import app.entity.Cartao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Dave
 */
public class CartaoDAOImpl implements CartaoDAO {
     
    private Connection con;

    public CartaoDAOImpl(Connection con) {
        this.con = con;
    }

    @Override
    public void inserir(Cartao cartao) { //os valores são inseridos dentro do banco de dados
        String sql = "INSERT INTO cartao (pix, dinheiro_id, cartao_id) VALUES (?, ?, ?)";
        try(PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setString(1, cartao.getPix()); //tiram do objeto e colocar na Query
            stmt.setInt(2, cartao.getDinheiroId());
            stmt.setInt(3, cartao.getCartaoId());
            stmt.executeUpdate(); //executa a Query botando os itens no banco de dados
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Cartao> listarCartao() { //os valores são retirados da do banco através da Query e colocados no bjeto
        List<Cartao> cartaos = new ArrayList<>();
        String sql = "SELECT * FROM cartao";
        try(Statement stmt = con.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {  //executeQuery() usado para SELECT retorna um objeto ResultSet
            Cartao cartao = new Cartao(); //o Objeto é criado
            cartao.setId(rs.getInt("id")); //os valores obtidos através da Query são adicionados no Objeto
            cartao.setPix(rs.getString("pix"));
            cartao.setDinheiroId(rs.getInt("dinheiro_id"));
            cartao.setCartaoId(rs.getInt("cartao_id"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cartaos;
    }

    @Override
    public void atualizar(Cartao cartao) {
        String sql = "UPDATE cartao SET id = ?, pix = ?, dinheiro_id = ?, cartao_id = ";
        try(PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setInt(1, cartao.getId());
            stmt.setString(2, cartao.getPix());
            stmt.setInt(3, cartao.getDinheiroId());
            stmt.setInt(4, cartao.getCartaoId());
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deletar(int id) {
        String sql = "DELETE FROM cartao WHERE id = ?";
        try(PreparedStatement stmt = con.prepareStatement(sql)) { 
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
