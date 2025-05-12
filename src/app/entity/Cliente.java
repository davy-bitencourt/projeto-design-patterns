/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.entity;

/**
 *
 * @author laboratorio
 */
public class Cliente {
    private Integer id;
    private String nome;
    private Integer telefoneId;

    public Cliente() {
    }

    public Cliente(Integer id, String nome, Integer telefoneId) {
        this.id = id;
        this.nome = nome;
        this.telefoneId = telefoneId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getTelefoneId() {
        return telefoneId;
    }

    public void setTelefoneId(Integer telefoneId) {
        this.telefoneId = telefoneId;
    }

    
}
