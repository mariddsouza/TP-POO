package view;
import java.awt.Desktop;
import java.net.URL;

public class TelaProgramacao extends javax.swing.JFrame {

    public TelaProgramacao() {
        initComponents();
        
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jColorChooser1 = new javax.swing.JColorChooser();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem3 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem4 = new javax.swing.JCheckBoxMenuItem();
        jPanel1 = new javax.swing.JPanel();
        TitleProgramacao = new javax.swing.JLabel();
        ButtonVoltar = new javax.swing.JButton();
        linkArray = new javax.swing.JButton();
        linkCondicional = new javax.swing.JButton();
        LinkMatriz = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("jCheckBoxMenuItem2");

        jCheckBoxMenuItem3.setSelected(true);
        jCheckBoxMenuItem3.setText("jCheckBoxMenuItem3");

        jCheckBoxMenuItem4.setSelected(true);
        jCheckBoxMenuItem4.setText("jCheckBoxMenuItem4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(null);

        TitleProgramacao.setFont(new java.awt.Font("Franklin Gothic Book", 1, 36)); // NOI18N
        TitleProgramacao.setText("Programação");
        jPanel1.add(TitleProgramacao);
        TitleProgramacao.setBounds(310, 80, 215, 41);

        ButtonVoltar.setText("Voltar");
        ButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonVoltarActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonVoltar);
        ButtonVoltar.setBounds(740, 100, 70, 20);

        linkArray.setText("Array");
        linkArray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                linkArrayActionPerformed(evt);
            }
        });
        jPanel1.add(linkArray);
        linkArray.setBounds(230, 330, 358, 25);

        linkCondicional.setText("Condicional");
        linkCondicional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                linkCondicionalActionPerformed(evt);
            }
        });
        jPanel1.add(linkCondicional);
        linkCondicional.setBounds(230, 290, 358, 25);

        LinkMatriz.setText("Matriz");
        LinkMatriz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LinkMatrizActionPerformed(evt);
            }
        });
        jPanel1.add(LinkMatriz);
        LinkMatriz.setBounds(230, 370, 358, 25);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/Background-image.png"))); // NOI18N
        Background.setText("jLabel2");
        jPanel1.add(Background);
        Background.setBounds(0, 0, 820, 660);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 818, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Voltando para a Tela de disciplinas do Usuario
    private void ButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonVoltarActionPerformed
       TelaUsuario user = new TelaUsuario ();
       user.setVisible(true);
       
       dispose ();
    }//GEN-LAST:event_ButtonVoltarActionPerformed

    private void linkArrayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_linkArrayActionPerformed

        try{
            Desktop.getDesktop().browse(new URL("http://linguagemc.com.br/vetores-ou-arrays-em-linguagem-c/").toURI());
        }
        catch(Exception e)
        {}
    }//GEN-LAST:event_linkArrayActionPerformed

    private void linkCondicionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_linkCondicionalActionPerformed
         try{
            Desktop.getDesktop().browse(new URL("https://www.ic.unicamp.br/~wainer/cursos/2s2011/Cap05-EstruturasCondicionais-texto.pdf").toURI());
        }
        catch(Exception e)
        {}
    }//GEN-LAST:event_linkCondicionalActionPerformed

    private void LinkMatrizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LinkMatrizActionPerformed
        try{
            Desktop.getDesktop().browse(new URL("http://linguagemc.com.br/matriz-em-c/").toURI());
        }
        catch(Exception e)
        {}
    }//GEN-LAST:event_LinkMatrizActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaProgramacao().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton ButtonVoltar;
    private javax.swing.JButton LinkMatriz;
    private javax.swing.JLabel TitleProgramacao;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem3;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem4;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton linkArray;
    private javax.swing.JButton linkCondicional;
    // End of variables declaration//GEN-END:variables
}
