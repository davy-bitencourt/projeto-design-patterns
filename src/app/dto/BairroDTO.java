/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.dto;
import app.entity.Bairro;
import app.interfaces.Entidade;
import app.interfaces.InterfaceDTO;
/**
 *
 * @author laboratorio
 */
public class BairroDTO extends InterfaceDTO {

    public String nome;
    
    @Override
    public InterfaceDTO buildDTO(Entidade e) {
        BairroDTO dto = new BairroDTO();
        Bairro b = (Bairro) e;
        dto.id = b.getId() + "";
        dto.nome = b.getNome();
        return dto;
    }

    @Override
    public Entidade buildEntidade() {
        Bairro b = new Bairro();
        b.setId(id == null ? 0 : Integer.valueOf(id));
        b.setNome(nome);
        return b;
    }

    @Override
    public String[] cabecalhoTable() {
        return new String[]{"ID", "Nome"};
    }

    @Override
    public Object[] dadosTable() {
        return new Object[]{id, nome};
    }

    @Override
    public String toString() {
        return this.nome;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BairroDTO other = (BairroDTO) obj;
        return id != null && id.equals(other.id);
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
