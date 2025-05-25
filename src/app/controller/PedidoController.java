/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.controller;

import app.dao.PedidoDAO;
import app.dao.PedidoDAOImpl;
import app.dto.PedidoDTO;
import app.entity.Pedido;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author Dave
 */
public class PedidoController {
    private PedidoDAO pedidoDAO;

    public PedidoController(Connection con) {
        this.pedidoDAO = new PedidoDAOImpl(con);
    }
    
    public void salvar(PedidoDTO dto){
        Pedido pedido = dto.builder();
        pedidoDAO.inserir(pedido);
    }
    
    public void atualizar(PedidoDTO dto){
        Pedido pedido = dto.builder();
        pedidoDAO.atualizar(pedido);
    }
    
    public void remover(PedidoDTO dto){
        Pedido pedido = dto.builder();
        pedidoDAO.deletar(pedido.getId());
    }
    
    public List<Pedido> listarTodos(){
        return pedidoDAO.listarPedido();
    }
}
