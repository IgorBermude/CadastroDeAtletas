/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import control.FuncoesUteis;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author 2022122760265
 */
public class DlgCadAtleta extends javax.swing.JDialog {

    /**
     * Creates new form CadAtleta
     */
    public DlgCadAtleta(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        PainelTitulo = new javax.swing.JPanel();
        txtTitulo = new javax.swing.JLabel();
        PainelSobre = new javax.swing.JPanel();
        Esporte = new javax.swing.JComboBox<>();
        txtEsporte = new javax.swing.JLabel();
        ScrollPaneSobre = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        Nacionalidade = new javax.swing.JComboBox<>();
        txtNacionalidade = new javax.swing.JLabel();
        txtSobre = new javax.swing.JLabel();
        PainelMedalhas = new javax.swing.JPanel();
        txtMedalhas = new javax.swing.JLabel();
        iconMedalhaBronze = new javax.swing.JLabel();
        iconMedalhaPrata = new javax.swing.JLabel();
        iconMedalhaOuro = new javax.swing.JLabel();
        SpinnerMedalhaOuro = new javax.swing.JSpinner();
        SpinnerMedalhaPrata = new javax.swing.JSpinner();
        SpinnerMedalhaBronze = new javax.swing.JSpinner();
        btnAdicionar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        lblFoto = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jTextField3 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        lupa = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel13.setText("jLabel13");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Atletas");
        setBackground(new java.awt.Color(255, 255, 255));

        PainelTitulo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTitulo.setFont(new java.awt.Font("Segoe UI Semilight", 3, 18)); // NOI18N
        txtTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTitulo.setText("Cadastro de Atletas");
        txtTitulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PainelTitulo.add(txtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 0, 530, -1));

