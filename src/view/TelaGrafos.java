
package view;

import java.awt.Desktop;
import java.net.URL;

public class TelaGrafos extends javax.swing.JFrame {

    public TelaGrafos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        TitleProgramacao = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Link = new javax.swing.JButton();
        Link1 = new javax.swing.JButton();
        Link2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/Background-image.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(null);

        TitleProgramacao.setFont(new java.awt.Font("Franklin Gothic Book", 1, 36)); // NOI18N
        TitleProgramacao.setText("Grafos");
        jPanel1.add(TitleProgramacao);
        TitleProgramacao.setBounds(330, 60, 108, 41);

        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(720, 80, 70, 20);

        Link.setText("Planaridade");
        Link.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LinkActionPerformed(evt);
            }
        });
        jPanel1.add(Link);
        Link.setBounds(230, 370, 358, 25);

        Link1.setText("Busca em Profundidade");
        Link1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Link1ActionPerformed(evt);
            }
        });
        jPanel1.add(Link1);
        Link1.setBounds(230, 270, 358, 25);

        Link2.setText("Grafos Eulerianos");
        Link2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Link2ActionPerformed(evt);
            }
        });
        jPanel1.add(Link2);
        Link2.setBounds(230, 320, 358, 25);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/Background-image.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 800, 620);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 794, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 619, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        TelaUsuario user = new TelaUsuario ();
        user.setVisible(true);

        dispose ();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void LinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LinkActionPerformed
        try{
            Desktop.getDesktop().browse(new URL("http://www.gpec.ucdb.br/pistori/disciplinas/discreta/aulas/planaridade.htm").toURI());
        }
        catch(Exception e)
        {}
    }//GEN-LAST:event_LinkActionPerformed

    private void Link1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Link1ActionPerformed
          try{
            Desktop.getDesktop().browse(new URL("https://www.ime.usp.br/~pf/algoritmos_para_grafos/aulas/dfs.html").toURI());
        }
        catch(Exception e)
        {}
    }//GEN-LAST:event_Link1ActionPerformed

    private void Link2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Link2ActionPerformed
         try{
            Desktop.getDesktop().browse(new URL("https://www.inf.ufsc.br/grafos/temas/euleriano/euleriano.htm").toURI());
        }
        catch(Exception e)
        {}
    }//GEN-LAST:event_Link2ActionPerformed

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaGrafos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Link;
    private javax.swing.JButton Link1;
    private javax.swing.JButton Link2;
    private javax.swing.JLabel TitleProgramacao;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
