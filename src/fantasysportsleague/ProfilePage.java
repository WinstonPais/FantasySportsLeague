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
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author winst
 */
public class ProfilePage extends javax.swing.JFrame {

    /**
     * Creates new form ProfilePage
     */
    String user_id="";
    public ProfilePage() {
        initComponents();
        
    }
    
    public ProfilePage(String user_id)
    {
        initComponents();
        this.user_id=user_id;
        try 
            {
                Class.forName("oracle.jdbc.OracleDriver");
                Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","DBMSPROJECT","cannon47061");
                Statement stat=con.createStatement();
                ResultSet rs=stat.executeQuery("select fav_team from user_details where user_id='"+user_id+"'");
                //con.close();
                rs.next();
                String favTeam=rs.getString("fav_team");
                String currentDir=System.getProperty("user.dir");   
        
        
                if(null != favTeam)
                switch (favTeam) {
                case "Arsenal":{
                    ImageIcon icon=new ImageIcon(currentDir+"\\src\\fantasysportsleague\\ArsenalBackGround.jpg");
                    backGroundLabel.setIcon(icon);
//                    ImageIcon icon1=new ImageIcon(currentDir+"\\src\\fantasysportsleague\\blackClosePng.png");
//                    CloseLabel.setIcon(icon1);
                    break;
                    }
                case "Manchester City":{
                    ImageIcon icon=new ImageIcon(currentDir+"\\src\\fantasysportsleague\\ManchesterCityBackGround.jpg");
                    backGroundLabel.setIcon(icon);
                    break;
                    }
                case "Mumbai Indians":{
                    ImageIcon icon=new ImageIcon(currentDir+"\\src\\fantasysportsleague\\MIBackGroung.png");
                    backGroundLabel.setIcon(icon);
                    break;
                    }
                case "Chennai Super Kings":{
                    ImageIcon icon=new ImageIcon(currentDir+"\\src\\fantasysportsleague\\CSKBackGround.jpg");
                    backGroundLabel.setIcon(icon);
                    ImageIcon icon1=new ImageIcon(currentDir+"\\src\\fantasysportsleague\\minimizeBlack.png");
                    MinimizeLabel.setIcon(icon1);
                    break;
                }
                case "Kolkata Knight Riders":{
                    ImageIcon icon=new ImageIcon(currentDir+"\\src\\fantasysportsleague\\KKRBackGroung.jpg");
                    backGroundLabel.setIcon(icon);
                    break;
                }
                case "West Ham United":{
                    ImageIcon icon=new ImageIcon(currentDir+"\\src\\fantasysportsleague\\WHUBackGround.jpg");
                    backGroundLabel.setIcon(icon);
                    break;
                }
                case "Norwich City":{
                        ImageIcon icon=new ImageIcon(currentDir+"\\src\\fantasysportsleague\\norwichBackGround.jpg");
                        backGroundLabel.setIcon(icon);
                        break;
                    }
                }
                
            } 
            catch (ClassNotFoundException | SQLException ex) 
            {
                Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);

            }
        
        
        try 
            {
                Class.forName("oracle.jdbc.OracleDriver");
                Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","DBMSPROJECT","cannon47061");
                Statement stat=con.createStatement();
                ResultSet rs=stat.executeQuery("select * from score_board where user_id='"+user_id+"'");
                rs.next();
                cscorelabel.setText(rs.getString("c_score"));
                fscorelabel.setText(rs.getString("f_score"));
                tscore.setText(rs.getString("total"));

                con.close();
                
            } 
            catch (ClassNotFoundException | SQLException ex) 
            {
                

            }
        try 
            {
                Class.forName("oracle.jdbc.OracleDriver");
                Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","DBMSPROJECT","cannon47061");
                Statement stat=con.createStatement();
                ResultSet rs=stat.executeQuery("select c.c_player_fn,c.c_player_ln,c.score from cricket_players c ,cricket_team_selection cts where cts.user_id='"+user_id+"' and c.pl_id=cts.c_pl_id");
                DefaultTableModel model = (DefaultTableModel) CricketTable.getModel();
                while(rs.next())
                {
                    String firstname=rs.getString("c_player_fn");
                    String lastname=rs.getString("c_player_ln");
                    int score=Integer.parseInt(rs.getString(3));
                    model.addRow(new Object[]{firstname,lastname,score});
                }
                ResultSet rs1=stat.executeQuery("select f.f_player_fn,f.f_player_ln,f.score from football_players f ,football_team_selection fts where fts.user_id='"+user_id+"' and f.pl_id=fts.f_pl_id");
                DefaultTableModel model1 = (DefaultTableModel) FootballTable.getModel();
                while(rs1.next())
                {
                    String firstname=rs1.getString("f_player_fn");
                    String lastname=rs1.getString("f_player_ln");
                    int score=Integer.parseInt(rs1.getString(3));
                    model1.addRow(new Object[]{firstname,lastname,score});
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
        CloseLabel = new javax.swing.JLabel();
        MinimizeLabel = new javax.swing.JLabel();
        backLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CricketTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        FootballTable = new javax.swing.JTable();
        checkLeaderBoardjButton = new javax.swing.JButton();
        CheckWinnerjButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        fscorelabel = new javax.swing.JLabel();
        cscorelabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tscore = new javax.swing.JLabel();
        backGroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(null);

        CloseLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fantasysportsleague/red x 30.png"))); // NOI18N
        CloseLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseLabelMouseClicked(evt);
            }
        });
        jPanel1.add(CloseLabel);
        CloseLabel.setBounds(860, 10, 30, 30);

        MinimizeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fantasysportsleague/min yel 30.png"))); // NOI18N
        MinimizeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinimizeLabelMouseClicked(evt);
            }
        });
        jPanel1.add(MinimizeLabel);
        MinimizeLabel.setBounds(820, 10, 30, 30);

        backLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fantasysportsleague/backpng.png"))); // NOI18N
        backLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backLabelMouseClicked(evt);
            }
        });
        jPanel1.add(backLabel);
        backLabel.setBounds(10, 10, 40, 40);

        jLabel1.setText("My FootBall Team");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(90, 140, 120, 14);

        jLabel2.setText("My Cricket Team");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(700, 140, 110, 14);

        CricketTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "First Name", "Last Name", "Score"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(CricketTable);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(600, 170, 270, 200);

        FootballTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "First Name", "Last Name", "Score"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(FootballTable);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(20, 170, 260, 200);

        checkLeaderBoardjButton.setText("Check LeaderBorad");
        checkLeaderBoardjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkLeaderBoardjButtonActionPerformed(evt);
            }
        });
        jPanel1.add(checkLeaderBoardjButton);
        checkLeaderBoardjButton.setBounds(70, 20, 170, 23);

        CheckWinnerjButton.setText("Check Winner");
        CheckWinnerjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckWinnerjButtonActionPerformed(evt);
            }
        });
        jPanel1.add(CheckWinnerjButton);
        CheckWinnerjButton.setBounds(260, 20, 130, 23);

        jLabel3.setText("FootBall Score :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(70, 390, 100, 14);

        jLabel4.setText("Cricket Score:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(650, 390, 90, 14);

        fscorelabel.setText("0");
        jPanel1.add(fscorelabel);
        fscorelabel.setBounds(180, 390, 34, 14);

        cscorelabel.setText("0");
        jPanel1.add(cscorelabel);
        cscorelabel.setBounds(750, 390, 30, 14);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setText("TOTAL:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(310, 440, 120, 30);

        tscore.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        tscore.setText("0");
        jPanel1.add(tscore);
        tscore.setBounds(440, 440, 80, 30);
        jPanel1.add(backGroundLabel);
        backGroundLabel.setBounds(0, 0, 900, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CheckWinnerjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckWinnerjButtonActionPerformed
        // TODO add your handling code here:
        
        try 
            {
                Class.forName("oracle.jdbc.OracleDriver");
                Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","DBMSPROJECT","cannon47061");
                Statement stat=con.createStatement();
                ResultSet rs=stat.executeQuery("select count(total) from score_board");
                rs.next();
                String chk=rs.getString(1);

                con.close();
                if("0".equals(chk))
                {
                    JOptionPane.showMessageDialog(null,"Match Day is not Done yet");
                }
                else
                {
                    WinnerPage wp=new WinnerPage(user_id);
                    wp.setVisible(true);
                    this.dispose();
                }
            } 
            catch (ClassNotFoundException | SQLException ex) 
            {
                

            }
        
    }//GEN-LAST:event_CheckWinnerjButtonActionPerformed

    private void checkLeaderBoardjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkLeaderBoardjButtonActionPerformed
        // TODO add your handling code here:
        try 
            {
                Class.forName("oracle.jdbc.OracleDriver");
                Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","DBMSPROJECT","cannon47061");
                Statement stat=con.createStatement();
                ResultSet rs=stat.executeQuery("select count(total) from score_board");
                rs.next();
                String chk=rs.getString(1);

                con.close();
                if("0".equals(chk))
                {
                    JOptionPane.showMessageDialog(null,"Match Day is not Done yet");
                }
                else
                {
              LeaderBoardPage lp=new LeaderBoardPage(user_id);
        lp.setVisible(true);
        this.dispose();
                }
            } 
            catch (ClassNotFoundException | SQLException ex) 
            {
                

            }
        
    }//GEN-LAST:event_checkLeaderBoardjButtonActionPerformed

    private void backLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLabelMouseClicked
        // TODO add your handling code here:
        WelcomeAndSelect w=new WelcomeAndSelect(user_id);
        w.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backLabelMouseClicked

    private void MinimizeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeLabelMouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_MinimizeLabelMouseClicked

    private void CloseLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseLabelMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_CloseLabelMouseClicked

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
            java.util.logging.Logger.getLogger(ProfilePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProfilePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProfilePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProfilePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProfilePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CheckWinnerjButton;
    private javax.swing.JLabel CloseLabel;
    private javax.swing.JTable CricketTable;
    private javax.swing.JTable FootballTable;
    private javax.swing.JLabel MinimizeLabel;
    private javax.swing.JLabel backGroundLabel;
    private javax.swing.JLabel backLabel;
    private javax.swing.JButton checkLeaderBoardjButton;
    private javax.swing.JLabel cscorelabel;
    private javax.swing.JLabel fscorelabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel tscore;
    // End of variables declaration//GEN-END:variables
}
