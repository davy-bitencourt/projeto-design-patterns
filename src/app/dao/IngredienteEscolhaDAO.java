/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package app.dao;
import app.entity.IngredienteEscolha;
import java.util.List;
/**
 *
 * @author Dave
 */
public interface IngredienteEscolhaDAO {
    void inserir(IngredienteEscolha ingredienteEscolha);
    List<IngredienteEscolha> listarIngredienteEscolha();
    void atualizar(IngredienteEscolha ingredienteEscolha);
    void deletar(int id);
}
