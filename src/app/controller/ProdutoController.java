/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.controller;
import app.entity.Produto;
import app.dao.ProdutoDAO;
import app.dao.ProdutoDAOImpl;
import app.dto.ProdutoDTO;
import java.sql.*;
import java.util.List;
/**
 *
 * @author Dave
 */
public class ProdutoController {
    
    private ProdutoDAO produtoDAO;
    
    public ProdutoController(Connection con){
        this.produtoDAO = new ProdutoDAOImpl(con);
    }
    
    public void salvar(ProdutoDTO dto){
        Produto produto = dto.builder();
        produtoDAO.inserir(produto);
    }
    
    public void atualizar(ProdutoDTO dto){
        Produto produto = dto.builder();
        produtoDAO.atualizar(produto);
    }
    
    public void remover(ProdutoDTO dto){
        Produto produto = dto.builder();
        if(produto.getId() != null){
            produtoDAO.deletar(produto.getId());
        }
    }
    
    public List<Produto> listarTodos(){
        return produtoDAO.listarProduto();
    }
}
 