/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.controller;
import app.dao.DinheiroDAO;
import app.dao.DinheiroDAOImpl;
import app.dto.DinheiroDTO;
import app.entity.Dinheiro;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author Dave
 */
public class DinheiroController {
    private DinheiroDAO dinheiroDAO;

    public DinheiroController(Connection con) {
        this.dinheiroDAO = new DinheiroDAOImpl(con);
    }
        
    public void salvar(DinheiroDTO dto){
        Dinheiro dinheiro = dto.builder();
        dinheiroDAO.inserir(dinheiro);
    }
    
    public void atualizar(DinheiroDTO dto){
        Dinheiro dinheiro = dto.builder();
        dinheiroDAO.atualizar(dinheiro);
    }
    
    public void remover(DinheiroDTO dto){
        Dinheiro dinheiro = dto.builder();
        dinheiroDAO.deletar(dinheiro.getId());
    }
    
    public List<Dinheiro> listarTodos(){
        return dinheiroDAO.listarDinheiro();
    }
}
