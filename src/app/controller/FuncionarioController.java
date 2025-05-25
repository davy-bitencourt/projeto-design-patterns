/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.controller;

import app.dao.FuncionarioDAO;
import app.dto.FuncionarioDTO;
import app.entity.Funcionario;
import java.util.List;

/**
 *
 * @author laboratorio
 */
public class FuncionarioController {
    private FuncionarioDAO funcionarioDAO;

    public FuncionarioController(FuncionarioDAO funcionarioDAO) {
        this.funcionarioDAO = funcionarioDAO;
    }
    
    public void salvar(FuncionarioDTO dto){
        Funcionario funcionario = dto.builder();
        funcionarioDAO.inserir(funcionario);
    }
    
    public void atualizar(FuncionarioDTO dto){
        Funcionario funcionario = dto.builder();
        funcionarioDAO.atualizar(funcionario);
    }
    
    public void remover(FuncionarioDTO dto){
        Funcionario funcionario = dto.builder();
        funcionarioDAO.deletar(funcionario.getId());
    }

    public List<Funcionario> listarTodos(){
        return funcionarioDAO.listarFuncionario();
    }
}
