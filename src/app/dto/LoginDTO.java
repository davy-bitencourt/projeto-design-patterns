/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.dto;
import app.entity.Login;
import app.interfaces.Entidade;
import app.interfaces.InterfaceDTO;
/**
 *
 * @author Dave
 */
public class LoginDTO extends InterfaceDTO {

    public String usuario;
    public String senha;

    @Override
    public InterfaceDTO buildDTO(Entidade e) {
        LoginDTO dto = new LoginDTO();
        Login login = (Login) e;

        dto.id = login.getId() == null ? "" : login.getId() + "";
        dto.usuario = login.getUsuario();
        dto.senha = login.getSenha();

        return dto;
    }

    @Override
    public Entidade buildEntidade() {
        Login login = new Login();

        login.setId(id == null || id.isEmpty() ? null : Integer.valueOf(id));
        login.setUsuario(usuario);
        login.setSenha(senha);

        return login;
    }

    @Override
    public String[] cabecalhoTable() {
        return new String[]{"ID", "Usuário", "Senha"};
    }

    @Override
    public Object[] dadosTable() {
        return new Object[]{id, usuario, senha};
    }
}