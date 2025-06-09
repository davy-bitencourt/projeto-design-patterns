/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.dto;
import app.entity.Produto;
import app.interfaces.Entidade;
import app.interfaces.InterfaceDTO;
/**
 *
 * @author Dave
 */
public class ProdutoDTO extends InterfaceDTO {

    public String nome;
    public String valorUnitario;

    @Override
    public InterfaceDTO buildDTO(Entidade e) {
        ProdutoDTO dto = new ProdutoDTO();
        Produto produto = (Produto) e;

        dto.id = produto.getId() == null ? "" : produto.getId() + "";
        dto.nome = produto.getNome();
        dto.valorUnitario = produto.getValorUnitario() != null ? produto.getValorUnitario().toString() : "";

        return dto;
    }

    @Override
    public Entidade buildEntidade() {
        Produto produto = new Produto();

        produto.setId(id == null || id.isEmpty() ? null : Integer.valueOf(id));
        produto.setNome(nome);
        produto.setValorUnitario(valorUnitario == null || valorUnitario.isEmpty() ? null : Double.valueOf(valorUnitario));

        return produto;
    }

    @Override
    public String[] cabecalhoTable() {
        return new String[]{"ID", "Nome", "Valor Unitário"};
    }

    @Override
    public Object[] dadosTable() {
        return new Object[]{id, nome, valorUnitario};
    }
}