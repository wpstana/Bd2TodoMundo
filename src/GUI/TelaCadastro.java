/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DAO.UsuarioDAO;
import Entity.Usuario;
import javax.swing.JOptionPane;

/**
 *
 * @author ludsc
 */
public class TelaCadastro extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastro
     */
    public TelaCadastro() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nome = new javax.swing.JTextField();
        datanasc = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        tel = new javax.swing.JTextField();
        login = new javax.swing.JTextField();
        senha = new javax.swing.JPasswordField();
        confimacao = new javax.swing.JPasswordField();
        voltar = new javax.swing.JButton();
        cadastrar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nome.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeActionPerformed(evt);
            }
        });
        getContentPane().add(nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 260, 20));

        datanasc.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        datanasc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datanascActionPerformed(evt);
            }
        });
        getContentPane().add(datanasc, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 180, 20));

        email.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 280, -1));

        tel.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        getContentPane().add(tel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 260, 20));

        login.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        getContentPane().add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 270, -1));

        senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaActionPerformed(evt);
            }
        });
        getContentPane().add(senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 80, -1));

        confimacao.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                confimacaoFocusLost(evt);
            }
        });
        confimacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confimacaoActionPerformed(evt);
            }
        });
        getContentPane().add(confimacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, 90, -1));

        voltar.setText("<| Voltar");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });
        getContentPane().add(voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        cadastrar.setText("Cadastrar!");
        cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(cadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 320, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Login");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, -1, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Telefone");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("confirmar senha");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("nome");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, -1, -1));
        jLabel2.getAccessibleContext().setAccessibleParent(jLabel2);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Data de Nascimento");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("E-mail");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("senha");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/claquete-porta-retratos-ima-ima.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 377));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void senhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_senhaActionPerformed

    private void cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarActionPerformed
        // TODO add your handling code here:
            if(!senha.getText().equals(confimacao.getText())){
                cadastrar.requestFocus();
                JOptionPane.showMessageDialog(null, "Senha inválida");
                confimacao.setText(""); 
                senha.setText("");
            } else {
                UsuarioDAO cliente = new UsuarioDAO(); 
                Usuario usuario =  cliente.consultaNome(nome.getText()); 
                if(usuario == null){
                    usuario = new Usuario(); 
                    usuario.setDataNascimento(datanasc.getText());
                    usuario.setEmail(email.getText());
                    usuario.setNome(nome.getText());
                    usuario.setNomeUsuario(login.getText());
                    usuario.setTelefone(tel.getText());
                    usuario.setSenha(senha.getText()); 
                    cliente.inserirUsuario(usuario);
                    JOptionPane.showMessageDialog(null, "Cadastrado!"); 
                    confimacao.setText(""); 
                    senha.setText("");
                    tel.setText(""); 
                    login.setText("");
                    nome.setText("");
                    email.setText(""); 
                    datanasc.setText("");
                }else {
                    JOptionPane.showMessageDialog(null, "Usuário Já Cadastrado");
                }
            }
            
    }//GEN-LAST:event_cadastrarActionPerformed

    private void datanascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datanascActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_datanascActionPerformed

    private void confimacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confimacaoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_confimacaoActionPerformed

    private void confimacaoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_confimacaoFocusLost
        // TODO add your handling code here:
     
    }//GEN-LAST:event_confimacaoFocusLost

    private void nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeActionPerformed

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        // TODO add your handling code here:
        TelaInicial inicio = new TelaInicial(); 
        inicio.setVisible(true); 
        dispose();
    }//GEN-LAST:event_voltarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrar;
    private javax.swing.JPasswordField confimacao;
    private javax.swing.JTextField datanasc;
    private javax.swing.JTextField email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField login;
    private javax.swing.JTextField nome;
    private javax.swing.JPasswordField senha;
    private javax.swing.JTextField tel;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}
