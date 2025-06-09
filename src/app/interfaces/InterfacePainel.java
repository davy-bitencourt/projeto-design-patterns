/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package app.interfaces;
import javax.swing.JPanel;

/**
 *
 * @author Dave
 */
public abstract class InterfacePainel extends JPanel {

    public abstract InterfaceDTO getDados();
    public abstract void setDTO(InterfaceDTO dto);
    
}
