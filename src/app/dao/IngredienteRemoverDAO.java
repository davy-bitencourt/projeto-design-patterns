/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package app.dao;
import app.entity.IngredienteRemover;
import java.util.List;
/**
 *
 * @author Dave
 */
public interface IngredienteRemoverDAO {
    void inserir(IngredienteRemover ingredienteRemover);
    List<IngredienteRemover> listarIngredienteRemover();
    void atualizar(IngredienteRemover ingredienteRemover);
    void deletar(int id);
}
