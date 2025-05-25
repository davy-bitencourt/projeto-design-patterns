/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.controller;

import app.dao.PagamentoDAO;
import app.dao.PagamentoDAOImpl;
import app.dto.PagamentoDTO;
import app.entity.Pagamento;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author Dave
 */
public class PagamentoController {
    private PagamentoDAO pagamentoDAO;

    public PagamentoController(Connection con) {
        this.pagamentoDAO = new PagamentoDAOImpl(con);
    }
    
    public void salvar(PagamentoDTO dto){
        Pagamento pagamento = dto.builder();
        pagamentoDAO.inserir(pagamento);
    }
    
    public void atualizar(PagamentoDTO dto){
        Pagamento pagamento = dto.builder();
        pagamentoDAO.atualizar(pagamento);
    }
    
    public void remover(PagamentoDTO dto){
        Pagamento pagamento = dto.builder();
        pagamentoDAO.deletar(pagamento.getId());
    }
    
    public List<Pagamento> listarTodos(){
        return pagamentoDAO.listarPagamento();
    }
}
