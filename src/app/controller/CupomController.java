/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.controller;

import app.dao.CupomDAO;
import app.dao.CupomDAOImpl;
import app.dto.CupomDTO;
import app.entity.Cupom;
import java.sql.Connection;
import java.util.List;
/**
 *
 * @author Dave
 */
public class CupomController {
    private CupomDAO cupomDAO;

    public CupomController(Connection con) {
        this.cupomDAO = new CupomDAOImpl(con);
    }
    
    public void salvar(CupomDTO dto){
        Cupom cupom = dto.builder();
        cupomDAO.inserir(cupom);
    }
    
    public void atualizar(CupomDTO dto){
        Cupom cupom = dto.builder();
        cupomDAO.atualizar(cupom);
    }
    
    public void remover(CupomDTO dto){
        Cupom cupom = dto.builder();
        cupomDAO.deletar(cupom.getId());
    }
    
    public List<Cupom> listarTodos(){
        return cupomDAO.listarCupom();
    }
}
