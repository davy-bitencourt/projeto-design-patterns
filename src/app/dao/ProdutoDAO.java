package app.dao;

import app.entity.Produto;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author Dave
 */
public interface ProdutoDAO {
    void inserir(Produto produto);
    Produto buscaporId(int id);
    List<Produto> listarProduto();
    void atualizar(Produto produto);
    void deletar(int id);
}
