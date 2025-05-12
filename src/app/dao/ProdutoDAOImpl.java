/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.dao;
import app.conections.Conexao;
import app.entity.Produto;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author Dave
 */
public class ProdutoDAOImpl implements ProdutoDAO {
    
    private Connection con;
    
    public ProdutoDAOImpl(Connection con){
        this.con = con;
    }

    @Override
    public void inserir(Produto produto) {
        String sql = "INSERT INTO produto (nome, valor_unitario) VALUES (?, ?)";
        try (PreparedStatement stmt = con.prepareStatement(sql)){ //PreparedStatement monta e executa as Queries em SQL
            stmt.setString(1, produto.getNome()); //Os valores são selecionados e setados dentro da Query usando sua posição de referência
            stmt.setDouble(2, produto.getValorUnitario());
            stmt.executeUpdate(); //A Query é executada, o método executeUpdadte() pode receber INSERT, UPDATE e DELETE
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public Produto buscaporId(int id) {
        String sql = "SELECT * FROM produto WHERE id = ?";
        try (PreparedStatement stmt = con.prepareStatement(sql)){
            stmt.setInt(1, id); //Usa o id referenciado para dar um SELECT na tabela desejada
            ResultSet rs = stmt.executeQuery(); //ResutlSet é um tipo de objeto que guarda o resultado da Query
            if (rs.next()){ //O método next() move o cursor para a próxima linha
                Produto produto = new Produto(); //Cria uma instância do produto
                produto.setId(rs.getInt("id")); //Pega os dados direto da Query
                produto.setNome(rs.getString("nome"));
                produto.setValorUnitario(rs.getDouble("valor_unitario"));
                return produto; //Retorna a instância do produto preenchida com os dados da Query
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Produto> listarProduto() {
        List<Produto> produtos = new ArrayList<>(); //Cria uma lista de objetos produto
        String sql = "SELECT * FROM produto";
        try (Statement stmt = con.createStatement(); //Statement, é inseguro, simples e sem parâmetro, e PreparedStatement, mais seguro, para valores dinâmicos
                ResultSet rs = stmt.executeQuery(sql)) { 
            while (rs.next()) {
                Produto produto = new Produto();
                produto.setId(rs.getInt("id"));
                produto.setNome(rs.getString("nome"));
                produto.setValorUnitario(rs.getDouble("valor_unitario"));
                produtos.add(produto);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return produtos;
    }

    @Override
    public void atualizar(Produto produto) {
        String sql = "UPDATE produto SET nome = ?, valor_unitario = ? WHERE id = ?";
        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setString(1, produto.getNome());
            stmt.setDouble(2, produto.getValorUnitario());
            stmt.setInt(3, produto.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deletar(int id) {
        String sql = "DELETE FROM produto WHERE id = ?";
        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
}
