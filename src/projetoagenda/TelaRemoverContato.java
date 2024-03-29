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
public class TelaRemoverContato extends javax.swing.JFrame {

    /**
     * Creates new form TelaRemoverContato
     */
    public TelaRemoverContato() {
        initComponents();
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        setResizable(false);
        pesquisarText.requestFocus();
        this.setTitle("Remover Contatos");
    }

    public void removerContato() {

        if (pesquisarText.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Informe o nome, número do celular ou telefone.");
        } else {
            if (nomeCheckBox.isSelected()) {
                String nome = pesquisarText.getText();
                Contato resultado = GerenciadorContato.pesquisarContatoNome(nome);
                if (resultado == null) {
                    JOptionPane.showMessageDialog(null, "Nenhum contato cadastrado como " + nome + ".");
                    pesquisarText.requestFocus();
                } else {
                    GerenciadorContato.listaContatosExcluidos.add(resultado);
                    GerenciadorContato.listaParametro.add(resultado);
                    GerenciadorContato.listaContatos.remove(resultado);
                    JOptionPane.showMessageDialog(null, "Contato removido para a lixeira.");
                    pesquisarText.requestFocus();
                }
            }

            if (telefoneCheckBox.isSelected()) {
                String telefone = pesquisarText.getText();
                Contato resultado = GerenciadorContato.pesquisarContatoTelefone(telefone);
                if (resultado == null) {
                    JOptionPane.showMessageDialog(null, "Nenhum contato cadastrado com este telefone.");
                    pesquisarText.requestFocus();
                } else {
                    GerenciadorContato.listaContatosExcluidos.add(resultado);
                    GerenciadorContato.listaParametro.add(resultado);
                    GerenciadorContato.listaContatos.remove(resultado);
                    JOptionPane.showMessageDialog(null, "Contato removido para a lixeira.");
                    pesquisarText.requestFocus();
                }
            }

            if (celularCheckBox.isSelected()) {
                String celular = pesquisarText.getText();
                Contato resultado = GerenciadorContato.pesquisarContatoCelular(celular);
                if (resultado == null) {
                    JOptionPane.showMessageDialog(null, "Nenhum contato cadastrado com este celular.");
                    pesquisarText.requestFocus();
                } else {
                    GerenciadorContato.listaContatosExcluidos.add(resultado);
                    GerenciadorContato.listaParametro.add(resultado);
                    GerenciadorContato.listaContatos.remove(resultado);
                    JOptionPane.showMessageDialog(null, "Contato removido para a lixeira.");
                    pesquisarText.requestFocus();
                }
            }

            if (celularCheckBox.isSelected() == false & telefoneCheckBox.isSelected() == false & nomeCheckBox.isSelected() == false) {
                JOptionPane.showMessageDialog(null, "Selecione o tipo de pesquisa.");
            }
            
            BancoDeDados.salvarContatosExcluidos(GerenciadorContato.listaContatosExcluidos);
            BancoDeDados.salvarContatos(GerenciadorContato.listaContatos);
            BancoDeDados.salvarContatosParametro(GerenciadorContato.listaParametro);
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

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        celularCheckBox = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        pesquisarText = new javax.swing.JTextField();
        nomeCheckBox = new javax.swing.JCheckBox();
        telefoneCheckBox = new javax.swing.JCheckBox();
        removerButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        voltarButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(255, 51, 51));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\solanje\\Documents\\Sadrak\\ícones\\icone-3.png")); // NOI18N
        jLabel3.setText(" Remover Contatos");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel3)
                .addContainerGap(116, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        celularCheckBox.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        celularCheckBox.setText("Celular");
        celularCheckBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                celularCheckBoxMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setText("Remover contato usando:");

        pesquisarText.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        pesquisarText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarTextActionPerformed(evt);
            }
        });
        pesquisarText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pesquisarTextKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pesquisarTextKeyTyped(evt);
            }
        });

        nomeCheckBox.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        nomeCheckBox.setText("Nome");
        nomeCheckBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nomeCheckBoxMouseClicked(evt);
            }
        });

        telefoneCheckBox.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        telefoneCheckBox.setText("Telefone");
        telefoneCheckBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                telefoneCheckBoxMouseClicked(evt);
            }
        });

        removerButton.setBackground(new java.awt.Color(255, 153, 0));
        removerButton.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        removerButton.setForeground(new java.awt.Color(255, 255, 255));
        removerButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\solanje\\Documents\\Sadrak\\ícones\\icone-4.png")); // NOI18N
        removerButton.setText("Remover");
        removerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerButtonActionPerformed(evt);
            }
        });
        removerButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                removerButtonKeyPressed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 51, 51));

        voltarButton1.setBackground(new java.awt.Color(255, 51, 51));
        voltarButton1.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        voltarButton1.setForeground(new java.awt.Color(255, 255, 255));
        voltarButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\solanje\\Documents\\Sadrak\\ícones\\Sem título-11.png")); // NOI18N
        voltarButton1.setText("Voltar");
        voltarButton1.setContentAreaFilled(false);
        voltarButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        voltarButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(voltarButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(voltarButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(removerButton, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(nomeCheckBox)
                        .addGap(18, 18, 18)
                        .addComponent(telefoneCheckBox)
                        .addGap(18, 18, 18)
                        .addComponent(celularCheckBox))
                    .addComponent(jLabel1)
                    .addComponent(pesquisarText))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeCheckBox)
                    .addComponent(telefoneCheckBox)
                    .addComponent(celularCheckBox))
                .addGap(18, 18, 18)
                .addComponent(pesquisarText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(removerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void celularCheckBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_celularCheckBoxMouseClicked
        if (celularCheckBox.isSelected()) {
            nomeCheckBox.setEnabled(false);
            telefoneCheckBox.setEnabled(false);
        } else {
            nomeCheckBox.setEnabled(true);
            telefoneCheckBox.setEnabled(true);
        }
    }//GEN-LAST:event_celularCheckBoxMouseClicked

    private void pesquisarTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pesquisarTextActionPerformed

    private void pesquisarTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pesquisarTextKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            removerButton.requestFocus();
        }
    }//GEN-LAST:event_pesquisarTextKeyPressed

    private void pesquisarTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pesquisarTextKeyTyped
        if (celularCheckBox.isSelected() | telefoneCheckBox.isSelected()) {
            String caracteres = "0987654321";
            if (!caracteres.contains(evt.getKeyChar() + "")) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_pesquisarTextKeyTyped

    private void nomeCheckBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nomeCheckBoxMouseClicked
        if (nomeCheckBox.isSelected()) {
            telefoneCheckBox.setEnabled(false);
            celularCheckBox.setEnabled(false);
        } else {
            telefoneCheckBox.setEnabled(true);
            celularCheckBox.setEnabled(true);
        }
    }//GEN-LAST:event_nomeCheckBoxMouseClicked

    private void telefoneCheckBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_telefoneCheckBoxMouseClicked
        if (telefoneCheckBox.isSelected()) {
            nomeCheckBox.setEnabled(false);
            celularCheckBox.setEnabled(false);
        } else {
            nomeCheckBox.setEnabled(true);
            celularCheckBox.setEnabled(true);
        }
    }//GEN-LAST:event_telefoneCheckBoxMouseClicked

    private void removerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerButtonActionPerformed
        removerContato();
    }//GEN-LAST:event_removerButtonActionPerformed

    private void voltarButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_voltarButton1ActionPerformed

    private void removerButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_removerButtonKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            removerContato();
        }
    }//GEN-LAST:event_removerButtonKeyPressed

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
            java.util.logging.Logger.getLogger(TelaRemoverContato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaRemoverContato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaRemoverContato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaRemoverContato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaRemoverContato().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox celularCheckBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JCheckBox nomeCheckBox;
    private javax.swing.JTextField pesquisarText;
    private javax.swing.JButton removerButton;
    private javax.swing.JCheckBox telefoneCheckBox;
    private javax.swing.JButton voltarButton1;
    // End of variables declaration//GEN-END:variables
}
