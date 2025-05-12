/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package app.dao;
import app.entity.Cupom;
import java.util.List;
/**
 *
 * @author Dave
 */
public interface CupomDAO {
    void inserir(Cupom cupom);
    List<Cupom> listarCupom();
    void atualizar(Cupom cupom);
    void deletar(int id);
}
