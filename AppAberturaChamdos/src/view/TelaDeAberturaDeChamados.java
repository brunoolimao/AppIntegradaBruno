/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package view;

import javax.swing.JOptionPane;

/**
 *
 * @author diegu
 */
public class TelaDeAberturaDeChamados extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaDeAberturaDeChamados1
     */
    public TelaDeAberturaDeChamados() {
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

        txtSenhaChamado = new javax.swing.JPasswordField();
        txtDescriçãoChamado = new javax.swing.JTextField();
        BtnEfetuarChamado = new javax.swing.JButton();
        txtNomeChamado = new javax.swing.JTextField();
        txtEndereçoChamado = new javax.swing.JTextField();
        txtAssuntoChamado = new javax.swing.JTextField();
        txtTelefoneChamado = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setTitle("Tela de Abertura de Chamados");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtSenhaChamado.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(txtSenhaChamado, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 510, 260, 40));

        txtDescriçãoChamado.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        txtDescriçãoChamado.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(txtDescriçãoChamado, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 490, 60));

        BtnEfetuarChamado.setBackground(new java.awt.Color(102, 153, 255));
        BtnEfetuarChamado.setFont(new java.awt.Font("Gill Sans MT", 0, 36)); // NOI18N
        BtnEfetuarChamado.setForeground(new java.awt.Color(255, 255, 255));
        BtnEfetuarChamado.setBorder(null);
        BtnEfetuarChamado.setContentAreaFilled(false);
        BtnEfetuarChamado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnEfetuarChamado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEfetuarChamadoActionPerformed(evt);
            }
        });
        getContentPane().add(BtnEfetuarChamado, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 520, 240, 70));

        txtNomeChamado.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        txtNomeChamado.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(txtNomeChamado, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 490, 30));

        txtEndereçoChamado.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        txtEndereçoChamado.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(txtEndereçoChamado, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 450, 490, 30));

        txtAssuntoChamado.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        txtAssuntoChamado.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(txtAssuntoChamado, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 490, 30));

        txtTelefoneChamado.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        txtTelefoneChamado.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(txtTelefoneChamado, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 490, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/TelaDoChamado_1.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public boolean checkLogin(String login, String senha){
        return login.equals("Diego") && senha.equals("123");
    }
    
    public boolean checkLogin1(String login, String senha){
        return login.equals("Carol") && senha.equals("123");
    }
    
    public boolean checkLogin2(String login, String senha){
        return login.equals("Leonardo") && senha.equals("123");
    }
    
    public boolean checkLogin3(String login, String senha){
        return login.equals("Arthur") && senha.equals("123");
    }
    
    public boolean checkLogin4(String login, String senha){
        return login.equals("Vinicius") && senha.equals("123");
    }
    
    public boolean checkLogin5(String login, String senha){
        return login.equals("Bruno") && senha.equals("123");
    }
    
    public boolean checkLogin6(String login, String senha){
        return login.equals("Gustavo") && senha.equals("123");
    }
    
    private void BtnEfetuarChamadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEfetuarChamadoActionPerformed
        boolean senhaContaChamado = false;
        
        if(this.checkLogin(txtNomeChamado.getText(), new String(txtSenhaChamado.getPassword()))){
            JOptionPane.showMessageDialog(null, "Chamado Efetuado com sucesso, aguarde atualizações no email de Cadastro!");
            this.setVisible(false);
            senhaContaChamado = true;

        }else if((this.checkLogin1(txtNomeChamado.getText(), new String(txtSenhaChamado.getPassword())))){
            JOptionPane.showMessageDialog(null, "Chamado Efetuado com sucesso, aguarde atualizações no email de Cadastro!");
            this.setVisible(false);

        }else if((this.checkLogin2(txtNomeChamado.getText(), new String(txtSenhaChamado.getPassword())))){
            JOptionPane.showMessageDialog(null, "Chamado Efetuado com sucesso, aguarde atualizações no email de Cadastro!");
            this.setVisible(false);

        }else if((this.checkLogin3(txtNomeChamado.getText(), new String(txtSenhaChamado.getPassword())))){
            JOptionPane.showMessageDialog(null, "Chamado Efetuado com sucesso, aguarde atualizações no email de Cadastro!");
            this.setVisible(false);

        }else if((this.checkLogin4(txtNomeChamado.getText(), new String(txtSenhaChamado.getPassword())))){
            JOptionPane.showMessageDialog(null, "Chamado Efetuado com sucesso, aguarde atualizações no email de Cadastro!");
            this.setVisible(false);

        }else if((this.checkLogin5(txtNomeChamado.getText(), new String(txtSenhaChamado.getPassword())))){
            JOptionPane.showMessageDialog(null, "Chamado Efetuado com sucesso, aguarde atualizações no email de Cadastro!");
            this.setVisible(false);

        }else if((this.checkLogin6(txtNomeChamado.getText(), new String(txtSenhaChamado.getPassword())))){
            JOptionPane.showMessageDialog(null, "Chamado Efetuado com sucesso, aguarde atualizações no email de Cadastro!");
            this.setVisible(false);

        }else{
            JOptionPane.showMessageDialog(null, "Senha ou Usuário incorreta.");
        }
    }//GEN-LAST:event_BtnEfetuarChamadoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnEfetuarChamado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtAssuntoChamado;
    private javax.swing.JTextField txtDescriçãoChamado;
    private javax.swing.JTextField txtEndereçoChamado;
    private javax.swing.JTextField txtNomeChamado;
    private javax.swing.JPasswordField txtSenhaChamado;
    private javax.swing.JTextField txtTelefoneChamado;
    // End of variables declaration//GEN-END:variables
}
