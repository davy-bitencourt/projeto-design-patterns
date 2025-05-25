/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.controller;

import app.dao.DeliveryDAO;
import app.dao.DeliveryDAOImpl;
import app.dto.DeliveryDTO;
import java.util.List;
import app.entity.Delivery;
import java.sql.Connection;
/**
 *
 * @author Dave
 */
public class DeliveryController {
    private DeliveryDAO deliveryDAO;

    public DeliveryController(Connection con) {
        this.deliveryDAO = new DeliveryDAOImpl(con);
    }
    
    public void salvar(DeliveryDTO dto){
        Delivery delivery = dto.builder();
        deliveryDAO.inserir(delivery);
    }
    
    public void atualizar(DeliveryDTO dto){
        Delivery delivery = dto.builder();
        deliveryDAO.atualizar(delivery);
    }
    
    public void remover(DeliveryDTO dto){
        Delivery delivery = dto.builder();
        deliveryDAO.deletar(delivery.getId());
    }
    
    public List<Delivery> listarTodos(){
        return deliveryDAO.listarDelivery();
    }
}
