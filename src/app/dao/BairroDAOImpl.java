package app.dao;
import app.entity.Bairro;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;

public class BairroDAOImpl implements BairroDAO {
    
    private Connection con;

    public BairroDAOImpl(Connection con){
        this.con = con;
    }

    @Override
    public void inserir(Bairro bairro) {
        String sql = "INSERT INTO bairro (nome) VALUES (?)";
        try(PreparedStatement stmt = con.prepareStatement(sql)){
            stmt.setString(1, bairro.getNome());
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Bairro> listarBairro() {
        List<Bairro> bairros = new ArrayList<>();
        String sql = "SELECT * FROM bairro";
        try(Statement stmt = con.createStatement(); ResultSet rs = stmt.executeQuery(sql)){
            while(rs.next()){
                Bairro bairro = new Bairro();
                bairro.setId(rs.getInt("id"));
                bairro.setNome(rs.getString("nome"));
                bairros.add(bairro);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bairros;
    }

    @Override
    public void atualizar(Bairro bairro) {
        String sql = "UPDATE bairro SET nome = ? WHERE id = ?";
        try(PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setString(1, bairro.getNome());
            stmt.setInt(2, bairro.getId());
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deletar(int id) {
        String sql = "DELETE FROM bairro WHERE id = ?";
        try(PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}