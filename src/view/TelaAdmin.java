package view;

public class TelaAdmin extends javax.swing.JFrame {

    public TelaAdmin() {
        initComponents();
        
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        TitleMateria = new javax.swing.JLabel();
        ButtonProgramacao = new javax.swing.JButton();
        ButtonVoltar = new javax.swing.JButton();
        ButtonGrafos = new javax.swing.JButton();
        ButtonCadastrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/Background-image.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(null);

        TitleMateria.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        TitleMateria.setForeground(new java.awt.Color(51, 51, 51));
        TitleMateria.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleMateria.setText("Matérias");
        jPanel1.add(TitleMateria);
        TitleMateria.setBounds(270, 10, 210, 70);

        ButtonProgramacao.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        ButtonProgramacao.setText("Programação");
        ButtonProgramacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonProgramacaoActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonProgramacao);
        ButtonProgramacao.setBounds(10, 280, 350, 41);

        ButtonVoltar.setText("Voltar");
        ButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonVoltarActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonVoltar);
        ButtonVoltar.setBounds(670, 40, 70, 20);

        ButtonGrafos.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        ButtonGrafos.setText("Teoria e Modelo de Grafos");
        ButtonGrafos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonGrafosActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonGrafos);
        ButtonGrafos.setBounds(380, 280, 350, 40);

        ButtonCadastrar.setText("Cadastrar");
        ButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCadastrarActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonCadastrar);
        ButtonCadastrar.setBounds(270, 460, 160, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/Background-image.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(-30, -20, 780, 590);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonVoltarActionPerformed
      TelaInicial inicial = new TelaInicial ();
       inicial.setVisible(true);
       
       dispose ();
    }//GEN-LAST:event_ButtonVoltarActionPerformed

    private void ButtonProgramacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonProgramacaoActionPerformed
        TelaProgAdmin prog = new TelaProgAdmin ();
        prog.setVisible(true);

        dispose ();
    }//GEN-LAST:event_ButtonProgramacaoActionPerformed

    private void ButtonGrafosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonGrafosActionPerformed
        TelaGrafosAdmin grafos = new TelaGrafosAdmin ();
        grafos.setVisible(true);

        dispose ();
    }//GEN-LAST:event_ButtonGrafosActionPerformed

    private void ButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCadastrarActionPerformed
        TelaCadastrar cadastrar = new TelaCadastrar ();
        cadastrar.setVisible(true);

        dispose ();
    }//GEN-LAST:event_ButtonCadastrarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonCadastrar;
    private javax.swing.JButton ButtonGrafos;
    private javax.swing.JButton ButtonProgramacao;
    private javax.swing.JButton ButtonVoltar;
    private javax.swing.JLabel TitleMateria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
