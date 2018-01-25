/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import DAO.SalaJpaController;
import javax.swing.JOptionPane;

/**
 *
 * @author Alan Breno
 */
public class TelaAdicionarSalas extends javax.swing.JDialog {

    /**
     * Creates new form TelaAdicionarSalas
     */
    public TelaAdicionarSalas(java.awt.Frame parent, boolean modal) {
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

        grupoBotoes = new javax.swing.ButtonGroup();
        painelAdicionarSalas = new javax.swing.JPanel();
        labelInformacoes = new javax.swing.JLabel();
        labelNome = new javax.swing.JLabel();
        labelCapacidade = new javax.swing.JLabel();
        labelBloco = new javax.swing.JLabel();
        labelObservacao = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtBloco = new javax.swing.JTextField();
        txtObservacao = new javax.swing.JTextField();
        botaoCancelar = new javax.swing.JButton();
        botaoSalvar = new javax.swing.JButton();
        txtCapacidade = new javax.swing.JFormattedTextField();
        labelLaboratorio = new javax.swing.JLabel();
        botaoRadioSim = new javax.swing.JRadioButton();
        botaoRadioNao = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Adicionar Salas");
        setResizable(false);

        labelInformacoes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelInformacoes.setText("Informações Salas ");

        labelNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelNome.setText("Nome");

        labelCapacidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelCapacidade.setText("Capacidade");

        labelBloco.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelBloco.setText("Bloco");

        labelObservacao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelObservacao.setText("Observação");

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

        txtCapacidade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        labelLaboratorio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelLaboratorio.setText("Laboratório");

        grupoBotoes.add(botaoRadioSim);
        botaoRadioSim.setText("Sim");
        botaoRadioSim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRadioSimActionPerformed(evt);
            }
        });

        grupoBotoes.add(botaoRadioNao);
        botaoRadioNao.setText("Não");
        botaoRadioNao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRadioNaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelAdicionarSalasLayout = new javax.swing.GroupLayout(painelAdicionarSalas);
        painelAdicionarSalas.setLayout(painelAdicionarSalasLayout);
        painelAdicionarSalasLayout.setHorizontalGroup(
            painelAdicionarSalasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAdicionarSalasLayout.createSequentialGroup()
                .addGroup(painelAdicionarSalasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelAdicionarSalasLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(painelAdicionarSalasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelObservacao, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelCapacidade, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelNome, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelBloco, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelLaboratorio, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelAdicionarSalasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelAdicionarSalasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(labelInformacoes)
                                .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                .addComponent(txtBloco)
                                .addComponent(txtObservacao)
                                .addComponent(txtCapacidade))
                            .addGroup(painelAdicionarSalasLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(botaoRadioSim)
                                .addGap(39, 39, 39)
                                .addComponent(botaoRadioNao))))
                    .addGroup(painelAdicionarSalasLayout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(botaoCancelar)
                        .addGap(99, 99, 99)
                        .addComponent(botaoSalvar)))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        painelAdicionarSalasLayout.setVerticalGroup(
            painelAdicionarSalasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAdicionarSalasLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(labelInformacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(painelAdicionarSalasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelAdicionarSalasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCapacidade)
                    .addComponent(txtCapacidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelAdicionarSalasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelBloco)
                    .addComponent(txtBloco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelAdicionarSalasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelObservacao)
                    .addComponent(txtObservacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelAdicionarSalasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelAdicionarSalasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelLaboratorio)
                        .addComponent(botaoRadioSim))
                    .addComponent(botaoRadioNao))
                .addGap(44, 44, 44)
                .addGroup(painelAdicionarSalasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoCancelar)
                    .addComponent(botaoSalvar))
                .addContainerGap(84, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelAdicionarSalas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelAdicionarSalas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        if (!"".equals(txtNome.getText()) && (!"".equals(txtBloco.getText())) && (!"".equals(txtCapacidade.getText())) && (!"".equals(txtObservacao.getText()))){
            Entidades.Sala s = new Entidades.Sala();
            s.setSalaNumAluno((short)Integer.parseInt(txtCapacidade.getText()));
            s.setSalaObservacao(txtObservacao.getText());
            s.setSalaCodigo(txtNome.getText());
            s.setSalaLocalizacao(txtBloco.getText());
            if (botaoRadioSim.isSelected() == true){
                s.setSalaLaboratorio(true);
            }else{
                s.setSalaLaboratorio(false);
            }
            
            SalaJpaController j = new SalaJpaController();
            j.create(s);

            txtCapacidade.setText("");
            txtNome.setText("");
            txtBloco.setText("");
            txtObservacao.setText("");
            botaoRadioSim.setSelected(false);
            botaoRadioNao.setSelected(false);
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        }else{
            JOptionPane.showMessageDialog(null, "Erro - Preencha todos os campos!");            
        }   
    }//GEN-LAST:event_botaoSalvarActionPerformed

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_botaoCancelarActionPerformed

    private void botaoRadioSimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRadioSimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoRadioSimActionPerformed

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
            java.util.logging.Logger.getLogger(TelaAdicionarSalas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAdicionarSalas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAdicionarSalas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAdicionarSalas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaAdicionarSalas dialog = new TelaAdicionarSalas(new javax.swing.JFrame(), true);
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
    private javax.swing.ButtonGroup grupoBotoes;
    private javax.swing.JLabel labelBloco;
    private javax.swing.JLabel labelCapacidade;
    private javax.swing.JLabel labelInformacoes;
    private javax.swing.JLabel labelLaboratorio;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelObservacao;
    private javax.swing.JPanel painelAdicionarSalas;
    private javax.swing.JTextField txtBloco;
    private javax.swing.JFormattedTextField txtCapacidade;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtObservacao;
    // End of variables declaration//GEN-END:variables
}
