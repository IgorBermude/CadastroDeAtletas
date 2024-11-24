/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import Model.Atleta;
import control.AtletaTableModel;
import control.GerenciadorInterfaceGrafica;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;

/**
 *
 * @author Usuario
 */
public class DlgListarCadastros extends javax.swing.JDialog {
    
    private Atleta atlSelecionado;
    private AtletaTableModel tableAtletaModel;

    /**
     * Creates new form DlgListarCadastros
     */
    public DlgListarCadastros(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        atlSelecionado = null;
        
        //Associar a tableModel
        tableAtletaModel = new AtletaTableModel();
        tabela.setModel( tableAtletaModel );
    }

    public Atleta getAtlSelecionado() {
        return atlSelecionado;
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
        btnAtualizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        cmbFiltrar = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        txtPesq = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        btnSelecionar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Listar");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastros"));

        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Atleta", "Esporte", "Rank", "Ouro", "Prata", "Bronze"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabela);

        cmbFiltrar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A - Z", "Z - A", "Rank", "Medalhas", "Medalhas de ouro", "Medalhas de prata", "Medalhas de bronze", "Esportes" }));

        jLabel1.setText("Filtrar");

        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/png/16x16/search.png"))); // NOI18N
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        btnSelecionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/png/16x16/accept.png"))); // NOI18N
        btnSelecionar.setText("Selecionar");
        btnSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionarActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/png/16x16/remove.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnAtualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPesq, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPesquisar)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnSelecionar, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAtualizar)
                    .addComponent(cmbFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPesq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnSelecionar)
                    .addComponent(btnExcluir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        try {
            String pesq = txtPesq.getText();
            
            List<Atleta> lista = GerenciadorInterfaceGrafica.getMyInstance().getGerDom().pesquisarAtleta(pesq);
            
            // Atualizar o JTable
            tableAtletaModel.setLista(lista);
            
        } catch (HibernateException ex) {
            JOptionPane.showMessageDialog(this, "Erro ao pesquisar. "  + ex, "Pesquisar Cliente", JOptionPane.ERROR_MESSAGE );
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarActionPerformed

        int linha = tabela.getSelectedRow();

        if ( linha >= 0 ){
            atlSelecionado = tableAtletaModel.getAtleta(linha);

        } else {
            JOptionPane.showMessageDialog(this, "Selecione um cliente", "Pesquisar Cliente", JOptionPane.ERROR_MESSAGE );
        }

        this.setVisible(false);
    }//GEN-LAST:event_btnSelecionarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int linha = tabela.getSelectedRow();

        if ( linha >= 0 ){
            try {
                Atleta atl = tableAtletaModel.getAtleta(linha);
                GerenciadorInterfaceGrafica.getMyInstance().getGerDom().excluir(atl);

                // Atualizar o JTable
                tableAtletaModel.remover(linha);
            } catch (HibernateException ex) {
                JOptionPane.showMessageDialog(this, "Erro ao excluir o cliente. "  + ex, "Pesquisar Cliente", JOptionPane.ERROR_MESSAGE );
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um cliente", "Pesquisar Cliente", JOptionPane.ERROR_MESSAGE );
        }

    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        atlSelecionado = null;
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        List<Atleta> lista = GerenciadorInterfaceGrafica.getMyInstance().getGerDom().listar(Atleta.class);
        tableAtletaModel.setLista(lista);
    }//GEN-LAST:event_btnAtualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSelecionar;
    private javax.swing.JComboBox<String> cmbFiltrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField txtPesq;
    // End of variables declaration//GEN-END:variables
}
