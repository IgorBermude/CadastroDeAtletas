/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import Model.Atleta;
import Model.Esporte;
import Model.EsporteColetivo;
import Model.Time;
import Model.TorneioColetivo;
import Model.TorneioIndividual;
import control.AtletaTableModel;
import control.GerenciadorInterfaceGrafica;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author 2022122760265
 */
public class DlgCadTorneio extends javax.swing.JDialog {

    
    private AtletaTableModel tableAtletaModel;
    private AtletaTableModel tableAtletaModel2;
    TorneioColetivo torneioColetivo;
    TorneioIndividual torneioIndividual;

    /**
     * Creates new form DlgCadTorneio
     */
    public DlgCadTorneio(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        pnlinscreveratletas.setVisible(false);
        pnlcadastrartimes.setVisible(false);
        pnlstatus.setVisible(false);
        GerenciadorInterfaceGrafica.getMyInstance().carregarCombo(cmbEsporte, Esporte.class);
        
        //Associar a tableModel
        tableAtletaModel = new AtletaTableModel();
        tableAtletaModel2 = new AtletaTableModel();
        tabelaInscritos.setModel( tableAtletaModel );
        tabelaAtletas.setModel(tableAtletaModel2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grptipo = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtTitulo = new javax.swing.JLabel();
        pnlinscreveratletas = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaInscritos = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        pnlcadastrartimes = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cmbNacionalidade = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabelaAtletas = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cmbEsporte = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        radioIndividual = new javax.swing.JRadioButton();
        radioColetivo = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtDt = new javax.swing.JFormattedTextField();
        txtLocal = new javax.swing.JTextField();
        pnlstatus = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Torneio");

        txtTitulo.setFont(new java.awt.Font("Segoe UI Semilight", 3, 18)); // NOI18N
        txtTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTitulo.setText("Cadastro de Torneio");
        txtTitulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        tabelaInscritos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Nacionalidade", "Sexo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabelaInscritos);

        jLabel5.setText("Atletas inscritos");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlinscreveratletasLayout = new javax.swing.GroupLayout(pnlinscreveratletas);
        pnlinscreveratletas.setLayout(pnlinscreveratletasLayout);
        pnlinscreveratletasLayout.setHorizontalGroup(
            pnlinscreveratletasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlinscreveratletasLayout.setVerticalGroup(
            pnlinscreveratletasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlinscreveratletasLayout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnlcadastrartimes.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel6.setText("Cadastro de Times");

        jLabel7.setText("Nacionalidade: ");

        cmbNacionalidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Afeganistão", "Albânia", "Andorra", "Angola", "Antígua e Barbuda", "Argélia", "Argentina", "Armênia", "Austrália", "Áustria", "Azerbaijão", "Bahamas", "Bahrein", "Barbados", "Bélgica", "Bielorrússia", "Bósnia e Herzegovina", "Botsuana", "Bolívia", "Botswana", "Brasil", "Brunei", "Bulgária", "Butão", "Cabo Verde", "Camarões", "Cazaquistão", "Cambodja", "Canadá", "Chile", "China", "Chipre", "Colômbia", "Comores", "Congo, República do", "Congo, República Democrática do", "Costa do Marfim", "Croácia", "Cuba", "Dinamarca", "Dominica", "Egito", "El Salvador", "Emirados Árabes Unidos", "Equador", "Eritreia", "Essuatíni (Suazilândia)", "Espanha", "Estados Unidos", "Estônia", "Etiópia", "Fiji", "Filipinas", "Finlândia", "França", "Gabão", "Gâmbia", "Gana", "Geórgia", "Granada", "Guiana", "Guiana Francesa", "Haiti", "Honduras", "Hong Kong", "Hungria", "Islândia", "Índia", "Indonésia", "Irã", "Iraque", "Irlanda", "Israel", "Itália", "Jamaica", "Japão", "Jordânia", "Kuwait", "Laos", "Líbano", "Libéria", "Lituânia", "Luxemburgo", "Macedônia do Norte", "Madagáscar", "Malásia", "Malavi", "Maldivas", "Marrocos", "Mauritânia", "Maurícias", "México", "Micronésia", "Mongólia", "Montenegro", "Moçambique", "Mônaco", "Myanmar (Birmânia)", "Namíbia", "Nauru", "Nepal", "Nicarágua", "Nigéria", "Noruega", "Nova Zelândia", "Omã", "Paquistão", "Palau", "Panamá", "Papua Nova Guiné", "Paraguai", "Peru", "Polônia", "Portugal", "Quênia", "Qatar", "República Centro-Africana", "República Checa", "Romênia", "Ruanda", "São Cristóvão e Nevis", "São Tomé e Príncipe", "Senegal", "Serra Leoa", "Síria", "Singapura", "Sri Lanka", "Suécia", "Suíça", "Suriname", "Tajiquistão", "Tanzânia", "Tailândia", "Tonga", "Turcomenistão", "Turquia", "Tuvalu", "Ucrânia", "Uzbequistão", "Vanuatu", "Venezuela", "Vietnã", "Zâmbia", "Zimbábue" }));

        jLabel8.setText("Atletas:");

        jButton5.setText("Ver todos os times");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/png/16x16/add.png"))); // NOI18N
        jButton4.setText("Gerar time");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        tabelaAtletas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "Atletas"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tabelaAtletas);

        jLabel10.setText("Nome:");

        javax.swing.GroupLayout pnlcadastrartimesLayout = new javax.swing.GroupLayout(pnlcadastrartimes);
        pnlcadastrartimes.setLayout(pnlcadastrartimesLayout);
        pnlcadastrartimesLayout.setHorizontalGroup(
            pnlcadastrartimesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlcadastrartimesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlcadastrartimesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlcadastrartimesLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton5)
                        .addGap(46, 46, 46))
                    .addGroup(pnlcadastrartimesLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 222, Short.MAX_VALUE)
                        .addComponent(jLabel8))
                    .addGroup(pnlcadastrartimesLayout.createSequentialGroup()
                        .addGroup(pnlcadastrartimesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlcadastrartimesLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbNacionalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton4)
                            .addGroup(pnlcadastrartimesLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlcadastrartimesLayout.setVerticalGroup(
            pnlcadastrartimesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlcadastrartimesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlcadastrartimesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlcadastrartimesLayout.createSequentialGroup()
                        .addGroup(pnlcadastrartimesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlcadastrartimesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(cmbNacionalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlcadastrartimesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addComponent(jButton4)
                        .addGap(20, 20, 20)
                        .addComponent(jButton5)
                        .addGap(0, 6, Short.MAX_VALUE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setText("Esporte:");

        cmbEsporte.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                cmbEsporteComponentShown(evt);
            }
        });
        cmbEsporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEsporteActionPerformed(evt);
            }
        });

