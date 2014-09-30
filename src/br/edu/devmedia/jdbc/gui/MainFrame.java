package br.edu.devmedia.jdbc.gui;

import br.edu.devmedia.jdbc.bo.PessoaBO;
import br.edu.devmedia.jdbc.bo.UfBO;
import br.edu.devmedia.jdbc.dto.Endereco;
import br.edu.devmedia.jdbc.dto.Pessoa;
import br.edu.devmedia.jdbc.dto.Uf;
import br.edu.devmedia.jdbc.exception.NegocioException;
import br.edu.devmedia.jdbc.util.MensagemUtil;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MainFrame extends javax.swing.JFrame {

    private DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
    private ButtonColumn buttonColummEdicao;
    private ButtonColumn buttonColummDelecao;
    private List<Integer> listaIds = new ArrayList();
    private InternalUpdate internalUpdate;

    public MainFrame() {
        initComponents();
        rbMasculino.setSelected(true);
        rbMasculinoConsulta.setSelected(true);
        buttonColummEdicao = new ButtonColumn(tbListagem, actionEdicao, 8);
        buttonColummDelecao = new ButtonColumn(tbListagem, actionDelecao, 9);

        //setando para efetuar deleção e edição por atalho de teclas
        buttonColummDelecao.setMnemonic(KeyEvent.VK_D);
        buttonColummDelecao.setMnemonic(KeyEvent.VK_E);
        btnDeleteAll.setMnemonic(KeyEvent.VK_D);

        panelInternalFrame.add(getInternalUpdate());
        internalUpdate.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgSexo = new javax.swing.ButtonGroup();
        btgSexoConsulta = new javax.swing.ButtonGroup();
        btgOrdemConsulta = new javax.swing.ButtonGroup();
        jTabbedPane = new javax.swing.JTabbedPane();
        panelCadastro = new javax.swing.JPanel();
        btOk = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        panelCadastroPrincipal = new javax.swing.JPanel();
        lbNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lbCPF = new javax.swing.JLabel();
        txtCPF = new javax.swing.JTextField();
        lbSexo = new javax.swing.JLabel();
        rbMasculino = new javax.swing.JRadioButton();
        rbFeminino = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        txtDataNascimento = new javax.swing.JTextField();
        lbExemploData = new javax.swing.JLabel();
        panelEndereco = new javax.swing.JPanel();
        lbLogradouro = new javax.swing.JLabel();
        txtLogradouro = new javax.swing.JTextField();
        lbNumero = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        lbBairro = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        lbCidade = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        lbCep = new javax.swing.JLabel();
        txtCep = new javax.swing.JTextField();
        lbUf = new javax.swing.JLabel();
        try{
            cbUf = new javax.swing.JComboBox();
            panelListagem = new javax.swing.JPanel();
            ScrollListagem = new javax.swing.JScrollPane();
            tbListagem = new javax.swing.JTable();
            btnDeleteAll = new javax.swing.JButton();
            panelInternalFrame = new javax.swing.JPanel();
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

            jTabbedPane.setToolTipText("");
            jTabbedPane.setName("painelCadastro"); // NOI18N

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

            panelCadastroPrincipal.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro Principal"));

            lbNome.setText("Nome:");

            lbCPF.setText("CPF:");

            lbSexo.setText("Sexo");

            btgSexo.add(rbMasculino);
            rbMasculino.setText("Masculino");

            btgSexo.add(rbFeminino);
            rbFeminino.setText("Femino");

            jLabel5.setText("Data Nas.");

            lbExemploData.setText("(DD/MM/YYYY)");

            javax.swing.GroupLayout panelCadastroPrincipalLayout = new javax.swing.GroupLayout(panelCadastroPrincipal);
            panelCadastroPrincipal.setLayout(panelCadastroPrincipalLayout);
            panelCadastroPrincipalLayout.setHorizontalGroup(
                panelCadastroPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelCadastroPrincipalLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(panelCadastroPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelCadastroPrincipalLayout.createSequentialGroup()
                            .addComponent(lbSexo)
                            .addGap(35, 35, 35)
                            .addComponent(rbMasculino)
                            .addGap(37, 37, 37)
                            .addComponent(rbFeminino))
                        .addGroup(panelCadastroPrincipalLayout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lbExemploData))
                        .addGroup(panelCadastroPrincipalLayout.createSequentialGroup()
                            .addComponent(lbNome)
                            .addGap(5, 5, 5)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelCadastroPrincipalLayout.createSequentialGroup()
                            .addComponent(lbCPF)
                            .addGap(16, 16, 16)
                            .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(108, Short.MAX_VALUE))
            );
            panelCadastroPrincipalLayout.setVerticalGroup(
                panelCadastroPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelCadastroPrincipalLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(panelCadastroPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelCadastroPrincipalLayout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addComponent(lbNome))
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(panelCadastroPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelCadastroPrincipalLayout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addComponent(lbCPF))
                        .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCadastroPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelCadastroPrincipalLayout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addComponent(jLabel5))
                        .addGroup(panelCadastroPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbExemploData)))
                    .addGap(18, 18, 18)
                    .addGroup(panelCadastroPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbSexo)
                        .addComponent(rbMasculino)
                        .addComponent(rbFeminino))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );

            lbExemploData.getAccessibleContext().setAccessibleName("");

            panelEndereco.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro Endereço"));

            lbLogradouro.setText("Logradouro:");

            lbNumero.setText("Nº:.");

            lbBairro.setText("Bairro:");

            lbCidade.setText("Cidade:");

            lbCep.setText("CEP:");

            lbUf.setText("UF:");

            UfBO ufBO = new UfBO();
            cbUf.setModel(new javax.swing.DefaultComboBoxModel(converEstados(ufBO.listaEstados())));
        } catch (Exception e) {
            MensagemUtil.adMesg(MainFrame.this, e.getMessage());
            e.printStackTrace();
        }

        javax.swing.GroupLayout panelEnderecoLayout = new javax.swing.GroupLayout(panelEndereco);
        panelEndereco.setLayout(panelEnderecoLayout);
        panelEnderecoLayout.setHorizontalGroup(
            panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEnderecoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEnderecoLayout.createSequentialGroup()
                        .addComponent(lbLogradouro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbNumero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelEnderecoLayout.createSequentialGroup()
                        .addGroup(panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbBairro)
                            .addComponent(lbCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbCep, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbUf, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cbUf, 0, 186, Short.MAX_VALUE)
                            .addComponent(txtCep, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                            .addComponent(txtCidade, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBairro, javax.swing.GroupLayout.Alignment.LEADING))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        panelEnderecoLayout.setVerticalGroup(
            panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEnderecoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEnderecoLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lbLogradouro))
                    .addGroup(panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbNumero)
                        .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbBairro)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCidade)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCep))
                .addGap(18, 18, 18)
                .addGroup(panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbUf)
                    .addComponent(cbUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelCadastroLayout = new javax.swing.GroupLayout(panelCadastro);
        panelCadastro.setLayout(panelCadastroLayout);
        panelCadastroLayout.setHorizontalGroup(
            panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelCadastroLayout.createSequentialGroup()
                        .addComponent(btOk)
                        .addGap(18, 18, 18)
                        .addComponent(btLimpar))
                    .addGroup(panelCadastroLayout.createSequentialGroup()
                        .addComponent(panelCadastroPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelCadastroLayout.setVerticalGroup(
            panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCadastroLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelCadastroPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 198, Short.MAX_VALUE)
                .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btOk)
                    .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane.addTab("Cadastro", null, panelCadastro, "Cadastro de Clientes");

        PessoaBO pessoaBo = new PessoaBO();
        try{
            String [][] listagem = pessoaBo.listar(listaIds);
            tbListagem.setModel(new javax.swing.table.DefaultTableModel(
                listagem,
                new String [] {
                    "ID","Nome", "CPF", "Sexo", "Data Nascimento","Logradouro", "CEP", "UF","",""
                }
            ));
        }catch(Exception e){
            e.printStackTrace();
            MensagemUtil.adMesg(MainFrame.this, e.getMessage());
        }
        ScrollListagem.setViewportView(tbListagem);

        btnDeleteAll.setIcon(new javax.swing.ImageIcon("C:\\Users\\Fábio\\Documents\\NetBeansProjects\\Curso JDBC DevMedia\\img\\delete-all.png")); // NOI18N
        btnDeleteAll.setText("Deletar Tudo");
        btnDeleteAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteAllActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelInternalFrameLayout = new javax.swing.GroupLayout(panelInternalFrame);
        panelInternalFrame.setLayout(panelInternalFrameLayout);
        panelInternalFrameLayout.setHorizontalGroup(
            panelInternalFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelInternalFrameLayout.setVerticalGroup(
            panelInternalFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 305, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelListagemLayout = new javax.swing.GroupLayout(panelListagem);
        panelListagem.setLayout(panelListagemLayout);
        panelListagemLayout.setHorizontalGroup(
            panelListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelListagemLayout.createSequentialGroup()
                .addGroup(panelListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelListagemLayout.createSequentialGroup()
                        .addGap(0, 777, Short.MAX_VALUE)
                        .addComponent(btnDeleteAll))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelListagemLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelInternalFrame, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ScrollListagem))))
                .addContainerGap())
        );
        panelListagemLayout.setVerticalGroup(
            panelListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListagemLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(ScrollListagem, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDeleteAll)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelInternalFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
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
                .addComponent(scrollConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, 864, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(scrollConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
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
                        .addGap(118, 118, 118)))
                .addGap(18, 18, 18)
                .addComponent(btPesquisar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelConsultaLayout.setVerticalGroup(
            panelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelConsultaLayout.createSequentialGroup()
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
                            .addComponent(txtCPFConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbFemininoConsulta)
                    .addComponent(lbSexoConsulta)
                    .addComponent(rbMasculinoConsulta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbOrdem)
                    .addComponent(rbOdemNome)
                    .addComponent(rbOrdemCpf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        jTabbedPane.addTab("Consulta", panelConsulta);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(288, 288, 288))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane))
        );

        setSize(new java.awt.Dimension(1000, 603));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOkActionPerformed
        Endereco endereco = new Endereco();
        Pessoa pessoa = new Pessoa();
        PessoaBO pessoaBO = new PessoaBO();
        Uf uf = new Uf();
        try {
            uf.setIdUf(cbUf.getSelectedIndex() + 1); 

            String nome = txtNome.getText();
            String cpf = txtCPF.getText();

            String dataNascimento = txtDataNascimento.getText();

            pessoaBO.validaNome(nome);
            pessoaBO.validaCPF(cpf);
            pessoaBO.validaDataNascimento(dataNascimento);

            pessoa.setNome(nome);
            pessoa.setCfp(Long.parseLong(cpf));
            pessoa.setDtNascimento(formatador.parse(dataNascimento));
            pessoa.setSexo(rbMasculino.isSelected() ? 'M' : 'F');

            endereco.setLogradouro(txtLogradouro.getText());
            endereco.setBairro(txtBairro.getText());
            endereco.setCidade(txtCidade.getText());
            endereco.setNumero(Long.parseLong(txtNumero.getText()));
            endereco.setCep(Integer.parseInt(txtCep.getText()));
            endereco.setUf(uf);
            
            pessoaBO.validaEndereco(endereco);
            pessoa.setEnderecoDTO(endereco);
            
            pessoaBO.Cadastrar(pessoa);
            MensagemUtil.adMesg(MainFrame.this, "Cadastro Efetuado com Sucesso!!!");
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
            String ordem = rbOdemNome.isSelected() ? "NOME" : "CPF";

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

    private void btnDeleteAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteAllActionPerformed
        PessoaBO pessoaBO = new PessoaBO();
        try {
            int confirmacao = JOptionPane.showConfirmDialog(MainFrame.this, "Deseja Realmente remover TODAS as pessoas? ", "Remoção de Pessoa", JOptionPane.OK_CANCEL_OPTION);

            if (confirmacao == 0) {
                pessoaBO.removeAll();
                MensagemUtil.adMesg(MainFrame.this, "Pessoas Removidas com Sucesso!!!");

                //carregando novamente a tabela ficou um codigo extenso e repetitivo
                PessoaBO pessoaBo = new PessoaBO();
                try {
                    String[][] listagem = pessoaBo.listar(listaIds);
                    tbListagem.setModel(new javax.swing.table.DefaultTableModel(
                            listagem,
                            new String[]{
                                "ID","Nome", "CPF", "Sexo", "Data Nascimento","Logradouro", "CEP", "UF","",""
                            }
                    ));
                } catch (Exception e) {
                    e.printStackTrace();
                    MensagemUtil.adMesg(MainFrame.this, e.getMessage());
                }

            }
        } catch (NegocioException e) {
            MensagemUtil.adMesg(MainFrame.this, e.getMessage());
            e.printStackTrace();
        }

    }//GEN-LAST:event_btnDeleteAllActionPerformed

    public void limpar() {
        txtNome.setText("");
        txtCPF.setText("");

        txtDataNascimento.setText("");
        rbMasculino.setSelected(true);
    }
    Action actionEdicao = new AbstractAction() {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            int linha = Integer.parseInt(actionEvent.getActionCommand());
            try {
                PessoaBO pessoaBO = new PessoaBO();
                Pessoa pessoa = pessoaBO.buscaPorId(listaIds.get(linha));
                populaInternalFrame(pessoa);
            } catch (NegocioException e) {
                MensagemUtil.adMesg(MainFrame.this, e.getMessage());
            }
        }
    };

    Action actionDelecao = new AbstractAction() {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {

            int linha = Integer.parseInt(actionEvent.getActionCommand());

            int confirmacao = JOptionPane.showConfirmDialog(MainFrame.this, "Deseja Realmente remover esta pessoa? ", "Remoção de Pessoa", JOptionPane.OK_CANCEL_OPTION);

            if (confirmacao == 0) {
                JTable tabela = (JTable) actionEvent.getSource();
                ((DefaultTableModel) tabela.getModel()).removeRow(linha);
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

    private void populaInternalFrame(Pessoa pessoa) {
        internalUpdate.lbIdValorUpdate.setText(pessoa.getId().toString());
        internalUpdate.txtNomeUpdate.setText(pessoa.getNome());
        internalUpdate.txtCPFUpdate.setText(pessoa.getCfp().toString());
       // internalUpdate.txtEnderecoUpdate.setText(pessoa.getEndereco());
        internalUpdate.txtDataNascimentoUpdate.setText(formatador.format(pessoa.getDtNascimento()));
        if (pessoa.getSexo() == 'M') {
            internalUpdate.rbMasculinoUpdate.setSelected(true);
        } else {
            internalUpdate.rbFemininoUpdate.setSelected(true);
        }
        internalUpdate.setVisible(true);

    }

    private JInternalFrame getInternalUpdate() {
        internalUpdate = new InternalUpdate(this);
        internalUpdate.setVisible(true);
        return internalUpdate;
    }

    public void getTable() {
        try {
            PessoaBO pessoaBO = new PessoaBO();
            String[][] listagem = pessoaBO.listar(listaIds);
            this.tbListagem.setModel(new javax.swing.table.DefaultTableModel(
                    listagem,
                    new String[]{
                        "ID","Nome", "CPF", "Sexo", "Data Nascimento","Logradouro", "CEP", "UF","",""
                    }
            ));
        } catch (Exception e) {
            e.printStackTrace();
            MensagemUtil.adMesg(MainFrame.this, e.getMessage());
        }
    }
    
    private String[] converEstados(List<Uf> estados){
        String[] vetorEstados = new String[estados.size()];
        for (int i = 0; i < estados.size(); i++) {
            Uf uf = estados.get(i);
            vetorEstados[i] = uf.getDescricao();
        }
 
         return vetorEstados;   
    }

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
    private javax.swing.JButton btnDeleteAll;
    private javax.swing.JComboBox cbUf;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTabbedPane jTabbedPane;
    private javax.swing.JLabel lbBairro;
    private javax.swing.JLabel lbCPF;
    private javax.swing.JLabel lbCPFConsulta;
    private javax.swing.JLabel lbCep;
    private javax.swing.JLabel lbCidade;
    private javax.swing.JLabel lbExemploData;
    private javax.swing.JLabel lbLogradouro;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbNomeConsulta;
    private javax.swing.JLabel lbNumero;
    private javax.swing.JLabel lbOrdem;
    private javax.swing.JLabel lbSexo;
    private javax.swing.JLabel lbSexoConsulta;
    private javax.swing.JLabel lbUf;
    private javax.swing.JPanel panelCadastro;
    private javax.swing.JPanel panelCadastroPrincipal;
    private javax.swing.JPanel panelConsulta;
    private javax.swing.JPanel panelEndereco;
    private javax.swing.JPanel panelInternalFrame;
    private javax.swing.JPanel panelListagem;
    private javax.swing.JRadioButton rbFeminino;
    private javax.swing.JRadioButton rbFemininoConsulta;
    private javax.swing.JRadioButton rbMasculino;
    private javax.swing.JRadioButton rbMasculinoConsulta;
    private javax.swing.JRadioButton rbOdemNome;
    private javax.swing.JRadioButton rbOrdemCpf;
    private javax.swing.JScrollPane scrollConsulta;
    protected javax.swing.JTable tbListagem;
    private javax.swing.JTable tbListagemConsulta;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtCPFConsulta;
    private javax.swing.JTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtDataNascimento;
    private javax.swing.JTextField txtLogradouro;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNomeConsulta;
    private javax.swing.JTextField txtNumero;
    // End of variables declaration//GEN-END:variables
}
