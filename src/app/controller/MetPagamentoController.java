/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.controller;

import app.dao.MetPagamentoDAO;
import app.dao.MetPagamentoDAOImpl;
import app.dto.MetPagamentoDTO;
import app.entity.MetPagamento;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author Dave
 */
public class MetPagamentoController {
    private MetPagamentoDAO metodoDAO;

    public MetPagamentoController(Connection con) {
        this.metodoDAO = new MetPagamentoDAOImpl(con);
    }
    
    public void salvar(MetPagamentoDTO dto){
        MetPagamento metodo = dto.builder();
        metodoDAO.inserir(metodo);
    }
    
    public void atualizar(MetPagamentoDTO dto){
        MetPagamento metodo = dto.builder();
        metodoDAO.atualizar(metodo);
    }
    
    public void remover(MetPagamentoDTO dto){
        MetPagamento metodo = dto.builder();
        metodoDAO.deletar(metodo.getId());
    }
    
    public List<MetPagamento> listarTodos(){
        return metodoDAO.listarMetPagamento();
    }
}
