/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package app.dao;
import app.entity.StatusPedido;
import java.util.List;
/**
 *
 * @author Dave
 */
public interface StatusPedidoDAO {
    void inserir(StatusPedido statusPedido);
    List<StatusPedido> listarStatusPedido();
    void atualizar(StatusPedido statusPedido);
    void deletar(int id);
}
