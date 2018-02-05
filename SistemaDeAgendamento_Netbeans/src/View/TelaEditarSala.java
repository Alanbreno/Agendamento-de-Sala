/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import DAO.Controladores.ControladorProfessor;
import DAO.Controladores.ControladorSala;
import DAO.SalaJpaController;
import Entidades.Professor;
import Entidades.Sala;
import ViewControllers.TelaCadastroController;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sedepti
 */
public class TelaEditarSala extends javax.swing.JFrame {

    DefaultTableModel modeloTabela;
    JTable tabela1;
    TelaCadastroController control = new TelaCadastroController();

    /**
     * Creates new form TelaEditarSalas
     */
    public TelaEditarSala(java.awt.Frame parent, boolean modal, JTable tabela) {

        initComponents();
        txtId.setVisible(false);
        botaoFechar.setVisible(false);
        tabela1 = tabela;

    }

    private TelaEditarSala(JFrame jFrame, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void editar(String valores) {
        ControladorSala j = new ControladorSala();
        String sala = valores;
        Entidades.Sala p = new Entidades.Sala();

        List<Sala> a = j.FiltroSala(sala);
        p = a.get(0);

        txtCodigo.setText(p.getSalaCodigo());
        txtLocalização.setText(p.getSalaLocalizacao());
        txtNumeroDeAlunos.setText(String.valueOf(p.getSalaNumAluno()));
        txtObservação.setText(p.getSalaObservacao());
        
        txtId.setText(p.getSalaId().toString());
        
        if(p.getSalaLaboratorio()){
            botaoRadioSim.setSelected(true);
        }else {
            botaoRadioNao.setSelected(true);
        }
    }
    
    public void mostrarDados(String valores){
        this.editar(valores);
        
        txtCodigo.setEditable(false);
        txtLocalização.setEditable(false);
        txtNumeroDeAlunos.setEditable(false);
        txtObservação.setEditable(false);
        
        botaoCancelar.setVisible(false);
        botaoSalvar.setVisible(false);
        botaoFechar.setVisible(true);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoBotao = new javax.swing.ButtonGroup();
        botaoCancelar = new javax.swing.JButton();
        botaoSalvar = new javax.swing.JButton();
        labelInformações = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtLocalização = new javax.swing.JTextField();
        txtObservação = new javax.swing.JTextField();
        txtNumeroDeAlunos = new javax.swing.JTextField();
        labelCodigo = new javax.swing.JLabel();
        labelLocalização = new javax.swing.JLabel();
        labelNumeroDeAlunos = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        labelObservação = new javax.swing.JLabel();
        botaoFechar = new javax.swing.JButton();
        labelLaboratorio = new javax.swing.JLabel();
        botaoRadioSim = new javax.swing.JRadioButton();
        botaoRadioNao = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        botaoCancelar.setText("Cancelar");
        botaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarActionPerformed(evt);
            }
        });

        botaoSalvar.setText("Salvar");
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });

        labelInformações.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelInformações.setText("Informações Sala");

        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });

        txtNumeroDeAlunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroDeAlunosActionPerformed(evt);
            }
        });

        labelCodigo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelCodigo.setText("Codigo");

        labelLocalização.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelLocalização.setText("Localização");

        labelNumeroDeAlunos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelNumeroDeAlunos.setText("Numero de Alunos");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtId.setEditable(false);
        txtId.setEnabled(false);
        txtId.setOpaque(false);
        txtId.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                txtIdComponentHidden(evt);
            }
        });
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        labelObservação.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelObservação.setText("Observação");

        botaoFechar.setText("Fechar");
        botaoFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoFecharActionPerformed(evt);
            }
        });

        labelLaboratorio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelLaboratorio.setText("Laboratório");

        grupoBotao.add(botaoRadioSim);
        botaoRadioSim.setText("Sim");

        grupoBotao.add(botaoRadioNao);
        botaoRadioNao.setText("Não");
        botaoRadioNao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRadioNaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 137, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(botaoCancelar)
                        .addGap(18, 18, 18)
                        .addComponent(botaoSalvar)
                        .addGap(137, 137, 137))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(botaoFechar)
                        .addGap(184, 184, 184))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelNumeroDeAlunos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4))
                            .addComponent(labelCodigo)
                            .addComponent(labelLocalização)
                            .addComponent(labelObservação)
                            .addComponent(labelLaboratorio))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtId, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtLocalização, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtObservação, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNumeroDeAlunos, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botaoRadioSim)
                                .addGap(32, 32, 32)
                                .addComponent(botaoRadioNao))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(labelInformações, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(labelInformações)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCodigo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLocalização, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelLocalização))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtObservação, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelObservação))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumeroDeAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(labelNumeroDeAlunos))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelLaboratorio)
                    .addComponent(botaoRadioSim)
                    .addComponent(botaoRadioNao))
                .addGap(76, 76, 76)
                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoFechar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoCancelar)
                    .addComponent(botaoSalvar))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void txtNumeroDeAlunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroDeAlunosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroDeAlunosActionPerformed

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_botaoCancelarActionPerformed

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        if (!"".equals(txtCodigo.getText()) && !"".equals(txtObservação.getText()) && !"".equals(txtLocalização.getText()) && !"".equals(txtNumeroDeAlunos.getText()) && (botaoRadioNao.isSelected() || botaoRadioSim.isSelected()) ) {
            Entidades.Sala s = new Entidades.Sala();

            ControladorSala j = new ControladorSala();

            s = j.findSala(Integer.parseInt(txtId.getText()));

            s.setSalaCodigo(txtCodigo.getText());
            s.setSalaLocalizacao(txtLocalização.getText());
            s.setSalaNumAluno((short)Integer.parseInt(txtNumeroDeAlunos.getText()));
            s.setSalaObservacao(txtObservação.getText());
            if(botaoRadioSim.isSelected()){
                s.setSalaLaboratorio(true);
            } else {
                s.setSalaLaboratorio(false);
            }
            
            

            try {
                j.edit(s);
                txtLocalização.setText("");
                txtCodigo.setText("");
                txtObservação.setText("");
                txtNumeroDeAlunos.setText("");
                txtId.setText("");
                JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
            } catch (Exception ex) {
                Logger.getLogger(TelaEditarSala.class.getName()).log(Level.SEVERE, null, ex);
            }
            TelaCadastroController control = new TelaCadastroController();
       
            control.refreshTable(tabela1, 2);            
            
            this.dispose();
        }


    }//GEN-LAST:event_botaoSalvarActionPerformed

    private void botaoFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_botaoFecharActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void txtIdComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_txtIdComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdComponentHidden

    private void botaoRadioNaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRadioNaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoRadioNaoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaEditarSala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEditarSala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEditarSala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEditarSala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaEditarSala dialog = new TelaEditarSala(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoFechar;
    private javax.swing.JRadioButton botaoRadioNao;
    private javax.swing.JRadioButton botaoRadioSim;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.ButtonGroup grupoBotao;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelInformações;
    private javax.swing.JLabel labelLaboratorio;
    private javax.swing.JLabel labelLocalização;
    private javax.swing.JLabel labelNumeroDeAlunos;
    private javax.swing.JLabel labelObservação;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtLocalização;
    private javax.swing.JTextField txtNumeroDeAlunos;
    private javax.swing.JTextField txtObservação;
    // End of variables declaration//GEN-END:variables
}
