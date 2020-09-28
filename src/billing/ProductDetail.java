/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package billing;
import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import org.apache.log4j.BasicConfigurator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 *
 * @author gajic
 */
public class ProductDetail extends javax.swing.JInternalFrame {

    /**
     * Creates new form ProductDetail
     */
    public ProductDetail() {
        initComponents();
        show_product();
        BasicConfigurator.configure();
        this.setLocation(260, 10);
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
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        t4 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        t1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("PRODUCT DETAILS");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Add Product Details");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("Product Id");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setText("Product Name");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setText("Available");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setText("MRP");

        b1.setBackground(new java.awt.Color(255, 255, 255));
        b1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        b1.setIcon(new javax.swing.ImageIcon("D:\\java\\billing_1\\src\\billing\\pics\\plus.png")); // NOI18N
        b1.setText("Add New");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        b2.setText("Update");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        b3.setIcon(new javax.swing.ImageIcon("D:\\java\\billing_1\\src\\billing\\pics\\del.png")); // NOI18N
        b3.setText("Delete");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        t4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        t3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t3ActionPerformed(evt);
            }
        });

        t2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        t1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jTable1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Product Name", "Available", "MRP"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setColumnSelectionAllowed(true);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(b1)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(t2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                                    .addComponent(t1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                                    .addComponent(t4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                                    .addComponent(t3, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(b2)
                                .addGap(18, 18, 18)
                                .addComponent(b3))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b1)
                            .addComponent(b2)
                            .addComponent(b3))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
       if(t1.getText()!=null&&t2.getText()!=null&&t3.getText()!=null&&t4.getText()!=null)
       {
        String sql="INSERT INTO `stock`VALUES('"+t1.getText()+"','"+t2.getText()+"','"+t3.getText()+"','"+t4.getText()+"');";
        try{
            
            Connection con=DataConnect.getConnect();
            Statement st=con.createStatement();
            if((st.executeUpdate(sql)) == 1)
            {

                
                DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
                model.setRowCount(0);
                show_product();
                t1.setText("");
                t2.setText("");
                t3.setText("");
                t4.setText("");
                con.close();
                JOptionPane.showMessageDialog(null, "Data inserted Successfully");
            }else{
                JOptionPane.showMessageDialog(null, "Data Not inserted");
            }
        }catch(Exception ex){
            System.out.println(ex);
        }
       }
       else
           JOptionPane.showMessageDialog(null, "Enter all Values");
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        if(t1.getText()!=null&&t2.getText()!=null&&t3.getText()!=null&&t4.getText()!=null)
       {
        String query="UPDATE `stock` SET `pname`=?,`available`=?,`mrp`=? WHERE `id`=?";

        try {

            Connection con=DataConnect.getConnect();
            PreparedStatement pstmt = con.prepareStatement(query);

            // set the corresponding param
            pstmt.setString(1, t2.getText());
            pstmt.setString(2, t3.getText());
            pstmt.setString(3, t4.getText());
            pstmt.setString(4, t1.getText());
           
            pstmt.executeUpdate();
            DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
            model.setRowCount(0);
            show_product();
            t1.setText("");
            t2.setText("");
            t3.setText("");
            t4.setText("");
            con.close();
            JOptionPane.showMessageDialog(null, "Data updated Successfully");
        }catch(Exception ex){
            
            JOptionPane.showMessageDialog(null, "Data Not updated");
            System.out.println(ex);
        }
       }
        else
            JOptionPane.showMessageDialog(null, "Data Not updated");    
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        String sql = "DELETE FROM stock WHERE id = ?";

        try {

            
            Connection con=DataConnect.getConnect();
            PreparedStatement pstmt = con.prepareStatement(sql);

            pstmt.setString(1, t1.getText());
           
            pstmt.executeUpdate();
            DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
            model.setRowCount(0);
            show_product();
            t1.setText("");
            t2.setText("");
            t3.setText("");
            t4.setText("");
            con.close();
            JOptionPane.showMessageDialog(null, "Data deleted Successfully");
        }catch(Exception ex){
            //ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Data Not deleted");
            System.out.println(ex);
        }
    }//GEN-LAST:event_b3ActionPerformed

    private void t3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t3ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int i=jTable1.getSelectedRow();        // TODO add your handling code here:
        TableModel model=jTable1.getModel();
        t1.setText(model.getValueAt(i, 0).toString());
        t2.setText(model.getValueAt(i, 1).toString());
        t3.setText(model.getValueAt(i, 2).toString());
        t4.setText(model.getValueAt(i, 3).toString());
    }//GEN-LAST:event_jTable1MouseClicked
public ArrayList<Product>getproList()
    {
        ArrayList<Product>proList=new ArrayList<>();
        
        String query="SELECT * FROM `stock`;";
        Statement st;
        ResultSet rs;
        try{
            
            Connection con=DataConnect.getConnect();
            Statement st1=con.createStatement();
            rs=st1.executeQuery(query);
            Product p;
            while(rs.next())
            {
                p = new Product(rs.getString("id"),rs.getString("pname"),rs.getInt("available"),rs.getInt("mrp"));
               proList.add(p);
            }
            con.close();
        }
        catch(Exception e)
        {
        }
        return proList;
    }
 // Display data in JTable
    public void show_product()
    {
        ArrayList<Product> list=getproList();
        DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
        
            model.setRowCount(0);
        Object[] row=new Object[4];
        for(int i=0;i<list.size();i++)
        {
            row[0]=list.get(i).getid();
            row[1]=list.get(i).getpname();
            row[2]=list.get(i).getavailable();
            row[3]=list.get(i).getmrp();
            model.addRow(row);
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    // End of variables declaration//GEN-END:variables
}
