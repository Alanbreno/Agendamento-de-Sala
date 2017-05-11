/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import DAO.Controladores.ControladorTurma;
import Entidades.Turma;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author sedepti
 */
public class TelaEditarTurmas extends javax.swing.JFrame {

    /**
     * Creates new form TelaEditarTurmas
     */
    public TelaEditarTurmas(java.awt.Frame parent, boolean modal) {
        initComponents();
        txtEditarID.setVisible(false);
    }
   
    
    public void editarTurma(String valor){
        ControladorTurma j = new ControladorTurma();
         Turma  p = new Turma();
         List<Turma> a = j.FiltroTurma(valor);
         p = a.get(0);
         txtEditarIdentificação.setText(p.getTurmaCodigo());
         txtEditarAlunos.setText(String.valueOf(p.getTurmaNumAluno()));
         txtEditarSemestre.setText(String.valueOf(p.getTurmaSemestre()));
         txtEditarTurno.setText(p.getTurmaTurno());
         txtEditarID.setText(p.getTurmaId().toString());
         if(p.getTurmaStatus()==true){
             botaoRadioSim.setSelected(true);
         }else{
             botaoRadioNao.setSelected(true);
         }
         
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoBotaoStatus = new javax.swing.ButtonGroup();
        labelInformaçõesTurma = new javax.swing.JLabel();
        labelEditarIdentificaçaoTurma = new javax.swing.JLabel();
        labelEditarSemestreTurma = new javax.swing.JLabel();
        labelEditarNumerodeAlunos = new javax.swing.JLabel();
        labelEditarTurno = new javax.swing.JLabel();
        labelEditarStatus = new javax.swing.JLabel();
        txtEditarIdentificação = new javax.swing.JTextField();
        txtEditarSemestre = new javax.swing.JTextField();
        txtEditarAlunos = new javax.swing.JTextField();
        txtEditarTurno = new javax.swing.JTextField();
        botaoRadioSim = new javax.swing.JRadioButton();
        botaoRadioNao = new javax.swing.JRadioButton();
        botaoCancelar = new javax.swing.JButton();
        botaoSalvar = new javax.swing.JButton();
        txtEditarID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelInformaçõesTurma.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelInformaçõesTurma.setText("Informações da Turma");

        labelEditarIdentificaçaoTurma.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelEditarIdentificaçaoTurma.setText("Identificação");

        labelEditarSemestreTurma.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelEditarSemestreTurma.setText("Semestre");

        labelEditarNumerodeAlunos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelEditarNumerodeAlunos.setText("Nº de Alunos");

        labelEditarTurno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelEditarTurno.setText("Turno");

        labelEditarStatus.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelEditarStatus.setText("Status");

        grupoBotaoStatus.add(botaoRadioSim);
        botaoRadioSim.setText("Sim");
        botaoRadioSim.setBorderPainted(true);

        grupoBotaoStatus.add(botaoRadioNao);
        botaoRadioNao.setText("Não");
        botaoRadioNao.setBorderPainted(true);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(labelInformaçõesTurma))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(botaoCancelar)
                        .addGap(84, 84, 84)
                        .addComponent(botaoSalvar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labelEditarIdentificaçaoTurma)
                                    .addComponent(labelEditarNumerodeAlunos)
                                    .addComponent(labelEditarSemestreTurma)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(labelEditarTurno)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEditarID, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtEditarIdentificação)
                                .addComponent(txtEditarSemestre)
                                .addComponent(txtEditarAlunos)
                                .addComponent(txtEditarTurno, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(labelEditarStatus)
                        .addGap(18, 18, 18)
                        .addComponent(botaoRadioSim)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botaoRadioNao)))
                .addContainerGap(118, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(labelInformaçõesTurma)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEditarIdentificaçaoTurma)
                    .addComponent(txtEditarIdentificação, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEditarSemestreTurma)
                    .addComponent(txtEditarSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEditarNumerodeAlunos)
                    .addComponent(txtEditarAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelEditarTurno)
                    .addComponent(txtEditarTurno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEditarID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEditarStatus)
                    .addComponent(botaoRadioSim)
                    .addComponent(botaoRadioNao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoCancelar)
                    .addComponent(botaoSalvar))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
       this.dispose();
    }//GEN-LAST:event_botaoCancelarActionPerformed

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        if (!"".equals(txtEditarIdentificação.getText()) && !"".equals(txtEditarAlunos.getText()) && !"".equals(txtEditarSemestre.getText()) && (botaoRadioSim.isSelected() == true || botaoRadioNao.isSelected() == true) ){
        Entidades.Turma t = new Entidades.Turma();
        ControladorTurma j = new ControladorTurma();
        t = j.findTurma(Integer.parseInt(txtEditarID.getText()));
        t.setTurmaTurno(txtEditarTurno.getText());
            t.setTurmaNumAluno((short)Integer.parseInt(txtEditarAlunos.getText()));
            t.setTurmaSemestre((short)Integer.parseInt(txtEditarSemestre.getText()));
            t.setTurmaCodigo(txtEditarIdentificação.getText());
            if (botaoRadioSim.isSelected() ==  true){
                t.setTurmaStatus(true);
            }else{
                t.setTurmaStatus(false);
            }
            try {
                j.edit(t);
                JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
            } catch (Exception ex) {
                Logger.getLogger(TelaEditarTurmas.class.getName()).log(Level.SEVERE, null, ex);
            }
       }
    }//GEN-LAST:event_botaoSalvarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaEditarTurmas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEditarTurmas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEditarTurmas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEditarTurmas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() { TelaEditarTurmas dialog = new TelaEditarTurmas(new javax.swing.JFrame(), true  );
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
    private javax.swing.ButtonGroup grupoBotaoStatus;
    private javax.swing.JLabel labelEditarIdentificaçaoTurma;
    private javax.swing.JLabel labelEditarNumerodeAlunos;
    private javax.swing.JLabel labelEditarSemestreTurma;
    private javax.swing.JLabel labelEditarStatus;
    private javax.swing.JLabel labelEditarTurno;
    private javax.swing.JLabel labelInformaçõesTurma;
    private javax.swing.JTextField txtEditarAlunos;
    private javax.swing.JTextField txtEditarID;
    private javax.swing.JTextField txtEditarIdentificação;
    private javax.swing.JTextField txtEditarSemestre;
    private javax.swing.JTextField txtEditarTurno;
    // End of variables declaration//GEN-END:variables
}
