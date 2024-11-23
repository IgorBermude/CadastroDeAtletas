/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import Model.Atleta;
import Model.Esporte;
import control.FuncoesUteis;
import control.GerenciadorInterfaceGrafica;
import java.awt.Color;
import java.io.File;
import java.text.ParseException;
import java.util.Date;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author 2022122760265
 */
public class DlgGerAtleta extends javax.swing.JDialog {

    private Atleta atlSelecionado;
    
    String formatoData = "dd/MM/yyyy";   // Formato da data esperado
    Icon icone;
    
    /**
     * Creates new form CadAtleta
     */
    public DlgGerAtleta(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        icone = lblFoto.getIcon();
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
        grpSexo = new javax.swing.ButtonGroup();
        PainelTitulo = new javax.swing.JPanel();
        txtTitulo = new javax.swing.JLabel();
        PainelSobre = new javax.swing.JPanel();
        cmbEsporte = new javax.swing.JComboBox<>();
        lblEsporte = new javax.swing.JLabel();
        ScrollPaneSobre = new javax.swing.JScrollPane();
        paneSobre = new javax.swing.JTextPane();
        cmbNacionalidade = new javax.swing.JComboBox<>();
        lblNacionalidade = new javax.swing.JLabel();
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
        btnAlterar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        txtnome = new javax.swing.JTextField();
        lblCPF = new javax.swing.JLabel();
        txtCPF = new javax.swing.JFormattedTextField();
        lblDtNasc = new javax.swing.JLabel();
        txtDtNascimento = new javax.swing.JFormattedTextField();
        lblCelular = new javax.swing.JLabel();
        txtCelular = new javax.swing.JTextField();
        lblFoto = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        txtEmail = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        lupa = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

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

        cmbEsporte.setMaximumRowCount(5);
        cmbEsporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEsporteActionPerformed(evt);
            }
        });

        lblEsporte.setText("Esporte");

        ScrollPaneSobre.setViewportView(paneSobre);

        cmbNacionalidade.setMaximumRowCount(5);
        cmbNacionalidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Afeganistão", "Albânia", "Andorra", "Angola", "Antígua e Barbuda", "Argélia", "Argentina", "Armênia", "Austrália", "Áustria", "Azerbaijão", "Bahamas", "Bahrein", "Barbados", "Bélgica", "Bielorrússia", "Bósnia e Herzegovina", "Botsuana", "Bolívia", "Botswana", "Brasil", "Brunei", "Bulgária", "Butão", "Cabo Verde", "Camarões", "Cazaquistão", "Cambodja", "Canadá", "Chile", "China", "Chipre", "Colômbia", "Comores", "Congo, República do", "Congo, República Democrática do", "Costa do Marfim", "Croácia", "Cuba", "Dinamarca", "Dominica", "Egito", "El Salvador", "Emirados Árabes Unidos", "Equador", "Eritreia", "Essuatíni (Suazilândia)", "Espanha", "Estados Unidos", "Estônia", "Etiópia", "Fiji", "Filipinas", "Finlândia", "França", "Gabão", "Gâmbia", "Gana", "Geórgia", "Granada", "Guiana", "Guiana Francesa", "Haiti", "Honduras", "Hong Kong", "Hungria", "Islândia", "Índia", "Indonésia", "Irã", "Iraque", "Irlanda", "Israel", "Itália", "Jamaica", "Japão", "Jordânia", "Kuwait", "Laos", "Líbano", "Libéria", "Lituânia", "Luxemburgo", "Macedônia do Norte", "Madagáscar", "Malásia", "Malavi", "Maldivas", "Marrocos", "Mauritânia", "Maurícias", "México", "Micronésia", "Mongólia", "Montenegro", "Moçambique", "Mônaco", "Myanmar (Birmânia)", "Namíbia", "Nauru", "Nepal", "Nicarágua", "Nigéria", "Noruega", "Nova Zelândia", "Omã", "Paquistão", "Palau", "Panamá", "Papua Nova Guiné", "Paraguai", "Peru", "Polônia", "Portugal", "Quênia", "Qatar", "República Centro-Africana", "República Checa", "Romênia", "Ruanda", "São Cristóvão e Nevis", "São Tomé e Príncipe", "Senegal", "Serra Leoa", "Síria", "Singapura", "Sri Lanka", "Suécia", "Suíça", "Suriname", "Tajiquistão", "Tanzânia", "Tailândia", "Tonga", "Turcomenistão", "Turquia", "Tuvalu", "Ucrânia", "Uzbequistão", "Vanuatu", "Venezuela", "Vietnã", "Zâmbia", "Zimbábue" }));
        cmbNacionalidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbNacionalidadeActionPerformed(evt);
            }
        });

        lblNacionalidade.setText("Nacionalidade");

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
                                .addComponent(lblEsporte)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbEsporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(lblNacionalidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbNacionalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PainelSobreLayout.setVerticalGroup(
            PainelSobreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelSobreLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(PainelSobreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelSobreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbNacionalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblNacionalidade))
                    .addGroup(PainelSobreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbEsporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblEsporte)))
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
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/png/16x16/remove.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/repeat.png"))); // NOI18N
        btnAlterar.setMnemonic('A');
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarbtnNovoActionPerformed(evt);
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
                .addComponent(btnAlterar)
                .addGap(89, 89, 89)
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
                    .addComponent(btnCancelar)
                    .addComponent(btnAlterar)))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setPreferredSize(new java.awt.Dimension(788, 301));

        lblNome.setText("Nome");

        lblCPF.setText("CPF");

        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblDtNasc.setText("Dt Nasc");

        try {
            txtDtNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblCelular.setText("Celular");

        txtCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCelularActionPerformed(evt);
            }
        });

        lblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/png/128x128/user.png"))); // NOI18N
        lblFoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel15.setText("Sexo");

        grpSexo.add(jRadioButton1);
        jRadioButton1.setText("Masculino");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        grpSexo.add(jRadioButton2);
        jRadioButton2.setText("Feminino");

        grpSexo.add(jRadioButton3);
        jRadioButton3.setText("Outros");

        lblEmail.setText("E-mail");

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

        jLabel5.setText("Buscar");

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
                    .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDtNasc)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail)
                    .addComponent(lblNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblCelular)
                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblCPF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCPF)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lupa))
                        .addGap(19, 19, 19)
                        .addComponent(lblCelular)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblFoto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblDtNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblEmail)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
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

    private void txtCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCelularActionPerformed

    private void cmbEsporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEsporteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbEsporteActionPerformed

    private void cmbNacionalidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNacionalidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbNacionalidadeActionPerformed

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
        // Pegar o atleta pesquisado e inserir nos campos.
        atlSelecionado = GerenciadorInterfaceGrafica.getMyInstance().abrirPesqAtleta();     
        
    }//GEN-LAST:event_lupaActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAlterarbtnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarbtnNovoActionPerformed
        
    }//GEN-LAST:event_btnAlterarbtnNovoActionPerformed

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        String nome = txtnome.getText();
        String cpf = txtCPF.getText();        
        char sexo = (char) grpSexo.getSelection().getMnemonic();
        String celular = txtCelular.getText();
        Date nascimento = FuncoesUteis.converterStringParaDate(txtDtNascimento.getText(), formatoData); 
        String email = txtEmail.getText();
        Esporte esporte = (Esporte) cmbEsporte.getSelectedItem();
        String nacionalidade = (String) cmbNacionalidade.getSelectedItem();
        String sobre = paneSobre.getText();
        int ouro = (int) SpinnerMedalhaOuro.getValue();
        int prata = (int) SpinnerMedalhaPrata.getValue();
        int bronze = (int) SpinnerMedalhaBronze.getValue();
        
        if ( validarCampos() ) {
            // INSERIR NO BANCO
            try {
                
                if ( atlSelecionado == null ) {
                    // INSERIR
                    int id = GerenciadorInterfaceGrafica.getMyInstance().getGerDom().inserirAtleta(nome, cpf, celular, email, sobre, nacionalidade, 
                            sobre, ouro, prata, bronze, lblFoto.getIcon(), nascimento);

                    JOptionPane.showMessageDialog(this, "Atleta " + id + " inserido com sucesso." );
                    limparCampos();
                } else {
                    // ALTERAR
                    GerenciadorInterfaceGrafica.getMyInstance().getGerDom().alterarAtleta(nome, cpf, celular, email, sobre, nacionalidade, 
                            sobre, ouro, prata, bronze, lblFoto.getIcon(), nascimento);

                    JOptionPane.showMessageDialog(this, "Atleta alterado com sucesso." );
                    
                }
                
                
                
            }
            catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex, "ERRO Atleta", JOptionPane.ERROR_MESSAGE  );
            }
            
        
        }
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void limparCampos() {
            atlSelecionado = null;
            txtnome.setText( "" );
            txtCPF.setText( "" );
            txtDtNascimento.setText( "" );
            txtCelular.setText( "");
            txtEmail.setText( "" );
            lblFoto.setIcon(icone);
            lblFoto.setIcon(null);
            cmbEsporte.setSelectedIndex(0);
            cmbNacionalidade.setSelectedIndex(0);
            SpinnerMedalhaOuro.setValue(0);
            SpinnerMedalhaPrata.setValue(0);
            SpinnerMedalhaBronze.setValue(0);
    }
    
    private boolean validarCampos() {
        
        String msgErro = "";

       // Resetar cores dos labels
       lblNome.setForeground(Color.black);
       lblCPF.setForeground(Color.black);
       lblDtNasc.setForeground(Color.black);
       lblCelular.setForeground(Color.black);
       lblEmail.setForeground(Color.black);
       lblEsporte.setForeground(Color.black);
       lblNacionalidade.setForeground(Color.black);

       // Validar nome
       if (txtnome.getText().trim().isEmpty()) {
           msgErro += "Digite o nome.\n";
           lblNome.setForeground(Color.red);
       }

       // Validar CPF
       if (!FuncoesUteis.isCPF(txtCPF.getText())) {
           msgErro += "CPF inválido.\n";
           lblCPF.setForeground(Color.red);
       }

       // Validar data de nascimento
       if (txtDtNascimento.getText().trim().isEmpty()) {
           msgErro += "Informe a data de nascimento.\n";
           lblDtNasc.setForeground(Color.red);
       } else {
           Date nascimento = FuncoesUteis.converterStringParaDate(txtDtNascimento.getText(), "dd/MM/yyyy");
           if (nascimento == null) {
               msgErro += "Data de nascimento inválida.\n";
               lblDtNasc.setForeground(Color.red);
           }
       }

       // Validar celular
       if (txtCelular.getText().trim().isEmpty()) {
           msgErro += "Informe o número do celular.\n";
           lblCelular.setForeground(Color.red);
       }

       // Validar e-mail
       if (txtEmail.getText().trim().isEmpty()) {
           msgErro += "Informe o e-mail.\n";
           lblEmail.setForeground(Color.red);
       }

       // Validar esporte
       if (cmbEsporte.getSelectedIndex() == 0) {
           msgErro += "Selecione um esporte.\n";
           lblEsporte.setForeground(Color.red);
       }

       // Validar nacionalidade
       if (cmbNacionalidade.getSelectedIndex() == 0) {
           msgErro += "Selecione a nacionalidade.\n";
           lblNacionalidade.setForeground(Color.red);
       }

       // Validar foto (exemplo simples)
       if (lblFoto.getIcon() == null) {
           msgErro += "Adicione uma foto.\n";
           lblFoto.setForeground(Color.red);
       }

       // Exibir mensagens de erro ou retornar verdadeiro
       if (msgErro.isEmpty()) {
           return true;
       } else {
           JOptionPane.showMessageDialog(this, msgErro, "Erro de Validação", JOptionPane.ERROR_MESSAGE);
           return false;
       }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelMedalhas;
    private javax.swing.JPanel PainelSobre;
    private javax.swing.JPanel PainelTitulo;
    private javax.swing.JScrollPane ScrollPaneSobre;
    private javax.swing.JSpinner SpinnerMedalhaBronze;
    private javax.swing.JSpinner SpinnerMedalhaOuro;
    private javax.swing.JSpinner SpinnerMedalhaPrata;
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<String> cmbEsporte;
    private javax.swing.JComboBox<String> cmbNacionalidade;
    private javax.swing.ButtonGroup grpSexo;
    private javax.swing.JLabel iconMedalhaBronze;
    private javax.swing.JLabel iconMedalhaOuro;
    private javax.swing.JLabel iconMedalhaPrata;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblCelular;
    private javax.swing.JLabel lblDtNasc;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEsporte;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JLabel lblNacionalidade;
    private javax.swing.JLabel lblNome;
    private javax.swing.JButton lupa;
    private javax.swing.JTextPane paneSobre;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JFormattedTextField txtDtNascimento;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JLabel txtMedalhas;
    private javax.swing.JLabel txtSobre;
    private javax.swing.JLabel txtTitulo;
    private javax.swing.JTextField txtnome;
    // End of variables declaration//GEN-END:variables
}