        Esporte.setMaximumRowCount(5);
        Esporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EsporteActionPerformed(evt);
            }
        });

        txtEsporte.setText("Esporte");

        ScrollPaneSobre.setViewportView(jTextPane1);

        Nacionalidade.setMaximumRowCount(5);
        Nacionalidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Afeganistão", "Albânia", "Andorra", "Angola", "Antígua e Barbuda", "Argélia", "Argentina", "Armênia", "Austrália", "Áustria", "Azerbaijão", "Bahamas", "Bahrein", "Barbados", "Bélgica", "Bielorrússia", "Bósnia e Herzegovina", "Botsuana", "Bolívia", "Botswana", "Brasil", "Brunei", "Bulgária", "Butão", "Cabo Verde", "Camarões", "Cazaquistão", "Cambodja", "Canadá", "Chile", "China", "Chipre", "Colômbia", "Comores", "Congo, República do", "Congo, República Democrática do", "Costa do Marfim", "Croácia", "Cuba", "Dinamarca", "Dominica", "Egito", "El Salvador", "Emirados Árabes Unidos", "Equador", "Eritreia", "Essuatíni (Suazilândia)", "Espanha", "Estados Unidos", "Estônia", "Etiópia", "Fiji", "Filipinas", "Finlândia", "França", "Gabão", "Gâmbia", "Gana", "Geórgia", "Granada", "Guiana", "Guiana Francesa", "Haiti", "Honduras", "Hong Kong", "Hungria", "Islândia", "Índia", "Indonésia", "Irã", "Iraque", "Irlanda", "Israel", "Itália", "Jamaica", "Japão", "Jordânia", "Kuwait", "Laos", "Líbano", "Libéria", "Lituânia", "Luxemburgo", "Macedônia do Norte", "Madagáscar", "Malásia", "Malavi", "Maldivas", "Marrocos", "Mauritânia", "Maurícias", "México", "Micronésia", "Mongólia", "Montenegro", "Moçambique", "Mônaco", "Myanmar (Birmânia)", "Namíbia", "Nauru", "Nepal", "Nicarágua", "Nigéria", "Noruega", "Nova Zelândia", "Omã", "Paquistão", "Palau", "Panamá", "Papua Nova Guiné", "Paraguai", "Peru", "Polônia", "Portugal", "Quênia", "Qatar", "República Centro-Africana", "República Checa", "Romênia", "Ruanda", "São Cristóvão e Nevis", "São Tomé e Príncipe", "Senegal", "Serra Leoa", "Síria", "Singapura", "Sri Lanka", "Suécia", "Suíça", "Suriname", "Tajiquistão", "Tanzânia", "Tailândia", "Tonga", "Turcomenistão", "Turquia", "Tuvalu", "Ucrânia", "Uzbequistão", "Vanuatu", "Venezuela", "Vietnã", "Zâmbia", "Zimbábue" }));
        Nacionalidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NacionalidadeActionPerformed(evt);
            }
        });

        txtNacionalidade.setText("Nacionalidade");

        txtSobre.setText("Sobre o Atleta");

        javax.swing.GroupLayout PainelSobreLayout = new javax.swing.GroupLayout(PainelSobre);
        PainelSobre.setLayout(PainelSobreLayout);
        PainelSobreLayout.setHorizontalGroup(
            PainelSobreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelSobreLayout.createSequentialGroup()
                .addGroup(PainelSobreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelSobreLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ScrollPaneSobre))
                    .addGroup(PainelSobreLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(PainelSobreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSobre)
                            .addGroup(PainelSobreLayout.createSequentialGroup()
                                .addComponent(txtEsporte)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Esporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(txtNacionalidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Nacionalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PainelSobreLayout.setVerticalGroup(
            PainelSobreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelSobreLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(PainelSobreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelSobreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Nacionalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNacionalidade))
                    .addGroup(PainelSobreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Esporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtEsporte)))
                .addGap(18, 18, 18)
                .addComponent(txtSobre)
                .addGap(1, 1, 1)
                .addComponent(ScrollPaneSobre, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        PainelMedalhas.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtMedalhas.setText("Medalhas");

        iconMedalhaBronze.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/png/32x32/medalha-de-bronze.png"))); // NOI18N

        iconMedalhaPrata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/png/32x32/medalha-de-prata.png"))); // NOI18N

        iconMedalhaOuro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/png/32x32/medalha-de-ouro.png"))); // NOI18N

        SpinnerMedalhaOuro.setModel(new javax.swing.SpinnerNumberModel(0, 0, 99, 1));

        SpinnerMedalhaPrata.setModel(new javax.swing.SpinnerNumberModel(0, 0, 99, 1));

        SpinnerMedalhaBronze.setModel(new javax.swing.SpinnerNumberModel(0, 0, 99, 1));

        btnAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/png/16x16/add.png"))); // NOI18N
        btnAdicionar.setText("Adicionar Atleta");

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/png/16x16/remove.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PainelMedalhasLayout = new javax.swing.GroupLayout(PainelMedalhas);
        PainelMedalhas.setLayout(PainelMedalhasLayout);
        PainelMedalhasLayout.setHorizontalGroup(
            PainelMedalhasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelMedalhasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelMedalhasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelMedalhasLayout.createSequentialGroup()
                        .addComponent(txtMedalhas)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelMedalhasLayout.createSequentialGroup()
                        .addGap(0, 106, Short.MAX_VALUE)
                        .addGroup(PainelMedalhasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(iconMedalhaOuro)
                            .addComponent(SpinnerMedalhaOuro, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(89, 89, 89)
                        .addGroup(PainelMedalhasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(iconMedalhaPrata)
                            .addComponent(SpinnerMedalhaPrata, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(89, 89, 89)
                        .addGroup(PainelMedalhasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SpinnerMedalhaBronze, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(iconMedalhaBronze))
                        .addContainerGap(112, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelMedalhasLayout.createSequentialGroup()
                .addComponent(btnCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAdicionar))
        );
        PainelMedalhasLayout.setVerticalGroup(
            PainelMedalhasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelMedalhasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtMedalhas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PainelMedalhasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelMedalhasLayout.createSequentialGroup()
                        .addComponent(iconMedalhaBronze)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SpinnerMedalhaBronze, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PainelMedalhasLayout.createSequentialGroup()
                        .addComponent(iconMedalhaPrata)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SpinnerMedalhaPrata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PainelMedalhasLayout.createSequentialGroup()
                        .addComponent(iconMedalhaOuro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SpinnerMedalhaOuro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(3, 3, 3)
                .addGroup(PainelMedalhasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionar)
                    .addComponent(btnCancelar)))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setPreferredSize(new java.awt.Dimension(788, 301));

        jLabel1.setText("Nome");

        jLabel2.setText("CPF");

        try {
            jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel3.setText("Dt Nasc");

        try {
            jFormattedTextField2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel4.setText("Celular");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        lblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/png/128x128/user.png"))); // NOI18N
        lblFoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel15.setText("Sexo");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Masculino");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Feminino");

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Outros");

        jLabel16.setText("E-mail");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/png/16x16/add.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        lupa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/png/16x16/search.png"))); // NOI18N
        lupa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lupaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFoto)
                    .addComponent(jButton2))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lupa, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lupa))
                        .addGap(19, 19, 19)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblFoto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE)
                    .addComponent(PainelMedalhas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PainelTitulo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PainelSobre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PainelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PainelSobre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PainelMedalhas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void EsporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EsporteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EsporteActionPerformed

    private void NacionalidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NacionalidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NacionalidadeActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JFileChooser janArq = new JFileChooser();
        janArq.setAcceptAllFileFilterUsed(false);
        janArq.setFileFilter( new FileNameExtensionFilter("Arquivos de imagem", "jpg", "png", "gif", "bmp") );       
        janArq.addChoosableFileFilter( new FileNameExtensionFilter("Arquivos de texto", "txt", "doc", "docx") );
        
        if ( janArq.showOpenDialog(this) == JFileChooser.APPROVE_OPTION ) {
            File arquivo = janArq.getSelectedFile();            
            
            // Transformar esse arquivo em Imagem
            ImageIcon imagem = new ImageIcon( arquivo.getAbsolutePath() );
            FuncoesUteis.mostrarFoto(lblFoto, imagem);           
            
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void lupaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lupaActionPerformed
        String pesq = lupa.getText();
        // Pegar o atleta pesquisado e inserir nos campos.
    }//GEN-LAST:event_lupaActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Esporte;
    private javax.swing.JComboBox<String> Nacionalidade;
    private javax.swing.JPanel PainelMedalhas;
    private javax.swing.JPanel PainelSobre;
    private javax.swing.JPanel PainelTitulo;
    private javax.swing.JScrollPane ScrollPaneSobre;
    private javax.swing.JSpinner SpinnerMedalhaBronze;
    private javax.swing.JSpinner SpinnerMedalhaOuro;
    private javax.swing.JSpinner SpinnerMedalhaPrata;
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel iconMedalhaBronze;
    private javax.swing.JLabel iconMedalhaOuro;
    private javax.swing.JLabel iconMedalhaPrata;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JButton lupa;
    private javax.swing.JLabel txtEsporte;
    private javax.swing.JLabel txtMedalhas;
    private javax.swing.JLabel txtNacionalidade;
    private javax.swing.JLabel txtSobre;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables
}
