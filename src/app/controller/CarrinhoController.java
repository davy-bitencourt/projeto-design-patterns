/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.controller;
import app.dao.CarrinhoDAOImpl;
import app.dao.CarrinhoDAO;
import app.dto.CarrinhoDTO;
import app.entity.Carrinho;
import java.sql.Connection;
import java.util.List;
/**
 *
 * @author Dave
 */
public class CarrinhoController {
    private CarrinhoDAO carrinhoDAO;

    public CarrinhoController(Connection con) {
        this.carrinhoDAO = new CarrinhoDAOImpl(con);
    }
    
    public void salvar(CarrinhoDTO dto){
        Carrinho carrinho = dto.builder();
        carrinhoDAO.inserir(carrinho);
    }
    
    public void atualizar(CarrinhoDTO dto){
        Carrinho carrinho = dto.builder();
        carrinhoDAO.atualizar(carrinho);
    }
    
    public void remover(CarrinhoDTO dto){
        Carrinho carrinho = dto.builder();
        carrinhoDAO.deletar(carrinho.getId());
    }
    
    public List<Carrinho> listarTodos(){
        return carrinhoDAO.listarCarrinho();
    }
}
