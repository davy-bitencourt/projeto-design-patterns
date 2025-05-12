/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package app.dao;
import app.entity.Endereco;
import java.util.List;
/**
 *
 * @author Dave
 */
public interface EnderecoDAO {
    void inserir(Endereco endereco);
    List<Endereco> listarEndereco();
    void atualizar(Endereco endereco);
    void deletar(int id);
}
