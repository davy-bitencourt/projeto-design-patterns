/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.controller;

import app.dao.TaxaEntregaDAO;
import app.dao.TaxaEntregaDAOImpl;
import app.dto.TaxaEntregaDTO;
import app.entity.TaxaEntrega;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author Dave
 */
public class TaxaEntregaController {
    private TaxaEntregaDAO taxaDAO;

    public TaxaEntregaController(Connection con) {
        this.taxaDAO = new TaxaEntregaDAOImpl(con);
    }
    
    public void inserir(TaxaEntregaDTO dto){
        TaxaEntrega taxa = dto.builder();
        taxaDAO.inserir(taxa);
    }
    
    public void atualizar(TaxaEntregaDTO dto){
        TaxaEntrega taxa = dto.builder();
        taxaDAO.atualizar(taxa);
    }
    
    public void remover(TaxaEntregaDTO dto){
        TaxaEntrega taxa = dto.builder();
        taxaDAO.deletar(taxa.getId());
    }
    
    public List<TaxaEntrega> listarTodos(){
        return taxaDAO.listarTaxaEntrega();
    }
}