        jLabel4.setText("Tipo de torneio:");

        grptipo.add(radioIndividual);
        radioIndividual.setText("Individual");
        radioIndividual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioIndividualActionPerformed(evt);
            }
        });

        grptipo.add(radioColetivo);
        radioColetivo.setText("Coletivo");
        radioColetivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioColetivoActionPerformed(evt);
            }
        });

        jLabel1.setText("Local:");

        jLabel9.setText("Data:");

        try {
            txtDt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbEsporte, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(radioIndividual)
                        .addGap(18, 18, 18)
                        .addComponent(radioColetivo)))
                .addGap(63, 63, 63)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLocal)))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmbEsporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(txtLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(radioIndividual)
                    .addComponent(radioColetivo)
                    .addComponent(jLabel9)
                    .addComponent(txtDt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pnlstatus.setBorder(javax.swing.BorderFactory.createTitledBorder("Status torneio"));

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/png/16x16/remove.png"))); // NOI18N
        btnCancelar.setText("Cancelar Torneio");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/png/16x16/accept.png"))); // NOI18N
        jButton1.setText("Iniciar Torneio");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("- NÃO INICIADO -");

        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/png/16x16/down.png"))); // NOI18N
        jToggleButton1.setText("Visualizar Resultados");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlstatusLayout = new javax.swing.GroupLayout(pnlstatus);
        pnlstatus.setLayout(pnlstatusLayout);
        pnlstatusLayout.setHorizontalGroup(
            pnlstatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlstatusLayout.createSequentialGroup()
                .addComponent(btnCancelar)
                .addGap(70, 70, 70)
                .addComponent(jToggleButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1))
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlstatusLayout.setVerticalGroup(
            pnlstatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlstatusLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(pnlstatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(jButton1)
                    .addComponent(jToggleButton1)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlinscreveratletas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlcadastrartimes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlstatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlinscreveratletas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlcadastrartimes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        GerenciadorInterfaceGrafica.getMyInstance().abrirResultado();
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        GerenciadorInterfaceGrafica.getMyInstance().abrirVerTimes();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void radioIndividualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioIndividualActionPerformed

    }//GEN-LAST:event_radioIndividualActionPerformed

    private void radioColetivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioColetivoActionPerformed

    }//GEN-LAST:event_radioColetivoActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // Vai pegar todos os atletas da nacionalidade escolhida e que sejam do esporte e jogar em um time
        EsporteColetivo esporteSelecionado = (EsporteColetivo) cmbEsporte.getSelectedItem();
        String nacionalidade = (String) cmbNacionalidade.getSelectedItem();
        String nome = txtNome.getText();
                
        List<Atleta> lista = esporteSelecionado.getAtletaNacionalidade(nacionalidade);
        tableAtletaModel2.setLista(lista);
        
        Time time = new Time(nome, nacionalidade, lista, esporteSelecionado);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void cmbEsporteComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_cmbEsporteComponentShown
        GerenciadorInterfaceGrafica.getMyInstance().carregarCombo(cmbEsporte, Esporte.class);
    }//GEN-LAST:event_cmbEsporteComponentShown

    private void cmbEsporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEsporteActionPerformed
        Esporte esporteSelecionado = (Esporte) cmbEsporte.getSelectedItem();
        
        tableAtletaModel.setLista(esporteSelecionado.getAtletas());
        
        switch (esporteSelecionado.getTipo()) {
            case "Individual" -> {
                radioIndividual.setSelected(rootPaneCheckingEnabled);
                pnlcadastrartimes.setVisible(false);
                pnlinscreveratletas.setVisible(true);
                pnlstatus.setVisible(true);
            }
            case "Coletivo" -> {
                radioColetivo.setSelected(rootPaneCheckingEnabled);
                pnlinscreveratletas.setVisible(true);
                pnlcadastrartimes.setVisible(true);
                pnlstatus.setVisible(true);
            }
            default -> JOptionPane.showMessageDialog(this, "Esse esporte não tem tipo");
        }
    }//GEN-LAST:event_cmbEsporteActionPerformed

    private void txtDtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<String> cmbEsporte;
    private javax.swing.JComboBox<String> cmbNacionalidade;
    private javax.swing.ButtonGroup grptipo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JPanel pnlcadastrartimes;
    private javax.swing.JPanel pnlinscreveratletas;
    private javax.swing.JPanel pnlstatus;
    private javax.swing.JRadioButton radioColetivo;
    private javax.swing.JRadioButton radioIndividual;
    private javax.swing.JTable tabelaAtletas;
    private javax.swing.JTable tabelaInscritos;
    private javax.swing.JFormattedTextField txtDt;
    private javax.swing.JTextField txtLocal;
    private javax.swing.JTextField txtNome;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables
}
