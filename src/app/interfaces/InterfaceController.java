/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package app.interfaces;
import java.util.List;

/**
 *
 * @author Dave
 */
public abstract class InterfaceController {

    protected InterfaceDTO dto;

    public abstract Boolean salvar();
    public abstract Boolean editar();
    public abstract List<InterfaceDTO> listar();
    public abstract Boolean remover(Integer id);

    public Object[] preencheLinha() {
        return dto.dadosTable();
    }

    public String[] cabecalho() {
        return dto.cabecalhoTable();
    }

    public void setDto(InterfaceDTO dto) {
        this.dto = dto;
    }

    public InterfaceDTO getDto() {
        return dto;
    }
}
