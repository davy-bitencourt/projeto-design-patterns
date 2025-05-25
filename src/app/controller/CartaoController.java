/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.controller;

import app.dao.CartaoDAO;
import app.dao.CartaoDAOImpl;
import app.dto.CartaoDTO;
import app.entity.Cartao;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author Dave
 */
public class CartaoController {
    private CartaoDAO cartaoDAO;

    public CartaoController(Connection con){
        this.cartaoDAO = new CartaoDAOImpl(con);
    }

    public void salvar(CartaoDTO dto){
        Cartao cartao = dto.builder();
        cartaoDAO.inserir(cartao);
    }
    
    public void atualizar(CartaoDTO dto){
        Cartao cartao = dto.builder();
        cartaoDAO.atualizar(cartao);
    }
    
    public void remover(CartaoDTO dto){
        Cartao cartao = dto.builder();
        cartaoDAO.deletar(cartao.getId());
    }
    
    public List<Cartao> listarTodos(){
        return cartaoDAO.listarCartao();
    }
}
