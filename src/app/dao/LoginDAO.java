/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package app.dao;
import app.entity.Login;
import java.util.List;
/**
 *
 * @author Dave
 */
public interface LoginDAO {
    void inserir(Login login);
    List<Login> listarLogin();
    void atualizar(Login login);
    void deletar(int id);
}
