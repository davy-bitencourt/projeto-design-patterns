/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package app.dao;
import app.entity.Cliente;
import java.util.List;
/**
 *
 * @author Dave
 */
public interface ClienteDAO {
    void inserir(Cliente cliente);
    List<Cliente> listarCliente();
    void atualizar(Cliente cliente);
    void deletar(int id);
}
