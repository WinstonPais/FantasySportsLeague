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
public class cricketAvailability extends javax.swing.JFrame {

    /**
     * Creates new form cricketAvailability
     */
    String admin_id="";
    String FirstName="",LastName="";
    public cricketAvailability() {
        initComponents();
    }
    public cricketAvailability(String admin_id) {
        initComponents();
        this.admin_id=admin_id;
        
        try 
            {
                Class.forName("oracle.jdbc.OracleDriver");
                Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","DBMSPROJECT","cannon47061");
                Statement stat=con.createStatement();
                String q1="select c_player_fn,c_player_ln,team,position,availability from";
                String q2=" cricket_players";
                ResultSet rs=stat.executeQuery( q1.concat(q2));
                
                DefaultTableModel model = (DefaultTableModel) availablejTable.getModel();
                DefaultTableModel model1 = (DefaultTableModel) InjuredjTable.getModel();
                while(rs.next())
                {
                    String testt="f_player_ln";
                    String firstname = rs.getString("c_player_fn");
                    String lastName = rs.getString(testt.replace('f', 'c'));
                    String team = rs.getString("team");
                    String position = rs.getString("position");
                    String avail=rs.getString("availability");
                    if("1".equals(avail))
                    {
                        model.addRow(new Object[]{firstname,lastName,position,team});
                    }
                    else
                    {
                        model1.addRow(new Object[]{firstname,lastName,position,team});
                    }
                    
                }
                con.close();
                
            } 
            catch (ClassNotFoundException | SQLException ex) 
            {
                Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);

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

        jPanel1 = new javax.swing.JPanel();
        minimizejLabel = new javax.swing.JLabel();
        closeLabel = new javax.swing.JLabel();
        logOutjLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        InjuredjTable = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        availablejTable = new javax.swing.JTable();
        InjuredTeamSelectComboBox = new javax.swing.JComboBox();
        AvailableTeamSelectComboBox1 = new javax.swing.JComboBox();
        availablepositionComboBox = new javax.swing.JComboBox();
        InjuredpositionComboBox1 = new javax.swing.JComboBox();
        InjuredSearchButton1 = new javax.swing.JButton();
        availableSearchButton = new javax.swing.JButton();
        movetoAvailablelistLabel1 = new javax.swing.JLabel();
        movetoinjuredlistLabel = new javax.swing.JLabel();
        pointleftarrowtextLabel1 = new javax.swing.JLabel();
        addtoavailablelistarrowLabel = new javax.swing.JLabel();
        pointrightarrowtextLabel = new javax.swing.JLabel();
        addtoinjuredlistarrowLabel = new javax.swing.JLabel();
        bgLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(null);

        minimizejLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fantasysportsleague/min yel 30.png"))); // NOI18N
        minimizejLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizejLabelMouseClicked(evt);
            }
        });
        jPanel1.add(minimizejLabel);
        minimizejLabel.setBounds(920, 10, 30, 30);

        closeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fantasysportsleague/red x 30.png"))); // NOI18N
        closeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeLabelMouseClicked(evt);
            }
        });
        jPanel1.add(closeLabel);
        closeLabel.setBounds(960, 10, 30, 30);

        logOutjLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fantasysportsleague/backpng.png"))); // NOI18N
        logOutjLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logOutjLabelMouseClicked(evt);
            }
        });
        jPanel1.add(logOutjLabel);
        logOutjLabel.setBounds(10, 10, 40, 40);

        InjuredjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "First Name", "Last Name", "Team", "Position"
            }
        ));
        InjuredjTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InjuredjTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(InjuredjTable);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(670, 120, 310, 340);

        availablejTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "First Name", "Last Name", "Team", "Position"
            }
        ));
        availablejTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                availablejTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(availablejTable);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(30, 122, 310, 340);

        InjuredTeamSelectComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Team", "CSK", "DC", "KXP", "KKR", "MI", "RR", "RCB", "SRH", " " }));
        jPanel1.add(InjuredTeamSelectComboBox);
        InjuredTeamSelectComboBox.setBounds(670, 60, 130, 20);

        AvailableTeamSelectComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Team", "CSK", "DC", "KXP", "KKR", "MI", "RR", "RCB", "SRH", " " }));
        jPanel1.add(AvailableTeamSelectComboBox1);
        AvailableTeamSelectComboBox1.setBounds(30, 60, 130, 20);

        availablepositionComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Position", "BAT", "AR", "WKB", "BALL" }));
        jPanel1.add(availablepositionComboBox);
        availablepositionComboBox.setBounds(200, 60, 140, 20);

        InjuredpositionComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Position", "BAT", "AR", "WKB", "BALL" }));
        jPanel1.add(InjuredpositionComboBox1);
        InjuredpositionComboBox1.setBounds(820, 60, 140, 20);

        InjuredSearchButton1.setText("Search");
        InjuredSearchButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InjuredSearchButton1MouseClicked(evt);
            }
        });
        InjuredSearchButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InjuredSearchButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(InjuredSearchButton1);
        InjuredSearchButton1.setBounds(670, 90, 310, 23);

        availableSearchButton.setText("Search");
        availableSearchButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                availableSearchButtonMouseClicked(evt);
            }
        });
        availableSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                availableSearchButtonActionPerformed(evt);
            }
        });
        jPanel1.add(availableSearchButton);
        availableSearchButton.setBounds(30, 90, 310, 23);

        movetoAvailablelistLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                movetoAvailablelistLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(movetoAvailablelistLabel1);
        movetoAvailablelistLabel1.setBounds(380, 350, 250, 90);

        movetoinjuredlistLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                movetoinjuredlistLabelMouseClicked(evt);
            }
        });
        jPanel1.add(movetoinjuredlistLabel);
        movetoinjuredlistLabel.setBounds(380, 180, 250, 90);

        pointleftarrowtextLabel1.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        pointleftarrowtextLabel1.setForeground(new java.awt.Color(255, 255, 255));
        pointleftarrowtextLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pointleftarrowtextLabel1.setText("Add To the Available List");
        jPanel1.add(pointleftarrowtextLabel1);
        pointleftarrowtextLabel1.setBounds(400, 360, 230, 60);

        addtoavailablelistarrowLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fantasysportsleague/pointleftarrow.png"))); // NOI18N
        jPanel1.add(addtoavailablelistarrowLabel);
        addtoavailablelistarrowLabel.setBounds(380, 350, 250, 90);

        pointrightarrowtextLabel.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        pointrightarrowtextLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pointrightarrowtextLabel.setText("Add To the Unavailable List");
        jPanel1.add(pointrightarrowtextLabel);
        pointrightarrowtextLabel.setBounds(390, 204, 230, 40);

        addtoinjuredlistarrowLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fantasysportsleague/pointrightarrow.png"))); // NOI18N
        jPanel1.add(addtoinjuredlistarrowLabel);
        addtoinjuredlistarrowLabel.setBounds(380, 180, 250, 90);

        bgLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fantasysportsleague/cricbbg.jpg"))); // NOI18N
        jPanel1.add(bgLabel1);
        bgLabel1.setBounds(0, 0, 1000, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1001, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void minimizejLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizejLabelMouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizejLabelMouseClicked

    private void closeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeLabelMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_closeLabelMouseClicked

    private void logOutjLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutjLabelMouseClicked
        // TODO add your handling code here:
        AvailabilitySportSelect lp= new AvailabilitySportSelect(admin_id);
        lp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logOutjLabelMouseClicked
public static void deleteAllRows(final DefaultTableModel model) 
    {
        for( int i = model.getRowCount() - 1; i >= 0; i-- ) 
        {
            model.removeRow(i);
        }
    }
    private void availableSearchButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_availableSearchButtonMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) availablejTable.getModel();
        deleteAllRows(model);
        String selectedteam=(String)AvailableTeamSelectComboBox1.getSelectedItem();
        String selectedposition=(String)availablepositionComboBox.getSelectedItem();
        try
        {
            Class.forName("oracle.jdbc.OracleDriver");
            try (Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","DBMSPROJECT","cannon47061")) {
                Statement stat=con.createStatement();
                //                DefaultTableModel model1 = (DefaultTableModel) jTable1.getModel();
                ResultSet rs;

                if("Select Team".equals(selectedteam)&&"Select Position".equals(selectedposition))
                {
                    rs=stat.executeQuery("select c_player_fn,c_player_ln,team,position from cricket_players where availability=1");
                    //                    System.out.println("Reached inisde if"+selectedposition+" "+selectedteam);
                }
                else
                if("Select Team".equals(selectedteam))
                {
                    //                        System.out.println("Reached inisde second if");
                    rs=stat.executeQuery("select c_player_fn,c_player_ln,team,position from cricket_players where position='"+selectedposition+"' and availability=1");
                }
                else
                if("Select Position".equals(selectedposition))
                {
                    //                            System.out.println("Reached inisde third if");
                    rs=stat.executeQuery("select c_player_fn,c_player_ln,team,position from cricket_players where team='"+selectedteam+"' and availability=1");
                }
                else
                {
                    //                            System.out.println("Reached inisde else"+selectedposition+ " "+ selectedteam);
                    rs=stat.executeQuery("select c_player_fn,c_player_ln,team,position from cricket_players where team='"+selectedteam+"' and position='"+selectedposition+"' and availability=1");
                }
                //                System.out.println("Reached before while");
                while(rs.next())
                {

                    String firstname = rs.getString("c_player_fn");
                    String lastName = rs.getString("c_player_ln");
                    String team = rs.getString("team");
                    String position = rs.getString("position");
                    model.addRow(new Object[]{firstname,lastName,position,team});
                }
            }

        }
        catch (ClassNotFoundException | SQLException ex)
        {
            Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);

        }
    }//GEN-LAST:event_availableSearchButtonMouseClicked

    private void availableSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_availableSearchButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_availableSearchButtonActionPerformed

    private void InjuredSearchButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InjuredSearchButton1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) InjuredjTable.getModel();
        deleteAllRows(model);
        String selectedteam=(String)InjuredTeamSelectComboBox.getSelectedItem();
        String selectedposition=(String)InjuredpositionComboBox1.getSelectedItem();
        try
        {
            Class.forName("oracle.jdbc.OracleDriver");
            try (Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","DBMSPROJECT","cannon47061")) {
                Statement stat=con.createStatement();
                //                DefaultTableModel model1 = (DefaultTableModel) jTable1.getModel();
                ResultSet rs;

                if("Select Team".equals(selectedteam)&&"Select Position".equals(selectedposition))
                {
                    rs=stat.executeQuery("select c_player_fn,c_player_ln,team,position from cricket_players where availability=0");
                    //                    System.out.println("Reached inisde if"+selectedposition+" "+selectedteam);
                }
                else
                if("Select Team".equals(selectedteam))
                {
                    //                        System.out.println("Reached inisde second if");
                    rs=stat.executeQuery("select c_player_fn,c_player_ln,team,position from cricket_players where position='"+selectedposition+"' and availability=0");
                }
                else
                if("Select Position".equals(selectedposition))
                {
                    //                            System.out.println("Reached inisde third if");
                    rs=stat.executeQuery("select c_player_fn,c_player_ln,team,position from cricket_players where team='"+selectedteam+"' and availability=0");
                }
                else
                {
                    //                            System.out.println("Reached inisde else"+selectedposition+ " "+ selectedteam);
                    rs=stat.executeQuery("select c_player_fn,c_player_ln,team,position from cricket_players where team='"+selectedteam+"' and position='"+selectedposition+"' and availability=0");
                }
                //                System.out.println("Reached before while");
                while(rs.next())
                {

                    String firstname = rs.getString("c_player_fn");
                    String lastName = rs.getString("c_player_ln");
                    String team = rs.getString("team");
                    String position = rs.getString("position");
                    model.addRow(new Object[]{firstname,lastName,position,team});
                }
            }

        }
        catch (ClassNotFoundException | SQLException ex)
        {
            Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);

        }
    }//GEN-LAST:event_InjuredSearchButton1MouseClicked

    private void InjuredSearchButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InjuredSearchButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InjuredSearchButton1ActionPerformed

    private void availablejTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_availablejTableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model=(DefaultTableModel) availablejTable.getModel();
        int selectedRow=availablejTable.getSelectedRow();
        FirstName=model.getValueAt(selectedRow, 0).toString();
        LastName=model.getValueAt(selectedRow, 1).toString();
    }//GEN-LAST:event_availablejTableMouseClicked

    private void InjuredjTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InjuredjTableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model=(DefaultTableModel) InjuredjTable.getModel();
        int selectedRow=InjuredjTable.getSelectedRow();
        FirstName=model.getValueAt(selectedRow, 0).toString();
        LastName=model.getValueAt(selectedRow, 1).toString();
    }//GEN-LAST:event_InjuredjTableMouseClicked

    private void movetoinjuredlistLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_movetoinjuredlistLabelMouseClicked
        // TODO add your handling code here:
        try 
            {
                Class.forName("oracle.jdbc.OracleDriver");
                Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","DBMSPROJECT","cannon47061");
                Statement stat=con.createStatement();
                if("".equals(FirstName)||"".equals(LastName))
                {
                    JOptionPane.showMessageDialog(null,"Select a Player First");
                }
                else
                {
                    try
                    {
                        stat.executeUpdate("update cricket_players set availability=0 where c_player_fn='"+FirstName+"' and c_player_ln='"+LastName+"'");
                        cricketAvailability ca=new cricketAvailability(admin_id);
                        ca.setVisible(true);
                        this.dispose();
                    }
                    catch(Exception e)
                    {
                        JOptionPane.showMessageDialog(null,"Player is already Unavailable");
                    }
                }
                

                
                
            } 
            catch (ClassNotFoundException | SQLException ex) 
            {
                Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);

            }
    }//GEN-LAST:event_movetoinjuredlistLabelMouseClicked

    private void movetoAvailablelistLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_movetoAvailablelistLabel1MouseClicked
        // TODO add your handling code here:
        try 
            {
                Class.forName("oracle.jdbc.OracleDriver");
                Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","DBMSPROJECT","cannon47061");
                Statement stat=con.createStatement();
                if("".equals(FirstName)||"".equals(LastName))
                {
                    JOptionPane.showMessageDialog(null,"Select a Player First");
                }
                else
                {
                    try
                    {
                        stat.executeUpdate("update cricket_players set availability=1 where c_player_fn='"+FirstName+"' and c_player_ln='"+LastName+"'");
                        cricketAvailability ca=new cricketAvailability(admin_id);
                        ca.setVisible(true);
                        this.dispose();
                    }
                    catch(Exception e)
                    {
                        JOptionPane.showMessageDialog(null,"Player is already Available");
                    }
                }
                

                
                
            } 
            catch (ClassNotFoundException | SQLException ex) 
            {
                Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);

            }
    }//GEN-LAST:event_movetoAvailablelistLabel1MouseClicked

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
            java.util.logging.Logger.getLogger(cricketAvailability.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cricketAvailability.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cricketAvailability.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cricketAvailability.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cricketAvailability().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox AvailableTeamSelectComboBox1;
    private javax.swing.JButton InjuredSearchButton1;
    private javax.swing.JComboBox InjuredTeamSelectComboBox;
    private javax.swing.JTable InjuredjTable;
    private javax.swing.JComboBox InjuredpositionComboBox1;
    private javax.swing.JLabel addtoavailablelistarrowLabel;
    private javax.swing.JLabel addtoinjuredlistarrowLabel;
    private javax.swing.JButton availableSearchButton;
    private javax.swing.JTable availablejTable;
    private javax.swing.JComboBox availablepositionComboBox;
    private javax.swing.JLabel bgLabel1;
    private javax.swing.JLabel closeLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel logOutjLabel;
    private javax.swing.JLabel minimizejLabel;
    private javax.swing.JLabel movetoAvailablelistLabel1;
    private javax.swing.JLabel movetoinjuredlistLabel;
    private javax.swing.JLabel pointleftarrowtextLabel1;
    private javax.swing.JLabel pointrightarrowtextLabel;
    // End of variables declaration//GEN-END:variables
}
