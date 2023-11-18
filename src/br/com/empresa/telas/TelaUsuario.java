/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.empresa.telas;

import java.sql.*;
import br.com.empresa.dal.ModuloDeConexao;
import javax.swing.JOptionPane;

/**
 *
 * @author josej
 */
public class TelaUsuario extends javax.swing.JInternalFrame {

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public TelaUsuario() {
        initComponents();
        conexao = ModuloDeConexao.conector();
    }

    //metodo para consultar usuarios
    private void consultar() {
        String sql = "select * from tbusuarios where IDduser=?";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txt_id_usu.getText());
            rs = pst.executeQuery();
            if (rs.next()) {
                txt_usu_fone.setText(rs.getString(3));
                txt_nome_usu.setText(rs.getString(2));
                txt_senha_usu.setText(rs.getString(5));
                txt_login_usu.setText(rs.getString(4));
                cbo_perfil_usu.setSelectedItem(rs.getString(6));

            } else {
                JOptionPane.showMessageDialog(null, "Usuário não cadastrado");
                //limpa os campos
                txt_usu_fone.setText(null);
                txt_nome_usu.setText(null);
                txt_senha_usu.setText(null);
                txt_login_usu.setText(null);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    //metodo para adicionar usuarios
    private void adicionar() {
        String sql = "insert into tbusuarios(IDduser,usuario,telefone,login,senha,perfil) values(?,?,?,?,?,?)";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txt_id_usu.getText());
            pst.setString(2, txt_nome_usu.getText());
            pst.setString(3, txt_usu_fone.getText());
            pst.setString(4, txt_login_usu.getText());
            pst.setString(5, txt_senha_usu.getText());
            pst.setString(6, cbo_perfil_usu.getSelectedItem().toString());
            if (txt_id_usu.getText().isEmpty() || (txt_nome_usu.getText().isEmpty()) || (txt_login_usu.getText().isEmpty()) || (txt_senha_usu.getText().isEmpty())) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios");
            } else {

                //atualiza/isnerir os dados na tabela
                int adicionado = pst.executeUpdate();
                //System.out.println(adicionado);
                if (adicionado > 0) {
                    JOptionPane.showMessageDialog(null, "Usuário adicionado com sucesso");
                    //limpa os campos
                    txt_id_usu.setText(null);
                    txt_usu_fone.setText(null);
                    txt_nome_usu.setText(null);
                    txt_senha_usu.setText(null);
                    txt_login_usu.setText(null);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    //metodo para altera usuarios
    private void alterar() {
        String sql = "update tbusuarios set usuario=?,telefone=?,login=?,senha=?,perfil=? where IDDuser=?";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txt_nome_usu.getText());
            pst.setString(2, txt_usu_fone.getText());
            pst.setString(3, txt_login_usu.getText());
            pst.setString(4, txt_senha_usu.getText());
            pst.setString(5, cbo_perfil_usu.getSelectedItem().toString());
            pst.setString(6, txt_id_usu.getText());
            //confirma se os dados obrigatorios estão inseridos
            if (txt_id_usu.getText().isEmpty() || (txt_nome_usu.getText().isEmpty()) || (txt_login_usu.getText().isEmpty()) || (txt_senha_usu.getText().isEmpty())) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios");
            } else {
                //atualiza/isnerir os dados na tabela
                int adicionado = pst.executeUpdate();
                //System.out.println(adicionado);
                if (adicionado > 0) {
                    JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!");
                    //limpa os campos
                    txt_id_usu.setText(null);
                    txt_usu_fone.setText(null);
                    txt_nome_usu.setText(null);
                    txt_senha_usu.setText(null);
                    txt_login_usu.setText(null);
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cbo_perfil_usu = new javax.swing.JComboBox<>();
        txt_id_usu = new javax.swing.JTextField();
        txt_nome_usu = new javax.swing.JTextField();
        txt_login_usu = new javax.swing.JTextField();
        txt_senha_usu = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_usu_fone = new javax.swing.JTextField();
        bt_editar = new javax.swing.JButton();
        bt_pesquisar = new javax.swing.JButton();
        bt_remover = new javax.swing.JButton();
        bt_add = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Usuários");
        setPreferredSize(new java.awt.Dimension(544, 429));

        jLabel1.setText("ID");

        jLabel2.setText("*Nome");

        jLabel4.setText("*Login");

        jLabel5.setText("*Senha");

        jLabel6.setText("*Perfil");

        cbo_perfil_usu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Usuário" }));
        cbo_perfil_usu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_perfil_usuActionPerformed(evt);
            }
        });

