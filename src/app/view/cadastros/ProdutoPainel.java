/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package app.view.cadastros;

import app.dto.*;
import app.interfaces.*;
/**
 *
 * @author Dave
 */
public class ProdutoPainel extends InterfacePainel {
    private ProdutoDTO dto;

    public ProdutoPainel(InterfaceDTO dto) {
        dto = new ProdutoDTO();
        initComponents();
        setDTO(dto);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jtfNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtfValorUnitario = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(390, 202));

        jLabel1.setText("Nome");
        jLabel1.setMaximumSize(new java.awt.Dimension(32767, 32767));
        jLabel1.setMinimumSize(new java.awt.Dimension(0, 0));

        jLabel2.setText("Valor Unitario");
        jLabel2.setMaximumSize(new java.awt.Dimension(32767, 32767));
        jLabel2.setMinimumSize(new java.awt.Dimension(0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtfValorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(34, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtfNome))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                        .addGap(83, 83, 83))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jtfValorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public InterfaceDTO getDados() {
        ProdutoDTO produtoDTO = dto;
        produtoDTO.nome = jtfNome.getText(); 
        produtoDTO.valorUnitario = jtfValorUnitario.getText();
        return produtoDTO; 
    }
    
    @Override
    public void setDTO(InterfaceDTO dto) {
        this.dto = (ProdutoDTO) dto; 
        jtfNome.setText(this.dto.nome); 
        jtfValorUnitario.setText(this.dto.valorUnitario); 
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JTextField jtfValorUnitario;
    // End of variables declaration//GEN-END:variables
}
