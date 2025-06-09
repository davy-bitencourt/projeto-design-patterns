/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.dto;
import app.entity.Funcionario;
import app.entity.Telefone;
import app.interfaces.Entidade;
import app.interfaces.InterfaceDTO;
import java.util.LinkedList;
import java.util.List;
/**
 *
 * @author laboratorio
 */
public class FuncionarioDTO extends InterfaceDTO {

    public String nome;
    public String cpf;
    public String rg;
    public List<String> telefones;

    @Override
    public InterfaceDTO buildDTO(Entidade e) {
        FuncionarioDTO dto = new FuncionarioDTO();
        Funcionario funcionario = (Funcionario) e;

        dto.id = funcionario.getId() == null ? "" : funcionario.getId() + "";
        dto.nome = funcionario.getNome();
        dto.cpf = funcionario.getCpf();
        dto.rg = funcionario.getRg();

        dto.telefones = new LinkedList<>();
        if (funcionario.getTelefones() != null) {
            for (Telefone t : funcionario.getTelefones()) {
                dto.telefones.add(t.getNumero());
            }
        }

        return dto;
    }

    @Override
    public Entidade buildEntidade() {
        Funcionario funcionario = new Funcionario();

        funcionario.setId(id == null || id.isEmpty() ? null : Integer.valueOf(id));
        funcionario.setNome(nome);
        funcionario.setCpf(cpf);
        funcionario.setRg(rg);

        List<Telefone> telefonesList = new LinkedList<>();
        if (telefones != null) {
            for (String numero : telefones) {
                Telefone telefone = new Telefone();
                telefone.setNumero(numero);
                telefone.setFuncionario(funcionario);
                telefonesList.add(telefone);
            }
        }

        funcionario.setTelefones(telefonesList);
        return funcionario;
    }

    @Override
    public String[] cabecalhoTable() {
        return new String[]{"ID", "Nome", "CPF", "RG", "Telefones"};
    }

    @Override
    public Object[] dadosTable() {
        String telefonesStr = telefones != null ? String.join(", ", telefones) : "";
        return new Object[]{id, nome, cpf, rg, telefonesStr};
    }

    @Override
    public List<InterfaceDTO> preencheLista(List<Entidade> e) {
        List<InterfaceDTO> retorno = new LinkedList<>();
        for (Entidade entidade : e) {
            retorno.add(this.buildDTO(entidade));
        }
        return retorno;
    }
}