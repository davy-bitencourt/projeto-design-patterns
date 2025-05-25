/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.controller;

import app.dao.TelefoneDAO;
import app.dao.TelefoneDAOImpl;
import app.dto.TelefoneDTO;
import app.entity.Telefone;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author Dave
 */
public class TelefoneController {
    private TelefoneDAO telefoneDAO;    

    public TelefoneController(Connection con) {
        this.telefoneDAO = new TelefoneDAOImpl(con);
    }
    
    public void inserir(TelefoneDTO dto){
        Telefone telefone = dto.builder();
        telefoneDAO.inserir(telefone);
    }
    
    public void atualizar(TelefoneDTO dto){
        Telefone telefone = dto.builder();
        telefoneDAO.atualizar(telefone);
    }
    
    public void remover(TelefoneDTO dto){
        Telefone telefone = dto.builder();
        telefoneDAO.deletar(telefone.getId());
    }
    
    public List<Telefone> listarTodos(){
        return telefoneDAO.listarTelefone();
    }
}
