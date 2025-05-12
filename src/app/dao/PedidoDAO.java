/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package app.dao;
import app.entity.Pedido;
import java.util.List;
/**
 *
 * @author Dave
 */
public interface PedidoDAO {
    void inserir(Pedido pedido);
    List<Pedido> listarPedido();
    void atualizar(Pedido pedido);
    void deletar(int id);
}
