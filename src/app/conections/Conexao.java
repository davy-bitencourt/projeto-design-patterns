/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.conections;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dave
 */

public class Conexao {
    private static Connection con;
    private String url;
    private String user;
    private String password;
    private static Conexao obj;
    
    private Conexao() throws SQLException {
        try {
            criarConexao();
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static Connection getConexao() throws SQLException{
        return con;
    }
    
    public Connection criarConexao() throws SQLException{
        url = "jdbc:postgres://localhost:5432/postgres"; // caminho do banco
        user = "postgres";
        password = "1234";
        con = DriverManager.getConnection(url, user, password);
        con.setAutoCommit(true);
        return con;
    }

}