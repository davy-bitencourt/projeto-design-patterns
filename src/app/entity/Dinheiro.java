/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.entity;

/**
 *
 * @author laboratorio
 */
public class Dinheiro {
    private Integer id;
    private Double valorEntrega;

    public Dinheiro() {
    }

    public Dinheiro(Integer id, Double valorEntrega) {
        this.id = id;
        this.valorEntrega = valorEntrega;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getValorEntrega() {
        return valorEntrega;
    }

    public void setValorEntrega(Double valorEntrega) {
        this.valorEntrega = valorEntrega;
    }
    
    
}
