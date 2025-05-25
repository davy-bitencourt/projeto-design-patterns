/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.dto;
import app.entity.Pagamento;
/**
 *
 * @author Dave
 */
public class PagamentoDTO {
    public String id;
    public String metPagamentoId;
    public String cupomId;
    public String pedidoId;

    public PagamentoDTO(){}
    
    public Pagamento builder(){
        Pagamento pagamento = new Pagamento();
        pagamento.setId(Integer.valueOf(id));
        pagamento.setMetPagamentoId(Integer.valueOf(metPagamentoId));
        pagamento.setCupomId(Integer.valueOf(cupomId));
        pagamento.setPedidoId(Integer.valueOf(pedidoId));
        return pagamento;
    }
}
