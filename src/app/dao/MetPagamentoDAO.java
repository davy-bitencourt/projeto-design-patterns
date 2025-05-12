/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package app.dao;

import java.util.List;
import app.entity.MetPagamento;
/**
 *
 * @author Dave
 */
public interface MetPagamentoDAO {
    void inserir(MetPagamento metPagamento);
    List<MetPagamento> listarMetPagamento();
    void atualizar(MetPagamento metPagamento);
    void deletar(int id);
}
