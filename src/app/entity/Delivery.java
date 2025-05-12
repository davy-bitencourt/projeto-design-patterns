/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.entity;

/**
 *
 * @author laboratorio
 */
public class Delivery {
    private Integer id;
    private String chaveEntrega;
    private String numero;
    private String complemento;
    private Integer enderecoId;

    public Delivery() {
    }

    public Delivery(Integer id, String chaveEntrega, String numero, String complemento, Integer enderecoId) {
        this.id = id;
        this.chaveEntrega = chaveEntrega;
        this.numero = numero;
        this.complemento = complemento;
        this.enderecoId = enderecoId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getChaveEntrega() {
        return chaveEntrega;
    }

    public void setChaveEntrega(String chaveEntrega) {
        this.chaveEntrega = chaveEntrega;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public Integer getEnderecoId() {
        return enderecoId;
    }

    public void setEnderecoId(Integer enderecoId) {
        this.enderecoId = enderecoId;
    }
    
    
}
