/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package app.interfaces;
import app.conections.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
/**
 *
 * @author Dave
 */
public abstract class InterfaceDAO {

    public void salvar(Entidade e) throws Exception {
        PreparedStatement prepareStatement = Conexao.getInstance().getConexao().prepareStatement("insert into " + e.getInsert());
        e.setParameter(prepareStatement);
        prepareStatement.executeUpdate();
    }

    public void editar(Entidade e) throws Exception {
        String sql="update " + e.getUpdate() + " where id =?";
        PreparedStatement prepareStatement = Conexao.getInstance().getConexao().prepareStatement(sql);
        e.setParameter(prepareStatement);
        prepareStatement.executeUpdate();

    }
    public void remover(Entidade e) throws Exception {
        String sql="delete from "+ e.getClass().getSimpleName() + " where id =?";
        PreparedStatement prepareStatement = Conexao.getInstance().getConexao().prepareStatement(sql);
                prepareStatement.setInt(1, e.getId());
                prepareStatement.executeUpdate();

    }
    public List listarTodos(Class c) throws Exception {
        List lista = new LinkedList();
        ResultSet res = Conexao.getInstance().getConexao().createStatement().executeQuery("select * from "+c.getSimpleName());

        while (res.next()) {
           lista.add(preencheDados(res));
        }
        return lista;
        
    }

    public abstract Entidade preencheDados(ResultSet res) throws SQLException;
}
