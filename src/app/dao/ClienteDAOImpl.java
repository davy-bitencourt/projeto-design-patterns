/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.dao;
import java.sql.*;
import app.entity.Cliente;
/**
 *
 * @author Dave
 */
public class ClienteDAOImpl implements ClienteDAO{
    
    private Connection con;
    
    public ClienteDAOImpl(Connection con){
        this.con = con;
    }
    
    
}
