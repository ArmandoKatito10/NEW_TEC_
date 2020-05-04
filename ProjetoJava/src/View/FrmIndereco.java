/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package View;

import Classes.Funcionarios;
import Classes.Indereco;
import Controller_Class_Entidades_Erp.Middle_BD_Funcionario;
import Controller_Class_Entidades_Erp.Middle_BD_Indereco;
import MysqlConectClasses.MyConectBD;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Armando Katito
 */
public class FrmIndereco extends javax.swing.JFrame {

    /**
     * Creates new form FrmIndereco
     */
    public FrmIndereco() {
        initComponents();
        this.setLocationRelativeTo(null);
        Adicionar();
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
        BtnNovo = new javax.swing.JButton();
        BtnUpdate = new javax.swing.JButton();
        BtnApagar = new javax.swing.JButton();
        BtnSalvar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        TxtProvincia = new javax.swing.JTextField();
        TxtBairro = new javax.swing.JTextField();
        TxtPais = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TxtMunicipio = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Jtable_Indereco = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        sair = new javax.swing.JLabel();
        minimizar = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 102), null));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnNovo.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        BtnNovo.setText("NOVO");
        BtnNovo.setBorder(null);
        jPanel1.add(BtnNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, -1));

        BtnUpdate.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        BtnUpdate.setText("ACTUALIZAR");
        BtnUpdate.setBorder(null);
        jPanel1.add(BtnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, -1, -1));

        BtnApagar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        BtnApagar.setText("APAGAR");
        BtnApagar.setBorder(null);
        jPanel1.add(BtnApagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, -1, -1));

        BtnSalvar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        BtnSalvar.setText("SALVAR");
        BtnSalvar.setBorder(null);
        BtnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalvarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel3.setText("BAIRRO");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 60, 20));

        TxtProvincia.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        TxtProvincia.setForeground(new java.awt.Color(102, 102, 102));
        TxtProvincia.setText("Província");
        TxtProvincia.setBorder(null);
        jPanel1.add(TxtProvincia, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 250, -1));

        TxtBairro.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        TxtBairro.setForeground(new java.awt.Color(102, 102, 102));
        TxtBairro.setText("Bairro");
        TxtBairro.setBorder(null);
        TxtBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtBairroActionPerformed(evt);
            }
        });
        jPanel1.add(TxtBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 250, -1));

        TxtPais.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        TxtPais.setForeground(new java.awt.Color(102, 102, 102));
        TxtPais.setText("Nome Do País");
        TxtPais.setBorder(null);
        jPanel1.add(TxtPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 250, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel4.setText("MUNICÍPIO");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 70, 20));

        TxtMunicipio.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        TxtMunicipio.setForeground(new java.awt.Color(102, 102, 102));
        TxtMunicipio.setText("Município");
        TxtMunicipio.setBorder(null);
        jPanel1.add(TxtMunicipio, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 250, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 250, 20));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 250, 20));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 250, 20));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 250, 20));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel6.setText("PAÍS");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 40, 20));

        jLabel8.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 51));
        jLabel8.setText("ÁREA DE AUTENTICAÇÃO");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 260, 30));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel9.setText("PROVÍNCIA");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, 21));

        Jtable_Indereco.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "PAÍS", "PROVÍNCIA", "MUNICÍPIO", "BAIRRO"
            }
        ));
        Jtable_Indereco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Jtable_InderecoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Jtable_Indereco);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sair.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        sair.setText("Sair");
        sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sairMouseClicked(evt);
            }
        });
        jPanel2.add(sair, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 40, 20));

        minimizar.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        minimizar.setText("Minimizar");
        minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizarMouseClicked(evt);
            }
        });
        jPanel2.add(minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 60, 20));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("LOCALIZE OS SEUS MAIORES COMPRADORES");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 450, 30));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 430, 40));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/3.jpeg"))); // NOI18N
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 300, -1));

        jSeparator5.setForeground(new java.awt.Color(255, 0, 51));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 370, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtBairroActionPerformed

    private void BtnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalvarActionPerformed
        // TODO add your handling code here:
        Indereco indereco = new Indereco();
        MyConectBD connection = new MyConectBD();
        Middle_BD_Indereco inderecoBD = new Middle_BD_Indereco();
        indereco.setPais(TxtPais.getText());
        indereco.setProvincia(TxtProvincia.getText());
        indereco.setMinicipio(TxtMunicipio.getText());
        indereco.setBairro(TxtBairro.getText());
        inderecoBD.Inserir(indereco);
        Adicionar();
    }//GEN-LAST:event_BtnSalvarActionPerformed

    private void Jtable_InderecoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jtable_InderecoMouseClicked
        // TODO add your handling code here:
         DefaultTableModel dtm = (DefaultTableModel) Jtable_Indereco.getModel();
      Indereco indereco = new Indereco();
      Middle_BD_Indereco inderecoBD = new Middle_BD_Indereco();
      int codigo =  (int) Jtable_Indereco.getValueAt(Jtable_Indereco.getSelectedRow(), 0);
      indereco.getId_indereco();
      inderecoBD.apagar(indereco);
      Adicionar();
      //ctf.apagar(f);
      //buscar();
    }//GEN-LAST:event_Jtable_InderecoMouseClicked

    private void sairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sairMouseClicked
        // TODO add your handling code here:
        int dialog = JOptionPane.YES_NO_OPTION;
        int resul = JOptionPane.showConfirmDialog(null, "Deseja sair?", "exit", dialog);
        if (resul == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_sairMouseClicked

    private void minimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizarMouseClicked
      this.setState(FrmLogin.ICONIFIED);
    }//GEN-LAST:event_minimizarMouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(FrmIndereco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmIndereco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmIndereco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmIndereco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmIndereco().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnApagar;
    private javax.swing.JButton BtnNovo;
    private javax.swing.JButton BtnSalvar;
    private javax.swing.JButton BtnUpdate;
    private javax.swing.JTable Jtable_Indereco;
    private javax.swing.JTextField TxtBairro;
    private javax.swing.JTextField TxtMunicipio;
    private javax.swing.JTextField TxtPais;
    private javax.swing.JTextField TxtProvincia;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel minimizar;
    private javax.swing.JLabel sair;
    // End of variables declaration//GEN-END:variables

private void Adicionar() {
        Middle_BD_Indereco adicionador = new Middle_BD_Indereco();
        DefaultTableModel Tabledata= (DefaultTableModel) Jtable_Indereco.getModel();
        Tabledata.setNumRows(0);
        for (Indereco indereco : adicionador.ListarInderecos()) {
       Object[] receberDados={
          indereco.getPais(),
           indereco.getProvincia(),
           indereco.getMinicipio(),
           indereco.getBairro()
       }; 
       Tabledata.addRow(receberDados);
        }
        
    }
}
