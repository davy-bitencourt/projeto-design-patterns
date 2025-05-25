/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.controller;

import app.dao.IngredienteAdicionarDAO;
import app.dao.IngredienteAdicionarDAOImpl;
import app.dto.IngredienteAdicionarDTO;
import app.entity.IngredienteAdicionar;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author Dave
 */
public class IngredienteAdicionarController {
    private IngredienteAdicionarDAO ingredienteDAO;

    public IngredienteAdicionarController(Connection con) {
        this.ingredienteDAO = new IngredienteAdicionarDAOImpl(con);
    }
    
    public void inserir(IngredienteAdicionarDTO dto){
        IngredienteAdicionar ingrediente = dto.builder();
        ingredienteDAO.inserir(ingrediente);
    }
    
    public void atualizar(IngredienteAdicionarDTO dto){
        IngredienteAdicionar ingrediente = dto.builder();
        ingredienteDAO.atualizar(ingrediente);
    }
    
    public void remover(IngredienteAdicionarDTO dto){
        IngredienteAdicionar ingrediente = dto.builder();
        ingredienteDAO.deletar(ingrediente.getId());
    }
    
    public List<IngredienteAdicionar> listarTodos(){
        return ingredienteDAO.listarIngredienteAdicionar();
    }
}
