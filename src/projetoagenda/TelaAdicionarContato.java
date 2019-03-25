/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoagenda;

import javax.swing.JOptionPane;

/**
 *
 * @author solanje
 */
public class TelaAdicionarContato extends javax.swing.JFrame {

    /**
     * Creates new form TelaAdicionarContato
     */
    public TelaAdicionarContato() {
        initComponents();
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        setResizable(false);
        nomeText.requestFocus();
        this.setTitle("Adicionar contatos");
    }

    public void salvarContato() {

        String nome = nomeText.getText();
        String celular = celularText.getText();
        String telefone = telefoneText.getText();
        String email = emailText.getText();
        String endereco = enderecoText.getText();

        if (nome.equals("")) {
            JOptionPane.showMessageDialog(null, "Adicione um nome ao contato.");
            nomeText.requestFocus();
        } else {
            Contato contato = new Contato(nome, celular, telefone, endereco, email);
            boolean add = GerenciadorContato.listaContatos.add(contato);
            if (add) {
                JOptionPane.showMessageDialog(null, "Contato salvo com sucesso!");
            }

            nomeText.setText("");
            celularText.setText("");
            telefoneText.setText("");
            emailText.setText("");
            enderecoText.setText("");

            nomeText.requestFocus();
            
            BancoDeDados.salvarContatos(GerenciadorContato.listaContatos);
        }
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
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nomeLabel = new javax.swing.JLabel();
        nomeText = new javax.swing.JTextField();
        celularLabel = new javax.swing.JLabel();
        celularText = new javax.swing.JTextField();
        TelefoneLabel = new javax.swing.JLabel();
        telefoneText = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        emailText = new javax.swing.JTextField();
        enderecoLabel = new javax.swing.JLabel();
        enderecoText = new javax.swing.JTextField();
        salvarButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        voltarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(503, 682));

        jPanel2.setBackground(new java.awt.Color(255, 153, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\solanje\\Documents\\Sadrak\\ícones\\Sem título-4.1.png")); // NOI18N
        jLabel1.setText(" Adicionar Contato");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        nomeLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nomeLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\solanje\\Documents\\Sadrak\\ícones\\Sem título-6.png")); // NOI18N
        nomeLabel.setText("Nome");

        nomeText.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        nomeText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeTextActionPerformed(evt);
            }
        });
        nomeText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nomeTextKeyPressed(evt);
            }
        });

        celularLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        celularLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\solanje\\Documents\\Sadrak\\ícones\\Sem título-8.png")); // NOI18N
        celularLabel.setText("Celular");

        celularText.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        celularText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                celularTextKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                celularTextKeyTyped(evt);
            }
        });

        TelefoneLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TelefoneLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\solanje\\Documents\\Sadrak\\ícones\\Sem título-7.png")); // NOI18N
        TelefoneLabel.setText("Telefone");

        telefoneText.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        telefoneText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefoneTextActionPerformed(evt);
            }
        });
        telefoneText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                telefoneTextKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telefoneTextKeyTyped(evt);
            }
        });

        emailLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        emailLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\solanje\\Documents\\Sadrak\\ícones\\Sem título-9.png")); // NOI18N
        emailLabel.setText("E-mail");

        emailText.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        emailText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                emailTextKeyPressed(evt);
            }
        });

        enderecoLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        enderecoLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\solanje\\Documents\\Sadrak\\ícones\\Sem título-10.png")); // NOI18N
        enderecoLabel.setText("Endereço");

        enderecoText.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        enderecoText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                enderecoTextKeyPressed(evt);
            }
        });

        salvarButton.setBackground(new java.awt.Color(0, 204, 102));
        salvarButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        salvarButton.setForeground(new java.awt.Color(255, 255, 255));
        salvarButton.setText("Salvar");
        salvarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salvarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarButtonActionPerformed(evt);
            }
        });
        salvarButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                salvarButtonKeyPressed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 153, 0));

        voltarButton.setBackground(new java.awt.Color(255, 153, 0));
        voltarButton.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        voltarButton.setForeground(new java.awt.Color(255, 255, 255));
        voltarButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\solanje\\Documents\\Sadrak\\ícones\\Sem título-11.png")); // NOI18N
        voltarButton.setText("Voltar");
        voltarButton.setContentAreaFilled(false);
        voltarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        voltarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(voltarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(voltarButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(celularText, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(celularLabel))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TelefoneLabel)
                            .addComponent(telefoneText)))
                    .addComponent(enderecoText, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enderecoLabel)
                    .addComponent(emailText, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailLabel)
                    .addComponent(salvarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeText, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeLabel))
                .addContainerGap(21, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(nomeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(celularLabel)
                    .addComponent(TelefoneLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(celularText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefoneText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(emailLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(enderecoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enderecoText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(salvarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nomeTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeTextActionPerformed

    private void salvarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarButtonActionPerformed
        salvarContato();
    }//GEN-LAST:event_salvarButtonActionPerformed

    private void voltarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_voltarButtonActionPerformed

    private void celularTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_celularTextKeyTyped
        String caracteres = "0987654321";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_celularTextKeyTyped

    private void telefoneTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefoneTextKeyTyped
        String caracteres = "0987654321";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_telefoneTextKeyTyped

    private void telefoneTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefoneTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefoneTextActionPerformed

    private void nomeTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomeTextKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            celularText.requestFocus();
        }
    }//GEN-LAST:event_nomeTextKeyPressed

    private void celularTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_celularTextKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            telefoneText.requestFocus();
        }
    }//GEN-LAST:event_celularTextKeyPressed

    private void telefoneTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefoneTextKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            emailText.requestFocus();
        }
    }//GEN-LAST:event_telefoneTextKeyPressed

    private void emailTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailTextKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            enderecoText.requestFocus();
        }
    }//GEN-LAST:event_emailTextKeyPressed

    private void enderecoTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_enderecoTextKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            salvarButton.requestFocus();
        }
    }//GEN-LAST:event_enderecoTextKeyPressed

    private void salvarButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_salvarButtonKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            salvarContato();
        }
    }//GEN-LAST:event_salvarButtonKeyPressed

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
                if (" ".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaAdicionarContato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAdicionarContato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAdicionarContato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAdicionarContato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAdicionarContato().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TelefoneLabel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel celularLabel;
    private javax.swing.JTextField celularText;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailText;
    private javax.swing.JLabel enderecoLabel;
    private javax.swing.JTextField enderecoText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel nomeLabel;
    private javax.swing.JTextField nomeText;
    private javax.swing.JButton salvarButton;
    private javax.swing.JTextField telefoneText;
    private javax.swing.JButton voltarButton;
    // End of variables declaration//GEN-END:variables
}