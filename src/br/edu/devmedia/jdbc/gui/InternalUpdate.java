/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.devmedia.jdbc.gui;

import br.edu.devmedia.jdbc.bo.PessoaBO;
import br.edu.devmedia.jdbc.dto.Pessoa;
import br.edu.devmedia.jdbc.util.MensagemUtil;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 *
 * @author Fábio
 */
public class InternalUpdate extends javax.swing.JInternalFrame {

    private DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
    private MainFrame frame;

    public InternalUpdate(MainFrame frame) {
        initComponents();
        this.frame = frame;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgSexo = new javax.swing.ButtonGroup();
        painelUpdate = new javax.swing.JPanel();
        lbNomeUpdate = new javax.swing.JLabel();
        txtNomeUpdate = new javax.swing.JTextField();
        lbCPFUpdate = new javax.swing.JLabel();
        txtCPFUpdate = new javax.swing.JTextField();
        lbEnderecoUpdate = new javax.swing.JLabel();
        txtEnderecoUpdate = new javax.swing.JTextField();
        lbSexoUpdate = new javax.swing.JLabel();
        rbMasculinoUpdate = new javax.swing.JRadioButton();
        rbFemininoUpdate = new javax.swing.JRadioButton();
        lbNascimentoUpdate = new javax.swing.JLabel();
        txtDataNascimentoUpdate = new javax.swing.JTextField();
        lbExemploDataUpdate = new javax.swing.JLabel();
        btOkUpdate = new javax.swing.JButton();
        btLimparUpdate = new javax.swing.JButton();
        lbIdUpdate = new javax.swing.JLabel();
        lbIdValorUpdate = new javax.swing.JLabel();

        painelUpdate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbNomeUpdate.setText("Nome:");

        lbCPFUpdate.setText("CPF:");

        lbEnderecoUpdate.setText("Endereço:");

        lbSexoUpdate.setText("Sexo");

        bgSexo.add(rbMasculinoUpdate);
        rbMasculinoUpdate.setText("Masculino");

        bgSexo.add(rbFemininoUpdate);
        rbFemininoUpdate.setText("Femino");

        lbNascimentoUpdate.setText("Data Nas.");

        lbExemploDataUpdate.setText("(DD/MM/YYYY)");

        btOkUpdate.setIcon(new javax.swing.ImageIcon("C:\\Users\\Fábio\\Documents\\NetBeansProjects\\Curso JDBC DevMedia\\img\\edit.png")); // NOI18N
        btOkUpdate.setText("Editar");
        btOkUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOkUpdateActionPerformed(evt);
            }
        });

        btLimparUpdate.setIcon(new javax.swing.ImageIcon("C:\\Users\\Fábio\\Documents\\NetBeansProjects\\Curso JDBC DevMedia\\img\\cancel.png")); // NOI18N
        btLimparUpdate.setText("Cancelar");

        lbIdUpdate.setText("ID:");

        javax.swing.GroupLayout painelUpdateLayout = new javax.swing.GroupLayout(painelUpdate);
        painelUpdate.setLayout(painelUpdateLayout);
        painelUpdateLayout.setHorizontalGroup(
            painelUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelUpdateLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelUpdateLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btOkUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btLimparUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelUpdateLayout.createSequentialGroup()
                        .addGroup(painelUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(painelUpdateLayout.createSequentialGroup()
                                .addComponent(lbNascimentoUpdate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtDataNascimentoUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbExemploDataUpdate))
                            .addGroup(painelUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(painelUpdateLayout.createSequentialGroup()
                                    .addComponent(lbCPFUpdate)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtCPFUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(painelUpdateLayout.createSequentialGroup()
                                    .addGroup(painelUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbEnderecoUpdate)
                                        .addComponent(lbSexoUpdate))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(painelUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(painelUpdateLayout.createSequentialGroup()
                                            .addComponent(rbMasculinoUpdate)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(rbFemininoUpdate))
                                        .addComponent(txtEnderecoUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(painelUpdateLayout.createSequentialGroup()
                                    .addGroup(painelUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbNomeUpdate)
                                        .addComponent(lbIdUpdate))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(painelUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbIdValorUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtNomeUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 62, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painelUpdateLayout.setVerticalGroup(
            painelUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelUpdateLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(painelUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbIdUpdate)
                    .addComponent(lbIdValorUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNomeUpdate)
                    .addComponent(txtNomeUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCPFUpdate)
                    .addComponent(txtCPFUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEnderecoUpdate)
                    .addComponent(txtEnderecoUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(painelUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSexoUpdate)
                    .addComponent(rbMasculinoUpdate)
                    .addComponent(rbFemininoUpdate))
                .addGap(2, 2, 2)
                .addGroup(painelUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNascimentoUpdate)
                    .addComponent(txtDataNascimentoUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbExemploDataUpdate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btLimparUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btOkUpdate))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btOkUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOkUpdateActionPerformed
        PessoaBO pessoaBO = new PessoaBO();
        try {

            String nome = txtNomeUpdate.getText();
            String cpf = txtCPFUpdate.getText();
            String endereco = txtEnderecoUpdate.getText();
            String dataNascimento = txtDataNascimentoUpdate.getText();

            pessoaBO.validaNome(nome);
            pessoaBO.validaCPF(cpf);
            pessoaBO.validaEndereco(endereco);
            pessoaBO.validaDataNascimento(dataNascimento);

            Pessoa pessoa = new Pessoa();
            pessoa.setId(Integer.parseInt(lbIdValorUpdate.getText()));
            pessoa.setNome(nome);
            pessoa.setCfp(Long.parseLong(cpf));
             pessoa.setEndereco(endereco);
            pessoa.setDtNascimento(formatador.parse(dataNascimento));
            pessoa.setSexo(rbMasculinoUpdate.isSelected() ? 'M' : 'F');

            
            pessoaBO.atualizar(pessoa);
            MensagemUtil.adMesg(InternalUpdate.this, "Edição efetuada com Sucesso !!");

            frame.getTable();
        } catch (Exception e) {
            MensagemUtil.adMesg(InternalUpdate.this, e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_btOkUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgSexo;
    protected javax.swing.JButton btLimparUpdate;
    protected javax.swing.JButton btOkUpdate;
    private javax.swing.JLabel lbCPFUpdate;
    private javax.swing.JLabel lbEnderecoUpdate;
    private javax.swing.JLabel lbExemploDataUpdate;
    private javax.swing.JLabel lbIdUpdate;
    protected javax.swing.JLabel lbIdValorUpdate;
    private javax.swing.JLabel lbNascimentoUpdate;
    private javax.swing.JLabel lbNomeUpdate;
    private javax.swing.JLabel lbSexoUpdate;
    private javax.swing.JPanel painelUpdate;
    protected javax.swing.JRadioButton rbFemininoUpdate;
    protected javax.swing.JRadioButton rbMasculinoUpdate;
    protected javax.swing.JTextField txtCPFUpdate;
    protected javax.swing.JTextField txtDataNascimentoUpdate;
    protected javax.swing.JTextField txtEnderecoUpdate;
    protected javax.swing.JTextField txtNomeUpdate;
    // End of variables declaration//GEN-END:variables
}
