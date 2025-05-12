/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.entity;

/**
 *
 * @author laboratorio
 */
public class Carrinho {
    private Integer id;
    private Integer produtoId;
    private int quantidade;
    private Integer ingredienteEscolhaId;

    public Carrinho() {
    }

    public Carrinho(Integer id, Integer produtoId, int quantidade, Integer ingredienteEscolhaId) {
        this.id = id;
        this.produtoId = produtoId;
        this.quantidade = quantidade;
        this.ingredienteEscolhaId = ingredienteEscolhaId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProdutoId() {
        return produtoId;
    }

    public void setProdutoId(Integer produtoId) {
        this.produtoId = produtoId;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Integer getIngredienteEscolhaId() {
        return ingredienteEscolhaId;
    }

    public void setIngredienteEscolhaId(Integer ingredienteEscolhaId) {
        this.ingredienteEscolhaId = ingredienteEscolhaId;
    }

    
}
