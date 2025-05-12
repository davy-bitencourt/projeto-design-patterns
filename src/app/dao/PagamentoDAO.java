/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package app.dao;
import app.entity.Pagamento;
import java.util.List;
/**
 *
 * @author Dave
 */
public interface PagamentoDAO {
    void inserir(Pagamento pagamento);
    List<Pagamento> listarPagamento();
    void atualizar(Pagamento pagamento);
    void deletar(int id);
}
