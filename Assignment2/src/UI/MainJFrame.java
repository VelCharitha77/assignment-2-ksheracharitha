/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

//import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Password;
import model.Person;
import model.PersonHistory;
import model.User;
import model.UserHistory;

/**
 *
 * @author advai
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
     PersonHistory history;
     //private ArrayList<User> history1;
     UserHistory history1;
     User user;
     String U;
     Password localPasswordObj;
    public String UID;
    public String PD;
    
    public MainJFrame() {
        //this.PD = "123admin";
        initComponents();
        this.history = new PersonHistory();
        this.history1 = new UserHistory();
        this.localPasswordObj = new Password("md5");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel1 = new javax.swing.JPanel();
        UserIDLbl = new javax.swing.JLabel();
        PasswordLbl = new javax.swing.JLabel();
        UserIDTF = new javax.swing.JTextField();
        AdminBtn = new javax.swing.JButton();
        UserBtn = new javax.swing.JButton();
        PasswordPF = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        UserIDLbl.setText("UserID:");

        PasswordLbl.setText("Password:");

        UserIDTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserIDTFActionPerformed(evt);
            }
        });

        AdminBtn.setText("Admin");
        AdminBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminBtnActionPerformed(evt);
            }
        });

        UserBtn.setText("User");
        UserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel1Layout = new javax.swing.GroupLayout(Panel1);
        Panel1.setLayout(Panel1Layout);
        Panel1Layout.setHorizontalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addComponent(AdminBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 155, Short.MAX_VALUE)
                        .addComponent(UserBtn))
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(UserIDLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PasswordLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(UserIDTF, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(PasswordPF))))
                .addContainerGap(204, Short.MAX_VALUE))
        );
        Panel1Layout.setVerticalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UserIDLbl)
                    .addComponent(UserIDTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PasswordLbl)
                    .addComponent(PasswordPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AdminBtn)
                    .addComponent(UserBtn))
                .addContainerGap(231, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AdminBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminBtnActionPerformed
        //PersonHistory history;
        // TODO add your handling code here:
        String UID = UserIDTF.getText();
        String PDx = String.valueOf(PasswordPF.getPassword());
        PD = this.localPasswordObj.hashPassword(PDx);
        
        if((UID.equals("admin")) && (PDx.equals("123admin"))){
        AdminJPanel adminPanel = new AdminJPanel(this.history, this.history1);
        Panel1.setLayout(new java.awt.BorderLayout());
        Panel1.removeAll();
        Panel1.add(adminPanel);
        Panel1.revalidate();
        
        User user = history1.addUser();
        user.setUsername("Admin");
        user.setNUID("null");
        user.setRole("admin");
        user.setPassword("123admin");
        user.setStatus(true);
        }
        
        else
        {
         JOptionPane.showMessageDialog(this,"Wrong Admin Details");
    }//GEN-LAST:event_AdminBtnActionPerformed
    }
    private void UserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserBtnActionPerformed
        // TODO add your handling code here:
        boolean found=false;
        String UID = UserIDTF.getText();
        String PD = String.valueOf(PasswordPF.getPassword());
        PD = this.localPasswordObj.hashPassword(PD);
        for(User user: history1.getHistory1()){
            if((user.getUsername().equals(UID)) &&(user.getPassword().equals(PD)) && user.Status == true ){
              //user.setUsername(user.Username);
              //return user;
              Person pp = this.history.searchPerson(user.getNUID());
        UserJPanel userPanel = new UserJPanel(this.history, this.history1, pp, this.user,this.U);
        Panel1.setLayout(new java.awt.BorderLayout());
        Panel1.removeAll();
        Panel1.add(userPanel);
        Panel1.revalidate();
        found=true;
        break;
            }
            
            
    }//GEN-LAST:event_UserBtnActionPerformed
    if(!found)
    {
       JOptionPane.showMessageDialog(this,"Invalid Credentials");
    }
    }
    private void UserIDTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserIDTFActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_UserIDTFActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdminBtn;
    private javax.swing.JPanel Panel1;
    private javax.swing.JLabel PasswordLbl;
    private javax.swing.JPasswordField PasswordPF;
    private javax.swing.JButton UserBtn;
    private javax.swing.JLabel UserIDLbl;
    private javax.swing.JTextField UserIDTF;
    // End of variables declaration//GEN-END:variables
}