        txt_senha_usu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_senha_usuActionPerformed(evt);
            }
        });

        jLabel7.setText("Fone");

        txt_usu_fone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usu_foneActionPerformed(evt);
            }
        });

        bt_editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/empresa/icones/user_edit.png"))); // NOI18N
        bt_editar.setToolTipText("Editar");
        bt_editar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_editar.setPreferredSize(new java.awt.Dimension(60, 60));
        bt_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_editarActionPerformed(evt);
            }
        });

        bt_pesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/empresa/icones/user_info.png"))); // NOI18N
        bt_pesquisar.setToolTipText("Pesquisar");
        bt_pesquisar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_pesquisar.setPreferredSize(new java.awt.Dimension(60, 60));
        bt_pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_pesquisarActionPerformed(evt);
            }
        });

        bt_remover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/empresa/icones/user_remove.png"))); // NOI18N
        bt_remover.setToolTipText("Remover");
        bt_remover.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_remover.setPreferredSize(new java.awt.Dimension(60, 60));
        bt_remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_removerActionPerformed(evt);
            }
        });

        bt_add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/empresa/icones/user_add.png"))); // NOI18N
        bt_add.setToolTipText("Adicionar");
        bt_add.setPreferredSize(new java.awt.Dimension(60, 60));
        bt_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_addActionPerformed(evt);
            }
        });

        jLabel3.setText("*Campos obrigatórios, para novo cadastro");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_add, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(bt_editar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(bt_pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(bt_remover, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4))
                        .addGap(2, 2, 2))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt_id_usu, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt_login_usu)
                            .addComponent(txt_usu_fone, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbo_perfil_usu, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_senha_usu, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59))
                    .addComponent(txt_nome_usu, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txt_id_usu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel3)))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_nome_usu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_login_usu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_senha_usu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbo_perfil_usu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_usu_fone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bt_remover, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_editar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_add, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70))
        );

        bt_editar.getAccessibleContext().setAccessibleName("");
        bt_pesquisar.getAccessibleContext().setAccessibleName("");
        bt_remover.getAccessibleContext().setAccessibleName("");

        setBounds(0, 0, 583, 451);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_senha_usuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_senha_usuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_senha_usuActionPerformed

    private void bt_pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_pesquisarActionPerformed
        // consultar um perfil/usuario
        consultar();
    }//GEN-LAST:event_bt_pesquisarActionPerformed

    private void bt_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_editarActionPerformed
        // altera um usuario
        alterar();
    }//GEN-LAST:event_bt_editarActionPerformed

    private void txt_usu_foneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usu_foneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usu_foneActionPerformed

    private void cbo_perfil_usuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_perfil_usuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbo_perfil_usuActionPerformed

    private void bt_removerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_removerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_removerActionPerformed

    private void bt_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_addActionPerformed
        // chama o metodo adicionar
        adicionar();
    }//GEN-LAST:event_bt_addActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_add;
    private javax.swing.JButton bt_editar;
    private javax.swing.JButton bt_pesquisar;
    private javax.swing.JButton bt_remover;
    private javax.swing.JComboBox<String> cbo_perfil_usu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txt_id_usu;
    private javax.swing.JTextField txt_login_usu;
    private javax.swing.JTextField txt_nome_usu;
    private javax.swing.JTextField txt_senha_usu;
    private javax.swing.JTextField txt_usu_fone;
    // End of variables declaration//GEN-END:variables
}
