/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.controller;

import app.dao.IngredienteRemoverDAO;
import app.dao.IngredienteRemoverDAOImpl;
import app.dto.IngredienteRemoverDTO;
import java.util.List;
import app.entity.IngredienteRemover;
import java.sql.Connection;

/**
 *
 * @author Dave
 */
public class IngredienteRemoverController {
    private IngredienteRemoverDAO ingredienteDAO;

    public IngredienteRemoverController(Connection con) {
        this.ingredienteDAO = new IngredienteRemoverDAOImpl(con);
    }
    
    public void inserir(IngredienteRemoverDTO dto){
        IngredienteRemover ingreiente = dto.builder();
        ingredienteDAO.inserir(ingreiente);
    }
    
    public void atualizar(IngredienteRemoverDTO dto){
        IngredienteRemover ingreiente = dto.builder();
        ingredienteDAO.atualizar(ingreiente);
    }
    
    public void remover(IngredienteRemoverDTO dto){
        IngredienteRemover ingreiente = dto.builder();
        ingredienteDAO.deletar(ingreiente.getId());
    }
    
    public List<IngredienteRemover> listarTodos(){
        return ingredienteDAO.listarIngredienteRemover();
    }
}
