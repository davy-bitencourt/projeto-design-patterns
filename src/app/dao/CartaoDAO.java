/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package app.dao;

import app.entity.Cartao;
import java.util.List;
/**
 *
 * @author Dave
 */
public interface CartaoDAO {
    void inserir(Cartao cartao);
    List<Cartao> listarCartao();
    void atualizar(Cartao cartao);
    void deletar(int id);
}
