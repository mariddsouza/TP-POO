package view;
import controller.ControlAluno;
import controller.ControlAdmin;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.JOptionPane;
import model.ModelAluno;
import model.ModelAdmin;
public class TelaCadastrar extends javax.swing.JFrame {
    ModelAluno modelAluno= new ModelAluno();
    ModelAdmin modelAdmin = new ModelAdmin();
    ControlAluno controlAluno = new ControlAluno();
    ControlAdmin controlAdmin = new ControlAdmin();
    List<ModelAluno> listaAluno = new ArrayList<>();
    List<ModelAdmin> listaAdmin = new ArrayList<>();
    public TelaCadastrar() {
    
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ButtonVoltar = new javax.swing.JButton();
        textName = new javax.swing.JTextField();
        TitleCadastrar = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textLogin = new javax.swing.JTextField();
        ButtonEnviar = new javax.swing.JButton();
        textEmail = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        BackgroundImage = new javax.swing.JLabel();

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

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel2.setText("Login");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(180, 290, 50, 23);

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel3.setText("E-mail");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(70, 360, 60, 23);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Usuario Comum" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(140, 430, 180, 22);

        BackgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/Background-image.png"))); // NOI18N
        BackgroundImage.setText("jLabel5");
        jPanel1.add(BackgroundImage);
        BackgroundImage.setBounds(0, 0, 820, 610);

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

    private void ButtonEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEnviarActionPerformed
      
        modelAluno = new ModelAluno();
        modelAdmin = new ModelAdmin();
        String senha =RandomAlphaNumeric.randomString(6);
        modelAdmin.setAdmNome(textName.getText());
        modelAdmin.setAdmLogin(textLogin.getText());
        modelAdmin.setAdmEmail(textEmail.getText());
        modelAdmin.setAdmSenha(senha);
        modelAluno.setAlunoNome(textName.getText());
        modelAluno.setAlunoLogin(textLogin.getText());
        modelAluno.setAlunoEmail(textEmail.getText());
        modelAluno.setAlunoSenha(senha);
        if(jComboBox1.getSelectedIndex()==1){
            
            if(controlAluno.verificaAlunoControl(modelAluno)){
                JOptionPane.showMessageDialog(this,"Usuário já Cadastrado!!");

            }else if(controlAdmin.verificaAdminControl(modelAdmin)){
                JOptionPane.showMessageDialog(this,"Usuário já Cadastrado!!");

            }else{
            if(controlAluno.salvarAlunoControl(modelAluno)){
                JOptionPane.showMessageDialog(this,"Usuário Cadastrado com sucesso!!");
            }
            else{
                JOptionPane.showMessageDialog(this,"Usuário Cadastrado com sucesso!!","Erro!!",JOptionPane.ERROR_MESSAGE);
            }}
        }
        else if(jComboBox1.getSelectedIndex()==0){
            
            if(controlAluno.verificaAlunoControl(modelAluno)){
                JOptionPane.showMessageDialog(this,"Usuário já Cadastrado!!");

            }else if(controlAdmin.verificaAdminControl(modelAdmin)){
                JOptionPane.showMessageDialog(this,"Usuário já Cadastrado!!");

            }else{
            if(controlAdmin.salvarAdminControl(modelAdmin)){
                JOptionPane.showMessageDialog(this,"Usuário Cadastrado com sucesso!!");
            }
            else{
                JOptionPane.showMessageDialog(this,"Usuário não foi Cadastrado!!","Erro!!",JOptionPane.ERROR_MESSAGE);
            }}
        }
    }//GEN-LAST:event_ButtonEnviarActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
    private javax.swing.JLabel TitleCadastrar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField textEmail;
    private javax.swing.JTextField textLogin;
    private javax.swing.JTextField textName;
    // End of variables declaration//GEN-END:variables
public class RandomAlphaNumeric {
private static final Random random = new Random();

//não faz sentido instanciar essa classe
//[0 - 9] =  0-9
//[A - Z] = 10-35
//[a - z] = 36-61
private static char toChar(int index) {
    if (index < 10)
        return (char)(index + 48); //os chars 48 a 57 representam [0 - 9]
    else if (index < 36)
        return (char)(index + 55); //os chars 65 a 90 representam [A - Z]
    else
        return (char)(index + 61); //os chars 97 a 122 representam [a - z]
}

//char randomico entre [0 - 9], [A - Z] e [a - z]
public static char randomChar() {
    return toChar(random.nextInt(62));
}

//String randomica de tamanho length, contendo apenas caracters alfanumericos
public static String randomString(int length) {
    return new String(randomCharSequence(length));
}

//sequencia de caracters randomicos de tamanho length, contendo apenas alfanumericos
public static char[] randomCharSequence(int length) {
    if (length < 0)
        throw new IllegalArgumentException("O tamanho da string não pode ser negativo");
    if (length == 0)
        return new char[0];
    
    char[] charSequence = new char[length];
    for (int i = 0; i<length; i++)
        charSequence[i] = randomChar();
    return charSequence;
}

//sequencia de caracters randomicos de tamanho entre minLength e maxLength, contendo apenas carcters alfanumericos
public static String randomString(int minLength, int maxLength) {
    if (minLength <0 || maxLength < 0){
        throw new IllegalArgumentException("O tamanho da string não pode ser negativo");}
    if (minLength > maxLength){
        throw new IllegalArgumentException("O tamanho maximo da String não pode ser menor que o minimo");
    }
    if (minLength == maxLength)
        return randomString(maxLength);
    int size = minLength + random.nextInt(maxLength-minLength+1);
    return randomString(size);
}
}
}