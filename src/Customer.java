
import java.awt.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sarowar_saurav
 */
public class Customer extends javax.swing.JFrame {

    /**
     * Creates new form Customer
     */
    public Customer() {
        initComponents();
        table_update();
    }
    
    public Connection getConnection(){
        Connection con;
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login-database","root","");
            return con;         
        }catch(SQLException e){
            return null;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        jFullNameLabel = new javax.swing.JLabel();
        jFullName = new javax.swing.JTextField();
        jUsernameLabel5 = new javax.swing.JLabel();
        jLastName = new javax.swing.JTextField();
        jUsernameLabel1 = new javax.swing.JLabel();
        jContact = new javax.swing.JTextField();
        jUsernameLabel4 = new javax.swing.JLabel();
        jID = new javax.swing.JTextField();
        jIdLabel = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jInsert = new javax.swing.JButton();
        jDelete = new javax.swing.JButton();
        jUpdate = new javax.swing.JButton();
        jClear = new javax.swing.JButton();
        jView = new javax.swing.JButton();
        jEmail = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panel1.setBackground(new java.awt.Color(0, 51, 153));

        jFullNameLabel.setFont(new java.awt.Font("BatangChe", 1, 18)); // NOI18N
        jFullNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        jFullNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jFullNameLabel.setText("First lName :");
        jFullNameLabel.setToolTipText("");

        jFullName.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jFullName.setText("fullname");
        jFullName.setToolTipText("");
        jFullName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jFullName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jFullNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFullNameFocusLost(evt);
            }
        });
        jFullName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFullNameActionPerformed(evt);
            }
        });

        jUsernameLabel5.setFont(new java.awt.Font("BatangChe", 1, 18)); // NOI18N
        jUsernameLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jUsernameLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jUsernameLabel5.setText("LastName :  ");
        jUsernameLabel5.setToolTipText("");

        jLastName.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLastName.setText("lastname");
        jLastName.setToolTipText("");
        jLastName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jLastName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jLastNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jLastNameFocusLost(evt);
            }
        });

        jUsernameLabel1.setFont(new java.awt.Font("BatangChe", 1, 18)); // NOI18N
        jUsernameLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jUsernameLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jUsernameLabel1.setText("Contact  :  ");
        jUsernameLabel1.setToolTipText("");

        jContact.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jContact.setText("contact");
        jContact.setToolTipText("");
        jContact.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jContact.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jContactFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jContactFocusLost(evt);
            }
        });

        jUsernameLabel4.setFont(new java.awt.Font("BatangChe", 1, 18)); // NOI18N
        jUsernameLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jUsernameLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jUsernameLabel4.setText("E -Mail  :");
        jUsernameLabel4.setToolTipText("");

        jID.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jID.setText("ID");
        jID.setToolTipText("");
        jID.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jIDFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jIDFocusLost(evt);
            }
        });

        jIdLabel.setFont(new java.awt.Font("BatangChe", 1, 18)); // NOI18N
        jIdLabel.setForeground(new java.awt.Color(255, 255, 255));
        jIdLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jIdLabel.setText("ID       :  ");
        jIdLabel.setToolTipText("");

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane4.setAutoscrolls(true);
        jScrollPane4.setViewportView(jTable2);

        jTable2.setAutoCreateRowSorter(true);
        jTable2.setBackground(new java.awt.Color(51, 0, 51));
        jTable2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 4));
        jTable2.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jTable2.setForeground(new java.awt.Color(255, 255, 255));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "First Name", "Last Name", "Contact", "E-mail"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable2.setToolTipText("");
        jTable2.setColumnSelectionAllowed(true);
        jTable2.setGridColor(new java.awt.Color(255, 255, 255));
        jTable2.setRowHeight(40);
        jTable2.setRowMargin(4);
        jTable2.setSelectionBackground(new java.awt.Color(255, 204, 204));
        jTable2.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jTable2.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable2.setShowGrid(true);
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable2);
        jTable2.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jScrollPane4.setViewportView(jScrollPane3);

        jInsert.setBackground(new java.awt.Color(255, 204, 204));
        jInsert.setFont(new java.awt.Font("Bebas Kai", 0, 14)); // NOI18N
        jInsert.setText("Insert");
        jInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jInsertActionPerformed(evt);
            }
        });

        jDelete.setBackground(new java.awt.Color(255, 204, 204));
        jDelete.setFont(new java.awt.Font("Bebas Kai", 0, 14)); // NOI18N
        jDelete.setText("Delete");
        jDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDeleteActionPerformed(evt);
            }
        });

        jUpdate.setBackground(new java.awt.Color(255, 204, 204));
        jUpdate.setFont(new java.awt.Font("Bebas Kai", 0, 14)); // NOI18N
        jUpdate.setText("Update");
        jUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUpdateActionPerformed(evt);
            }
        });

        jClear.setBackground(new java.awt.Color(255, 102, 51));
        jClear.setFont(new java.awt.Font("Bebas Kai", 0, 14)); // NOI18N
        jClear.setText("Clear");
        jClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jClearActionPerformed(evt);
            }
        });

        jView.setBackground(new java.awt.Color(255, 204, 204));
        jView.setFont(new java.awt.Font("Bebas Kai", 0, 14)); // NOI18N
        jView.setText("View");
        jView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jViewActionPerformed(evt);
            }
        });

        jEmail.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jEmail.setText("email");
        jEmail.setToolTipText("");
        jEmail.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jEmailFocusLost(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jIdLabel)
                                    .addComponent(jFullNameLabel))
                                .addGap(18, 18, 18)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jID)
                                    .addComponent(jFullName, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(jUsernameLabel4)
                                .addGap(38, 38, 38)
                                .addComponent(jEmail))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jUsernameLabel5)
                                    .addComponent(jUsernameLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLastName, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                                    .addComponent(jContact)))))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jClear, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addComponent(jView, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel1Layout.createSequentialGroup()
                        .addComponent(jInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jID, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jFullNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jUsernameLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jContact, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jUsernameLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jUsernameLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jView, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jClear, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    Connection conn;
    PreparedStatement ps;
    private void jIDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jIDFocusLost
        // TODO add your handling code here:
        if(jID.getText().trim().equals("") ||
            jID.getText().trim().toLowerCase().equals("ID"))
        {
            jID.setText("ID");
            jID.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jIDFocusLost

    private void jIDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jIDFocusGained
        // TODO add your handling code here:
        if(jID.getText().trim().toLowerCase().equals("ID"))
        {
            jID.setText("");
            jID.setForeground(Color.black);
        }
    }//GEN-LAST:event_jIDFocusGained

    private void jContactFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jContactFocusLost
        // TODO add your handling code here:
        if(jContact.getText().trim().equals("") ||
            jContact.getText().trim().toLowerCase().equals("contact"))
        {
            jContact.setText("contact");
            jContact.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jContactFocusLost

    private void jContactFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jContactFocusGained
        // TODO add your handling code here:
        if(jContact.getText().trim().toLowerCase().equals("contact"))
        {
            jContact.setText("");
            jContact.setForeground(Color.black);
        }
    }//GEN-LAST:event_jContactFocusGained

    private void jLastNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLastNameFocusLost
        // TODO add your handling code here:
        if(jLastName.getText().trim().equals("") ||
            jLastName.getText().trim().toLowerCase().equals("lastname"))
        {
            jLastName.setText("lastname");
            jLastName.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jLastNameFocusLost

    private void jLastNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLastNameFocusGained
        // TODO add your handling code here:
        if(jLastName.getText().trim().toLowerCase().equals("lastname"))
        {
            jLastName.setText("");
            jLastName.setForeground(Color.black);
        }
    }//GEN-LAST:event_jLastNameFocusGained

    private void jFullNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFullNameFocusLost
        // TODO add your handling code here:
        if(jFullName.getText().trim().equals("") ||
            jFullName.getText().trim().toLowerCase().equals("fullname"))
        {
            jFullName.setText("fullname");
            jFullName.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jFullNameFocusLost

    private void jFullNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFullNameFocusGained
        // TODO add your handling code here:
        if(jFullName.getText().trim().toLowerCase().equals("fullname"))
        {
            jFullName.setText("");
            jFullName.setForeground(Color.black);
        }
    }//GEN-LAST:event_jFullNameFocusGained

    private void jViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jViewActionPerformed
        // TODO add your handling code here:
        DefaultTableModel Df = (DefaultTableModel)jTable2.getModel();
        int selectedIndex = jTable2.getSelectedRow();
        
        jID.setText(Df.getValueAt(selectedIndex,0).toString());
        jFullName.setText(Df.getValueAt(selectedIndex,1).toString());
        jLastName.setText(Df.getValueAt(selectedIndex,2).toString());
        jContact.setText(Df.getValueAt(selectedIndex,3).toString());
        jEmail.setText(Df.getValueAt(selectedIndex,4).toString());
        

    }//GEN-LAST:event_jViewActionPerformed

    private void jUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUpdateActionPerformed
        // TODO add your handling code here:
        DefaultTableModel Df = (DefaultTableModel)jTable2.getModel();
        int selectedIndex = jTable2.getSelectedRow();
        try {
            int id = Integer.parseInt(Df.getValueAt(selectedIndex,0).toString());
            String first_name = jFullName.getText();
            String last_name = jLastName.getText();
            String email = jEmail.getText();
            String tel = jContact.getText();
            conn = getConnection();
            ps = conn.prepareStatement("update customerpage set First_Name=?,Last_Name=?, Contact=?, Email=? where id=?");
            ps.setString(1, first_name);
            ps.setString(2, last_name);
            ps.setString(3, tel);
            ps.setString(4,email);
            ps.setInt(5, id);
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(this,"Record Updated");
            table_update();
            
            jID.setText("");
            jFullName.setText("");
            jLastName.setText("");
            jContact.setText("");
            jEmail.setText("");
            jID.requestFocus();    
        }
        catch (SQLException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this,"Error"+ex);
        }
    }//GEN-LAST:event_jUpdateActionPerformed

    private void jEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jEmailFocusGained
        // TODO add your handling code here:
        if(jEmail.getText().trim().toLowerCase().equals("email"))
        {
            jEmail.setText("");
            jEmail.setForeground(Color.black);
        }
    }//GEN-LAST:event_jEmailFocusGained

    private void jEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jEmailFocusLost
        // TODO add your handling code here:
        if(jEmail.getText().trim().equals("") ||
           jEmail.getText().trim().toLowerCase().equals("email"))
        {
            jEmail.setText("email");
            jEmail.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jEmailFocusLost

    private void jInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jInsertActionPerformed
        // TODO add your handling code here:
        String id = jID.getText();
        String first_name = jFullName.getText();
        String last_name = jLastName.getText();
        String email = jEmail.getText();
        String tel = jContact.getText();
        
        try {
            conn = getConnection();
            ps = conn.prepareStatement("insert into customerpage(ID,First_Name,Last_Name,Contact,Email)values(?,?,?,?,?)");
            ps.setString(1, id);
            ps.setString(2, first_name);
            ps.setString(3, last_name);
            ps.setString(4, tel);
            ps.setString(5,email);
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(this,"Record Added");
            table_update();
            
            jID.setText("");
            jFullName.setText("");
            jLastName.setText("");
            jEmail.setText("");
            jContact.setText("");
            jID.requestFocus();
        }
        
        catch (SQLException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this,"Error"+ex);
        }
        
    }//GEN-LAST:event_jInsertActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jTable2MouseClicked

    private void jDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDeleteActionPerformed
        // TODO add your handling code here:
        DefaultTableModel Df = (DefaultTableModel)jTable2.getModel();
        int selectedIndex = jTable2.getSelectedRow();
        try {
            int id = Integer.parseInt(Df.getValueAt(selectedIndex,0).toString());
            
            int dialogResult=JOptionPane.showConfirmDialog(null,"DO YOU WANT TO DELETE THE RECORD","WARNING",JOptionPane.YES_NO_OPTION);
        
            if(dialogResult==JOptionPane.YES_OPTION)
            {
            conn = getConnection();
            ps = conn.prepareStatement("delete from customerpage where id=?");
            
            ps.setInt(1, id);
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(this,"Record deleted");
            table_update();
            
            
            
            jID.setText("");
            jFullName.setText("");
            jLastName.setText("");
            jEmail.setText("");
            jContact.setText("");
            
            jID.requestFocus();
            }     
        }catch (SQLException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this,"Error"+ex);
        }
    }//GEN-LAST:event_jDeleteActionPerformed

    private void jClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jClearActionPerformed
        // TODO add your handling code here:
        jID.setText("");
        jFullName.setText("");
        jLastName.setText("");
        jEmail.setText("");
        jContact.setText("");
            
        jID.requestFocus();
    }//GEN-LAST:event_jClearActionPerformed

    private void jFullNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFullNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFullNameActionPerformed

    private void table_update()
        {
            int c;
            try {
            Connection conn = getConnection();
            PreparedStatement ps = conn.prepareStatement("select * from customerpage");
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData Rss = rs.getMetaData();
            c = Rss.getColumnCount();
            
            DefaultTableModel Df = (DefaultTableModel)jTable2.getModel();
            Df.setRowCount(0);
            while(rs.next())
            {
                Vector v2 = new Vector();
                for(int a=0; a<c; a++) 
                {
                    v2.add(rs.getString("ID"));
                    v2.add(rs.getString("First_Name"));
                    v2.add(rs.getString("Last_Name"));
                    v2.add(rs.getString("Contact"));
                    v2.add(rs.getString("Email"));
                }
                Df.addRow(v2);
            }
            jFullName.setText("");
            jLastName.setText("");
            jID.setText("");
            jContact.setText("");
            jEmail.setText("");
            jID.requestFocus();
            
            
        }     
        catch (SQLException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this,"Error"+ex);
        }
    }
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
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customer().setVisible(true);
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jClear;
    private javax.swing.JTextField jContact;
    private javax.swing.JButton jDelete;
    private javax.swing.JTextField jEmail;
    private javax.swing.JTextField jFullName;
    private javax.swing.JLabel jFullNameLabel;
    private javax.swing.JTextField jID;
    private javax.swing.JLabel jIdLabel;
    private javax.swing.JButton jInsert;
    private javax.swing.JTextField jLastName;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton jUpdate;
    private javax.swing.JLabel jUsernameLabel1;
    private javax.swing.JLabel jUsernameLabel4;
    private javax.swing.JLabel jUsernameLabel5;
    private javax.swing.JButton jView;
    private java.awt.Panel panel1;
    // End of variables declaration//GEN-END:variables
}
