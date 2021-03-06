/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package employee_management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.*;


/**
 *
 * @author Hp
 */
public class employee extends javax.swing.JFrame {

    /**
     * Creates new form employee
     */
    public employee() {
        
        
        initComponents();
 
         String path = "C:\\Users\\Hp\\OneDrive\\Documents\\NetBeansProjects\\Employee_management\\src\\employee_management\\person 2.png";
         Image icon = Toolkit.getDefaultToolkit().getImage(path);
         this.setIconImage(icon);
         //System.out.println(icon);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        insert_panel = new javax.swing.JPanel();
        insert_header = new javax.swing.JLabel();
        eno_label = new javax.swing.JLabel();
        ename_label = new javax.swing.JLabel();
        edep_label = new javax.swing.JLabel();
        esal_label = new javax.swing.JLabel();
        eno_input = new javax.swing.JTextField();
        ename_input = new javax.swing.JTextField();
        edep_input = new javax.swing.JTextField();
        esal_input = new javax.swing.JTextField();
        insert_button = new javax.swing.JButton();
        clear_button = new javax.swing.JButton();
        desplay_panel = new javax.swing.JPanel();
        search_label = new javax.swing.JLabel();
        search_input = new javax.swing.JTextField();
        search_button = new javax.swing.JButton();
        table_panel = new javax.swing.JScrollPane();
        employee_search_table = new javax.swing.JTable();
        delete_panel = new javax.swing.JPanel();
        delete_label = new javax.swing.JLabel();
        delete_button = new javax.swing.JButton();
        table_panel1 = new javax.swing.JScrollPane();
        employee_table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Employee management");
        setPreferredSize(new java.awt.Dimension(800, 500));
        setResizable(false);

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setForeground(new java.awt.Color(0, 0, 128));
        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTabbedPane1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N

        insert_header.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        insert_header.setForeground(new java.awt.Color(0, 0, 128));
        insert_header.setText("Insert employee details");

        eno_label.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        eno_label.setForeground(new java.awt.Color(0, 0, 128));
        eno_label.setText("Employee number :");

        ename_label.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        ename_label.setForeground(new java.awt.Color(0, 0, 128));
        ename_label.setText("Employee name :");

        edep_label.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        edep_label.setForeground(new java.awt.Color(0, 0, 128));
        edep_label.setText("Department name :");

        esal_label.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        esal_label.setForeground(new java.awt.Color(0, 0, 128));
        esal_label.setText("Employee salary :");

        eno_input.setForeground(new java.awt.Color(0, 0, 128));
        eno_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eno_inputActionPerformed(evt);
            }
        });

        ename_input.setForeground(new java.awt.Color(0, 0, 128));
        ename_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ename_inputActionPerformed(evt);
            }
        });

        edep_input.setForeground(new java.awt.Color(0, 0, 128));

        esal_input.setForeground(new java.awt.Color(0, 0, 128));

        insert_button.setBackground(new java.awt.Color(0, 0, 128));
        insert_button.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        insert_button.setForeground(new java.awt.Color(255, 255, 255));
        insert_button.setText("Insert");
        insert_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insert_buttonActionPerformed(evt);
            }
        });

        clear_button.setBackground(new java.awt.Color(0, 0, 128));
        clear_button.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        clear_button.setForeground(new java.awt.Color(255, 255, 255));
        clear_button.setText("Clear");
        clear_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout insert_panelLayout = new javax.swing.GroupLayout(insert_panel);
        insert_panel.setLayout(insert_panelLayout);
        insert_panelLayout.setHorizontalGroup(
            insert_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(insert_panelLayout.createSequentialGroup()
                .addGroup(insert_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(insert_panelLayout.createSequentialGroup()
                        .addGroup(insert_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(insert_panelLayout.createSequentialGroup()
                                .addGap(129, 129, 129)
                                .addGroup(insert_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(esal_label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(edep_label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(eno_label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                    .addComponent(ename_label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(insert_panelLayout.createSequentialGroup()
                                .addGap(169, 169, 169)
                                .addComponent(insert_button, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(69, 69, 69)
                        .addGroup(insert_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(eno_input)
                            .addComponent(ename_input)
                            .addComponent(edep_input)
                            .addComponent(esal_input, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                            .addComponent(clear_button, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(insert_panelLayout.createSequentialGroup()
                        .addGap(282, 282, 282)
                        .addComponent(insert_header, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(236, Short.MAX_VALUE))
        );
        insert_panelLayout.setVerticalGroup(
            insert_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(insert_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(insert_header, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(insert_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eno_label, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eno_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(insert_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ename_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(insert_panelLayout.createSequentialGroup()
                        .addComponent(ename_label, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)))
                .addGap(18, 18, 18)
                .addGroup(insert_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(edep_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(insert_panelLayout.createSequentialGroup()
                        .addComponent(edep_label, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)))
                .addGap(34, 34, 34)
                .addGroup(insert_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(esal_label, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(esal_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(insert_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insert_button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clear_button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(246, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Insert", insert_panel);

        search_label.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        search_label.setForeground(new java.awt.Color(0, 0, 128));
        search_label.setText("Enter employee name to search :");

        search_input.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        search_input.setForeground(new java.awt.Color(0, 0, 128));

        search_button.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        search_button.setForeground(new java.awt.Color(0, 0, 128));
        search_button.setText("Search");
        search_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_buttonActionPerformed(evt);
            }
        });

        employee_search_table.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        employee_search_table.setForeground(new java.awt.Color(0, 0, 128));
        employee_search_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Eno", "Ename", "Edep", "Esal"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        employee_search_table.setRowHeight(28);
        employee_search_table.getTableHeader().setFont(new java.awt.Font("serif",java.awt.Font.BOLD,18));

        employee_search_table.getTableHeader().setForeground(new java.awt.Color(0,0,128));
        table_panel.setViewportView(employee_search_table);

        javax.swing.GroupLayout desplay_panelLayout = new javax.swing.GroupLayout(desplay_panel);
        desplay_panel.setLayout(desplay_panelLayout);
        desplay_panelLayout.setHorizontalGroup(
            desplay_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desplay_panelLayout.createSequentialGroup()
                .addGroup(desplay_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(desplay_panelLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(search_label, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(search_input, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(desplay_panelLayout.createSequentialGroup()
                        .addGap(311, 311, 311)
                        .addComponent(search_button, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(desplay_panelLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(table_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 697, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        desplay_panelLayout.setVerticalGroup(
            desplay_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desplay_panelLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(desplay_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(search_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(search_input, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
                .addGap(46, 46, 46)
                .addComponent(search_button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(table_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(236, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Display", desplay_panel);

        delete_label.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        delete_label.setForeground(new java.awt.Color(0, 0, 128));
        delete_label.setText("Please select an employee to delete :");

        delete_button.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        delete_button.setForeground(new java.awt.Color(0, 0, 128));
        delete_button.setText("Delete");
        delete_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_buttonActionPerformed(evt);
            }
        });

        employee_table.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        employee_table.setForeground(new java.awt.Color(0, 0, 128));
        employee_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Eno", "Ename", "Edep", "Esal"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        employee_table.setRowHeight(28);
        employee_table.getTableHeader().setFont(new java.awt.Font("serif",java.awt.Font.BOLD,18));

        employee_table.getTableHeader().setForeground(new java.awt.Color(0,0,128));
        table_panel1.setViewportView(employee_table);

        javax.swing.GroupLayout delete_panelLayout = new javax.swing.GroupLayout(delete_panel);
        delete_panel.setLayout(delete_panelLayout);
        delete_panelLayout.setHorizontalGroup(
            delete_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(delete_panelLayout.createSequentialGroup()
                .addGroup(delete_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(delete_panelLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(table_panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 697, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(delete_panelLayout.createSequentialGroup()
                        .addGap(323, 323, 323)
                        .addComponent(delete_button, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, delete_panelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(delete_label, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(241, 241, 241))
        );
        delete_panelLayout.setVerticalGroup(
            delete_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(delete_panelLayout.createSequentialGroup()
                .addContainerGap(76, Short.MAX_VALUE)
                .addComponent(delete_label, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(delete_button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(table_panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(238, 238, 238))
        );

        jTabbedPane1.addTab("Delete", delete_panel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ename_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ename_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ename_inputActionPerformed

    private void eno_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eno_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eno_inputActionPerformed

    private void clear_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_buttonActionPerformed
        eno_input.setText("");
        ename_input.setText("");
        edep_input.setText("");
        esal_input.setText("");
    }//GEN-LAST:event_clear_buttonActionPerformed

    private void insert_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insert_buttonActionPerformed
        int eno = Integer.parseInt(eno_input.getText()); 
        String ename = ename_input.getText();
        String edep = edep_input.getText();
        int esal = Integer.parseInt(esal_input.getText());
            
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","SYSTEM","kishor");
            Statement st = con.createStatement();
            String Insert_Query = "insert into employee_management values('"+eno+"','"+ename+"','"+edep+"','"+esal+"')";
            //st.execute(Insert_Query);
            ResultSet rs1 = st.executeQuery(Insert_Query);
            
            
            DefaultTableModel tblModel = (DefaultTableModel) employee_table.getModel();
    
            String [] colmnNames= { "eno", "ename", "edep", "esal"};
   
            DefaultTableModel model=new DefaultTableModel();
            model.setColumnIdentifiers(colmnNames);
            employee_table.setModel(model);
            String eno1,ename1,edep1,esal1;
            String Query1="select * from employee_management";
            ResultSet rs = st.executeQuery(Query1);
            
            //System.out.println(Query1);
            //System.out.println(rs.next());
            while(rs.next())
            {
                eno1=rs.getString("eno");
                ename1=rs.getString("ename");
                edep1=rs.getString("edep");
                esal1=rs.getString("esal");
             
                //System.out.println(rs.getString("eno")+"_"+rs.getString("ename")+"_"+rs.getString("esal"));
                //System.out.println(ename1);
                model.addRow(new Object[]{eno1,ename1,edep1,esal1});
                
            }
             
            
            //System.out.println(eno + ename + edep + esal);
            JOptionPane.showMessageDialog(null,"One employee inserted.");
        }catch(Exception e){}
    }//GEN-LAST:event_insert_buttonActionPerformed

    private void search_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_buttonActionPerformed
       
        try{
            
            String [] colnames = {"Eno","Ename","Edep","Esal"};
            
            DefaultTableModel model = new DefaultTableModel();
            model.setColumnIdentifiers(colnames);
            employee_search_table.setModel(model);
            String s_ename = search_input.getText();
            String eno,ename,edep,esal;
            
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","SYSTEM","kishor");
            Statement st = con.createStatement();
            String search_Query = "select * from employee_management where ename ='"+s_ename+"'";
            st.execute(search_Query);
            ResultSet rs = st.executeQuery(search_Query);
            //System.out.println(rs.next());

            while(rs.next())
            {
                eno = rs.getString("eno");
                ename = rs.getString("ename");
                edep = rs.getString("edep");
                esal = rs.getString("esal");
                
                model.addRow(new Object[] {eno,ename,edep,esal});
            }
            search_input.setText("");
        }catch(Exception e){}
    }//GEN-LAST:event_search_buttonActionPerformed

           
    private void delete_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_buttonActionPerformed
        DefaultTableModel tblModel = (DefaultTableModel) employee_table.getModel();
        //System.out.println(jTable1.getRowCount());
        
        try{
        //System.out.println(jTable1.getSelectedRow());
        
        if(employee_table.getSelectedRowCount() == 1)
        {
            
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","SYSTEM","kishor");
            Statement st=con.createStatement();
            
            int row =  employee_table.getSelectedRow();
            //System.out.println(jTable1.getSelectedRow());
            String cell = employee_table.getModel().getValueAt(row, 1).toString();
            //System.out.println(cell);
            String Query = "delete from employee_management where ename = '"+cell+"'";
            st.execute(Query);
            
            //System.out.println(Query);
            JOptionPane.showMessageDialog(null,"one item deleted");
            
            tblModel.removeRow(employee_table.getSelectedRow());
            
        }
        else
        {
            if(employee_table.getRowCount()==0)
            {
                JOptionPane.showMessageDialog(this, "Table is empty");
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Please select a row");
            }
        }
        }catch(Exception e){}
    }//GEN-LAST:event_delete_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               new employee().setVisible(true);           
            }
        });
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clear_button;
    private javax.swing.JButton delete_button;
    private javax.swing.JLabel delete_label;
    private javax.swing.JPanel delete_panel;
    private javax.swing.JPanel desplay_panel;
    private javax.swing.JTextField edep_input;
    private javax.swing.JLabel edep_label;
    private javax.swing.JTable employee_search_table;
    private javax.swing.JTable employee_table;
    private javax.swing.JTextField ename_input;
    private javax.swing.JLabel ename_label;
    private javax.swing.JTextField eno_input;
    private javax.swing.JLabel eno_label;
    private javax.swing.JTextField esal_input;
    private javax.swing.JLabel esal_label;
    private javax.swing.JButton insert_button;
    private javax.swing.JLabel insert_header;
    private javax.swing.JPanel insert_panel;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton search_button;
    private javax.swing.JTextField search_input;
    private javax.swing.JLabel search_label;
    private javax.swing.JScrollPane table_panel;
    private javax.swing.JScrollPane table_panel1;
    // End of variables declaration//GEN-END:variables

}