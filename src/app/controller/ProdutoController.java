/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.controller;
import app.entity.Produto;
import app.dao.ProdutoDAO;
import app.dto.ProdutoDTO;
import app.interfaces.InterfaceController;
import app.interfaces.InterfaceDTO;
import java.sql.*;
import java.util.List;
/**
 *
 * @author Dave
 */
public class ProdutoController extends InterfaceController {
    private ProdutoDAO dao;
    
    public ProdutoController() {
        dao = new ProdutoDAO();
        dto = new ProdutoDTO();
    }

    @Override
    public Boolean salvar() {
        try {
            dao.salvar(dto.buildEntidade());
            return true;
        } catch (Exception ex) {
            System.getLogger(ProdutoController.class.getName())
                  .log(System.Logger.Level.ERROR, "Erro ao salvar Produto", ex);
            return false;
        }
    }

    @Override
    public Boolean editar() {
        try {
            dao.editar(dto.buildEntidade()); 
            return true;
        } catch (Exception ex) {
            System.getLogger(ProdutoController.class.getName())
                  .log(System.Logger.Level.ERROR, "Erro ao editar Produto", ex);
            return false;
        }
    }

    @Override
    public List<InterfaceDTO> listar() {
        try {
            List lista = dao.listarTodos(Produto.class);
            return dto.preencheLista(lista); 
        } catch (Exception ex) {
            System.getLogger(ProdutoController.class.getName())
                  .log(System.Logger.Level.ERROR, "Erro ao listar Produtos", ex);
            return null;
        }
    }

    @Override
    public Boolean remover(Integer id) {
        try {
            Produto produto = new Produto(id);
            
            dao.remover(produto);
            return true;
        } catch (Exception ex) {
            System.getLogger(ProdutoController.class.getName())
                  .log(System.Logger.Level.ERROR, "Erro ao remover Produto", ex);
            return false;
        }
    }
}