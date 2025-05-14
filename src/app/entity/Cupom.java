/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.entity;

/**
 *
 * @author laboratorio
 */
public class Cupom {
    private Integer id;
    private Double valorCupom;
    private String codigo;
    private Integer pagamentoId;
    private String validade;

    public Cupom() {
    }

    public Cupom(Integer id, Double valorCupom, String codigo, Integer pagamentoId, String validade) {
        this.id = id;
        this.valorCupom = valorCupom;
        this.codigo = codigo;
        this.pagamentoId = pagamentoId;
        this.validade = validade;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getValorCupom() {
        return valorCupom;
    }

    public Double setValorCupom(Double valorCupom) {
        this.valorCupom = valorCupom;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Integer getPagamentoId() {
        return pagamentoId;
    }

    public void setPagamentoId(Integer pagamentoId) {
        this.pagamentoId = pagamentoId;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }
    
    
}
