/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package app.dao;
import app.entity.Dinheiro;
import java.util.List;
/**
 *
 * @author Dave
 */
public interface DinheiroDAO {
    void inserir(Dinheiro dinheiro);
    List<Dinheiro> listarDinheiro();
    void atualizar(Dinheiro dinheiro);
    void deletar(int id);
}
