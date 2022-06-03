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
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/**
 *
 * @author HP
 */
public class viewProduct extends javax.swing.JFrame {

    /**
     * Creates new form viewProduct
     */
    int i=22;
    
    public viewProduct() {
        initComponents();
        this.setBounds(495, 270, 990, 540);
        AutoCompleteDecorator.decorate(name);
        AutoCompleteDecorator.decorate(pn);
        setName();
        setPN();
        select.setSelectedItem("Select All Product");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        select = new javax.swing.JComboBox<>();
        viewAll = new javax.swing.JComboBox<>();
        name = new javax.swing.JComboBox<>();
        name_l = new javax.swing.JLabel();
        viewps = new javax.swing.JComboBox<>();
        from = new javax.swing.JLabel();
        from_dc = new com.toedter.calendar.JDateChooser();
        to = new javax.swing.JLabel();
        to_dc = new com.toedter.calendar.JDateChooser();
        pn_l = new javax.swing.JLabel();
        pn = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        table.setFont(new java.awt.Font("Malgun Gothic", 3, 16)); // NOI18N
        table.setForeground(new java.awt.Color(255, 51, 51));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {}
            },
            new String [] {

            }
        ));
        table.setRowHeight(30);
        jScrollPane1.setViewportView(table);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 180, 970, 240);

        jButton1.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        jButton1.setText("View");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(840, 120, 110, 50);

        jButton2.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        jButton2.setText("<- Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(450, 435, 150, 50);

        select.setFont(new java.awt.Font("Malgun Gothic", 0, 18)); // NOI18N
        select.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Particualr Product", "Select All Product" }));
        select.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                selectItemStateChanged(evt);
            }
        });
        select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectActionPerformed(evt);
            }
        });
        getContentPane().add(select);
        select.setBounds(0, 0, 231, 38);

        viewAll.setFont(new java.awt.Font("Malgun Gothic", 0, 18)); // NOI18N
        viewAll.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "most to least sold products", "view as Menu" }));
        viewAll.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                viewAllItemStateChanged(evt);
            }
        });
        viewAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAllActionPerformed(evt);
            }
        });
        getContentPane().add(viewAll);
        viewAll.setBounds(370, 120, 240, 38);

        name.setFont(new java.awt.Font("Malgun Gothic", 0, 15)); // NOI18N
        name.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));
        name.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                nameItemStateChanged(evt);
            }
        });
        getContentPane().add(name);
        name.setBounds(390, 0, 250, 30);

        name_l.setFont(new java.awt.Font("Malgun Gothic", 1, 20)); // NOI18N
        name_l.setText("Name");
        getContentPane().add(name_l);
        name_l.setBounds(280, 0, 110, 30);

        viewps.setFont(new java.awt.Font("Malgun Gothic", 0, 18)); // NOI18N
        viewps.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "view quantity in all orders", "view in orders for particular customer", "view for all customers" }));
        viewps.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                viewpsItemStateChanged(evt);
            }
        });
        viewps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewpsActionPerformed(evt);
            }
        });
        getContentPane().add(viewps);
        viewps.setBounds(330, 120, 330, 38);

        from.setFont(new java.awt.Font("Malgun Gothic", 1, 20)); // NOI18N
        from.setText("From");
        getContentPane().add(from);
        from.setBounds(250, 50, 70, 30);

        from_dc.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        getContentPane().add(from_dc);
        from_dc.setBounds(310, 50, 160, 30);

        to.setFont(new java.awt.Font("Malgun Gothic", 1, 20)); // NOI18N
        to.setText("To");
        getContentPane().add(to);
        to.setBounds(490, 50, 70, 30);

        to_dc.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        getContentPane().add(to_dc);
        to_dc.setBounds(520, 50, 160, 30);

        pn_l.setFont(new java.awt.Font("Malgun Gothic", 1, 20)); // NOI18N
        pn_l.setText("Phone No.");
        getContentPane().add(pn_l);
        pn_l.setBounds(670, 0, 110, 30);

        pn.setFont(new java.awt.Font("Malgun Gothic", 0, 15)); // NOI18N
        pn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));
        pn.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                pnItemStateChanged(evt);
            }
        });
        getContentPane().add(pn);
        pn.setBounds(780, 0, 160, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selectItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_selectItemStateChanged
        // TODO add your handling code here:
        String s = select.getSelectedItem().toString();
        setFalse();
        if(s.equals("Select All Product"))
        {
            viewAll.setVisible(true);
            //ord.setVisible(true);
            //ob.setVisible(true);
            //word.setVisible(true);
            viewAll.setSelectedItem("view as Menu");
            i=22;
        }
        else
        {
            name.setVisible(true);
            name_l.setVisible(true);
            from.setVisible(true);
            to.setVisible(true);
            from_dc.setVisible(true);
            to_dc.setVisible(true);
            viewps.setVisible(true);
            viewps.setSelectedItem("view for all customers");
            i=13;
            //viewps.setSelectedItem("product like most");
        }
    }//GEN-LAST:event_selectItemStateChanged

    private void selectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectActionPerformed

    private void viewAllItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_viewAllItemStateChanged
        // TODO add your handling code here:
        String s = viewAll.getSelectedItem().toString();
        setFalse();
        viewAll.setVisible(true);
        if(s.equals("view as Menu"))
        {
            i=22;
        }
        if(s.equals("most to least sold products"))
        {
            i=21;
            from.setVisible(true);
            to.setVisible(true);
            from_dc.setVisible(true);
            to_dc.setVisible(true);
        }
    }//GEN-LAST:event_viewAllItemStateChanged

    private void viewAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAllActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewAllActionPerformed

    private void nameItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_nameItemStateChanged
        // TODO add your handling code here:
        
    }//GEN-LAST:event_nameItemStateChanged

    private void viewpsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_viewpsItemStateChanged
        // TODO add your handling code here:
        String s = viewps.getSelectedItem().toString();
        setFalse();
        viewps.setVisible(true);
        from.setVisible(true);
        to.setVisible(true);
        from_dc.setVisible(true);
        to_dc.setVisible(true);
        name.setVisible(true);
        name_l.setVisible(true);
        if(s.equals("view quantity in all orders"))
        {
            i=11;
            System.out.println(i);
        }
        
        if(s.equals("view in orders for particular customer"))
        {
            i=12;
            pn_l.setVisible(true);
            pn.setVisible(true);
        }
        if(s.equals("view for all customers"))
        {
            i=13;
            
        }
    }//GEN-LAST:event_viewpsItemStateChanged

    private void viewpsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewpsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewpsActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        products pr = new products();
        pr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void pnItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_pnItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_pnItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String query = setQuery();
        Connection con = getConnection();
        if(con!=null)
        {
            try
            {
                Statement s=con.createStatement();
                ResultSet rs=s.executeQuery(query);
                //String ID = id.getText();
                
               // System.out.println(ID +"1"+PN+"2"+s_type);
                mymodel mm = new mymodel(rs);
                table.setModel(mm);
                //con.close();
            }
            catch(Exception e)
            {
                System.out.println(e);
                JOptionPane.showMessageDialog(this,"INCORRECT details entered");
            }
                
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
            java.util.logging.Logger.getLogger(viewProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewProduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel from;
    private com.toedter.calendar.JDateChooser from_dc;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> name;
    private javax.swing.JLabel name_l;
    private javax.swing.JComboBox<String> pn;
    private javax.swing.JLabel pn_l;
    private javax.swing.JComboBox<String> select;
    private javax.swing.JTable table;
    private javax.swing.JLabel to;
    private com.toedter.calendar.JDateChooser to_dc;
    private javax.swing.JComboBox<String> viewAll;
    private javax.swing.JComboBox<String> viewps;
    // End of variables declaration//GEN-END:variables

    private void setFalse() {
         //To change body of generated methods, choose Tools | Templates.
         viewAll.setVisible(false);
         viewps.setVisible(false);
         from.setVisible(false);
         to.setVisible(false);
         from_dc.setVisible(false);
         to_dc.setVisible(false);
         name_l.setVisible(false);
         name.setVisible(false);
         pn_l.setVisible(false);
         pn.setVisible(false);
         
    }

    private void setName() {
         //To change body of generated methods, choose Tools | Templates.
         Connection con = getConnection();
         try
         {
             Statement s=con.createStatement();
             ResultSet rs=s.executeQuery("select name from products order by name asc");
             
             name.addItem("");
             while(rs.next())
                 name.addItem(rs.getString(1));
             con.close();
         }
         catch(Exception e)
         {
             System.out.println(e);
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
             System.out.println(e);
             Connection con = null;
             return con;
         }
    }

    private void setPN() {
        //To change body of generated methods, choose Tools | Templates.
        Connection con = getConnection();
         try
         {
             Statement s=con.createStatement();
             ResultSet rs=s.executeQuery("select phone_no from customers order by phone_no asc");
             
             pn.addItem("");
             while(rs.next())
                 pn.addItem(rs.getString(1));
             con.close();
         }
         catch(Exception e)
         {
             System.out.println(e);
         }
    }

    private String setQuery() {
         //To change body of generated methods, choose Tools | Templates.
         String query = null;
         int j = i/10;
         System.out.println(j+" "+i);
         if(j==2)
         {
             SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
             String fromd = "";
             String tod = "";
             try
            {
                
                fromd = sdf1.format(from_dc.getDate());
                tod = sdf1.format(to_dc.getDate());
                System.out.println(fromd);
                System.out.println(tod);
            }
            catch(Exception e)
            {
                //pn.setSelectedItem("");
                System.out.println(e);
            }
             if(i==21 &&!fromd.equals("") && !tod.equals(""))
                 query = "select Product_Name , sum(quantity) as 'Quantity_Sold' from (select products.name as 'Product_Name' , ord_pro_qu.quantity from ord_pro_qu inner join orders on orders.orderID = ord_pro_qu.orderID inner join products on products.productID = ord_pro_qu.productID where order_date between '"+fromd+"' and '"+tod+"'  )ex group by Product_Name order by Quantity_Sold desc  ;";
             if(i==22)
                 query = "select * from products order by category asc";
         }
         
         if(j==1)
         {
             SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
            String fromd = "";
            String tod = "";
            try
            {
                name.getSelectedItem().toString();
            }
            catch(Exception e)
            {
                name.setSelectedItem("");
                System.out.println(e);
            }
            try
            {
                pn.getSelectedItem().toString();
            }
            catch(Exception e)
            {
                pn.setSelectedItem("");
                System.out.println(e);
            }
            try
            {
                
                fromd = sdf1.format(from_dc.getDate());
                tod = sdf1.format(to_dc.getDate());
                System.out.println(fromd);
                System.out.println(tod);
            }
            catch(Exception e)
            {
                //pn.setSelectedItem("");
                System.out.println(e);
            }
            
            if(i==11 && !name.getSelectedItem().toString().equals("") && !fromd.equals("") && !tod.equals(""))
                query = "select orders.orderID as 'OrderID',order_date as 'Order_Date',products.name as 'Product_Name' , quantity as 'Quantity' ,amount as 'Order_Amount' from ord_pro_qu inner join orders on orders.orderID = ord_pro_qu.orderID inner join products on products.productID = ord_pro_qu.productID where ord_pro_qu.productID = (select productID from products where name = '"+name.getSelectedItem().toString()+"') and order_date between '"+fromd+"' and '"+tod+"' ";
            if(i==12&& !name.getSelectedItem().toString().equals("") && !fromd.equals("") && !tod.equals("")&& !pn.getSelectedItem().equals(""))
                query = "select orders.orderID as 'OrderID',order_date as 'Order_Date',customers.name as 'Customer_Name' ,products.name as 'Product_Name' , quantity as 'Quantity' ,amount as 'Order_Amount' from orders inner join ord_pro_qu on orders.orderID = ord_pro_qu.orderID inner join products on products.productID = ord_pro_qu.productID inner join customers on customers.customerID = orders.customerID where customers.customerID = (select customerID from customers where phone_no = '"+pn.getSelectedItem().toString()+"' ) and products.productID = (select productID from products where name = '"+name.getSelectedItem().toString()+"') and order_date between '"+fromd+"' and '"+tod+"' ";
            if(i==13&& !name.getSelectedItem().toString().equals("") && !fromd.equals("") && !tod.equals(""))
                query = "select customerID , Customer_Name , Product_Name , sum(Quantity) as 'Quantity_Bought' from (select customers.customerID as 'CustomerID' , customers.name as 'Customer_Name' , products.name as 'Product_Name', quantity as 'Quantity' from ord_pro_qu inner join orders on orders.orderID = ord_pro_qu.orderID inner join products on products.productID = ord_pro_qu.productID inner join customers on customers.customerID = orders.customerID where products.productID = (select productID from products where name = '"+name.getSelectedItem().toString()+"') and order_date between '"+fromd+"' and '"+tod+"' )ex group by Customer_Name order by Quantity_Bought desc;";
             
         }
         
         System.out.println(query);
         return query ;
    }
}
