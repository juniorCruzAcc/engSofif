/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author iMurilo Cruz
 */
public class TelaVisualizarSecretario extends javax.swing.JFrame {

    /**
     * Creates new form TelaLogin
     */
    public TelaVisualizarSecretario() {
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

        jPanelCentro = new javax.swing.JPanel();
        labelVisualizarSecretario = new javax.swing.JLabel();
        buttonVoltar = new javax.swing.JButton();
        labelCampoInicioContrato = new javax.swing.JLabel();
        labelDataNasc = new javax.swing.JLabel();
        labelRG = new javax.swing.JLabel();
        labelEndereco = new javax.swing.JLabel();
        labelInicioContrato = new javax.swing.JLabel();
        labelContrato = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        labelCEP = new javax.swing.JLabel();
        labelNome = new javax.swing.JLabel();
        labelCampoNome = new javax.swing.JLabel();
        labelCampoDataNasc = new javax.swing.JLabel();
        labelCampoRG = new javax.swing.JLabel();
        labelCampoEndereco = new javax.swing.JLabel();
        labelCampoCEP = new javax.swing.JLabel();
        labelCampoEmail = new javax.swing.JLabel();
        labelCampoContrato = new javax.swing.JLabel();
        labelTerminoContrato = new javax.swing.JLabel();
        labelCampoTerminoContrato = new javax.swing.JLabel();
        labelCampoCPF = new javax.swing.JLabel();
        labelCPF = new javax.swing.JLabel();
        jPanelTopo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanelLateral = new javax.swing.JPanel();
        labelSecretarios = new javax.swing.JLabel();
        labelPersonalTrainers = new javax.swing.JLabel();
        labelEquipamentos = new javax.swing.JLabel();
        labelAlunos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanelCentro.setBackground(new java.awt.Color(255, 255, 255));
        jPanelCentro.setLayout(null);

        labelVisualizarSecretario.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelVisualizarSecretario.setText("Visualizar Secretário");
        jPanelCentro.add(labelVisualizarSecretario);
        labelVisualizarSecretario.setBounds(30, 20, 260, 40);

        buttonVoltar.setText("Voltar");
        buttonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVoltarActionPerformed(evt);
            }
        });
        jPanelCentro.add(buttonVoltar);
        buttonVoltar.setBounds(420, 390, 130, 23);

        labelCampoInicioContrato.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelCampoInicioContrato.setText("22/07/2016");
        jPanelCentro.add(labelCampoInicioContrato);
        labelCampoInicioContrato.setBounds(330, 320, 210, 30);

        labelDataNasc.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelDataNasc.setText("Data de nascimento:");
        jPanelCentro.add(labelDataNasc);
        labelDataNasc.setBounds(150, 140, 200, 30);

        labelRG.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelRG.setText("RG:");
        jPanelCentro.add(labelRG);
        labelRG.setBounds(150, 170, 40, 30);

        labelEndereco.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelEndereco.setText("Endereço:");
        jPanelCentro.add(labelEndereco);
        labelEndereco.setBounds(150, 200, 100, 30);

        labelInicioContrato.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelInicioContrato.setText("Inicio de contrato:");
        jPanelCentro.add(labelInicioContrato);
        labelInicioContrato.setBounds(150, 320, 180, 30);

        labelContrato.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelContrato.setText("Nº de contrato:");
        jPanelCentro.add(labelContrato);
        labelContrato.setBounds(150, 290, 150, 30);

        labelEmail.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelEmail.setText("Email:");
        jPanelCentro.add(labelEmail);
        labelEmail.setBounds(150, 260, 70, 30);

        labelCEP.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelCEP.setText("CEP:");
        jPanelCentro.add(labelCEP);
        labelCEP.setBounds(150, 230, 50, 30);

        labelNome.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelNome.setText("Nome:");
        jPanelCentro.add(labelNome);
        labelNome.setBounds(150, 110, 70, 30);

        labelCampoNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelCampoNome.setText("Marcos Vinicius");
        jPanelCentro.add(labelCampoNome);
        labelCampoNome.setBounds(220, 110, 210, 30);

        labelCampoDataNasc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelCampoDataNasc.setText("23/12/1993");
        jPanelCentro.add(labelCampoDataNasc);
        labelCampoDataNasc.setBounds(340, 140, 210, 30);

        labelCampoRG.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelCampoRG.setText("000.000.000-00");
        jPanelCentro.add(labelCampoRG);
        labelCampoRG.setBounds(190, 170, 180, 30);

        labelCampoEndereco.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelCampoEndereco.setText("Av. Rio Branco, nº 113");
        jPanelCentro.add(labelCampoEndereco);
        labelCampoEndereco.setBounds(250, 200, 210, 30);

        labelCampoCEP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelCampoCEP.setText("44312320");
        jPanelCentro.add(labelCampoCEP);
        labelCampoCEP.setBounds(200, 230, 210, 30);

        labelCampoEmail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelCampoEmail.setText("mv@gmail.com");
        jPanelCentro.add(labelCampoEmail);
        labelCampoEmail.setBounds(210, 260, 210, 30);

        labelCampoContrato.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelCampoContrato.setText("20171512");
        jPanelCentro.add(labelCampoContrato);
        labelCampoContrato.setBounds(300, 290, 210, 30);

        labelTerminoContrato.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelTerminoContrato.setText("Termino de contrato:");
        jPanelCentro.add(labelTerminoContrato);
        labelTerminoContrato.setBounds(150, 350, 200, 30);

        labelCampoTerminoContrato.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelCampoTerminoContrato.setText("22/07/2016");
        jPanelCentro.add(labelCampoTerminoContrato);
        labelCampoTerminoContrato.setBounds(350, 350, 210, 30);

        labelCampoCPF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelCampoCPF.setText("000.000.000.00");
        jPanelCentro.add(labelCampoCPF);
        labelCampoCPF.setBounds(420, 170, 210, 30);

        labelCPF.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelCPF.setText("CPF:");
        jPanelCentro.add(labelCPF);
        labelCPF.setBounds(370, 170, 50, 30);

        getContentPane().add(jPanelCentro, java.awt.BorderLayout.CENTER);

        jPanelTopo.setBackground(new java.awt.Color(0, 255, 0));
        jPanelTopo.setPreferredSize(new java.awt.Dimension(694, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SoFiT");

        javax.swing.GroupLayout jPanelTopoLayout = new javax.swing.GroupLayout(jPanelTopo);
        jPanelTopo.setLayout(jPanelTopoLayout);
        jPanelTopoLayout.setHorizontalGroup(
            jPanelTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTopoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(738, Short.MAX_VALUE))
        );
        jPanelTopoLayout.setVerticalGroup(
            jPanelTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTopoLayout.createSequentialGroup()
                .addGap(0, 8, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        getContentPane().add(jPanelTopo, java.awt.BorderLayout.PAGE_START);

        jPanelLateral.setBackground(new java.awt.Color(103, 152, 104));
        jPanelLateral.setPreferredSize(new java.awt.Dimension(200, 570));

        labelSecretarios.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        labelSecretarios.setForeground(new java.awt.Color(255, 255, 255));
        labelSecretarios.setText("Secretários");

        labelPersonalTrainers.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        labelPersonalTrainers.setForeground(new java.awt.Color(255, 255, 255));
        labelPersonalTrainers.setText("Personal Trainers");

        labelEquipamentos.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        labelEquipamentos.setForeground(new java.awt.Color(255, 255, 255));
        labelEquipamentos.setText("Equipamentos");

        labelAlunos.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        labelAlunos.setForeground(new java.awt.Color(255, 255, 255));
        labelAlunos.setText("Alunos");

        javax.swing.GroupLayout jPanelLateralLayout = new javax.swing.GroupLayout(jPanelLateral);
        jPanelLateral.setLayout(jPanelLateralLayout);
        jPanelLateralLayout.setHorizontalGroup(
            jPanelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLateralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelPersonalTrainers, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addGroup(jPanelLateralLayout.createSequentialGroup()
                        .addGroup(jPanelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelSecretarios, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelEquipamentos))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelLateralLayout.setVerticalGroup(
            jPanelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLateralLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(labelAlunos)
                .addGap(18, 18, 18)
                .addComponent(labelSecretarios)
                .addGap(18, 18, 18)
                .addComponent(labelPersonalTrainers)
                .addGap(18, 18, 18)
                .addComponent(labelEquipamentos)
                .addContainerGap(382, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelLateral, java.awt.BorderLayout.LINE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVoltarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaVisualizarSecretario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaVisualizarSecretario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaVisualizarSecretario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaVisualizarSecretario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new TelaVisualizarSecretario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanelCentro;
    private javax.swing.JPanel jPanelLateral;
    private javax.swing.JPanel jPanelTopo;
    private javax.swing.JLabel labelAlunos;
    private javax.swing.JLabel labelCEP;
    private javax.swing.JLabel labelCPF;
    private javax.swing.JLabel labelCampoCEP;
    private javax.swing.JLabel labelCampoCPF;
    private javax.swing.JLabel labelCampoContrato;
    private javax.swing.JLabel labelCampoDataNasc;
    private javax.swing.JLabel labelCampoEmail;
    private javax.swing.JLabel labelCampoEndereco;
    private javax.swing.JLabel labelCampoInicioContrato;
    private javax.swing.JLabel labelCampoNome;
    private javax.swing.JLabel labelCampoRG;
    private javax.swing.JLabel labelCampoTerminoContrato;
    private javax.swing.JLabel labelContrato;
    private javax.swing.JLabel labelDataNasc;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelEndereco;
    private javax.swing.JLabel labelEquipamentos;
    private javax.swing.JLabel labelInicioContrato;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelPersonalTrainers;
    private javax.swing.JLabel labelRG;
    private javax.swing.JLabel labelSecretarios;
    private javax.swing.JLabel labelTerminoContrato;
    private javax.swing.JLabel labelVisualizarSecretario;
    // End of variables declaration//GEN-END:variables
}
