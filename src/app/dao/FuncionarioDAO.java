/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package app.dao;
import app.entity.Funcionario;
import java.util.List;
/**
 *
 * @author Dave
 */
public interface FuncionarioDAO {
    void inserir(Funcionario funcionario);
    List<Funcionario> listarFuncionario();
    void atualizar(Funcionario funcionario);
    void deletar(int id);
}
