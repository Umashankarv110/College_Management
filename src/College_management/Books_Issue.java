package College_management;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Books_Issue extends javax.swing.JFrame {

    public Books_Issue() {
        initComponents();
        ComboBox1();
        ComboBox();
    }

    public void ComboBox(){
            try {
           Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            java.sql.Connection cn = DriverManager.getConnection("jdbc:derby://localhost:1527/MyData");
            Statement st = cn.createStatement();
            String str = "Select sid from Student_Entry";
            ResultSet rs = st.executeQuery(str);
            while(rs.next()){
                ComboId.addItem(rs.getString("sid"));
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
public void ComboBox1(){
            try {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            Connection cn = DriverManager.getConnection("jdbc:derby://localhost:1527/MyData");
            Statement st = cn.createStatement();
            String str = "Select Book_name from Book_Info";
            ResultSet rs = st.executeQuery(str);
            while(rs.next()){
                Book_name.addItem(rs.getString("Book_name"));
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
}

//    String imgPath;
//     public ImageIcon ResizeImage(String ImagePath, byte[] pic)
//    {
//        ImageIcon MyImage;
//        if(ImagePath == "")
//        {
//           MyImage = new ImageIcon(ImagePath);
//        }else
//        {
//            MyImage = new ImageIcon(pic);
//        }
//        Image img = MyImage.getImage();
//        Image newImg = img.getScaledInstance(lblphoto.getWidth(), lblphoto.getHeight(), Image.SCALE_SMOOTH);
//        ImageIcon image = new ImageIcon(newImg);
//        return image;
//    }


@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Book_name = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblclass = new javax.swing.JLabel();
        Stuclass = new javax.swing.JComboBox<>();
        course = new javax.swing.JLabel();
        sname = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ComboId = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        comboIssue = new com.toedter.calendar.JDateChooser();
        comboSubmit = new com.toedter.calendar.JDateChooser();
        lblmob = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("College Management System");
        setUndecorated(true);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Issue Date :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Submit Date :");

        Book_name.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Book_name.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Select Book Name---" }));
        Book_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Book_nameActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Book Name :");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/reading.png"))); // NOI18N
        jButton1.setText("Issue Book");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/text-book-opened-from-top-view.png"))); // NOI18N
        jButton6.setText("View issue ");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(204, 255, 204));
        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("College Management System");

        jLabel11.setBackground(new java.awt.Color(204, 255, 204));
        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Books_Issue");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Course :");

        lblclass.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblclass.setText("Class:");

        Stuclass.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Stuclass.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--- Select Class ---", "FYBsc cs", "SYBsc cs", "TYBsc cs" }));
        Stuclass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StuclassActionPerformed(evt);
            }
        });

        course.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        course.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        sname.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sname.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Student Name:");

        ComboId.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ComboId.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--- Select ID ---" }));
        ComboId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboIdActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Select Rollno:");

        lblmob.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblmob.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Contect no:");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/close.png"))); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/back.png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 761, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(ComboId, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addComponent(jLabel7)
                .addGap(6, 6, 6)
                .addComponent(sname, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(325, 325, 325)
                .addComponent(course, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(lblmob, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addComponent(lblclass, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(Stuclass, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(Book_name, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(comboIssue, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(comboSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(233, 233, 233)
                .addComponent(jButton1)
                .addGap(26, 26, 26)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(ComboId, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addComponent(course, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblmob, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblclass, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Stuclass, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(Book_name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboIssue, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(comboSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

            try {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            Connection cn = DriverManager.getConnection("jdbc:derby://localhost:1527/MyData");
            String str ="INSERT INTO BOOK_ISSUE VALUES (?,?,?,?,?,?,?,?)";
            PreparedStatement ps = cn.prepareStatement(str);
            ps.setString(1,ComboId.getSelectedItem().toString());
            ps.setString(2, sname.getText());
            ps.setString(3,course.getText());
            ps.setString(4, lblmob.getText());
            ps.setString(5,Stuclass.getSelectedItem().toString());
            ps.setString(6,Book_name.getSelectedItem().toString());
            ps.setDate(7, new java.sql.Date(comboIssue.getDate().getTime()));
            ps.setDate(8, new java.sql.Date(comboSubmit.getDate().getTime()));
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "BOOK ISSUED..............");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        View_All_Issues_Books vb = new View_All_Issues_Books();
        vb.show();
        dispose();
        vb.table();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        LibraryMainPanel mp = new LibraryMainPanel();
        mp.show();
        dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void StuclassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StuclassActionPerformed
        // TODO add your handling code here:
//        String course=Stuclass.getSelectedItem().toString();
//        if(course.equalsIgnoreCase("FYBsc cs"))
//        {
//            amt.setText("30000");
//            gst.setText("1000");
//            int amount= Integer.parseInt(amt.getText());
//            int gst1 = Integer.parseInt(gst.getText());
//            int total = amount + gst1;
//            totalamt.setText(""+total);
//        }
//        if(course.equalsIgnoreCase("SYBsc cs"))
//        {
//            amt.setText("34000");
//            gst.setText("1500");
//            int amount= Integer.parseInt(amt.getText());
//            int gst1 = Integer.parseInt(gst.getText());
//            int total = amount + gst1;
//            totalamt.setText(""+total);
//        }
//        if(course.equalsIgnoreCase("TYBsc cs"))
//        {
//            amt.setText("38000");
//            gst.setText("2000");
//            int amount= Integer.parseInt(amt.getText());
//            int gst1 = Integer.parseInt(gst.getText());
//            int total = amount + gst1;
//            totalamt.setText(""+total);
//        }
//        if(course.equalsIgnoreCase("FYBsc IT"))
//        {
//            amt.setText("28000");
//            gst.setText("1000");
//            int amount= Integer.parseInt(amt.getText());
//            int gst1 = Integer.parseInt(gst.getText());
//            int total = amount + gst1;
//            totalamt.setText(""+total);
//        }
//        if(course.equalsIgnoreCase("SYBsc IT"))
//        {
//            amt.setText("30000");
//            gst.setText("1500");
//            int amount= Integer.parseInt(amt.getText());
//            int gst1 = Integer.parseInt(gst.getText());
//            int total = amount + gst1;
//            totalamt.setText(""+total);
//        }
//        if(course.equalsIgnoreCase("TYBsc IT"))
//        {
//            amt.setText("34000");
//            gst.setText("2000");
//            int amount= Integer.parseInt(amt.getText());
//            int gst1 = Integer.parseInt(gst.getText());
//            int total = amount + gst1;
//            totalamt.setText(""+total);
//        }
    }//GEN-LAST:event_StuclassActionPerformed

    private void ComboIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboIdActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            java.sql.Connection cn = DriverManager.getConnection("jdbc:derby://localhost:1527/MyData");
            String sql = "Select * from student_Entry where sid = ? ";
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, ComboId.getSelectedItem().toString());
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                sname.setText(rs.getString("sname"));
                course.setText(rs.getString("Course"));
                lblmob.setText(rs.getString("Mob"));
            }

        } catch (Exception e) {
            e.getMessage();
        }

    }//GEN-LAST:event_ComboIdActionPerformed

    private void Book_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Book_nameActionPerformed
//        // TODO add your handling code here:
//        
//        try {
//            String bname = Book_name.getSelectedItem().toString();
//            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
//            Connection cn = DriverManager.getConnection("jdbc:derby://localhost:1527/MyData");
//            String str = "Select image from Book_info where book_name='"+bname+"' ";
//            Statement st = cn.createStatement();
//            ResultSet rs = st.executeQuery(str);
//            while(rs.next()){
//                lblphoto.setIcon(ResizeImage(null, rs.getBytes("image")));
//            }
//        }
//        catch (Exception e) {
//            JOptionPane.showMessageDialog(rootPane, e.getMessage());
//        }
//        
    }//GEN-LAST:event_Book_nameActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton9ActionPerformed

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
            java.util.logging.Logger.getLogger(Books_Issue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Books_Issue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Books_Issue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Books_Issue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Books_Issue().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Book_name;
    private javax.swing.JComboBox<String> ComboId;
    private javax.swing.JComboBox<String> Stuclass;
    private com.toedter.calendar.JDateChooser comboIssue;
    private com.toedter.calendar.JDateChooser comboSubmit;
    private javax.swing.JLabel course;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblclass;
    private javax.swing.JLabel lblmob;
    private javax.swing.JLabel sname;
    // End of variables declaration//GEN-END:variables
}
