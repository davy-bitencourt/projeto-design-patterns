/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package app.dao;
import app.entity.Telefone;
import java.util.List;
/**
 *
 * @author Dave
 */
public interface TelefoneDAO {
    void inserir(Telefone telefone);
    List<Telefone> listarTelefone();
    void atualizar(Telefone telefone);
    void deletar(int id);
}
