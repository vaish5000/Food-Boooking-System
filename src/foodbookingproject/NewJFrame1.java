/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodbookingproject;


import java.sql.*;
import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.DriverManager;



/**
 *
 * @author sujatha
 */
public class NewJFrame1 extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame1
     */
    public NewJFrame1() {
        initComponents();this.setBounds(200,50,900,600);
    }
public static int count=1;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        newuserid = new javax.swing.JTextField();
        newnumber = new javax.swing.JTextField();
        newpass = new javax.swing.JPasswordField();
        newpass1 = new javax.swing.JPasswordField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jToggleButton6 = new javax.swing.JToggleButton();
        newname = new javax.swing.JTextField();
        newcity = new javax.swing.JTextField();
        newaddress = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        newpincode = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        newuserid.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        getContentPane().add(newuserid);
        newuserid.setBounds(390, 190, 520, 30);

        newnumber.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        getContentPane().add(newnumber);
        newnumber.setBounds(390, 137, 520, 30);

        newpass.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        getContentPane().add(newpass);
        newpass.setBounds(390, 390, 410, 30);

        newpass1.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        getContentPane().add(newpass1);
        newpass1.setBounds(390, 450, 410, 30);

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("ENTER YOUR FULL NAME");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(21, 85, 227, 22);

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("ENTER YOUR PHONE NUMBER");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(21, 135, 268, 22);

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("ENTER USER ID");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(20, 190, 243, 22);

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("ENTER PASSWORD");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(20, 390, 165, 22);

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("CONFIRM PASSWORD");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(20, 450, 193, 22);

        jToggleButton6.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        jToggleButton6.setText("CREATE");
        jToggleButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton6);
        jToggleButton6.setBounds(400, 510, 130, 50);

        newname.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        getContentPane().add(newname);
        newname.setBounds(390, 87, 520, 30);

        newcity.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        getContentPane().add(newcity);
        newcity.setBounds(390, 290, 520, 30);

        newaddress.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        getContentPane().add(newaddress);
        newaddress.setBounds(390, 240, 520, 30);

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("ENTER YOUR FULL ADDRESS");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(20, 240, 256, 22);

        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("ENTER CITY");
        getContentPane().add(jLabel23);
        jLabel23.setBounds(20, 290, 219, 22);

        newpincode.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        getContentPane().add(newpincode);
        newpincode.setBounds(390, 340, 520, 30);

        jLabel24.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("ENTER AREA PIN CODE");
        getContentPane().add(jLabel24);
        jLabel24.setBounds(20, 340, 253, 22);

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NEW USER");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(330, 10, 282, 56);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-10, -10, 950, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton6ActionPerformed

        String NEWNAME=newname.getText();
        String NEWCITY=newcity.getText();
        String NEWADDRESS=newaddress.getText();
        count++;
        int NEWPINCODE=Integer.parseInt(newpincode.getText());
        int NEWNUMBER=Integer.parseInt(newnumber.getText());
        String NEWUSERID=newuserid.getText();
        String NEWPASS= new String(newpass.getPassword());
        String NEWPASS1=new String(newpass1.getPassword());
        if(NEWPASS.equals(NEWPASS1))
        { try
         {Class.forName("java.sql.Driver");
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost/classxii","root","system");
          Statement stmt=con.createStatement();
          String query="insert into pass values("+count+",'"+NEWNAME+"','"+NEWUSERID+"','"+NEWPASS+"',"+NEWNUMBER+",'"+NEWADDRESS+"','"+NEWCITY+"',"+NEWPINCODE+");";
          stmt.executeUpdate(query);
          JOptionPane.showMessageDialog(null,"THANKS FOR BECOMING A USER");
          new NewJFrame11().setVisible(true);
          this.dispose();
         }
          catch (Exception e)
          {JOptionPane.showMessageDialog(null,"UNEXPECTED ERROR PLEASE CHECK THE DATA ALREADY EXISTS");}
        }
        else JOptionPane.showMessageDialog(null,"renter password");
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JToggleButton jToggleButton6;
    private javax.swing.JTextField newaddress;
    private javax.swing.JTextField newcity;
    private javax.swing.JTextField newname;
    private javax.swing.JTextField newnumber;
    private javax.swing.JPasswordField newpass;
    private javax.swing.JPasswordField newpass1;
    private javax.swing.JTextField newpincode;
    private javax.swing.JTextField newuserid;
    // End of variables declaration//GEN-END:variables
}