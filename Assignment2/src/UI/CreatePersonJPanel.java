/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import javax.swing.JOptionPane;
import model.Person;
import model.PersonHistory;
//import model.Person;

/**
 *
 * @author advai
 */
public class CreatePersonJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreatePersonJPanel
     */
    
    PersonHistory history;
    public CreatePersonJPanel(PersonHistory history) {
        initComponents();
        this.history = history;
    }

    //CreatePersonJPanel() {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    //}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NUIDLbl = new javax.swing.JLabel();
        NameLbl = new javax.swing.JLabel();
        DepartmentLbl = new javax.swing.JLabel();
        CgpaLbl = new javax.swing.JLabel();
        NUIDTF = new javax.swing.JTextField();
        NameTF = new javax.swing.JTextField();
        DepartmentTF = new javax.swing.JTextField();
        CgpaTF = new javax.swing.JTextField();
        SaveBtn = new javax.swing.JButton();

        NUIDLbl.setText("NUID:");

        NameLbl.setText("Name:");

        DepartmentLbl.setText("Department:");

        CgpaLbl.setText("Cgpa:");

        NUIDTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NUIDTFActionPerformed(evt);
            }
        });

        NameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameTFActionPerformed(evt);
            }
        });

        SaveBtn.setText("SAVE");
        SaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(DepartmentLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(NUIDLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(NameLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CgpaLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(NUIDTF)
                            .addComponent(NameTF)
                            .addComponent(DepartmentTF)
                            .addComponent(CgpaTF, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(SaveBtn)))
                .addContainerGap(290, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NUIDLbl)
                    .addComponent(NUIDTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameLbl)
                    .addComponent(NameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DepartmentLbl)
                    .addComponent(DepartmentTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CgpaLbl)
                    .addComponent(CgpaTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addComponent(SaveBtn)
                .addContainerGap(144, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBtnActionPerformed
        // TODO add your handling code here:
        String NUID = NUIDTF.getText();
        String name= NameTF.getText(); 
        String department= DepartmentTF.getText();
        double cgpa=  Double.parseDouble(CgpaTF.getText());
        
        Person pp = history.addNewPerson();
        
        pp.setNUID(NUID);
        pp.setName(name);
        pp.setDepartment(department);
        pp.setCgpa(cgpa);
        
        JOptionPane.showMessageDialog(this,"New Person Details added");
        
        NUIDTF.setText("");
        NameTF.setText("");
        DepartmentTF.setText("");
        CgpaTF.setText("");
    }//GEN-LAST:event_SaveBtnActionPerformed

    private void NUIDTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NUIDTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NUIDTFActionPerformed

    private void NameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameTFActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CgpaLbl;
    private javax.swing.JTextField CgpaTF;
    private javax.swing.JLabel DepartmentLbl;
    private javax.swing.JTextField DepartmentTF;
    private javax.swing.JLabel NUIDLbl;
    private javax.swing.JTextField NUIDTF;
    private javax.swing.JLabel NameLbl;
    private javax.swing.JTextField NameTF;
    private javax.swing.JButton SaveBtn;
    // End of variables declaration//GEN-END:variables
}
