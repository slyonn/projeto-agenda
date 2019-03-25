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
public class TelaAtualizarContato extends javax.swing.JFrame {

    /**
     * Creates new form TelaAtualizarContato
     */
    public TelaAtualizarContato() {
        initComponents();
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        setResizable(false);
        this.setTitle("Atualizar Contatos");
    }
    
    public Contato pesquisarContato(){
        if (nomeCheckBox.isSelected()) {
            String nome = pesquisarText.getText();
            Contato resultado = GerenciadorContato.pesquisarContatoNome(nome);
            if (resultado == null) {
                JOptionPane.showMessageDialog(null, "Nenhum contato salvo como " + nome + ".");
                pesquisarText.requestFocus();
                return null;
            } else {
                nomeText.setText(resultado.getNome());
                celularText.setText(resultado.getCelular());
                telefoneText.setText(resultado.getTelefone());
                enderecoText.setText(resultado.getEndereco());
                emailText.setText(resultado.getEmail());
                nomeText.requestFocus();
                return resultado;
            }
        }

        if (telefoneCheckBox.isSelected()) {
            String telefone = pesquisarText.getText();
            Contato resultado = GerenciadorContato.pesquisarContatoTelefone(telefone);
            if (resultado == null) {
                JOptionPane.showMessageDialog(null, "Nenhum contato salvo com este telefone.");
                pesquisarText.requestFocus();
                return null;
            } else {
                nomeText.setText(resultado.getNome());
                celularText.setText(resultado.getCelular());
                telefoneText.setText(resultado.getTelefone());
                enderecoText.setText(resultado.getEndereco());
                emailText.setText(resultado.getEmail());
                nomeText.requestFocus();
                return resultado;
            }
        }

        if (celularCheckBox.isSelected()) {
            String celular = pesquisarText.getText();
            Contato resultado = GerenciadorContato.pesquisarContatoCelular(celular);
            if (resultado == null) {
                JOptionPane.showMessageDialog(null, "Nenhum contato salvo com este celular.");
                pesquisarText.requestFocus();
                return null;
            } else {
                nomeText.setText(resultado.getNome());
                celularText.setText(resultado.getCelular());
                telefoneText.setText(resultado.getTelefone());
                enderecoText.setText(resultado.getEndereco());
                emailText.setText(resultado.getEmail());
                nomeText.requestFocus();
                return resultado;
            }
        }

        if (celularCheckBox.isSelected() == false & telefoneCheckBox.isSelected() == false & nomeCheckBox.isSelected() == false) {
            JOptionPane.showMessageDialog(null, "Selecione o tipo de pesquisa.");
            pesquisarText.requestFocus();
        }
        return null;
    }
    
