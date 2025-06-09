/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.dto;
import app.entity.Endereco;
import app.entity.Bairro;
import app.interfaces.Entidade;
import app.interfaces.InterfaceDTO;

/**
 *
 * @author laboratorio
 */
public class EnderecoDTO extends InterfaceDTO {

    public String rua;
    public String cep;
    public Bairro bairro; 
    public String distancia; 
    
    @Override
    public InterfaceDTO buildDTO(Entidade e) {
        Endereco endereco = (Endereco) e;

        id = endereco.getId() == null ? "" : String.valueOf(endereco.getId());
        rua = endereco.getRua();
        cep = endereco.getCep();
        distancia = String.valueOf(endereco.getDistancia());
        bairro = endereco.getBairro();

        return this;
    }

    @Override
    public Entidade buildEntidade() {
        Endereco endereco = new Endereco();

        endereco.setId(id == null || id.isEmpty() ? 0 : Integer.valueOf(id));
        endereco.setRua(rua);
        endereco.setCep(cep);

        try {
            endereco.setDistancia(distancia == null || distancia.isEmpty() ? 0f : Float.parseFloat(distancia));
        } catch (NumberFormatException e) {
            endereco.setDistancia(0f);
        }

        endereco.setBairro(bairro);

        return endereco;
    }

    @Override
    public String[] cabecalhoTable() {
        return new String[]{"ID", "Rua", "CEP", "Distância", "ID Bairro"};
    }

    @Override
    public Object[] dadosTable() {
        String bairroIdString = "";
        if (bairro != null && bairro.getId() != null) {
            bairroIdString = String.valueOf(bairro.getId());
        }

        return new Object[]{id, rua, cep, distancia, bairroIdString};
    }
}