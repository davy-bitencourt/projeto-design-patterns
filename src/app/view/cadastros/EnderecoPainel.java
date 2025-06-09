package app.view.cadastros;

import app.controller.*;
import app.dto.*;
import app.interfaces.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import app.entity.Bairro;
/**
 *
 * @author Dave
 */
public class EnderecoPainel extends InterfacePainel {
    private EnderecoDTO dto;
    
    public EnderecoPainel(InterfaceDTO dto) {
        dto = new EnderecoDTO(); 
        initComponents(); 
        carregarComboBoxBairros();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jtfRua = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtfCep = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtfDistancia = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        setPreferredSize(new java.awt.Dimension(390, 202));

        jLabel1.setText("Rua");
        jLabel1.setMaximumSize(new java.awt.Dimension(32767, 32767));
        jLabel1.setMinimumSize(new java.awt.Dimension(0, 0));

        jLabel2.setText("Cep");
        jLabel2.setMaximumSize(new java.awt.Dimension(32767, 32767));
        jLabel2.setMinimumSize(new java.awt.Dimension(0, 0));

        jLabel3.setText("Distancia");
        jLabel3.setMaximumSize(new java.awt.Dimension(32767, 32767));
        jLabel3.setMinimumSize(new java.awt.Dimension(0, 0));

        jLabel4.setText("Bairro");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jtfRua, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfCep, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jtfDistancia)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(45, 45, 45)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtfDistancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public InterfaceDTO getDados() {
        dto = new EnderecoDTO();
        dto.rua = jtfRua.getText();
        dto.cep = jtfCep.getText();
        dto.distancia = jtfDistancia.getText();
        
        BairroDTO bairroSelecionado = (BairroDTO) jComboBox1.getSelectedItem();
        dto.bairro = bairroSelecionado != null && bairroSelecionado.id != null && !bairroSelecionado.id.isEmpty()
                ? new Bairro(Integer.valueOf(bairroSelecionado.id), bairroSelecionado.nome, null)
                : null;

        return dto;
    }

    @Override
    public void setDTO(InterfaceDTO dto) {
        this.dto = (EnderecoDTO) dto;

        jtfRua.setText(this.dto.rua);
        jtfCep.setText(this.dto.cep);
        jtfDistancia.setText(this.dto.distancia);

        if (jComboBox1.getItemCount() > 0 && this.dto.bairro != null) {
            for (int i = 0; i < jComboBox1.getItemCount(); i++) {
                BairroDTO item = jComboBox1.getItemAt(i);
                if (item.id.equals(String.valueOf(this.dto.bairro.getId()))) {
                    jComboBox1.setSelectedIndex(i);
                    break;
                }
            }
        }
    }
    
    private static final Logger LOGGER = Logger.getLogger(EnderecoPainel.class.getName());

    private void carregarComboBoxBairros() {
        BairroController controller = new BairroController();
        DefaultComboBoxModel<BairroDTO> model = new DefaultComboBoxModel<>();

        try {
            List<InterfaceDTO> lista = controller.listar();
            for (InterfaceDTO interfaceDTO : lista) {
                BairroDTO bairroDTO = (BairroDTO) interfaceDTO;
                model.addElement(bairroDTO);
            }

            jComboBox1.setModel(model);

        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Erro ao carregar bairros", e);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<BairroDTO> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jtfCep;
    private javax.swing.JTextField jtfDistancia;
    private javax.swing.JTextField jtfRua;
    // End of variables declaration//GEN-END:variables
}
