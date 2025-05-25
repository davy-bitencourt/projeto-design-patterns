/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.controller;

import app.dao.StatusPedidoDAO;
import app.dao.StatusPedidoDAOImpl;
import app.dto.StatusPedidoDTO;
import app.entity.StatusPedido;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author Dave
 */
public class StatusPedidoController {
    private StatusPedidoDAO statusDAO;

    public StatusPedidoController(Connection con) {
        this.statusDAO = new StatusPedidoDAOImpl(con);
    }
    
    public void inserir(StatusPedidoDTO dto){
        StatusPedido status = dto.builder();
        statusDAO.inserir(status);
    }
    
    public void atualizar(StatusPedidoDTO dto){
        StatusPedido status = dto.builder();
        statusDAO.atualizar(status);
    }
    
    public void remover(StatusPedidoDTO dto){
        StatusPedido status = dto.builder();
        statusDAO.deletar(status.getId());
    }
    
    public List<StatusPedido> listarTodos(){
        return statusDAO.listarStatusPedido();
    }
}
