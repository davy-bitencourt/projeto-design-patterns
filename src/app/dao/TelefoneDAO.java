/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package app.dao;
import app.entity.Telefone;
import app.entity.Funcionario;
import app.entity.Cliente;
import app.interfaces.Entidade;
import app.interfaces.InterfaceDAO;
import java.util.List;
import java.sql.SQLException;
import java.sql.ResultSet;
/**
 *
 * @author Dave
 */
public class TelefoneDAO extends InterfaceDAO {

    @Override
    public Entidade preencheDados(ResultSet res) throws SQLException {
        Telefone t = new Telefone();
        t.setId(res.getInt("id"));
        t.setDdd(res.getString("ddd"));
        t.setNumero(res.getString("numero"));
        
        Integer funcionarioId = res.getObject("funcionario_id") != null ? res.getInt("funcionario_id") : null;
        if (funcionarioId != null) {
            t.setFuncionario(new Funcionario(funcionarioId));
        }

        Integer clienteId = res.getObject("cliente_id") != null ? res.getInt("cliente_id") : null;
        if (clienteId != null) {
            t.setCliente(new Cliente(clienteId));
        }

        return t;
    }
}