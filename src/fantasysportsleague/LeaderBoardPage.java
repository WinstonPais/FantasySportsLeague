/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fantasysportsleague;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author winst
 */
public class LeaderBoardPage extends javax.swing.JFrame {

    /**
     * Creates new form LeaderBoardPage
     */
    public LeaderBoardPage() {
        initComponents();
    }
    String user_id="";
    public LeaderBoardPage(String user_id) {
        initComponents();
        this.user_id=user_id;
        try 
            {
                Class.forName("oracle.jdbc.OracleDriver");
                Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","DBMSPROJECT","cannon47061");
                Statement stat=con.createStatement();
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                int count=0;
                ResultSet rs=stat.executeQuery("select u.name,s.total from user_details u , score_board s where u.user_id=s.user_id order by s.total desc");
                String score="";
                while(rs.next())
                {
                    String userid=rs.getString(1);
                    if(rs.getString(2)==null)
                    {
                        score="0";
                    }
                    else
                    {
                        score=rs.getString(2);
                    }
                    count++;
                    if("ADMIN1".equals(userid))
                        continue;
                    
                    model.addRow(new Object[]{count,userid,score});
                   
                }
                con.close();
                
                
                
            } 
            catch (ClassNotFoundException | SQLException ex) 
            {
                Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);

            }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        closeLabel = new javax.swing.JLabel();
        minimizejLabel = new javax.swing.JLabel();
        logOutjLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        BGjLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(null);

        closeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fantasysportsleague/red x 30.png"))); // NOI18N
        closeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeLabelMouseClicked(evt);
            }
        });
        jPanel1.add(closeLabel);
        closeLabel.setBounds(960, 10, 30, 30);

        minimizejLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fantasysportsleague/min yel 30.png"))); // NOI18N
        minimizejLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizejLabelMouseClicked(evt);
            }
        });
        jPanel1.add(minimizejLabel);
        minimizejLabel.setBounds(920, 10, 30, 30);

        logOutjLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fantasysportsleague/backpng.png"))); // NOI18N
        logOutjLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logOutjLabelMouseClicked(evt);
            }
        });
        jPanel1.add(logOutjLabel);
        logOutjLabel.setBounds(10, 10, 40, 40);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Rank", "Name", "Total Score"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(240, 60, 452, 402);

        BGjLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fantasysportsleague/lbbg.jpg"))); // NOI18N
        jPanel1.add(BGjLabel);
        BGjLabel.setBounds(0, 0, 1000, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logOutjLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutjLabelMouseClicked
        // TODO add your handling code here:
        ProfilePage lp= new ProfilePage(user_id);
        lp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logOutjLabelMouseClicked

    private void minimizejLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizejLabelMouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizejLabelMouseClicked

    private void closeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeLabelMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_closeLabelMouseClicked
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
            java.util.logging.Logger.getLogger(LeaderBoardPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LeaderBoardPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LeaderBoardPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LeaderBoardPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LeaderBoardPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BGjLabel;
    private javax.swing.JLabel closeLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel logOutjLabel;
    private javax.swing.JLabel minimizejLabel;
    // End of variables declaration//GEN-END:variables
}
