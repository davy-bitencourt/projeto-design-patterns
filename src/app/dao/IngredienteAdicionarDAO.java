/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package app.dao;
import app.entity.IngredienteAdicionar;
import java.util.List;
/**
 *
 * @author Dave
 */
public interface IngredienteAdicionarDAO {
    void inserir(IngredienteAdicionar ingredienteAdicionar);
    List<IngredienteAdicionar> listarIngredienteAdicionar();
    void atualizar(IngredienteAdicionar ingredienteAdicionar);
    void deletar(int id);
}
