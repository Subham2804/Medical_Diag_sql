
package db_conn;
import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class Form extends javax.swing.JFrame {
    
    Connection conn=null;
    String x1,x2,x3,d,r;
    static String Name,Mobile,Address;
    
    public Form() {
        initComponents();
       
        
    }
    public Form(String x,String y,String z) {
         initComponents();
        conn=Medical_Diagnosis.connect();
        name.setText(x);
        name.setEditable(false);
        Name=x;
        Mobile=y;
        Address=z;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        e1 = new javax.swing.JComboBox();
        External = new javax.swing.JRadioButton();
        e2 = new javax.swing.JComboBox();
        e3 = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        et2 = new javax.swing.JTextArea();
        el2 = new javax.swing.JLabel();
        et1 = new javax.swing.JTextField();
        el1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        i1 = new javax.swing.JComboBox();
        Internal = new javax.swing.JRadioButton();
        i2 = new javax.swing.JComboBox();
        i3 = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        it2 = new javax.swing.JTextArea();
        il1 = new javax.swing.JLabel();
        it1 = new javax.swing.JTextField();
        il2 = new javax.swing.JLabel();
        Diagnose = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        name = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(150, 150, 209));
        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        e1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Location" }));
        e1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                e1ItemStateChanged(evt);
            }
        });
        e1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(External);
        External.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        External.setText("External");
        External.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExternalActionPerformed(evt);
            }
        });

        e2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Symptom 1" }));
        e2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e2ActionPerformed(evt);
            }
        });

        e3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Symptom 2" }));
        e3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e3ActionPerformed(evt);
            }
        });

        et2.setColumns(20);
        et2.setRows(5);
        jScrollPane1.setViewportView(et2);

        el2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        el2.setText("Treatment");

        el1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        el1.setText("Disease");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(External)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(e1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(e2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(e3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(53, 53, 53))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(el2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(el1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(et1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(External)
                .addGap(18, 18, 18)
                .addComponent(e1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(e2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(e3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(et1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(el1))
                .addGap(120, 120, 120)
                .addComponent(el2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(211, 108, 108));

        i1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Symptom 1" }));
        i1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                i1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(Internal);
        Internal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Internal.setText("Internal");
        Internal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InternalActionPerformed(evt);
            }
        });

        i2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "symptom 2" }));
        i2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                i2ActionPerformed(evt);
            }
        });

        i3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "symptom 3" }));
        i3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                i3ActionPerformed(evt);
            }
        });

        it2.setColumns(20);
        it2.setRows(5);
        jScrollPane2.setViewportView(it2);

        il1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        il1.setText("Disease");

        il2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        il2.setText("Treatment");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Internal)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(i3, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(i2, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(i1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 22, Short.MAX_VALUE)
                        .addComponent(il1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(il2)
                            .addComponent(it1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(Internal)
                .addGap(18, 18, 18)
                .addComponent(i1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(i2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(i3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(it1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(il1))
                .addGap(126, 126, 126)
                .addComponent(il2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        Diagnose.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Diagnose.setText("Diagnose");
        Diagnose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiagnoseActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Generate Report");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("Exit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel4.setText("Name");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        jLabel1.setText("* Please Fill the given Form Carefully");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                            .addComponent(Diagnose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(Diagnose, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(132, 132, 132)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void e1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_e1ItemStateChanged
        
    
     
    }//GEN-LAST:event_e1ItemStateChanged

    private void ExternalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExternalActionPerformed
       Internal.setEnabled(false);
       i1.setEnabled(false);
       i2.setEnabled(false);
       i3.setEnabled(false);
       it1.setEnabled(false);
       it2.setEnabled(false);
       il1.setEnabled(false);
       il2.setEnabled(false);
       ecb1();
       
    }//GEN-LAST:event_ExternalActionPerformed

    private void InternalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InternalActionPerformed
       External.setEnabled(false);
       e1.setEnabled(false);
       e2.setEnabled(false);
       e3.setEnabled(false);
       et1.setEnabled(false);
       et2.setEnabled(false);
       el1.setEnabled(false);
       el2.setEnabled(false);
       icb1();
       
    }//GEN-LAST:event_InternalActionPerformed

    private void e1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e1ActionPerformed
        
        x1=e1.getSelectedItem().toString();
        ecb2();
    }//GEN-LAST:event_e1ActionPerformed

    private void e2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e2ActionPerformed
       x2=e2.getSelectedItem().toString();
        ecb3();
       
    }//GEN-LAST:event_e2ActionPerformed

    private void e3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e3ActionPerformed
         x3=e3.getSelectedItem().toString();
    }//GEN-LAST:event_e3ActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void i2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_i2ActionPerformed
          x2=i2.getSelectedItem().toString();
        icb3();
        
    }//GEN-LAST:event_i2ActionPerformed

    private void i1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_i1ActionPerformed
      x1=i1.getSelectedItem().toString();
        icb2();
    }//GEN-LAST:event_i1ActionPerformed

    private void i3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_i3ActionPerformed
        x3=i3.getSelectedItem().toString();
    }//GEN-LAST:event_i3ActionPerformed

    private void DiagnoseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiagnoseActionPerformed
      if(External.isSelected())
      {
       ecb1();
       ed();
       er();
      }
      else if(Internal.isSelected())
      {
       icb1();
       id();
       ir();
      }
      else{System.out.println("Please select a radio button");}
              {}
        
    }//GEN-LAST:event_DiagnoseActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Report rp;
        rp=new Report(Name,Mobile,Address, x1,x2,x3,d,r);
        rp.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     this.hide();
     
    }//GEN-LAST:event_jButton1ActionPerformed
    public void ecb1()
    {
     try{   
         Class.forName("com.mysql.jdbc.Driver");

         Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/medical","root","Subham@8991");
         String sql="select distinct location from external";
        PreparedStatement pst=conn.prepareStatement(sql);
        ResultSet rs=pst.executeQuery();
        
        while(rs.next())
        {   
            e1.addItem(rs.getString("location"));
        }
        conn.close();
     }
     
     catch(ClassNotFoundException | SQLException e){System.out.println("jobdone");}
     
    }
     public void ecb2()
    {
     try{   
         Class.forName("com.mysql.jdbc.Driver");

         Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/medical","root","Subham@8991");
         String sql="select distinct s1 from external where location=?";
         PreparedStatement pst=conn.prepareStatement(sql);
         pst.setString(1,x1);
         ResultSet rs=pst.executeQuery();
        
        while(rs.next())
        {   
            e2.addItem(rs.getString("s1"));
        }
        conn.close();
     }
     
     catch(ClassNotFoundException | SQLException e){System.out.println("jobdone");}
     
    }
     
      public void ecb3()
    {
     try{   
         Class.forName("com.mysql.jdbc.Driver");

         Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/medical","root","Subham@8991");
         String sql="select distinct s2 from external where s1=?";
        PreparedStatement pst=conn.prepareStatement(sql);
        pst.setString(1,x2);
        
        ResultSet rs=pst.executeQuery();
        
        while(rs.next())
        {   
            e3.addItem(rs.getString("s2"));
        }
        conn.close();
     }
     
     catch(ClassNotFoundException | SQLException e){System.out.println("jobdone");}
     
    }
    public void icb1()
    {
     try{   
         Class.forName("com.mysql.jdbc.Driver");

         Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/medical","root","Subham@8991");
         String sql="select distinct sy1 from internal";
        PreparedStatement pst=conn.prepareStatement(sql);
        ResultSet rs=pst.executeQuery();
        
        while(rs.next())
        {   
            i1.addItem(rs.getString("sy1"));
        }
        conn.close();
     }
     
     catch(ClassNotFoundException | SQLException e){System.out.println("jobdone");}
     
    }
     public void icb2()
    {
     try{   
         Class.forName("com.mysql.jdbc.Driver");

         Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/medical","root","Subham@8991");
         String sql="select distinct sy2 from internal where sy1=?";
         PreparedStatement pst=conn.prepareStatement(sql);
         pst.setString(1,x1);
         ResultSet rs=pst.executeQuery();
        
        while(rs.next())
        {   
            i2.addItem(rs.getString("sy2"));
        }
        conn.close();
     }
     
     catch(ClassNotFoundException | SQLException e){System.out.println("jobdone");}
     
    }
     
      public void icb3()
    {
     try{   
         Class.forName("com.mysql.jdbc.Driver");

         Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/medical","root","Subham@8991");
         String sql="select distinct sy3 from internal where sy2=?";
        PreparedStatement pst=conn.prepareStatement(sql);
        pst.setString(1,x2);
        
        ResultSet rs=pst.executeQuery();
        
        while(rs.next())
        {   
            i3.addItem(rs.getString("sy3"));
        }
        conn.close();
     }
     
     catch(ClassNotFoundException | SQLException e){System.out.println("jobdone");}
     
    }
      
       public void ed()
    {
     try{   
         Class.forName("com.mysql.jdbc.Driver");

         Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/medical","root","Subham@8991");
         String sql="select distinct disease from external where location=? and s1=? and s2=?";
        PreparedStatement pst=conn.prepareStatement(sql);
        pst.setString(1,x1);
        pst.setString(2,x2);
        pst.setString(3,x3);
        
        ResultSet rs=pst.executeQuery();
        
        while(rs.next())
        {   
            et1.setText(rs.getString("disease"));
            d=et1.getText();
        }
        conn.close();
     }
     
     catch(ClassNotFoundException | SQLException e){System.out.println("jobdone");}
     
    }
       
        public void id()
    {
     try{   
         Class.forName("com.mysql.jdbc.Driver");

         Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/medical","root","Subham@8991");
         String sql="select distinct disease from internal where sy1=? and sy2=? and sy3=?";
        PreparedStatement pst=conn.prepareStatement(sql);
        pst.setString(1,x1);
        pst.setString(2,x2);
        pst.setString(3,x3);
        
        ResultSet rs=pst.executeQuery();
        
        while(rs.next())
        {   
            it1.setText(rs.getString("disease"));
            d=it1.getText();
        }
        conn.close();
     }
     
     catch(ClassNotFoundException | SQLException e){System.out.println("jobdone");}
     
    }
        
        public void er()
    {
     try{   
         Class.forName("com.mysql.jdbc.Driver");

         Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/medical","root","Subham@8991");
         String sql="select distinct remedy from external where location=? and s1=? and s2=? and disease=?" ;
        PreparedStatement pst=conn.prepareStatement(sql);
        pst.setString(1,x1);
        pst.setString(2,x2);
        pst.setString(3,x3);
        pst.setString(4,d);
        
        ResultSet rs=pst.executeQuery();
        
        while(rs.next())
        {   et2.setText(rs.getString("remedy"));
            r=et2.getText();
        }
        conn.close();
     }
     
     catch(ClassNotFoundException | SQLException e){System.out.println("jobdone");}
     
    }
       
        public void ir()
    {
     try{   
         Class.forName("com.mysql.jdbc.Driver");

         Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/medical","root","Subham@8991");
         String sql="select distinct remedy from internal where sy1=? and sy2=? and sy3=? and disease=?";
        PreparedStatement pst=conn.prepareStatement(sql);
        pst.setString(1,x1);
        pst.setString(2,x2);
        pst.setString(3,x3);
        pst.setString(4,d);
        
        ResultSet rs=pst.executeQuery();
        
        while(rs.next())
        {   it2.setText(rs.getString("remedy"));
            r=it2.getText();
        }
        conn.close();
     }
     
     catch(ClassNotFoundException | SQLException e){System.out.println("jobdone");}
     
    }
    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form(Name,Mobile,Address).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Diagnose;
    private javax.swing.JRadioButton External;
    private javax.swing.JRadioButton Internal;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox e1;
    private javax.swing.JComboBox e2;
    private javax.swing.JComboBox e3;
    private javax.swing.JLabel el1;
    private javax.swing.JLabel el2;
    private javax.swing.JTextField et1;
    private javax.swing.JTextArea et2;
    private javax.swing.JComboBox i1;
    private javax.swing.JComboBox i2;
    private javax.swing.JComboBox i3;
    private javax.swing.JLabel il1;
    private javax.swing.JLabel il2;
    private javax.swing.JTextField it1;
    private javax.swing.JTextArea it2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField name;
    // End of variables declaration//GEN-END:variables
}
