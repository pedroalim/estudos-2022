
import java.text.Normalizer;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author aluno
 */
public class JogoForca extends javax.swing.JFrame {

    String palavra, dica, letra, trocar, letraCerta;
    int numLetras, erro, chances;

    public JogoForca() {
        initComponents();
        jButton1.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        btnPalavra = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lblPalavra = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblErradas = new javax.swing.JLabel();
        lblDica = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblChances = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 0, 48)); // NOI18N
        jLabel2.setText("Forca Primitiva");

        btnPalavra.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnPalavra.setText("Escolher Palavra");
        btnPalavra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPalavraActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gettyimages-169937776-612x612.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");

        lblPalavra.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        lblPalavra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPalavra.setText("_ _ _ _ _ _ _ _ _ _");
        lblPalavra.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Escolher letra");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Letras erradas:");

        lblErradas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblErradas.setText("-> ");

        lblDica.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblDica.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDica.setText("Dica:");

        lblChances.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblChances.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblChances.setText("Chances restantes:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPalavra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(lblErradas, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDica, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblChances, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(214, 214, 214)
                                .addComponent(jLabel2)))
                        .addGap(0, 220, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(294, 294, 294)
                .addComponent(btnPalavra, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblDica)
                        .addComponent(lblChances))
                    .addComponent(jLabel4))
                .addGap(46, 46, 46)
                .addComponent(btnPalavra, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblPalavra)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(lblErradas))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(73, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void resetar(){
                btnPalavra.setEnabled(true);
                palavra = "";
                dica = "";
                lblPalavra.setText("_ _ _ _ _ _");
                lblDica.setText("Dica: ");
                lblErradas.setText("-> ");
                letraCerta = "";
                erro = 0;
                lblChances.setText("Chances restantes: ");
}

    private void btnPalavraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPalavraActionPerformed
        palavra = JOptionPane.showInputDialog("Digite a palavra secreta: ");
        dica = JOptionPane.showInputDialog("Digite a dica da palavra: ");
        jButton1.setEnabled(true);

        palavra = Normalizer.normalize(palavra, Normalizer.Form.NFD);     
        palavra = palavra.replaceAll("[^\\p{ASCII}]", "");              //retirar os acentos

        btnPalavra.setEnabled(false);
        palavra = palavra.toUpperCase();
        lblPalavra.setText(palavra.replaceAll("[A-Z]", "_ "));
        numLetras = palavra.length();
    }//GEN-LAST:event_btnPalavraActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       letra = JOptionPane.showInputDialog("Digite uma letra anta: ");
       
       if (letra.length() == 1){

        letra = Normalizer.normalize(letra, Normalizer.Form.NFD);
        letra = letra.replaceAll("[^\\p{ASCII}]", "");                   //retirar os acentos

        letra = letra.toUpperCase();
        if(palavra.contains(letra)){
           //letraCerta guarda todas as letras corretas
           letraCerta = letraCerta + letra;
           //trocar tudo por traço, deixando as letras corretas
           lblPalavra.setText(palavra.replaceAll("[^" + letraCerta + "]", "_ "));

           if (palavra == lblPalavra.getText()){
            JOptionPane.showMessageDialog(null, "GANHOU! Parabens Zé!");
            JOptionPane.showMessageDialog(null, "Número de erros = " + erro);
            resetar();
           }

          } else {
             if (lblErradas.getText().contains(letra)){
                 JOptionPane.showMessageDialog(null, "Letra já digitada");
             }else {
                 erro++;
                 chances = 6 - erro;
                 lblChances.setText("Chances restantes = " + chances);
                 lblErradas.setText(lblErradas.getText()+ letra + ", ");
             if (erro == 2){
                 lblDica.setText("Dica: " + dica);
             }
             if(erro == 6){
                 JOptionPane.showMessageDialog(null, "PERDEU! Desparabens Zé!");
                 JOptionPane.showMessageDialog(null, "A palavra era: " + palavra);
                 resetar();
             }
         }
        }
    }

    else {
        JOptionPane.showMessageDialog(null, "Letra inadequada burro! \n Põe outra");
    }

    }//GEN-LAST:event_jButton1ActionPerformed
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
            java.util.logging.Logger.getLogger(JogoForca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JogoForca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JogoForca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JogoForca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JogoForca().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPalavra;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblChances;
    private javax.swing.JLabel lblDica;
    private javax.swing.JLabel lblErradas;
    private javax.swing.JLabel lblPalavra;
    // End of variables declaration//GEN-END:variables
}