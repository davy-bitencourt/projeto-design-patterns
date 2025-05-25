/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.dto;
import app.entity.Cupom;
/**
 *
 * @author Dave
 */
public class CupomDTO {
    public String id;
    public String valorCupom;
    public String codigo;
    public String pagamentoId;
    public String validade;

    public CupomDTO() {}
    
    public Cupom builder(){
        Cupom cupom = new Cupom();
        cupom.setId(Integer.valueOf(id));
        cupom.setValorCupom(Double.valueOf(valorCupom));
        cupom.setCodigo(codigo);
        cupom.setPagamentoId(Integer.valueOf(pagamentoId));
        cupom.setValidade(validade);
        return cupom;
    }
}
