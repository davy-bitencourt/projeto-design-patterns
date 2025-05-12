/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package app.dao;
import app.entity.Entrega;
import java.util.List;
/**
 *
 * @author Dave
 */
public interface EntregaDAO {
    void inserir(Entrega entrega);
    List<Entrega> listarEntrega();
    void atualizar(Entrega entrega);
    void deletar(int id);
}
