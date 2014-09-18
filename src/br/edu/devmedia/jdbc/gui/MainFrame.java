package br.edu.devmedia.jdbc.gui;

import br.edu.devmedia.jdbc.bo.PessoaBO;
import br.edu.devmedia.jdbc.dto.Pessoa;
import br.edu.devmedia.jdbc.exception.NegocioException;
import br.edu.devmedia.jdbc.util.MensagemUtil;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MainFrame extends javax.swing.JFrame {

    DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
    ButtonColumn buttonColummEdicao; 
    ButtonColumn buttonColummDelecao;
    private List<Integer> listaIds = new ArrayList();
    
    
    
    

        
        

    public MainFrame() {
        initComponents();
        rbMasculino.setSelected(true);
        rbMasculinoConsulta.setSelected(true);
        buttonColummEdicao = new ButtonColumn(tbListagem, actionEdicao, 6);
        buttonColummDelecao = new ButtonColumn(tbListagem, actionDelecao,7);
        
        //setando para efetuar deleção e edição por atalho de teclas
        buttonColummDelecao.setMnemonic(KeyEvent.VK_D);
        buttonColummDelecao.setMnemonic(KeyEvent.VK_E);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgSexo = new javax.swing.ButtonGroup();
        btgSexoConsulta = new javax.swing.ButtonGroup();
        btgOrdemConsulta = new javax.swing.ButtonGroup();
        jTabbedPane = new javax.swing.JTabbedPane();
        panelCadastro = new javax.swing.JPanel();
        lbNome = new javax.swing.JLabel();
        lbCPF = new javax.swing.JLabel();
        lbEndereco = new javax.swing.JLabel();
        lbSexo = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtCPF = new javax.swing.JTextField();
        txtDataNascimento = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        btOk = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        rbMasculino = new javax.swing.JRadioButton();
        rbFeminino = new javax.swing.JRadioButton();
        lbExemploData = new javax.swing.JLabel();
        panelListagem = new javax.swing.JPanel();
        ScrollListagem = new javax.swing.JScrollPane();
        tbListagem = new javax.swing.JTable();
        panelConsulta = new javax.swing.JPanel();
        lbNomeConsulta = new javax.swing.JLabel();
        txtNomeConsulta = new javax.swing.JTextField();
        lbCPFConsulta = new javax.swing.JLabel();
        txtCPFConsulta = new javax.swing.JTextField();
        lbSexoConsulta = new javax.swing.JLabel();
        rbMasculinoConsulta = new javax.swing.JRadioButton();
        rbFemininoConsulta = new javax.swing.JRadioButton();
        btPesquisar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        scrollConsulta = new javax.swing.JScrollPane();
        tbListagemConsulta = new javax.swing.JTable();
        lbOrdem = new javax.swing.JLabel();
        rbOdemNome = new javax.swing.JRadioButton();
        rbOrdemCpf = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MainFrame");
        setName("MainFrame"); // NOI18N
        setResizable(false);

        jTabbedPane.setName("painelCadastro"); // NOI18N

        lbNome.setText("Nome:");

        lbCPF.setText("CPF:");

        lbEndereco.setText("Endereço:");

        lbSexo.setText("Sexo");

        jLabel5.setText("Data Nas.");

        btOk.setIcon(new javax.swing.ImageIcon("C:\\workspace\\Curso JDBC DevMedia\\img\\save.png")); // NOI18N
        btOk.setText("Cadastrar");
        btOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOkActionPerformed(evt);
            }
        });

        btLimpar.setIcon(new javax.swing.ImageIcon("C:\\workspace\\Curso JDBC DevMedia\\img\\broompng.png")); // NOI18N
        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btgSexo.add(rbMasculino);
        rbMasculino.setText("Masculino");

        btgSexo.add(rbFeminino);
        rbFeminino.setText("Femino");

        lbExemploData.setText("(DD/MM/YYYY)");

        javax.swing.GroupLayout panelCadastroLayout = new javax.swing.GroupLayout(panelCadastro);
        panelCadastro.setLayout(panelCadastroLayout);
        panelCadastroLayout.setHorizontalGroup(
            panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCadastroLayout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCadastroLayout.createSequentialGroup()
                        .addComponent(lbNome)
                        .addGap(5, 5, 5)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCadastroLayout.createSequentialGroup()
                        .addComponent(lbCPF)
                        .addGap(16, 16, 16)
                        .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCadastroLayout.createSequentialGroup()
                        .addComponent(lbEndereco)
                        .addGap(5, 5, 5)
                        .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCadastroLayout.createSequentialGroup()
                        .addComponent(lbSexo)
                        .addGap(35, 35, 35)
                        .addComponent(rbMasculino)
                        .addGap(37, 37, 37)
                        .addComponent(rbFeminino))
                    .addGroup(panelCadastroLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbExemploData)))
                .addGap(77, 77, 77))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btOk)
                .addGap(18, 18, 18)
                .addComponent(btLimpar)
                .addContainerGap())
        );
        panelCadastroLayout.setVerticalGroup(
            panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCadastroLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCadastroLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lbNome))
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCadastroLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lbCPF))
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbEndereco)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbSexo)
                    .addComponent(rbMasculino)
                    .addComponent(rbFeminino))
                .addGap(9, 9, 9)
                .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCadastroLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel5))
                    .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbExemploData)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btOk)
                    .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55))
        );

        lbExemploData.getAccessibleContext().setAccessibleName("");

        jTabbedPane.addTab("Cadastro", null, panelCadastro, "Cadastro de Clientes");

        PessoaBO pessoaBo = new PessoaBO();
        try{
            String [][] listagem = pessoaBo.listar(listaIds);
            tbListagem.setModel(new javax.swing.table.DefaultTableModel(
                listagem,
                new String [] {
                    "ID","Nome", "CPF", "Endereço", "Sexo", "Data Nascimento","",""
                }
            ));
        }catch(Exception e){
            e.printStackTrace();
            MensagemUtil.adMesg(MainFrame.this, e.getMessage());
        }
        ScrollListagem.setViewportView(tbListagem);

        javax.swing.GroupLayout panelListagemLayout = new javax.swing.GroupLayout(panelListagem);
        panelListagem.setLayout(panelListagemLayout);
        panelListagemLayout.setHorizontalGroup(
            panelListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelListagemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ScrollListagem, javax.swing.GroupLayout.DEFAULT_SIZE, 623, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelListagemLayout.setVerticalGroup(
            panelListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListagemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ScrollListagem, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane.addTab("Listagem", null, panelListagem, "Listagem de  Clientes");
        panelListagem.getAccessibleContext().setAccessibleName("");

        lbNomeConsulta.setText("Nome:");

        lbCPFConsulta.setText("CPF:");

        lbSexoConsulta.setText("Sexo:");

        btgSexoConsulta.add(rbMasculinoConsulta);
        rbMasculinoConsulta.setText("Masculino");

        btgSexoConsulta.add(rbFemininoConsulta);
        rbFemininoConsulta.setText("Femino");

        btPesquisar.setIcon(new javax.swing.ImageIcon("C:\\workspace\\Curso JDBC DevMedia\\img\\search.png")); // NOI18N
        btPesquisar.setText("Pesquisar");
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Listagem", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 13), new java.awt.Color(51, 0, 204))); // NOI18N

        scrollConsulta.setViewportView(tbListagemConsulta);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(scrollConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                .addContainerGap())
        );

        lbOrdem.setText("Ordem:");

        btgOrdemConsulta.add(rbOdemNome);
        rbOdemNome.setText("Nome");

        btgOrdemConsulta.add(rbOrdemCpf);
        rbOrdemCpf.setText("CPF");

        javax.swing.GroupLayout panelConsultaLayout = new javax.swing.GroupLayout(panelConsulta);
        panelConsulta.setLayout(panelConsultaLayout);
        panelConsultaLayout.setHorizontalGroup(
            panelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConsultaLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(panelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelConsultaLayout.createSequentialGroup()
                            .addComponent(lbNomeConsulta)
                            .addGap(5, 5, 5)
                            .addComponent(txtNomeConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelConsultaLayout.createSequentialGroup()
                            .addComponent(lbCPFConsulta)
                            .addGap(16, 16, 16)
                            .addComponent(txtCPFConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelConsultaLayout.createSequentialGroup()
                        .addGroup(panelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelConsultaLayout.createSequentialGroup()
                                .addComponent(lbSexoConsulta)
                                .addGap(12, 12, 12)
                                .addComponent(rbMasculinoConsulta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbFemininoConsulta))
                            .addGroup(panelConsultaLayout.createSequentialGroup()
                                .addComponent(lbOrdem)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbOdemNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbOrdemCpf)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btPesquisar)))
                .addContainerGap(286, Short.MAX_VALUE))
            .addGroup(panelConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelConsultaLayout.setVerticalGroup(
            panelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelConsultaLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lbNomeConsulta))
                    .addComponent(txtNomeConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(panelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelConsultaLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lbCPFConsulta))
                    .addComponent(txtCPFConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelConsultaLayout.createSequentialGroup()
                        .addGroup(panelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbFemininoConsulta)
                            .addComponent(lbSexoConsulta)
                            .addComponent(rbMasculinoConsulta))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbOrdem)
                            .addComponent(rbOdemNome)
                            .addComponent(rbOrdemCpf))
                        .addGap(0, 7, Short.MAX_VALUE))
                    .addComponent(btPesquisar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane.addTab("Consulta", panelConsulta);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(694, 465));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOkActionPerformed
        Pessoa pessoa = new Pessoa();
        PessoaBO pessoaBO = new PessoaBO();
        try {
            String nome = txtNome.getText();
            String cpf = txtCPF.getText();
            String endereco = txtEndereco.getText();
            String dataNascimento = txtDataNascimento.getText();

            pessoaBO.validaNome(nome);
            pessoaBO.validaCPF(cpf);
            pessoaBO.validaEndereco(endereco);
            pessoaBO.validaDataNascimento(dataNascimento);

            pessoa.setNome(nome);
            pessoa.setCfp(Long.parseLong(cpf));
            pessoa.setEndereco(endereco);

            pessoa.setDtNascimento(formatador.parse(dataNascimento));

            char sexo = rbMasculino.isSelected() ? 'M' : 'F';
            pessoa.setSexo(sexo);

            MensagemUtil.adMesg(MainFrame.this, "Cadastro Efetuado com Sucesso!!!");
            pessoaBO.Cadastrar(pessoa);
            MainFrame.this.dispose();
            MainFrame.this.main(null);
        } catch (Exception e) {
            MensagemUtil.adMesg(MainFrame.this, e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_btOkActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        try {
            String nome = txtNomeConsulta.getText();
            Long cpf = txtCPFConsulta.getText().equals("") ? null : Long.parseLong(txtCPFConsulta.getText());
            char sexo = rbMasculinoConsulta.isSelected() ? 'M' : 'F';
            String ordem  = rbOdemNome.isSelected() ? "NOME" : "CPF";
            
            PessoaBO pessoaBO = new PessoaBO();
            String[][] listagemConsulta = pessoaBO.listaConsulta(nome, cpf, sexo, ordem);
            
            
            
            
            tbListagemConsulta.setModel(new javax.swing.table.DefaultTableModel(
                   listagemConsulta,
                    new String[]{
                        "ID", "Nome", "CPF", "Endereço", "Sexo", "Data Nascimento"
                    }));
        } catch (Exception e) {
            MensagemUtil.adMesg(MainFrame.this, e.getMessage());
            e.printStackTrace();
        }
        
        
        
    }//GEN-LAST:event_btPesquisarActionPerformed

    public void limpar() {
        txtNome.setText("");
        txtCPF.setText("");
        txtEndereco.setText("");
        txtDataNascimento.setText("");
        rbMasculino.setSelected(true);
    }
     Action actionEdicao = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int linha = Integer.parseInt(actionEvent.getActionCommand());
                JOptionPane.showMessageDialog(MainFrame.this, linha);
            }
        };

 
    Action actionDelecao = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                
                int linha = Integer.parseInt(actionEvent.getActionCommand());
                
                int confirmacao = JOptionPane.showConfirmDialog(MainFrame.this, "Deseja Realmente remover esta pessoa? ","Remoção de Pessoa" ,JOptionPane.OK_CANCEL_OPTION);
               
                if (confirmacao == 0) {
                    JTable tabela = (JTable) actionEvent.getSource();
                    ((DefaultTableModel)tabela.getModel()).removeRow(linha);   
                    try {
                        new PessoaBO().deletarPessoa(listaIds.get(linha));
                        listaIds.remove(linha);
                        MensagemUtil.adMesg(MainFrame.this, "Pessoa Removida com sucesso!!!");
                    } catch (NegocioException e) {
                        MensagemUtil.adMesg(MainFrame.this, e.getMessage());
                    }
                    
                }
                
                
            }
        };
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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ScrollListagem;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btOk;
    private javax.swing.JButton btPesquisar;
    private javax.swing.ButtonGroup btgOrdemConsulta;
    private javax.swing.ButtonGroup btgSexo;
    private javax.swing.ButtonGroup btgSexoConsulta;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTabbedPane jTabbedPane;
    private javax.swing.JLabel lbCPF;
    private javax.swing.JLabel lbCPFConsulta;
    private javax.swing.JLabel lbEndereco;
    private javax.swing.JLabel lbExemploData;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbNomeConsulta;
    private javax.swing.JLabel lbOrdem;
    private javax.swing.JLabel lbSexo;
    private javax.swing.JLabel lbSexoConsulta;
    private javax.swing.JPanel panelCadastro;
    private javax.swing.JPanel panelConsulta;
    private javax.swing.JPanel panelListagem;
    private javax.swing.JRadioButton rbFeminino;
    private javax.swing.JRadioButton rbFemininoConsulta;
    private javax.swing.JRadioButton rbMasculino;
    private javax.swing.JRadioButton rbMasculinoConsulta;
    private javax.swing.JRadioButton rbOdemNome;
    private javax.swing.JRadioButton rbOrdemCpf;
    private javax.swing.JScrollPane scrollConsulta;
    private javax.swing.JTable tbListagem;
    private javax.swing.JTable tbListagemConsulta;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtCPFConsulta;
    private javax.swing.JTextField txtDataNascimento;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNomeConsulta;
    // End of variables declaration//GEN-END:variables
}
