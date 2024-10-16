/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import control.GerenciadorInterfaceGrafica;
import java.awt.Color;
import javax.swing.UIManager;

/**
 *
 * @author Usuario
 */
public class FrmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FrmPrincipal
     */
    public FrmPrincipal() {
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

        cadastrar = new javax.swing.JButton();
        adicionar = new javax.swing.JButton();
        buscar = new javax.swing.JButton();
        editar = new javax.swing.JButton();
        conf = new javax.swing.JButton();
        listar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        setResizable(false);
        getContentPane().setLayout(null);

        cadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/png/24x24/note_add.png"))); // NOI18N
        cadastrar.setText("Cadastrar Atleta");
        cadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cadastrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cadastrarMouseExited(evt);
            }
        });
        cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(cadastrar);
        cadastrar.setBounds(40, 120, 170, 50);

        adicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/png/24x24/favorite_add.png"))); // NOI18N
        adicionar.setText("Adicionar Esporte");
        adicionar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                adicionarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                adicionarMouseExited(evt);
            }
        });
        adicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarActionPerformed(evt);
            }
        });
        getContentPane().add(adicionar);
        adicionar.setBounds(230, 120, 170, 50);

        buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/png/24x24/page_search.png"))); // NOI18N
        buscar.setText("Buscar Atleta");
        buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buscarMouseExited(evt);
            }
        });
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        getContentPane().add(buscar);
        buscar.setBounds(420, 120, 170, 50);

        editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/png/24x24/note_edit.png"))); // NOI18N
        editar.setText("Editar Atleta");
        editar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editarMouseExited(evt);
            }
        });
        editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarActionPerformed(evt);
            }
        });
        getContentPane().add(editar);
        editar.setBounds(230, 230, 170, 50);

        conf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/png/24x24/process.png"))); // NOI18N
        conf.setText("Configurações");
        conf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                confMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                confMouseExited(evt);
            }
        });
        conf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confActionPerformed(evt);
            }
        });
        getContentPane().add(conf);
        conf.setBounds(420, 230, 170, 50);

        listar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/png/24x24/database_search.png"))); // NOI18N
        listar.setText("Listar Cadastros");
        listar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                listarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                listarMouseExited(evt);
            }
        });
        listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarActionPerformed(evt);
            }
        });
        getContentPane().add(listar);
        listar.setBounds(40, 230, 170, 50);

        jLabel3.setFont(new java.awt.Font("Segoe UI Semilight", 3, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CADASTRO OLIMPÍCO");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(-3, 10, 640, 25);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/png/Generic/640px-Olympic_flag.svg.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 640, 427);

        setSize(new java.awt.Dimension(656, 436));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarActionPerformed
        GerenciadorInterfaceGrafica.getMyInstance().abrirCadastroAtleta();
    }//GEN-LAST:event_cadastrarActionPerformed

    private void adicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarActionPerformed
        GerenciadorInterfaceGrafica.getMyInstance().abrirCadastroEsporte();
    }//GEN-LAST:event_adicionarActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        GerenciadorInterfaceGrafica.getMyInstance().abrirBuscar();
    }//GEN-LAST:event_buscarActionPerformed

    private void editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarActionPerformed
        GerenciadorInterfaceGrafica.getMyInstance().abrirEditarAtleta();
    }//GEN-LAST:event_editarActionPerformed

    private void confActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confActionPerformed
        GerenciadorInterfaceGrafica.getMyInstance().abrirConfiguracoes();
    }//GEN-LAST:event_confActionPerformed

    private void listarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarActionPerformed
        GerenciadorInterfaceGrafica.getMyInstance().abrirListarCadastros();
    }//GEN-LAST:event_listarActionPerformed

    private void cadastrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastrarMouseEntered
        cadastrar.setBackground(new Color(173, 216, 230));
    }//GEN-LAST:event_cadastrarMouseEntered

    private void adicionarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adicionarMouseEntered
        adicionar.setBackground(new Color(169, 169, 169));
    }//GEN-LAST:event_adicionarMouseEntered

    private void buscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarMouseEntered
        buscar.setBackground(new Color(255, 182, 193));
    }//GEN-LAST:event_buscarMouseEntered

    private void listarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listarMouseEntered
        listar.setBackground(new Color(255, 255, 224));
    }//GEN-LAST:event_listarMouseEntered

    private void editarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editarMouseEntered
        editar.setBackground(new Color(222, 184, 135));
    }//GEN-LAST:event_editarMouseEntered

    private void confMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confMouseEntered
        conf.setBackground(new Color(144, 238, 144));
    }//GEN-LAST:event_confMouseEntered

    private void cadastrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastrarMouseExited
        cadastrar.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_cadastrarMouseExited

    private void adicionarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adicionarMouseExited
        adicionar.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_adicionarMouseExited

    private void buscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarMouseExited
        buscar.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_buscarMouseExited

    private void listarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listarMouseExited
        listar.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_listarMouseExited

    private void editarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editarMouseExited
        editar.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_editarMouseExited

    private void confMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confMouseExited
        conf.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_confMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adicionar;
    private javax.swing.JButton buscar;
    private javax.swing.JButton cadastrar;
    private javax.swing.JButton conf;
    private javax.swing.JButton editar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton listar;
    // End of variables declaration//GEN-END:variables
}
