/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.dto;
import app.entity.Cliente;
import app.entity.Telefone;
import app.interfaces.Entidade;
import app.interfaces.InterfaceDTO;
/**
 *
 * @author laboratorio
 */
public class ClienteDTO extends InterfaceDTO {

    public String nome;
    public String telefoneId;
    public String telefoneNumero;

    @Override
    public InterfaceDTO buildDTO(Entidade e) {
        ClienteDTO dto = new ClienteDTO();
        Cliente cliente = (Cliente) e;
        dto.id = cliente.getId() == null ? "" : cliente.getId() + "";
        dto.nome = cliente.getNome();

        Telefone tel = cliente.getTelefone();
        if (tel != null) {
            dto.telefoneId = tel.getId() == null ? "" : tel.getId() + "";
            dto.telefoneNumero = tel.getNumero();
        } else {
            dto.telefoneId = "";
            dto.telefoneNumero = "";
        }

        return dto;
    }

    @Override
    public Entidade buildEntidade() {
        Cliente cliente = new Cliente();

        cliente.setId(id == null || id.isEmpty() ? null : Integer.valueOf(id));
        cliente.setNome(nome);

        Telefone tel = new Telefone();
        tel.setId(telefoneId == null || telefoneId.isEmpty() ? null : Integer.valueOf(telefoneId));
        tel.setNumero(telefoneNumero);

        cliente.setTelefone(tel);

        return cliente;
    }

    @Override
    public String[] cabecalhoTable() {
        return new String[]{"ID", "Nome"};
    }

    @Override
    public Object[] dadosTable() {
        return new Object[]{id, nome};
    }
}
