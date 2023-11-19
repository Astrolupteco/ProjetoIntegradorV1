/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.empresa.telas;
import java.text.DateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
/**
 *
 * @author josej
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
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

        desktop = new javax.swing.JDesktopPane();
        LblUsuario = new javax.swing.JLabel();
        LblData = new javax.swing.JLabel();
        Principal_OS = new javax.swing.JLabel();
        Menu = new javax.swing.JMenuBar();
        menu_Cadastro = new javax.swing.JMenu();
        menu_Cliente = new javax.swing.JMenuItem();
        menu_Usuarios = new javax.swing.JMenuItem();
        menu_Servicos = new javax.swing.JMenu();
        menu_ServicosRel = new javax.swing.JMenuItem();
        MenuNotas = new javax.swing.JMenuItem();
        menu_Ajuda = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        menu_ajuda_Sobre = new javax.swing.JMenuItem();
        menu_opcoes = new javax.swing.JMenu();
        menu_opcoes_sair = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Instituição programadores do amanhã");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        desktop.setPreferredSize(new java.awt.Dimension(583, 451));

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 583, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 451, Short.MAX_VALUE)
        );

        LblUsuario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LblUsuario.setText("Usuário");

        LblData.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LblData.setText("Data");

        Principal_OS.setIcon(new javax.swing.ImageIcon("C:\\Users\\josej\\Pictures\\Icones\\logo_os.png")); // NOI18N

        menu_Cadastro.setText("Inicio");

        menu_Cliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        menu_Cliente.setText("Àrea do Aluno");
        menu_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_ClienteActionPerformed(evt);
            }
        });
        menu_Cadastro.add(menu_Cliente);

        menu_Usuarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_MASK));
        menu_Usuarios.setText("Àrea do Professor");
        menu_Usuarios.setEnabled(false);
        menu_Usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_UsuariosActionPerformed(evt);
            }
        });
        menu_Cadastro.add(menu_Usuarios);

        Menu.add(menu_Cadastro);

        menu_Servicos.setText("Relatório");

        menu_ServicosRel.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        menu_ServicosRel.setText("Serviços");
        menu_ServicosRel.setEnabled(false);
        menu_ServicosRel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_ServicosRelActionPerformed(evt);
            }
        });
        menu_Servicos.add(menu_ServicosRel);

        MenuNotas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.ALT_MASK));
        MenuNotas.setText("Notas");
        MenuNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuNotasActionPerformed(evt);
            }
        });
        menu_Servicos.add(MenuNotas);

        Menu.add(menu_Servicos);

        menu_Ajuda.setText("Ajuda");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_J, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem2.setText("Avaliações");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        menu_Ajuda.add(jMenuItem2);

        menu_ajuda_Sobre.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.ALT_MASK));
        menu_ajuda_Sobre.setText("Sobre");
        menu_ajuda_Sobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_ajuda_SobreActionPerformed(evt);
            }
        });
        menu_Ajuda.add(menu_ajuda_Sobre);

        Menu.add(menu_Ajuda);

        menu_opcoes.setText("Opções");

        menu_opcoes_sair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        menu_opcoes_sair.setText("Sair");
        menu_opcoes_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_opcoes_sairActionPerformed(evt);
            }
        });
        menu_opcoes.add(menu_opcoes_sair);

        Menu.add(menu_opcoes);

        jMenu1.setText("Material");

        jMenuItem1.setText("Estudo");
        jMenu1.add(jMenuItem1);

        Menu.add(jMenu1);

        setJMenuBar(Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(LblUsuario)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(Principal_OS, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(LblData)
                        .addContainerGap(74, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Principal_OS)
                    .addComponent(LblData))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LblUsuario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(desktop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(806, 511));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menu_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_ClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menu_ClienteActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        //substitui as label da data para a data do sistema ao inicializar o form
        Date data = new Date();        
        DateFormat formatador = DateFormat.getDateInstance(DateFormat.SHORT);      
        LblData.setText(formatador.format(data));
    }//GEN-LAST:event_formWindowActivated

    private void menu_opcoes_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_opcoes_sairActionPerformed
        // CAIXA DE DIALOGO PARA SAIR DO PROGRAMA
        int sair = JOptionPane.showConfirmDialog(null, "tem certeza que deseja sair?","atenção",JOptionPane.YES_NO_OPTION);
        if(sair == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_menu_opcoes_sairActionPerformed

    private void menu_ajuda_SobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_ajuda_SobreActionPerformed
        // informações sobre o software na tela sobre
        TelaSobre sobre = new TelaSobre();
        sobre.setVisible(true);
    }//GEN-LAST:event_menu_ajuda_SobreActionPerformed

    private void menu_UsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_UsuariosActionPerformed
        // abre o form usuario dentro do painel do desktop
        TelaUsuario usuario = new TelaUsuario();
        usuario.setVisible(true);
        desktop.add(usuario);
    }//GEN-LAST:event_menu_UsuariosActionPerformed

    private void MenuNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuNotasActionPerformed
        TelaNotas notas = new TelaNotas();
        notas.setVisible(true);
        desktop.add(notas);
    }//GEN-LAST:event_MenuNotasActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        TelaAvaliacao avaliacao = new TelaAvaliacao();
        avaliacao.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void menu_ServicosRelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_ServicosRelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menu_ServicosRelActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblData;
    public static javax.swing.JLabel LblUsuario;
    private javax.swing.JMenuBar Menu;
    public static javax.swing.JMenuItem MenuNotas;
    private javax.swing.JLabel Principal_OS;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenu menu_Ajuda;
    private javax.swing.JMenu menu_Cadastro;
    public static javax.swing.JMenuItem menu_Cliente;
    private javax.swing.JMenu menu_Servicos;
    public static javax.swing.JMenuItem menu_ServicosRel;
    public static javax.swing.JMenuItem menu_Usuarios;
    private javax.swing.JMenuItem menu_ajuda_Sobre;
    private javax.swing.JMenu menu_opcoes;
    private javax.swing.JMenuItem menu_opcoes_sair;
    // End of variables declaration//GEN-END:variables
}
