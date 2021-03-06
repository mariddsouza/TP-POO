package view;

import java.awt.geom.RoundRectangle2D;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.border.BevelBorder;

public class TelaUsuario extends javax.swing.JFrame {
    int positionX = 0, positionY = 0;
    
    public TelaUsuario() {
        
        //setUndecorated(true);
        
        
        initComponents();
        
        
        
        setLocationRelativeTo(null);
        
        //setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 50, 80));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TitleMateria = new javax.swing.JLabel();
        ButtonGrafos = new javax.swing.JButton();
        ButtonProgramacao = new javax.swing.JButton();
        ButtonVoltar = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(631, 606));
        jPanel1.setLayout(null);

        TitleMateria.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        TitleMateria.setForeground(new java.awt.Color(51, 51, 51));
        TitleMateria.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleMateria.setText("Disciplinas");
        jPanel1.add(TitleMateria);
        TitleMateria.setBounds(300, 40, 270, 70);

        ButtonGrafos.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        ButtonGrafos.setText("Teoria e Modelo de Grafos");
        ButtonGrafos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonGrafosActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonGrafos);
        ButtonGrafos.setBounds(420, 290, 350, 40);

        ButtonProgramacao.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        ButtonProgramacao.setText("Programa????o");
        ButtonProgramacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonProgramacaoActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonProgramacao);
        ButtonProgramacao.setBounds(40, 290, 350, 41);

        ButtonVoltar.setText("Voltar");
        ButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonVoltarActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonVoltar);
        ButtonVoltar.setBounds(720, 70, 90, 25);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/Background-image.png"))); // NOI18N
        Background.setText("jLabel1");
        jPanel1.add(Background);
        Background.setBounds(0, 0, 820, 610);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 813, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonGrafosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonGrafosActionPerformed
         
        TelaGrafos grafos = new TelaGrafos ();
        grafos.setVisible(true);

        dispose ();
    }//GEN-LAST:event_ButtonGrafosActionPerformed
        
  
    private void ButtonProgramacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonProgramacaoActionPerformed
        TelaProgramacao prog = new TelaProgramacao ();
        prog.setVisible(true);

        dispose ();
    }//GEN-LAST:event_ButtonProgramacaoActionPerformed

    private void ButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonVoltarActionPerformed
       TelaInicial inicial = new TelaInicial ();
       inicial.setVisible(true);
       
       dispose ();
    }//GEN-LAST:event_ButtonVoltarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaUsuario().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton ButtonGrafos;
    private javax.swing.JButton ButtonProgramacao;
    private javax.swing.JButton ButtonVoltar;
    private javax.swing.JLabel TitleMateria;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
