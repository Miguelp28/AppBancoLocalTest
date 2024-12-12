/****************************************************
 * @author Miguel Henrique dos Santos Correa        *
 * RGM: 11231101499                                 *
 * Turma: B                                         *
 * Período: 04                                      *
 ***************************************************/
package bancobocadocaixa;

import javax.swing.JOptionPane;

public class FormUsuario extends javax.swing.JFrame {
    public ControleUsuario controle = new ControleUsuario();
    
    public FormUsuario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TituloText = new javax.swing.JLabel();
        NomeTXT = new javax.swing.JLabel();
        CPFTXT = new javax.swing.JLabel();
        NumContaTXT = new javax.swing.JLabel();
        ValorEmContaTXT = new javax.swing.JLabel();
        NomeCampo = new javax.swing.JTextField();
        CpfCampo = new javax.swing.JTextField();
        NumContaCampo = new javax.swing.JTextField();
        ValEmContaCampo = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ValDoEmprestimoCampo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        DivMesesCampo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ValParcelasCampo = new javax.swing.JTextField();
        ButCalcularEmprestimo = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        ValTotalJurosCampo = new javax.swing.JTextField();
        LimparCamposEprestimo = new javax.swing.JButton();
        ButCadastrar = new javax.swing.JButton();
        ButConsultar = new javax.swing.JButton();
        ButExcluir = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        DepositoCamp = new javax.swing.JTextField();
        ButDepositar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        SaqueCampo = new javax.swing.JTextField();
        ButSacar = new javax.swing.JButton();
        ButSair = new javax.swing.JButton();
        ButListar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        LimparCampoBut = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 192, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 186, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(500, 200));

        TituloText.setText("Sistema De Conta Boca Do Caixa");

        NomeTXT.setText("Nome");

        CPFTXT.setText("CPF");

        NumContaTXT.setText("N° Conta");

        ValorEmContaTXT.setText("Valor em Conta");

        NomeCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomeCampoActionPerformed(evt);
            }
        });

        CpfCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CpfCampoActionPerformed(evt);
            }
        });

        NumContaCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumContaCampoActionPerformed(evt);
            }
        });

        ValEmContaCampo.setActionCommand("<Not Set>");
        ValEmContaCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValEmContaCampoActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel1.setText("Simular Emprestimo");

        jLabel2.setText("Valor do emprestimo");

        ValDoEmprestimoCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValDoEmprestimoCampoActionPerformed(evt);
            }
        });

        jLabel3.setText("Dividir em Quantos Meses");

        DivMesesCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DivMesesCampoActionPerformed(evt);
            }
        });

        jLabel4.setText("Valor das Parcelas com Juros");

        ValParcelasCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValParcelasCampoActionPerformed(evt);
            }
        });

        ButCalcularEmprestimo.setText("Calcular  Emprestimo");
        ButCalcularEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButCalcularEmprestimoActionPerformed(evt);
            }
        });

        jLabel5.setText("Valor Total com Juros");

        ValTotalJurosCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValTotalJurosCampoActionPerformed(evt);
            }
        });

        LimparCamposEprestimo.setBackground(new java.awt.Color(153, 51, 0));
        LimparCamposEprestimo.setText("Limpar Campos");
        LimparCamposEprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparCamposEprestimoActionPerformed(evt);
            }
        });

        ButCadastrar.setText("Cadastrar");
        ButCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButCadastrarActionPerformed(evt);
            }
        });

        ButConsultar.setText("Consultar");
        ButConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButConsultarActionPerformed(evt);
            }
        });

        ButExcluir.setText("Excluir Conta");
        ButExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jLabel6.setText("Valor de Deposito");

        ButDepositar.setText("Depositar");
        ButDepositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButDepositarActionPerformed(evt);
            }
        });

        jLabel7.setText("Valor de saque");

        ButSacar.setText("Sacar");
        ButSacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButSacarActionPerformed(evt);
            }
        });

        ButSair.setBackground(new java.awt.Color(204, 0, 0));
        ButSair.setText("Sair do Aplicativo");
        ButSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButSairActionPerformed(evt);
            }
        });

        ButListar.setText("Listar Clientes");
        ButListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButListarActionPerformed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setForeground(new java.awt.Color(153, 51, 0));
        jLabel8.setText("Para realizar o emprestimo fale com o ");

        jLabel9.setForeground(new java.awt.Color(153, 51, 0));
        jLabel9.setText("gerente para liberar o emprestimo");

        LimparCampoBut.setBackground(new java.awt.Color(153, 51, 0));
        LimparCampoBut.setText("Limpar Campos");
        LimparCampoBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparCampoButActionPerformed(evt);
            }
        });

        jLabel10.setText("R$");

        jLabel11.setText("R$");

        jLabel12.setText("R$");

        jLabel13.setText("R$");

        jLabel14.setText("R$");

        jLabel15.setText("Nº");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(TituloText))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14))
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ValorEmContaTXT)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ValEmContaCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(NumContaTXT)
                                            .addComponent(NomeTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(CPFTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(NumContaCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(CpfCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(NomeCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(ButCadastrar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ButConsultar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ButExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(SaqueCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(ButSacar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(DepositoCamp, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(ButDepositar)))))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel7))
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 9, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ButListar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LimparCampoBut, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ButSair, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel15))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(2, 2, 2)
                                                .addComponent(ValDoEmprestimoCampo))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(3, 3, 3)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(DivMesesCampo)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(12, 12, 12)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel4)
                                                            .addComponent(ButCalcularEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(0, 0, Short.MAX_VALUE))))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel12))
                                        .addGap(1, 1, 1)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ValTotalJurosCampo)
                                            .addComponent(ValParcelasCampo)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(LimparCamposEprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(23, 23, 23))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel9)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(1, 1, 1)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1))
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(58, 58, 58))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ValDoEmprestimoCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DivMesesCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButCalcularEmprestimo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ValParcelasCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ValTotalJurosCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LimparCamposEprestimo))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(TituloText)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CpfCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CPFTXT))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NomeTXT)
                            .addComponent(NomeCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NumContaTXT)
                            .addComponent(NumContaCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ValorEmContaTXT)
                            .addComponent(ValEmContaCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ButCadastrar)
                            .addComponent(ButConsultar)
                            .addComponent(ButExcluir))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DepositoCamp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButDepositar)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SaqueCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14)))
                            .addComponent(ButSacar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(LimparCampoBut, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ButSair)
                            .addComponent(ButListar))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NomeCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomeCampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomeCampoActionPerformed

    private void CpfCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CpfCampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CpfCampoActionPerformed

    private void ValEmContaCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValEmContaCampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ValEmContaCampoActionPerformed

    private void ValDoEmprestimoCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValDoEmprestimoCampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ValDoEmprestimoCampoActionPerformed

    private void DivMesesCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DivMesesCampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DivMesesCampoActionPerformed

    private void ValParcelasCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValParcelasCampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ValParcelasCampoActionPerformed

    private void ValTotalJurosCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValTotalJurosCampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ValTotalJurosCampoActionPerformed

    private void LimparCamposEprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparCamposEprestimoActionPerformed
        this.ValDoEmprestimoCampo.setText("");
        this.DivMesesCampo.setText("");
        this.ValParcelasCampo.setText("");
        this.ValTotalJurosCampo.setText("");
    }//GEN-LAST:event_LimparCamposEprestimoActionPerformed

    private void ButCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButCadastrarActionPerformed
        try{
            controle.cadastrar(Long.parseLong(
                                this.CpfCampo.getText()),
                                this.NomeCampo.getText(),
                                Integer.parseInt(this.NumContaCampo.getText()),
                                Double.parseDouble(this.ValEmContaCampo.getText()));
            this.CpfCampo.setText("");
            this.NomeCampo.setText("");
            this.NumContaCampo.setText("");
            this.ValEmContaCampo.setText("");            
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Digite somente numeros em (CPF, Numero de conta e valor em conta)");
            System.out.println(e);
        }
    }//GEN-LAST:event_ButCadastrarActionPerformed

    private void ButConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButConsultarActionPerformed
        try{
            String info = controle.consultar(Long.parseLong(this.CpfCampo.getText()));
            String vetor[] = info.split(";");
            this.NomeCampo.setText(vetor[0]);
            this.NumContaCampo.setText(vetor[1]);
            this.ValEmContaCampo.setText(vetor[2]);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Digite somente numeros em (CPF, Numero de conta e valor em conta)");
            System.out.println(e);
        }
    }//GEN-LAST:event_ButConsultarActionPerformed

    private void ButExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButExcluirActionPerformed
        try{
            controle.excluir(Long.parseLong(this.CpfCampo.getText()));
            this.CpfCampo.setText("");
            this.NomeCampo.setText("");
            this.NumContaCampo.setText("");
            this.ValEmContaCampo.setText("");            
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Digite somente numeros em (CPF, Numero de conta e valor em conta)");
            System.out.println(e);
        }
    }//GEN-LAST:event_ButExcluirActionPerformed

    private void ButSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ButSairActionPerformed

    private void ButListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButListarActionPerformed
        controle.listar();
    }//GEN-LAST:event_ButListarActionPerformed

    private void LimparCampoButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparCampoButActionPerformed
        this.CpfCampo.setText("");
        this.NomeCampo.setText("");
        this.NumContaCampo.setText("");
        this.ValEmContaCampo.setText("");
        this.DepositoCamp.setText("");
        this.SaqueCampo.setText("");
    }//GEN-LAST:event_LimparCampoButActionPerformed

    private void ButDepositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButDepositarActionPerformed
        try{
            controle.depositar(Long.parseLong(this.CpfCampo.getText()), Double.parseDouble(this.DepositoCamp.getText()));
            this.CpfCampo.setText("");
            this.NomeCampo.setText("");
            this.NumContaCampo.setText("");
            this.ValEmContaCampo.setText("");
            this.DepositoCamp.setText("");
            this.SaqueCampo.setText("");            
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Digite somente o valor e certifique-se de preencher o CPF");
            System.out.println(e);
        }
    }//GEN-LAST:event_ButDepositarActionPerformed

    private void NumContaCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumContaCampoActionPerformed
        
    }//GEN-LAST:event_NumContaCampoActionPerformed

    private void ButSacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButSacarActionPerformed
        try{
            controle.sacar(Long.parseLong(this.CpfCampo.getText()), Double.parseDouble(this.SaqueCampo.getText()));
            this.CpfCampo.setText("");
            this.NomeCampo.setText("");
            this.NumContaCampo.setText("");
            this.ValEmContaCampo.setText("");
            this.DepositoCamp.setText("");
            this.SaqueCampo.setText("");            
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Digite somente o valor e certifique-se de preencher o CPF");
            System.out.println(e);
        }
    }//GEN-LAST:event_ButSacarActionPerformed

    private void ButCalcularEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButCalcularEmprestimoActionPerformed
        try{
            double[] teste = controle.calcEmprestimo(Long.parseLong(this.CpfCampo.getText()),
                                    Double.parseDouble(this.ValDoEmprestimoCampo.getText()),
                                    Integer.parseInt(this.DivMesesCampo.getText()));
            if(teste != null){
                this.ValParcelasCampo.setText(String.format("%.2f", teste[0]));
                this.ValTotalJurosCampo.setText(String.format("%.2f", teste[1]));
            }else{
                JOptionPane.showMessageDialog(null, "Erro");
            }            
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Digite somente os valores dos campos de emprestimo \nE certifique-se de preencher o CPF Corretamente!!");
            System.out.println(e);
        }
    }//GEN-LAST:event_ButCalcularEmprestimoActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(FormUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButCadastrar;
    private javax.swing.JButton ButCalcularEmprestimo;
    private javax.swing.JButton ButConsultar;
    private javax.swing.JButton ButDepositar;
    private javax.swing.JButton ButExcluir;
    private javax.swing.JButton ButListar;
    private javax.swing.JButton ButSacar;
    private javax.swing.JButton ButSair;
    private javax.swing.JLabel CPFTXT;
    private javax.swing.JTextField CpfCampo;
    private javax.swing.JTextField DepositoCamp;
    private javax.swing.JTextField DivMesesCampo;
    private javax.swing.JButton LimparCampoBut;
    private javax.swing.JButton LimparCamposEprestimo;
    private javax.swing.JTextField NomeCampo;
    private javax.swing.JLabel NomeTXT;
    private javax.swing.JTextField NumContaCampo;
    private javax.swing.JLabel NumContaTXT;
    private javax.swing.JTextField SaqueCampo;
    private javax.swing.JLabel TituloText;
    private javax.swing.JTextField ValDoEmprestimoCampo;
    private javax.swing.JTextField ValEmContaCampo;
    private javax.swing.JTextField ValParcelasCampo;
    private javax.swing.JTextField ValTotalJurosCampo;
    private javax.swing.JLabel ValorEmContaTXT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
