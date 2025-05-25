/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.controller;

import app.dao.ReembolsoDAO;
import app.dao.ReembolsoDAOImpl;
import app.dto.ReembolsoDTO;
import app.entity.Reembolso;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author Dave
 */
public class ReembolsoController {
    private ReembolsoDAO reembolsoDAO;

    public ReembolsoController(Connection con) {
        this.reembolsoDAO = new ReembolsoDAOImpl(con);
    }
    
    public void inserir(ReembolsoDTO dto){
        Reembolso reembolso = dto.builder();
        reembolsoDAO.inserir(reembolso);
    }
    
    public void atualizar(ReembolsoDTO dto){
        Reembolso reembolso = dto.builder();
        reembolsoDAO.atualizar(reembolso);
    }
    
    public void remover(ReembolsoDTO dto){
        Reembolso reembolso = dto.builder();
        reembolsoDAO.deletar(reembolso.getId());
    }
    
    public List<Reembolso> listarTodos(){
        return reembolsoDAO.listarReembolso();
    }
}
