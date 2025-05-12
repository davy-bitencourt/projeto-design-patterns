/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package app.dao;
import app.entity.TaxaEntrega;
import java.util.List;
/**
 *
 * @author Dave
 */
public interface TaxaEntregaDAO {
    void inserir(TaxaEntrega taxaEntrega);
    List<TaxaEntrega> listarTaxaEntrega();
    void atualizar(TaxaEntrega taxaEntrega);
    void deletar(int id);
}
