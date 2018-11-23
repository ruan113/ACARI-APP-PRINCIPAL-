/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.principalController;
import javax.swing.JOptionPane;
import model.Materiais;

/**
 *
 * @author Bento
 */
public class fichaMaterialForm extends javax.swing.JFrame {

    principalController controllerPrincipal;
    Materiais material;
    principalView pv;
    
    /**
     * Creates new form cadastrarMaterialForm
     */
    public fichaMaterialForm(principalController pc, Materiais mat, principalView pv) {
        this.controllerPrincipal = pc;
        this.material = mat;
        this.pv = pv;
        initComponents();
        if (mat != null) {
            nomeTextField.setText(mat.getMaterialNome());
            tipoTextField.setText(mat.getTipoMaterial());
        }
        this.setLocationRelativeTo(null);
        this.setVisible(true);
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
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        nomeTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tipoTextField = new javax.swing.JTextField();
        confirmarMaterialButton = new javax.swing.JButton();
        cancelarButton = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ficha de Informações do Material");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nome*:");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Tipo*:");

        confirmarMaterialButton.setBackground(new java.awt.Color(1, 103, 204));
        confirmarMaterialButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        confirmarMaterialButton.setForeground(new java.awt.Color(51, 51, 51));
        confirmarMaterialButton.setText("Confirmar");
        confirmarMaterialButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarMaterialButtonActionPerformed(evt);
            }
        });

        cancelarButton.setBackground(new java.awt.Color(156, 36, 33));
        cancelarButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cancelarButton.setForeground(new java.awt.Color(51, 51, 51));
        cancelarButton.setText("Cancelar");
        cancelarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarButtonActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Os campos marcados com * são obrigatórios! ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomeTextField))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tipoTextField)))
                .addContainerGap())
            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(148, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(confirmarMaterialButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(140, 140, 140))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tipoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(confirmarMaterialButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancelarButton)
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

    private void cancelarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelarButtonActionPerformed

    private void confirmarMaterialButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarMaterialButtonActionPerformed
         //Garante que todos os campos necessarios foram preenchidos
        if (!nomeTextField.getText().equals("")
                && !tipoTextField.getText().equals("")) {
            if (material == null) {
                //Cadastra um novo associado
                controllerPrincipal.getControladorMateriais().adicionarMaterial(nomeTextField.getText(),
                        tipoTextField.getText());
            } else {
                //Edita um associado, enviando o antigo registro do mesmo e o novo registro para troca
                controllerPrincipal.getControladorMateriais().editarMaterial(material, new Materiais(nomeTextField.getText(),
                        tipoTextField.getText()));
            }

            if (material == null) {
                //Confirma cadastro
                JOptionPane.showMessageDialog(null, "Cadastro Concluido com Sucesso!");
            } else {
                //Confirma cadastro
                JOptionPane.showMessageDialog(null, "Edição Concluida com Sucesso!");
            }

            //Se for uma edição, o programa fecha a janela
            if (material == null) {
                //Pergunta se quer cadastrar mais um
                if (JOptionPane.showConfirmDialog(null, "Deseja cadastrar outro Material?") == JOptionPane.YES_OPTION) {
                    nomeTextField.setText("");
                    tipoTextField.setText("");
                } else {
                    this.dispose();//Fecha a tela caso não queira fazer mais nenhum cadastro
                }
            }else{
                this.dispose();//Fecha a tela caso não queira fazer mais nenhum cadastro
            }
        } else {
            //Mensagem de erro
            JOptionPane.showMessageDialog(null, "Preencha todos campos obrigatórios para concluir o cadastro!");
        }

        //Atualiza tabela na view principal
        pv.preencherTabela("Materiais", pv.getjTableMateriais());
    }//GEN-LAST:event_confirmarMaterialButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelarButton;
    private javax.swing.JButton confirmarMaterialButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField nomeTextField;
    private javax.swing.JTextField tipoTextField;
    // End of variables declaration//GEN-END:variables
}
