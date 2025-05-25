/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.dto;
import app.entity.TaxaEntrega;
/**
 *
 * @author Dave
 */
public class TaxaEntregaDTO {
    public String id;
    public String enderecoId;
    public String traxaEntrega;

    public TaxaEntregaDTO() {}
    
    public TaxaEntrega builder(){
        TaxaEntrega taxa = new TaxaEntrega();
        taxa.setId(Integer.valueOf(id));
        taxa.setEnderecoId(Integer.valueOf(enderecoId));
        taxa.setTraxaEntrega(Double.valueOf(traxaEntrega));
        return taxa;
    }
}
