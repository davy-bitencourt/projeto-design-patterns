/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.controller;

import app.dao.IngredienteEscolhaDAO;
import app.dao.IngredienteEscolhaDAOImpl;
import app.dto.IngredienteEscolhaDTO;
import java.util.List;
import app.entity.IngredienteEscolha;
import java.sql.Connection;
/**
 *
 * @author Dave
 */
public class IngredienteEscolhaController {
    private IngredienteEscolhaDAO ingredienteDAO;

    public IngredienteEscolhaController(Connection con) {
        this.ingredienteDAO = new IngredienteEscolhaDAOImpl(con);
    }
    
    public void inserir(IngredienteEscolhaDTO dto){
        IngredienteEscolha ingrediente = dto.builder();
        ingredienteDAO.inserir(ingrediente);
    }
    
    public void atualizar(IngredienteEscolhaDTO dto){
        IngredienteEscolha ingrediente = dto.builder();
        ingredienteDAO.atualizar(ingrediente);
    }
    
    public void remover(IngredienteEscolhaDTO dto){
        IngredienteEscolha ingrediente = dto.builder();
        ingredienteDAO.deletar(ingrediente.getId());
    }
    
    public List<IngredienteEscolha> listarTodos(){
        return ingredienteDAO.listarIngredienteEscolha();
    }
}
