/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Controler.Controler;
import Model.Assinante;
import javax.swing.JOptionPane;

/**
 *
 * Classe view responsável por procurar e nviar a mensagem do assiannte
 */
public class EnviarMensagem extends javax.swing.JFrame {

    /**
     * Creates new form EnviarMensagem
     */
    
    InserirAssinante inserirAss;
    Controler controler;
    
    
    public EnviarMensagem(InserirAssinante instanciaIns, Controler instanciaCon) {// ao ser instanciada recebe a instancia de InserirAssinante e de controler
        initComponents();
        this.inserirAss = instanciaIns;
        this.controler = instanciaCon;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        idPesquisar = new javax.swing.JTextField();
        procurar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaMensagem = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        enviar = new javax.swing.JButton();
        EnviarMensagem = new javax.swing.JButton();
        Rancking = new javax.swing.JButton();
        NovoAssinante = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(421, 455));

        jLabel1.setText("Digite o ID do assinante que enviará a mensagem:");

        procurar.setText("Procurar");
        procurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                procurarActionPerformed(evt);
            }
        });

        areaMensagem.setColumns(20);
        areaMensagem.setRows(5);
        jScrollPane1.setViewportView(areaMensagem);

        jLabel2.setText("Digite aqui sua mensagem:");

        enviar.setText("Enviar");
        enviar.setEnabled(false);
        enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarActionPerformed(evt);
            }
        });

        EnviarMensagem.setForeground(new java.awt.Color(0, 102, 255));
        EnviarMensagem.setText("Enviar Mensagem");
        EnviarMensagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnviarMensagemActionPerformed(evt);
            }
        });

        Rancking.setForeground(new java.awt.Color(0, 153, 255));
        Rancking.setText("Rancking");
        Rancking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RanckingActionPerformed(evt);
            }
        });

        NovoAssinante.setForeground(new java.awt.Color(0, 153, 255));
        NovoAssinante.setText("Novo Assinante");
        NovoAssinante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NovoAssinanteActionPerformed(evt);
            }
        });

        jLabel3.setText("Enviar Mensagem");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(enviar)
                        .addGap(261, 261, 261))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(idPesquisar, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(procurar))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(EnviarMensagem)
                .addGap(18, 18, 18)
                .addComponent(Rancking, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(NovoAssinante, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EnviarMensagem)
                    .addComponent(Rancking)
                    .addComponent(NovoAssinante))
                .addGap(34, 34, 34)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(procurar))
                .addGap(36, 36, 36)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(enviar)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EnviarMensagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnviarMensagemActionPerformed

    }//GEN-LAST:event_EnviarMensagemActionPerformed

    private void RanckingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RanckingActionPerformed
        JOptionPane.showMessageDialog(null,controler.ranckingAssinantes());// Botão de rancking chama 'ranckingAssinantes' da classe controler e 
                                                                           // exibe em tel o seu retorno
    }//GEN-LAST:event_RanckingActionPerformed

    private void NovoAssinanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NovoAssinanteActionPerformed
        this.setVisible(false);// torna a view InserirAssinantes visivel
        inserirAss.setVisible(true);// torna a tela atual invisível
    }//GEN-LAST:event_NovoAssinanteActionPerformed

    private void procurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_procurarActionPerformed
        
        boolean check;
        String nome;
        int limite = controler.getLimiteCarac(Integer.parseInt(idPesquisar.getText()));// obtém o limite de caractéres do assinante
        
        try{
            
            check = controler.encontraAssinante(Integer.parseInt(idPesquisar.getText())); // verifica a exisência do assiannte
            
            if(check){
                nome = controler.encontraNome(Integer.parseInt(idPesquisar.getText())); 
                JOptionPane.showMessageDialog(null, "Assinante " + nome + " encontrado com sucesso! Limite de caracteres: " + limite);
                //exibe o nome e o limite de caracteres do assinante em tela
                enviar.setEnabled(true);
            }else{
                 JOptionPane.showMessageDialog(null, "ERRO: numero de RG não encontrado"); 
            }
        
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "ERRO: numero de RG não encontrado");
        }
        
    }//GEN-LAST:event_procurarActionPerformed

    private void enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarActionPerformed
        int limite = controler.getLimiteCarac(Integer.parseInt(idPesquisar.getText())); // recebe o limite de caracteres do assinante selecionado
        
        if(areaMensagem.getText().length() > limite){ // se a mensagem digitada for maior que o limite de caracteres do assiante exibe uma mensagem em tela e não envia mensagem
            JOptionPane.showMessageDialog(null, "Limite de caracteres excedido.\n O usuário só pode digitar: " +limite+ 
                                          "\nVocê digitou: " + areaMensagem.getText().length());
        }else{    
            // se não exceder o limite de caracteres envia mensagem e exibe mensagem de confirmação
            try{
                controler.enviarMensagem(Integer.parseInt(idPesquisar.getText()), areaMensagem.getText());
                JOptionPane.showMessageDialog(null, "Mensagem enviada com sucesso ");
                enviar.setEnabled(false);

            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "ERRO: Assinante não selecionado");
            }
        }
    }//GEN-LAST:event_enviarActionPerformed

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
            java.util.logging.Logger.getLogger(EnviarMensagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EnviarMensagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EnviarMensagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EnviarMensagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
    private javax.swing.JTextArea areaMensagem;
    private javax.swing.JButton enviar;
    private javax.swing.JTextField idPesquisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton procurar;
    // End of variables declaration//GEN-END:variables
}