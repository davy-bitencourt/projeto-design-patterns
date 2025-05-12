/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package app.dao;

import app.entity.Bairro;
import java.util.List;


/**
 *
 * @author Dave
 */
public interface BairroDAO {
    void inserir(Bairro bairro);
    List<Bairro> listarBairro();
    void atualizar(Bairro bairro);
    void deletar(int id);
}
