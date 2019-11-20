/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fantasysportsleague;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author winst
 */
public class adminpage extends javax.swing.JFrame {

    /**
     * Creates new form adminpage
     */
    public adminpage() {
        initComponents();
    }
    String adminid="";
    public adminpage(String id) {
        initComponents();
        adminid=id;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        closeLabel = new javax.swing.JLabel();
        minimizejLabel = new javax.swing.JLabel();
        logOutjLabel = new javax.swing.JLabel();
        generateScorejButton = new javax.swing.JButton();
        resetScorejButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        bgLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(910, 550));

        closeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fantasysportsleague/red x 30.png"))); // NOI18N
        closeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeLabelMouseClicked(evt);
            }
        });

        minimizejLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fantasysportsleague/min yel 30.png"))); // NOI18N
        minimizejLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizejLabelMouseClicked(evt);
            }
        });

        logOutjLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fantasysportsleague/red logout.png"))); // NOI18N
        logOutjLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logOutjLabelMouseClicked(evt);
            }
        });

        generateScorejButton.setFont(new java.awt.Font("Lucida Handwriting", 3, 43)); // NOI18N
        generateScorejButton.setText("Generate Score");
        generateScorejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateScorejButtonActionPerformed(evt);
            }
        });

        resetScorejButton.setFont(new java.awt.Font("Lucida Handwriting", 3, 43)); // NOI18N
        resetScorejButton.setText("RESET Score");
        resetScorejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetScorejButtonActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Players Availability List");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        bgLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fantasysportsleague/genscorebg.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(820, 820, 820)
                .addComponent(minimizejLabel))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(710, 710, 710)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(218, 218, 218)
                .addComponent(resetScorejButton, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(218, 218, 218)
                .addComponent(generateScorejButton, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(logOutjLabel))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(860, 860, 860)
                .addComponent(closeLabel))
            .addComponent(bgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 910, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(minimizejLabel))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(510, 510, 510)
                .addComponent(jButton1))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(315, 315, 315)
                .addComponent(resetScorejButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(generateScorejButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(logOutjLabel))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(closeLabel))
            .addComponent(bgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeLabelMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_closeLabelMouseClicked

    private void minimizejLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizejLabelMouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizejLabelMouseClicked

    private void logOutjLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutjLabelMouseClicked
        // TODO add your handling code here:
        LoginPage lp= new LoginPage();
        lp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logOutjLabelMouseClicked

    private void generateScorejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateScorejButtonActionPerformed
        // TODO add your handling code here:
        generateforcricket();
        generateforfootball();
        insertintoscoreboard();
        JOptionPane.showMessageDialog(null,"Scores have been Generated");
    }//GEN-LAST:event_generateScorejButtonActionPerformed
    static void insertintoscoreboard()
    {
        try 
            {
                Class.forName("oracle.jdbc.OracleDriver");
                Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","DBMSPROJECT","cannon47061");
                Statement stat=con.createStatement();
                ResultSet rs=stat.executeQuery("select user_id from user_details");
                Class.forName("oracle.jdbc.OracleDriver");
                Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","DBMSPROJECT","cannon47061");
                Statement statt=conn.createStatement();
                Class.forName("oracle.jdbc.OracleDriver");
                Connection connn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","DBMSPROJECT","cannon47061");
                CallableStatement stmt=connn.prepareCall("{CALL finalscore(?,?,?)}"); 
                while(rs.next())
                {
                    String cscore="0";
                    String currentuserid=rs.getString("user_id");
                    try
                    {
                        ResultSet rs1=statt.executeQuery("select sum(c_score) from cricket_team_selection where user_id='"+currentuserid+"'");
                        rs1.next();
                        cscore=rs1.getString(1);
                    }
                    catch(Exception e)
                    {
                        
                    }
                    String fscore="0";
                    try{
                        ResultSet rs2=statt.executeQuery("select sum(f_score) from football_team_selection where user_id='"+currentuserid+"'");
                        rs2.next();
                        fscore=rs2.getString(1);
                    }
                    catch(Exception e)
                    {
                        
                    }
                    if(cscore==null)
                    {
                        cscore="0";
                    }
                    if(fscore==null)
                    {
                        fscore="0";
                    }
                    stmt.setString(1,currentuserid);
                    stmt.setInt(2,Integer.parseInt(fscore));  
                    
                    stmt.setInt(3,Integer.parseInt(cscore)); 
//                    stmt.setInt(4,Types.VARCHAR);
                    
                    stmt.execute();  
                    
                }
                con.close();
                conn.close();
                connn.close();
                
                
            } 
            catch (ClassNotFoundException | SQLException ex) 
            {
                Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);

            }
    }
    private void resetScorejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetScorejButtonActionPerformed
        // TODO add your handling code here:
        try 
            {
                Class.forName("oracle.jdbc.OracleDriver");
                Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","DBMSPROJECT","cannon47061");
                Statement stat=con.createStatement();
                stat.executeUpdate("update cricket_players set score=0");
                stat.executeUpdate("update football_players set score=0");
                stat.executeUpdate("delete from score_board");
                JOptionPane.showMessageDialog(null,"Scores have been Reset");
                
                
                
            } 
            catch (ClassNotFoundException | SQLException ex) 
            {
                Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);

            }
    }//GEN-LAST:event_resetScorejButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        AvailabilitySportSelect a=new AvailabilitySportSelect(adminid);
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
static void generateforcricket()
{
    try 
            {
                Class.forName("oracle.jdbc.OracleDriver");
                Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","DBMSPROJECT","cannon47061");
                Statement stat=con.createStatement();
                ResultSet rs=stat.executeQuery("select pl_id,availability from cricket_players");
                Random r=new Random();
                Class.forName("oracle.jdbc.OracleDriver");
                Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","DBMSPROJECT","cannon47061");
                Statement statt=conn.createStatement();
                while(rs.next())
                {
                    if("1".equals(rs.getString("availability")))
                    {
//                        System.out.println("update cricket_players set score="+r.nextInt(10)+" where pl_id="+rs.getString("pl_id"));
                          
                          statt.executeUpdate("update cricket_players set score="+(r.nextInt(10)+1)+" where pl_id='"+rs.getString("pl_id")+"'");
                    }
                    
                }
                
                
            } 
            catch (ClassNotFoundException | SQLException ex) 
            {
                Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);

            }
}

static void generateforfootball()
{
    try 
            {
                Class.forName("oracle.jdbc.OracleDriver");
                Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","DBMSPROJECT","cannon47061");
                Statement stat=con.createStatement();
                ResultSet rs=stat.executeQuery("select pl_id,availability from football_players");
                Random r=new Random();
                Class.forName("oracle.jdbc.OracleDriver");
                Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","DBMSPROJECT","cannon47061");
                Statement statt=conn.createStatement();
                while(rs.next())
                {
                    if("1".equals(rs.getString("availability")))
                    {
                        statt.executeUpdate("update football_players set score="+(r.nextInt(10)+1)+" where pl_id='"+rs.getString("pl_id")+"'");
                    }
                    
                }
                
                
            } 
            catch (ClassNotFoundException | SQLException ex) 
            {
                Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);

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
            java.util.logging.Logger.getLogger(adminpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminpage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgLabel;
    private javax.swing.JLabel closeLabel;
    private javax.swing.JButton generateScorejButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logOutjLabel;
    private javax.swing.JLabel minimizejLabel;
    private javax.swing.JButton resetScorejButton;
    // End of variables declaration//GEN-END:variables
}