/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caffe;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public login() {
        initComponents();
         this.setBounds(495, 270, 990, 540);
         
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        userid = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        jLabel1.setText("User ID");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(560, 157, 120, 50);

        jLabel2.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        jLabel2.setText("Password");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(560, 220, 113, 39);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/caffe/Untitled-1 copy.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(610, 301, 200, 80);

        userid.setFont(new java.awt.Font("Malgun Gothic", 0, 18)); // NOI18N
        getContentPane().add(userid);
        userid.setBounds(740, 170, 160, 40);

        password.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        getContentPane().add(password);
        password.setBounds(740, 220, 160, 39);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/caffe/login.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 0, 520, 540);

        jLabel5.setFont(new java.awt.Font("Verdana Pro Cond Semibold", 1, 40)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 51, 51));
        jLabel5.setText("LOGIN");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(650, 40, 140, 90);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/caffe/bh.jpg"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 990, 540);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String id = userid.getText();
        char[] pass = password.getPassword();
        String passw = String.valueOf(pass);
        if(id.equals("tushar") && passw.equals("tushar"))
        {
            master_login ml = new master_login();
            ml.setVisible(true);
            this.dispose();
        }
        else
        {
            int j = checkUidAndPass(id,passw);
            if(j != -1)
            {
                staff_login sl = new staff_login(j);
                sl.setVisible(true);
                this.dispose();
            }
            else
                JOptionPane.showMessageDialog(this,"incorrect   id / password");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField userid;
    // End of variables declaration//GEN-END:variables

    private int checkUidAndPass(String id, String passw) {
        //To change body of generated methods, choose Tools | Templates.
        Connection con = getConnection();
        try
        {
            Statement s=con.createStatement();
            ResultSet rs=s.executeQuery("Select staffID from staff where s_userid = '"+id+"' and s_pass = '"+passw+"' and type = 'Billing Staff' and status = 'Working' " );
            rs.next();
            int i =rs.getInt(1);
            System.out.println(i);
            con.close();
            return i;
        }
        catch(Exception e)
        {
            System.out.println(e);
            return -1;
        }
    }

    private Connection getConnection() {
        //To change body of generated methods, choose Tools | Templates.
        try
         {
             Class.forName("com.mysql.jdbc.Driver");
             Connection con =(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe","root","");
             return con;
         }
         catch(Exception e)
         {
             System.out.println("connection failed"+e);
             Connection con = null;
             return con;
         }
    }
}
