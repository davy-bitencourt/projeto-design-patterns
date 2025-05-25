/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.controller;

import app.dao.BairroDAO;
import app.dao.ClienteDAO;
import app.dto.BairroDTO;
import app.entity.Bairro;
import java.util.List;

/**
 *
 * @author laboratorio
 */
public class BairroController {
     private BairroDAO bairroDAO;

    public BairroController(BairroDAO bairroDAO) {
        this.bairroDAO = bairroDAO;
    }
    
    public void salvar(BairroDTO dto){
        Bairro bairro = dto.builder();
        bairroDAO.inserir(bairro);
    }
    
    public void atualizar(BairroDTO dto){
        Bairro bairro = dto.builder();
        bairroDAO.atualizar(bairro);
    }
    
    public void remover(BairroDTO dto){
        Bairro bairro = dto.builder();
        bairroDAO.deletar(bairro.getId());
    }
    
    public List<Bairro> listarTodos(){
        return bairroDAO.listarBairro();
    }
}
