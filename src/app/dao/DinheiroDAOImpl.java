/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.dao;
import app.entity.Dinheiro;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Dave
 */
public class DinheiroDAOImpl implements DinheiroDAO{
    
    private Connection con;

    public DinheiroDAOImpl(Connection con) {
        this.con = con;
    }

    @Override
    public void inserir(Dinheiro dinheiro) {
        String sql = "INSERT INTO dinheiro (valor_entrega) VALUES(?)";
        try(PreparedStatement stmt = con.prepareStatement(sql)){
            stmt.setDouble(1, dinheiro.getValorEntrega());
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Dinheiro> listarDinheiro() {
        List<Dinheiro> dinheiros = new ArrayList<>();
        String sql = "SELECT * FROM dinheiro";
        try(Statement stmt = con.createStatement(); ResultSet rs = stmt.executeQuery(sql)){
            Dinheiro dinheiro = new Dinheiro();
            dinheiro.setId(rs.getInt("id"));
            dinheiro.setValorEntrega(rs.getDouble("valor_entrega"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dinheiros;
    }

    @Override
    public void atualizar(Dinheiro dinheiro) {
        String sql = "UPDATE dinheiro SET id = ?, valor_entrega = ?";
        try(PreparedStatement stmt = con.prepareStatement(sql)){
            stmt.setInt(1, dinheiro.getId());
            stmt.setDouble(2, dinheiro.getValorEntrega());
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deletar(int id) {
        String sql = "DELETE FROM dinheiro WHERE id = ?";
        try(PreparedStatement stmt = con.prepareStatement(sql)){
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
}
