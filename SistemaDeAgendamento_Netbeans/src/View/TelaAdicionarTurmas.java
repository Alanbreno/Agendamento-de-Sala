/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author Alan Breno
 */
public class TelaAdicionarTurmas extends javax.swing.JDialog {

    /**
     * Creates new form TelaAdicionarTurmas
     */
    public TelaAdicionarTurmas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoBotoesStatus = new javax.swing.ButtonGroup();
        painelAdicionarTurmas = new javax.swing.JPanel();
        labelInformacoes = new javax.swing.JLabel();
        labelNome = new javax.swing.JLabel();
        labelSemestre = new javax.swing.JLabel();
        labelNumeroDeAlunos = new javax.swing.JLabel();
        labelStatus = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtSemestre = new javax.swing.JTextField();
        txtNumeroDeAlunos = new javax.swing.JTextField();
        botaoCancelar = new javax.swing.JButton();
        botaoSalvar = new javax.swing.JButton();
        botaoRadioNao = new javax.swing.JRadioButton();
        botaoRadioSim = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Adicionar Turmas");
        setResizable(false);

        labelInformacoes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelInformacoes.setText("Informações Turmas");

        labelNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelNome.setText("Nome");

        labelSemestre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelSemestre.setText("Semestre");

        labelNumeroDeAlunos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelNumeroDeAlunos.setText("Nº de Alunos");

        labelStatus.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelStatus.setText("Status");

        txtSemestre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSemestreActionPerformed(evt);
            }
        });

        botaoCancelar.setText("Cancelar");

        botaoSalvar.setText("Salvar");
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });

        grupoBotoesStatus.add(botaoRadioNao);
        botaoRadioNao.setText("Não");
        botaoRadioNao.setBorderPainted(true);
        botaoRadioNao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRadioNaoActionPerformed(evt);
            }
        });

        grupoBotoesStatus.add(botaoRadioSim);
        botaoRadioSim.setText("Sim");
        botaoRadioSim.setBorderPainted(true);

        javax.swing.GroupLayout painelAdicionarTurmasLayout = new javax.swing.GroupLayout(painelAdicionarTurmas);
        painelAdicionarTurmas.setLayout(painelAdicionarTurmasLayout);
        painelAdicionarTurmasLayout.setHorizontalGroup(
            painelAdicionarTurmasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAdicionarTurmasLayout.createSequentialGroup()
                .addGroup(painelAdicionarTurmasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelAdicionarTurmasLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(painelAdicionarTurmasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(painelAdicionarTurmasLayout.createSequentialGroup()
                                .addGroup(painelAdicionarTurmasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labelStatus)
                                    .addComponent(labelNumeroDeAlunos)
                                    .addComponent(labelSemestre)
                                    .addComponent(labelNome))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(painelAdicionarTurmasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNome)
                                    .addComponent(txtSemestre)
                                    .addComponent(txtNumeroDeAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(painelAdicionarTurmasLayout.createSequentialGroup()
                                        .addComponent(botaoRadioSim)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(botaoRadioNao))))
                            .addGroup(painelAdicionarTurmasLayout.createSequentialGroup()
                                .addComponent(botaoCancelar)
                                .addGap(99, 99, 99)
                                .addComponent(botaoSalvar))))
                    .addGroup(painelAdicionarTurmasLayout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(labelInformacoes)))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        painelAdicionarTurmasLayout.setVerticalGroup(
            painelAdicionarTurmasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAdicionarTurmasLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(labelInformacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(painelAdicionarTurmasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelAdicionarTurmasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSemestre)
                    .addComponent(txtSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelAdicionarTurmasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNumeroDeAlunos)
                    .addComponent(txtNumeroDeAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(painelAdicionarTurmasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoRadioSim)
                    .addComponent(botaoRadioNao))
                .addGap(76, 76, 76)
                .addGroup(painelAdicionarTurmasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoCancelar)
                    .addComponent(botaoSalvar))
                .addContainerGap(84, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelAdicionarTurmas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelAdicionarTurmas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtSemestreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSemestreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSemestreActionPerformed

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoSalvarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaAdicionarTurmas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAdicionarTurmas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAdicionarTurmas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAdicionarTurmas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaAdicionarTurmas dialog = new TelaAdicionarTurmas(new javax.swing.JFrame(), true);
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
    private javax.swing.JRadioButton botaoRadioNao;
    private javax.swing.JRadioButton botaoRadioSim;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.ButtonGroup grupoBotoesStatus;
    private javax.swing.JLabel labelInformacoes;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelNumeroDeAlunos;
    private javax.swing.JLabel labelSemestre;
    private javax.swing.JLabel labelStatus;
    private javax.swing.JPanel painelAdicionarTurmas;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumeroDeAlunos;
    private javax.swing.JTextField txtSemestre;
    // End of variables declaration//GEN-END:variables
}
