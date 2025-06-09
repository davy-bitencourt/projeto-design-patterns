/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.interfaces;

/**
 *
 * @author Dave
 */
import java.sql.PreparedStatement;
import java.sql.SQLException;

public abstract class Entidade {

    private Integer id;
    
    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    public void setId(String id) {
        this.id = (id == null || id.isEmpty() || !id.matches("[0-9.]+")) ? 0
                : Integer.valueOf(id);
    }

    public abstract String getInsert();
    public abstract String getUpdate();
    public abstract void setParameter(PreparedStatement prepareStatement) throws SQLException;
}
