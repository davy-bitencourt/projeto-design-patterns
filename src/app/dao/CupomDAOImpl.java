/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.dao;
import app.entity.Cupom;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Dave
 */
public class CupomDAOImpl implements CupomDAO {
    
    private Connection con;

    public CupomDAOImpl(Connection con) {
        this.con = con;
    }

    @Override
    public void inserir(Cupom cupom) {
        String sql = "INSERT INTO cupom (valor_cupom, codigo, pagamento_id, validade) VALUES (?, ?, ?, ?)";
        try(PreparedStatement stmt = con.prepareStatement(sql)){
            stmt.setDouble(1, cupom.getValorCupom());
            stmt.setString(2, cupom.getCodigo());
            stmt.setInt(3, cupom.getPagamentoId());
            stmt.setString(4, cupom.getValidade());
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Cupom> listarCupom() {
        List<Cupom> cupons = new ArrayList<>();
        String sql = "SELECT * FROM cupom";
        try(Statement stmt = con.createStatement(); ResultSet rs = stmt.executeQuery(sql)){
            Cupom cupom = new Cupom();
            cupom.setId(rs.getInt("id"));
            cupom.setValorCupom(rs.getDouble("valor_cupom"));
            cupom.setCodigo(rs.getString("codigo"));
            cupom.setPagamentoId(rs.getInt("pagamento_id"));
            cupom.setValidade(rs.getString("validade"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cupons;
    }

    @Override
    public void atualizar(Cupom cupom) {
        String sql = "UPDATE cupom SET id = ?, valor_cupom = ?, codigo = ?, pagamento_id = ?, validade = ?";
        try(PreparedStatement stmt = con.prepareStatement(sql)){
            stmt.setInt(1, cupom.getId());
            stmt.setDouble(2, cupom.getValorCupom());
            stmt.setString(3, cupom.getCodigo());
            stmt.setInt(4, cupom.getPagamentoId());
            stmt.setString(5, cupom.getValidade());
            stmt.executeUpdate();
        } catch(Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void deletar(int id) {
        String sql = "DELETE FROM cupom WHERE id = ?";
        try(PreparedStatement stmt = con.prepareStatement(sql)){
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
}
