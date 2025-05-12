/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package app.dao;
import app.entity.Reembolso;
import java.util.List;
/**
 *
 * @author Dave
 */
public interface ReembolsoDAO {
    void inserir(Reembolso reembolso);
    List<Reembolso> listarReembolso();
    void atualizar(Reembolso reembolso);
    void deletar(int id);
}