    public void atualizarContato(){
        
        if (nomeCheckBox.isSelected()) {
            String nome = pesquisarText.getText();
            Contato resultado = GerenciadorContato.pesquisarContatoNome(nome);
            if (resultado == null) {
                JOptionPane.showMessageDialog(null, "Nenhum contato salvo como " + nome + ".");
                pesquisarText.requestFocus();
            } else {
                String nome1 = nomeText.getText();
                String celular1 = celularText.getText();
                String telefone = telefoneText.getText();
                String endereco = enderecoText.getText();
                String email = emailText.getText();
                
                resultado.setNome(nome1);
                resultado.setCelular(celular1);
                resultado.setTelefone(telefone);
                resultado.setEndereco(endereco);
                resultado.setEmail(email);

                JOptionPane.showMessageDialog(null, "Contato atualizado com sucesso.");

                nomeText.setText("");
                celularText.setText("");
                telefoneText.setText("");
                enderecoText.setText("");
                emailText.setText("");
                pesquisarText.requestFocus();
                
                BancoDeDados.salvarContatos(GerenciadorContato.listaContatos);
            }
        }

        if (telefoneCheckBox.isSelected()) {
            String telefone = pesquisarText.getText();
            Contato resultado = GerenciadorContato.pesquisarContatoTelefone(telefone);
            if (resultado == null) {
                JOptionPane.showMessageDialog(null, "Nenhum contato salvo com este telefone.");
                pesquisarText.requestFocus();

            } else {
                String nome = nomeText.getText();
                String celular1 = celularText.getText();
                String telefone1 = telefoneText.getText();
                String endereco = enderecoText.getText();
                String email = emailText.getText();
                
                resultado.setNome(nome);
                resultado.setCelular(celular1);
                resultado.setTelefone(telefone1);
                resultado.setEndereco(endereco);
                resultado.setEmail(email);

                JOptionPane.showMessageDialog(null, "Contato atualizado com sucesso.");

                nomeText.setText("");
                celularText.setText("");
                telefoneText.setText("");
                enderecoText.setText("");
                emailText.setText("");
                nomeText.requestFocus();
                
                BancoDeDados.salvarContatos(GerenciadorContato.listaContatos);
            }
        }

        if (celularCheckBox.isSelected()) {
            String celular = pesquisarText.getText();
            Contato resultado = GerenciadorContato.pesquisarContatoCelular(celular);
            if (resultado == null) {
                JOptionPane.showMessageDialog(null, "Nenhum contato salvo com este celular.");
                pesquisarText.requestFocus();
            } else {
                String nome = nomeText.getText();
                String celular1 = celularText.getText();
                String telefone = telefoneText.getText();
                String endereco = enderecoText.getText();
                String email = emailText.getText();
                
                resultado.setNome(nome);
                resultado.setCelular(celular1);
                resultado.setTelefone(telefone);
                resultado.setEndereco(endereco);
                resultado.setEmail(email);

                JOptionPane.showMessageDialog(null, "Contato atualizado com sucesso.");

                nomeText.setText("");
                celularText.setText("");
                telefoneText.setText("");
                enderecoText.setText("");
                emailText.setText("");
                nomeText.requestFocus();
                
                BancoDeDados.salvarContatos(GerenciadorContato.listaContatos);
            }
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
        jPanel5 = new javax.swing.JPanel();
        voltarButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        nomeCheckBox = new javax.swing.JCheckBox();
        telefoneCheckBox = new javax.swing.JCheckBox();
        celularCheckBox = new javax.swing.JCheckBox();
        pesquisarText = new javax.swing.JTextField();
        pesquisarButton = new javax.swing.JButton();
        celularText = new javax.swing.JTextField();
        TelefoneLabel = new javax.swing.JLabel();
        telefoneText = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        emailText = new javax.swing.JTextField();
        enderecoLabel = new javax.swing.JLabel();
        enderecoText = new javax.swing.JTextField();
        nomeLabel = new javax.swing.JLabel();
        nomeText = new javax.swing.JTextField();
        celularLabel = new javax.swing.JLabel();
        atualizarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(0, 51, 204));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\solanje\\Documents\\Sadrak\\ícones\\Sem título-15.png")); // NOI18N
        jLabel3.setText(" Atualizar Contatos");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(0, 51, 204));

