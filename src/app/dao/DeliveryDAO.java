/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package app.dao;
import app.entity.Delivery;
import java.util.List;
/**
 *
 * @author Dave
 */
public interface DeliveryDAO {
    void inserir(Delivery delivery);
    List<Delivery> listarDelivery();
    void atualizar(Delivery delivery);
    void deletar(int id);
}
