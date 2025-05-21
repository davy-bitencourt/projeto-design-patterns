/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.dto;
import app.entity.Produto;
/**
 *
 * @author Dave
 */
public class ProdutoDTO {
    public String id;
    public String nome;
    public String valorUnitario;

    public ProdutoDTO() {}
    
    public Produto builder(){
        Produto produto = new Produto();
        produto.setId(Integer.valueOf(id));
        produto.setNome(nome);
        produto.setValorUnitario(Double.valueOf(valorUnitario));
        return produto;
    }
}