        voltarButton1.setBackground(new java.awt.Color(0, 51, 204));
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

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(voltarButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(voltarButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setText("Pesquisar usando:");

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

        celularCheckBox.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        celularCheckBox.setText("Celular");
        celularCheckBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                celularCheckBoxMouseClicked(evt);
            }
        });

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

        pesquisarButton.setBackground(new java.awt.Color(51, 153, 255));
        pesquisarButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\solanje\\Documents\\Sadrak\\ícones\\icone-2.png")); // NOI18N
        pesquisarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pesquisarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarButtonActionPerformed(evt);
            }
        });
        pesquisarButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pesquisarButtonKeyPressed(evt);
            }
        });

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

        atualizarButton.setBackground(new java.awt.Color(255, 153, 0));
        atualizarButton.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        atualizarButton.setForeground(new java.awt.Color(255, 255, 255));
        atualizarButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\solanje\\Documents\\Sadrak\\ícones\\Sem título-16.png")); // NOI18N
        atualizarButton.setText("Atualizar");
        atualizarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarButtonActionPerformed(evt);
            }
        });
        atualizarButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                atualizarButtonKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(celularText, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(celularLabel))
                        .addGap(18, 18, 18)
                        .addComponent(TelefoneLabel))
                    .addComponent(enderecoLabel)
                    .addComponent(emailLabel)
                    .addComponent(nomeLabel)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(nomeCheckBox)
                        .addGap(18, 18, 18)
                        .addComponent(telefoneCheckBox)
                        .addGap(18, 18, 18)
                        .addComponent(celularCheckBox))
                    .addComponent(jLabel1)
                    .addComponent(emailText)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(telefoneText, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(nomeText, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(pesquisarText, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pesquisarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(enderecoText)
                    .addComponent(atualizarButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeCheckBox)
                    .addComponent(telefoneCheckBox)
                    .addComponent(celularCheckBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pesquisarText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pesquisarButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
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
                .addGap(18, 18, 18)
                .addComponent(enderecoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enderecoText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(atualizarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void voltarButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_voltarButton1ActionPerformed

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
            pesquisarButton.requestFocus();
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

    private void pesquisarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarButtonActionPerformed
        pesquisarContato();
    }//GEN-LAST:event_pesquisarButtonActionPerformed

    private void pesquisarButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pesquisarButtonKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            pesquisarContato();
        }
    }//GEN-LAST:event_pesquisarButtonKeyPressed

    private void celularTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_celularTextKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            telefoneText.requestFocus();
        }
    }//GEN-LAST:event_celularTextKeyPressed

    private void celularTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_celularTextKeyTyped
        String caracteres = "0987654321";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_celularTextKeyTyped

    private void telefoneTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefoneTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefoneTextActionPerformed

    private void telefoneTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefoneTextKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            emailText.requestFocus();
        }
    }//GEN-LAST:event_telefoneTextKeyPressed

    private void telefoneTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefoneTextKeyTyped
        String caracteres = "0987654321";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_telefoneTextKeyTyped

    private void emailTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailTextKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            enderecoText.requestFocus();
        }
    }//GEN-LAST:event_emailTextKeyPressed

    private void enderecoTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_enderecoTextKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            atualizarButton.requestFocus();
        }
    }//GEN-LAST:event_enderecoTextKeyPressed

    private void nomeTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeTextActionPerformed

    private void nomeTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomeTextKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            celularText.requestFocus();
        }
    }//GEN-LAST:event_nomeTextKeyPressed

    private void atualizarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarButtonActionPerformed
        atualizarContato();
    }//GEN-LAST:event_atualizarButtonActionPerformed

    private void atualizarButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_atualizarButtonKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            atualizarContato();
        }
    }//GEN-LAST:event_atualizarButtonKeyPressed

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
                if ("".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaAtualizarContato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAtualizarContato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAtualizarContato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAtualizarContato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAtualizarContato().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TelefoneLabel;
    private javax.swing.JButton atualizarButton;
    private javax.swing.JCheckBox celularCheckBox;
    private javax.swing.JLabel celularLabel;
    private javax.swing.JTextField celularText;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailText;
    private javax.swing.JLabel enderecoLabel;
    private javax.swing.JTextField enderecoText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JCheckBox nomeCheckBox;
    private javax.swing.JLabel nomeLabel;
    private javax.swing.JTextField nomeText;
    private javax.swing.JButton pesquisarButton;
    private javax.swing.JTextField pesquisarText;
    private javax.swing.JCheckBox telefoneCheckBox;
    private javax.swing.JTextField telefoneText;
    private javax.swing.JButton voltarButton1;
    // End of variables declaration//GEN-END:variables

}
