/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.controller;

import app.dao.EntregaDAO;
import app.dao.EntregaDAOImpl;
import app.dto.EntregaDTO;
import app.entity.Entrega;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author Dave
 */
public class EntregaController {
    private EntregaDAO entregaDAO;

    public EntregaController(Connection con) {
        this.entregaDAO = new EntregaDAOImpl(con);
    }
    
    public void inserir(EntregaDTO dto){
        Entrega entrega = dto.builder();
        entregaDAO.inserir(entrega);
    }
    
    public void atualizar(EntregaDTO dto){
        Entrega entrega = dto.builder();
        entregaDAO.atualizar(entrega);
    }
    
    public void remover(EntregaDTO dto){
        Entrega entrega = dto.builder();
        entregaDAO.deletar(entrega.getId());
    }
    
    public List<Entrega> listarTodos(){
        return entregaDAO.listarEntrega();
    }
}
