/*Grupo: Daniel Aguila, Sandro Caio, Marcos Mol, Pedro Ely e Gabrielle Liberato*/
package Views;

import Controler.Controler;
import java.awt.event.WindowEvent;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.event.WindowListener;

/**
 *
 * Essa classe é a view para inserir assinantes
 */
public class InserirAssinante extends javax.swing.JFrame{

    
    Controler controler; 
    EnviarMensagem enviarMsg;

    
    public InserirAssinante(Controler controler) throws ParseException {
        initComponents();
        this.controler = controler; // recebe a instancia da classe controler
        enviarMsg = new EnviarMensagem(this, controler); // ao ser instanciada a classe instancia a view EnviarMensagem
        
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        inserir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        vip = new javax.swing.JRadioButton();
        premium = new javax.swing.JRadioButton();
        free = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Rancking = new javax.swing.JButton();
        idRG = new javax.swing.JFormattedTextField();
        EnviarMensagem = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        NovoAssinante = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        inserir.setText("Inserir");
        inserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inserirActionPerformed(evt);
            }
        });

        jLabel4.setText("Digite os numeros do seu RG:(8 digitos)");

        buttonGroup1.add(vip);
        vip.setText("VIP");

        buttonGroup1.add(premium);
        premium.setText("Premium");
        premium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                premiumActionPerformed(evt);
            }
        });

        buttonGroup1.add(free);
        free.setText("Free");

        jLabel3.setText("Tipo de Assinante");

        jLabel2.setText("Nome:");

        Rancking.setForeground(new java.awt.Color(0, 153, 255));
        Rancking.setText("Rancking");
        Rancking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RanckingActionPerformed(evt);
            }
        });

        try {
            idRG.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        EnviarMensagem.setForeground(new java.awt.Color(0, 102, 255));
        EnviarMensagem.setText("Enviar Mensagem");
        EnviarMensagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnviarMensagemActionPerformed(evt);
            }
        });

        jLabel1.setText("Inserir Novo Assinante");

        NovoAssinante.setForeground(new java.awt.Color(0, 153, 255));
        NovoAssinante.setText("Novo Assinante");
        NovoAssinante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NovoAssinanteActionPerformed(evt);
            }
        });

        jLabel5.setText("Obs.: O numero de RG servirá como ID do assinante.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(EnviarMensagem)
                        .addGap(18, 18, 18)
                        .addComponent(Rancking, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(NovoAssinante, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(vip)
                            .addComponent(premium)
                            .addComponent(free)
                            .addComponent(inserir)
                            .addComponent(idRG, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jLabel1))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EnviarMensagem)
                    .addComponent(Rancking)
                    .addComponent(NovoAssinante))
                .addGap(55, 55, 55)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(free)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(premium)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(vip)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(idRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(inserir)
                .addGap(27, 27, 27)
                .addComponent(jLabel5)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inserirActionPerformed
        
        String tipo = null;
        boolean check = false;
        
        if(nome.getText().isEmpty()){// se o campo nome estiver vazio Eero é emitido na tela
            JOptionPane.showMessageDialog(null, "ERRO: Campo 'nome' vazio.");
        }else{
            
            try{
                if(free.isSelected()) tipo = "Free";
                else if(premium.isSelected()) tipo = "Premium";
                else if(vip.isSelected()) tipo = "VIP";
                
                try {
                   check = controler.inserirAssinante(Integer.parseInt(idRG.getText()), nome.getText(), tipo);
                   
                   if(check)JOptionPane.showMessageDialog(null, "Assinante inserido com sucesso!");// Se o assinante ~for criado uma mensagem de sucesso é exibida em tela
                   else if(!check) JOptionPane.showMessageDialog(null, "Não foi possível inserir novo assinante. Assinante já existente.");
                   
                } catch (Exception ex) {
                   JOptionPane.showMessageDialog(null, "ERRO: numero de RG inválido");
                }   
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "ERRO: Tipo de assinante não selecionado.");
            }
            
        
        }
        
    }//GEN-LAST:event_inserirActionPerformed

    private void premiumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_premiumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_premiumActionPerformed

    private void RanckingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RanckingActionPerformed
        JOptionPane.showMessageDialog(null,controler.ranckingAssinantes()); // Botão de rancking chama 'ranckingAssinantes' da classe controler e 
                                                                            // exibe em tel o seu retorno
    }//GEN-LAST:event_RanckingActionPerformed

    private void EnviarMensagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnviarMensagemActionPerformed
        enviarMsg.setVisible(true);//torna visível a tela enviarMensagem
        this.setVisible(false);// torna invisível a tela atual
    }//GEN-LAST:event_EnviarMensagemActionPerformed

    private void NovoAssinanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NovoAssinanteActionPerformed
 
    }//GEN-LAST:event_NovoAssinanteActionPerformed

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
            java.util.logging.Logger.getLogger(InserirAssinante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InserirAssinante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InserirAssinante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InserirAssinante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                 
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EnviarMensagem;
    private javax.swing.JButton NovoAssinante;
    private javax.swing.JButton Rancking;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton free;
    private javax.swing.JFormattedTextField idRG;
    private javax.swing.JButton inserir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField nome;
    private javax.swing.JRadioButton premium;
    private javax.swing.JRadioButton vip;
    // End of variables declaration//GEN-END:variables

    
    
}