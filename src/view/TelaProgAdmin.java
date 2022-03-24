package view;
import java.awt.Desktop;
import java.net.URL;

public class TelaProgAdmin extends javax.swing.JFrame {

    public TelaProgAdmin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TitleProgramacao = new javax.swing.JLabel();
        ButtonVoltar = new javax.swing.JButton();
        linkCondicional = new javax.swing.JButton();
        linkArray = new javax.swing.JButton();
        LinkMatriz = new javax.swing.JButton();
        ButtonInserirConteudo = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
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
        ButtonVoltar.setBounds(720, 90, 70, 20);

        linkCondicional.setText("Condicional");
        linkCondicional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                linkCondicionalActionPerformed(evt);
            }
        });
        jPanel1.add(linkCondicional);
        linkCondicional.setBounds(230, 280, 358, 25);

        linkArray.setText("Array");
        linkArray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                linkArrayActionPerformed(evt);
            }
        });
        jPanel1.add(linkArray);
        linkArray.setBounds(230, 330, 358, 25);

        LinkMatriz.setText("Matriz");
        LinkMatriz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LinkMatrizActionPerformed(evt);
            }
        });
        jPanel1.add(LinkMatriz);
        LinkMatriz.setBounds(230, 380, 358, 25);

        ButtonInserirConteudo.setText("Inserir conteúdo");
        ButtonInserirConteudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonInserirConteudoActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonInserirConteudo);
        ButtonInserirConteudo.setBounds(310, 510, 180, 30);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/Background-image.png"))); // NOI18N
        background.setText("jLabel1");
        jPanel1.add(background);
        background.setBounds(0, 0, 850, 650);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 812, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 646, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonVoltarActionPerformed
        TelaAdmin admin = new TelaAdmin ();
        admin.setVisible(true);

        dispose ();
    }//GEN-LAST:event_ButtonVoltarActionPerformed

    private void linkCondicionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_linkCondicionalActionPerformed
        try{
            Desktop.getDesktop().browse(new URL("https://www.ic.unicamp.br/~wainer/cursos/2s2011/Cap05-EstruturasCondicionais-texto.pdf").toURI());
        }
        catch(Exception e)
        {}
    }//GEN-LAST:event_linkCondicionalActionPerformed

    private void linkArrayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_linkArrayActionPerformed

        try{
            Desktop.getDesktop().browse(new URL("http://linguagemc.com.br/vetores-ou-arrays-em-linguagem-c/").toURI());
        }
        catch(Exception e)
        {}
    }//GEN-LAST:event_linkArrayActionPerformed

    private void LinkMatrizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LinkMatrizActionPerformed
        try{
            Desktop.getDesktop().browse(new URL("http://linguagemc.com.br/matriz-em-c/").toURI());
        }
        catch(Exception e)
        {}
    }//GEN-LAST:event_LinkMatrizActionPerformed

    private void ButtonInserirConteudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonInserirConteudoActionPerformed
        //inseir o conteudo de programação aqui 
    }//GEN-LAST:event_ButtonInserirConteudoActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaProgAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonInserirConteudo;
    private javax.swing.JButton ButtonVoltar;
    private javax.swing.JButton LinkMatriz;
    private javax.swing.JLabel TitleProgramacao;
    private javax.swing.JLabel background;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton linkArray;
    private javax.swing.JButton linkCondicional;
    // End of variables declaration//GEN-END:variables
}
