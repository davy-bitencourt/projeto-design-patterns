/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.dto;
import app.entity.Carrinho;
/**
 *
 * @author Dave
 */
public class CarrinhoDTO {
    private String id;
    private String produtoId;
    private String quantidade;
    private String ingredienteEscolhaId;

    public CarrinhoDTO() {}
    
    public Carrinho builder(){
        Carrinho carrinho = new Carrinho();
        carrinho.setId(Integer.valueOf(id));
        carrinho.setProdutoId(Integer.valueOf(produtoId));
        carrinho.setQuantidade(Integer.valueOf(quantidade));
        carrinho.setIngredienteEscolhaId(Integer.valueOf(ingredienteEscolhaId));
        return carrinho;
    }
}
