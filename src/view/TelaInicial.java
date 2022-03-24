package view;

import controller.ControlAluno;
import controller.ControlProfessor;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.ModelAluno;
import model.ModelProfessor;

public class TelaInicial extends javax.swing.JFrame {

    ModelAluno modelAluno= new ModelAluno();
    ModelProfessor modelProfessor = new ModelProfessor();
    ControlAluno controlAluno = new ControlAluno();
    ControlProfessor controlProfessor = new ControlProfessor();
    List<ModelAluno> listaAluno = new ArrayList<>();
    
    public TelaInicial() {
        initComponents();
        setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        ButtonSingin = new javax.swing.JButton();
        ButtonLogin = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        textLogin = new javax.swing.JTextField();
        TextLogin = new javax.swing.JLabel();
        TextSenha = new javax.swing.JPasswordField();
        TextPassword = new javax.swing.JLabel();
        ButtonSingin1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/imagem-fundo-login.png"))); // NOI18N
        jLabel3.setText("jLabel3");

        ButtonSingin.setBackground(new java.awt.Color(204, 204, 204));
        ButtonSingin.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        ButtonSingin.setText("Sing in");
        ButtonSingin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSinginActionPerformed(evt);
            }
        });

        ButtonLogin.setBackground(new java.awt.Color(204, 204, 204));
        ButtonLogin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLoginActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));
        jPanel3.setLayout(null);

        textLogin.setBackground(new java.awt.Color(204, 204, 204));
        textLogin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textLoginActionPerformed(evt);
            }
        });
        jPanel3.add(textLogin);
        textLogin.setBounds(20, 150, 210, 31);

        TextLogin.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        TextLogin.setText("Login");
        jPanel3.add(TextLogin);
        TextLogin.setBounds(20, 120, 60, 23);

        TextSenha.setBackground(new java.awt.Color(204, 204, 204));
        TextSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextSenhaActionPerformed(evt);
            }
        });
        jPanel3.add(TextSenha);
        TextSenha.setBounds(20, 230, 210, 33);

        TextPassword.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        TextPassword.setText("Senha");
        jPanel3.add(TextPassword);
        TextPassword.setBounds(20, 200, 62, 33);

        ButtonSingin1.setBackground(new java.awt.Color(204, 204, 204));
        ButtonSingin1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        ButtonSingin1.setText("Sing in");
        ButtonSingin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSingin1ActionPerformed(evt);
            }
        });
        jPanel3.add(ButtonSingin1);
        ButtonSingin1.setBounds(270, 530, 360, 39);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/imagem-fundo-login.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(0, 0, 860, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 842, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLoginActionPerformed

    }//GEN-LAST:event_ButtonLoginActionPerformed

    private void ButtonSinginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSinginActionPerformed

    }//GEN-LAST:event_ButtonSinginActionPerformed

    private void textLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textLoginActionPerformed

    }//GEN-LAST:event_textLoginActionPerformed

    private void ButtonSingin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSingin1ActionPerformed

       /* modelAluno.setAlunoLogin(ButtonLogin.getText());
        modelAluno.setAlunoSenha(String.valueOf(ButtonPassword.getPassword()));
        modelProfessor.setProfLogin(ButtonLogin.getText());
        modelProfessor.setProfSenha(String.valueOf(ButtonPassword.getPassword()));

        if(controlAluno.validarAlunoControl(modelAluno)){
            new TelaUsuario().setVisible(true);
            dispose ();

        }else if(controlProfessor.validarProfControl(modelProfessor)){
            new TelaAdmin().setVisible(true);
            dispose ();

        }*/
       if(textLogin.getText().equals("Marcia")&&TextSenha.getText().equals("1234")){
           JOptionPane.showMessageDialog(null,"Bem vindo ao iCode");
           new TelaUsuario().setVisible(true);
            dispose ();
       }
        else{
            JOptionPane.showMessageDialog(null,"Usuário ou senha incorretos");
        }
    }//GEN-LAST:event_ButtonSingin1ActionPerformed

    private void TextSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextSenhaActionPerformed

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ButtonLogin;
    private javax.swing.JButton ButtonSingin;
    private javax.swing.JButton ButtonSingin1;
    private javax.swing.JLabel TextLogin;
    private javax.swing.JLabel TextPassword;
    private javax.swing.JPasswordField TextSenha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField textLogin;
    // End of variables declaration//GEN-END:variables
}
