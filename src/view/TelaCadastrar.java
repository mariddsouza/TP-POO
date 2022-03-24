package view;

public class TelaCadastrar extends javax.swing.JFrame {

    public TelaCadastrar() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        ButtonVoltar = new javax.swing.JButton();
        textName = new javax.swing.JTextField();
        TitleCadastrar = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textLogin = new javax.swing.JTextField();
        ButtonEnviar = new javax.swing.JButton();
        textEmail = new javax.swing.JTextField();
        CheckBoxAdmin = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        CheckBoxAluno = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        BackgroundImage = new javax.swing.JLabel();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/Background-image.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(null);

        ButtonVoltar.setText("Voltar");
        ButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonVoltarActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonVoltar);
        ButtonVoltar.setBounds(720, 70, 70, 20);

        textName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNameActionPerformed(evt);
            }
        });
        jPanel1.add(textName);
        textName.setBounds(330, 210, 240, 50);

        TitleCadastrar.setFont(new java.awt.Font("Franklin Gothic Book", 1, 36)); // NOI18N
        TitleCadastrar.setText("Cadastrar");
        jPanel1.add(TitleCadastrar);
        TitleCadastrar.setBounds(320, 50, 170, 41);

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel4.setText("Nome");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(260, 220, 60, 23);

        textLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textLoginActionPerformed(evt);
            }
        });
        jPanel1.add(textLogin);
        textLogin.setBounds(240, 280, 240, 50);

        ButtonEnviar.setText("Enviar");
        ButtonEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEnviarActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonEnviar);
        ButtonEnviar.setBounds(140, 490, 190, 30);

        textEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textEmailActionPerformed(evt);
            }
        });
        jPanel1.add(textEmail);
        textEmail.setBounds(140, 350, 240, 50);

        CheckBoxAdmin.setText("Cadastrar Administrador");
        CheckBoxAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxAdminActionPerformed(evt);
            }
        });
        jPanel1.add(CheckBoxAdmin);
        CheckBoxAdmin.setBounds(80, 440, 160, 30);

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel2.setText("Login");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(180, 290, 50, 23);

        CheckBoxAluno.setText("Cadastrar Aluno");
        CheckBoxAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxAlunoActionPerformed(evt);
            }
        });
        jPanel1.add(CheckBoxAluno);
        CheckBoxAluno.setBounds(270, 440, 130, 30);

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel3.setText("E-mail");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(70, 360, 60, 23);

        BackgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/Background-image.png"))); // NOI18N
        BackgroundImage.setText("jLabel5");
        jPanel1.add(BackgroundImage);
        BackgroundImage.setBounds(0, 0, 810, 610);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 810, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textEmailActionPerformed
    }//GEN-LAST:event_textEmailActionPerformed

    private void textNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNameActionPerformed
    }//GEN-LAST:event_textNameActionPerformed

    private void textLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textLoginActionPerformed
    }//GEN-LAST:event_textLoginActionPerformed

    private void ButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonVoltarActionPerformed
        TelaAdmin admin = new TelaAdmin ();
        admin.setVisible(true);

        dispose ();
    }//GEN-LAST:event_ButtonVoltarActionPerformed

    private void CheckBoxAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxAdminActionPerformed
    }//GEN-LAST:event_CheckBoxAdminActionPerformed

    private void CheckBoxAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxAlunoActionPerformed
    }//GEN-LAST:event_CheckBoxAlunoActionPerformed

    private void ButtonEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEnviarActionPerformed
    }//GEN-LAST:event_ButtonEnviarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackgroundImage;
    private javax.swing.JButton ButtonEnviar;
    private javax.swing.JButton ButtonVoltar;
    private javax.swing.JCheckBox CheckBoxAdmin;
    private javax.swing.JCheckBox CheckBoxAluno;
    private javax.swing.JLabel TitleCadastrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField textEmail;
    private javax.swing.JTextField textLogin;
    private javax.swing.JTextField textName;
    // End of variables declaration//GEN-END:variables
}
