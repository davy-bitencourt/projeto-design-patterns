/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.dto;
import app.entity.Funcionario;
/**
 *
 * @author laboratorio
 */
public class FuncionarioDTO {
    public String id;
    public String nome;
    public String loginId;
    public String telefoneId;
    public String cpf;
    public String rg;
    
    public FuncionarioDTO() {}
        
    public Funcionario builder(){
        Funcionario funcionario = new Funcionario();
        funcionario.setId(Integer.valueOf(id));
        funcionario.setNome(nome);
        funcionario.setLoginId(Integer.valueOf(loginId));
        funcionario.setTelefoneId(Integer.valueOf(telefoneId));
        funcionario.setCpf(cpf);
        funcionario.setRg(rg);
        return funcionario;
    }
}
