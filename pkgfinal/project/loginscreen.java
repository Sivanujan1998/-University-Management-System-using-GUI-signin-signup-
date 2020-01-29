 
package pkgfinal.project;
 import java.awt.Color;
import java.awt.Frame;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.border.Border;
import static javafx.scene.paint.Color.color;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


 
public class loginscreen extends javax.swing.JFrame {
    private Object level;

 
    public loginscreen() {
        initComponents();
        
        this.setLocationRelativeTo(null);
 
        
         
    }

     
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("University Management System");
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Tekton Pro", 1, 36)); // NOI18N
        jLabel1.setText("LOGIN HERE...");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText(" -");
        jLabel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(240, 0, 0));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText(" x");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(539, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(395, 395, 395)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(7, 7, 7))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 128, 240));
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        jLabel2.setText("User Name :");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(380, 130, 145, 42);

        jLabel3.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        jLabel3.setText("Password :");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(400, 200, 143, 53);

        jTextField1.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(153, 153, 153));
        jTextField1.setText("username");
        jTextField1.setToolTipText("");
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });
        jPanel2.add(jTextField1);
        jTextField1.setBounds(570, 130, 265, 42);

        jPasswordField1.setFont(new java.awt.Font("Sylfaen", 0, 24)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(153, 153, 153));
        jPasswordField1.setText("password");
        jPasswordField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordField1FocusLost(evt);
            }
        });
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        jPanel2.add(jPasswordField1);
        jPasswordField1.setBounds(570, 210, 265, 41);

        jButton1.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 24)); // NOI18N
        jButton1.setText("Login");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(830, 310, 146, 43);

        jButton2.setFont(new java.awt.Font("Verdana", 2, 24)); // NOI18N
        jButton2.setText("Register Here.....");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(340, 310, 231, 43);

        jLabel7.setFont(new java.awt.Font("Trajan Pro", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("WELCOME TO THE UNIVERSITY MANAGEMENT SYSTEM");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(250, 60, 760, 45);

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Documents\\NetBeansProjects\\final project\\images\\vintage-cars-desktop-wallpaper_054105168_44.jpg")); // NOI18N
        jLabel6.setText("jLabel6");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(-20, 0, 1290, 560);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
 
        Border label_border= BorderFactory.createMatteBorder(1, 1, 1, 1, Color.blue);
        jLabel4.setBorder(label_border);
        jLabel4.setForeground(Color.blue);
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
    
         Border label_border= BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        jLabel4.setBorder(label_border);
        jLabel4.setForeground(Color.black);
    }//GEN-LAST:event_jLabel4MouseExited

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
       
        Border label_border= BorderFactory.createMatteBorder(1, 1, 1, 1, Color.blue);
        jLabel5.setBorder(label_border);
        jLabel5.setForeground(Color.blue);
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
       
         Border label_border= BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        jLabel5.setBorder(label_border);
        jLabel5.setForeground(Color.black);
    }//GEN-LAST:event_jLabel5MouseExited

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
        if(jTextField1.getText().trim().toLowerCase().equals("username"))
        {
            jTextField1.setText("");
            jTextField1.setForeground(Color.black);
        }
        
        
    }//GEN-LAST:event_jTextField1FocusGained

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
                   if(jTextField1.getText().trim().equals("") || jTextField1.getText().trim().toLowerCase().equals("username"))
                   {
                    jTextField1.setText("username");
            jTextField1.setForeground(new Color(153,153,153));
                   }
                   
                   jTextField1.setBorder(null);
    }//GEN-LAST:event_jTextField1FocusLost

    private void jPasswordField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField1FocusGained
         String pass = String.valueOf(jPasswordField1.getPassword());
        if(pass.trim().toLowerCase().equals("password"))
        {
            jPasswordField1.setText("");
            jPasswordField1.setForeground(Color.black);
        }
    }//GEN-LAST:event_jPasswordField1FocusGained

    private void jPasswordField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField1FocusLost
      String pass=String.valueOf(jPasswordField1.getPassword());
        if(pass.trim().equals("") || pass.trim().toLowerCase().equals("password"))
                   {
                    jPasswordField1.setText("password");
            jPasswordField1.setForeground(new Color(153,153,153));
                   }
                   
                   jPasswordField1.setBorder(null);
    }//GEN-LAST:event_jPasswordField1FocusLost

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
       jButton1.setBackground(new Color(200,101,100));
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        jButton1.setBackground(new Color(200,200,200));
    }//GEN-LAST:event_jButton1MouseExited

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked

    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        jButton2.setBackground(new Color(200,101,100));
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        jButton2.setBackground(new Color(200,200,200));
    }//GEN-LAST:event_jButton2MouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            PreparedStatement st;
            ResultSet rs;
        
        String username = jTextField1.getText();
        String password = String.valueOf(jPasswordField1.getPassword());
        
        
        
        
       
        
        
        String query = "SELECT * FROM details WHERE username = ?   AND password =?";
        if(username.trim().equals("username"))
        {
           JOptionPane.showMessageDialog(null,"Enter your Username","Username is Empty!!",2); 
        }
        else if(password.trim().equals("password")){
            JOptionPane.showMessageDialog(null,"Enter your password","Password is Empty!!",2);
        }else{
        
        try{
        st=MY_DATA.getConnection().prepareStatement(query);
        
        st.setString(1, username);
         st.setString(2, password);
         
         rs=st.executeQuery();
         if(rs.next()){
             resultscreen user=new resultscreen();
        user.display(username,password);
        
         resultscreen form=new resultscreen();
             form.setVisible(true);
             form.pack();
             form.setLocationRelativeTo(null);
             this.dispose();
             
         }else{
             JOptionPane.showMessageDialog(null,"Invalid Username / password","Login Error!!",2);
         }
         
        } catch (SQLException ex){
             Logger.getLogger(loginscreen.class.getName()).log(Level.SEVERE,null,ex);
            
        }
       
        
        }
  
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
registerscreen form=new registerscreen();
        form.setVisible(true);
        form.pack();
        form.setLocationRelativeTo(null);
        this.dispose();          
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
       
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginscreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    private void setstate(int ICONIFIED) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
