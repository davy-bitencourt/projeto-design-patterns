/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package app.dao;

import java.util.List;
import app.entity.Carrinho;
/**
 *
 * @author Dave
 */
public interface CarrinhoDAO {
    void inserir(Carrinho carrinho);
    List<Carrinho> listarCarrinho();
    void atualizar(Carrinho carrinho);
    void deletar(int id);
}
