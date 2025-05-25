/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.controller;

import app.dao.EnderecoDAO;
import app.dto.EnderecoDTO;
import app.entity.Endereco;
import java.util.List;

/**
 *
 * @author laboratorio
 */
public class EnderecoController {
    private EnderecoDAO enderecoDAO;

    public EnderecoController(EnderecoDAO enderecoDAO) {
        this.enderecoDAO = enderecoDAO;
    }
    
    public void salvar(EnderecoDTO dto){
        Endereco endereco = dto.builder();
        enderecoDAO.inserir(endereco);
    }
    
    public void atualizar(EnderecoDTO dto){
        Endereco endereco = dto.builder();
        enderecoDAO.atualizar(endereco);
    }
    
    public void remover(EnderecoDTO dto){
        Endereco endereco = dto.builder();
        enderecoDAO.deletar(endereco.getId());
    }
    
    public List<Endereco> listarTodos(){
        return enderecoDAO.listarEndereco();
    }
}
