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
public class FootBallPage extends javax.swing.JFrame {

    /**
     * Creates new form FootBallPage
     */
    String user_id="",FirstName="",LastName="";
    public FootBallPage() {
        initComponents();
    }
    
    public FootBallPage(String user_id) {
        initComponents();
        this.user_id=user_id;
        
        try 
            {
                Class.forName("oracle.jdbc.OracleDriver");
                Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","DBMSPROJECT","cannon47061");
                Statement stat=con.createStatement();
                ResultSet rs=stat.executeQuery("select f_player_fn,f_player_ln,team,position from football_players");
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

                while(rs.next())
                {
                    String firstname = rs.getString("f_player_fn");
                    String lastName = rs.getString("f_player_ln");
                    String team = rs.getString("team");
                    String position = rs.getString("position");
                    model.addRow(new Object[]{firstname,lastName,position,team});
                }
                con.close();
                
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
                ResultSet rs=stat.executeQuery("select f_pl_id from football_team_selection where user_id='"+user_id+"'");
                int plrCount=0;
                String currentDir=System.getProperty("user.dir");
                ImageIcon icon;
                while(rs.next())
                {
                    plrCount++;
                    String curPlrId=rs.getString("f_pl_id");
                    switch(plrCount)
                    {
                        case 1:icon=new ImageIcon(currentDir+"\\src\\footballPlayerPics\\"+curPlrId+".png");
                               jLabel12.setIcon(icon);
                               break;
                        case 2:icon=new ImageIcon(currentDir+"\\src\\footballPlayerPics\\"+curPlrId+".png");
                               jLabel2.setIcon(icon);
                               break;
                        case 3:icon=new ImageIcon(currentDir+"\\src\\footballPlayerPics\\"+curPlrId+".png");
                               jLabel3.setIcon(icon);
                               break;
                        case 4:icon=new ImageIcon(currentDir+"\\src\\footballPlayerPics\\"+curPlrId+".png");
                               jLabel4.setIcon(icon);
                               break;
                        case 5:icon=new ImageIcon(currentDir+"\\src\\footballPlayerPics\\"+curPlrId+".png");
                               jLabel5.setIcon(icon);
                               break;
                        case 6:icon=new ImageIcon(currentDir+"\\src\\footballPlayerPics\\"+curPlrId+".png");
                               jLabel6.setIcon(icon);
                               break;
                        case 7:icon=new ImageIcon(currentDir+"\\src\\footballPlayerPics\\"+curPlrId+".png");
                               jLabel7.setIcon(icon);
                               break;
                        case 8:icon=new ImageIcon(currentDir+"\\src\\footballPlayerPics\\"+curPlrId+".png");
                               jLabel8.setIcon(icon);
                               break;
                        case 9:icon=new ImageIcon(currentDir+"\\src\\footballPlayerPics\\"+curPlrId+".png");
                               jLabel9.setIcon(icon);
                               break;
                        case 10:icon=new ImageIcon(currentDir+"\\src\\footballPlayerPics\\"+curPlrId+".png");
                               jLabel10.setIcon(icon);
                               break;
                        case 11:icon=new ImageIcon(currentDir+"\\src\\footballPlayerPics\\"+curPlrId+".png");
                               jLabel11.setIcon(icon);
                               break;
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
        redCrossLabel = new javax.swing.JLabel();
        minimizeLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        footBallPitchLabel = new javax.swing.JLabel();
        logOutLabel = new javax.swing.JLabel();
        backLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        RemoveButton = new javax.swing.JButton();
        AddButton = new javax.swing.JButton();
        TeamSelectionComboBox = new javax.swing.JComboBox();
        PositionSelectionComboBox = new javax.swing.JComboBox();
        SearchButton = new javax.swing.JButton();
        backGroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 255, 51));
        jPanel1.setLayout(null);

        redCrossLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fantasysportsleague/red x 30.png"))); // NOI18N
        redCrossLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                redCrossLabelMouseClicked(evt);
            }
        });
        jPanel1.add(redCrossLabel);
        redCrossLabel.setBounds(870, 10, 30, 30);

        minimizeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fantasysportsleague/min yel 30.png"))); // NOI18N
        minimizeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeLabelMouseClicked(evt);
            }
        });
        jPanel1.add(minimizeLabel);
        minimizeLabel.setBounds(830, 10, 30, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fantasysportsleague/defaultplayerimage.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(480, 340, 60, 60);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fantasysportsleague/defaultplayerimage.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(570, 390, 60, 60);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fantasysportsleague/defaultplayerimage.png"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(730, 390, 60, 60);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fantasysportsleague/defaultplayerimage.png"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(820, 340, 60, 60);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fantasysportsleague/defaultplayerimage.png"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(650, 300, 60, 60);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fantasysportsleague/defaultplayerimage.png"))); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(490, 180, 60, 60);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fantasysportsleague/defaultplayerimage.png"))); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(810, 180, 60, 60);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fantasysportsleague/defaultplayerimage.png"))); // NOI18N
        jPanel1.add(jLabel9);
        jLabel9.setBounds(600, 90, 60, 60);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fantasysportsleague/defaultplayerimage.png"))); // NOI18N
        jPanel1.add(jLabel10);
        jLabel10.setBounds(710, 90, 60, 60);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fantasysportsleague/defaultplayerimage.png"))); // NOI18N
        jPanel1.add(jLabel11);
        jLabel11.setBounds(650, 180, 60, 60);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fantasysportsleague/defaultplayerimage.png"))); // NOI18N
        jPanel1.add(jLabel12);
        jLabel12.setBounds(650, 450, 60, 60);

        footBallPitchLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fantasysportsleague/footballpitch.jpg"))); // NOI18N
        jPanel1.add(footBallPitchLabel);
        footBallPitchLabel.setBounds(460, 40, 440, 500);

        logOutLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        logOutLabel.setForeground(new java.awt.Color(255, 255, 255));
        logOutLabel.setText("Log Out");
        logOutLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logOutLabelMouseClicked(evt);
            }
        });
        jPanel1.add(logOutLabel);
        logOutLabel.setBounds(70, 20, 55, 17);

        backLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fantasysportsleague/backpng.png"))); // NOI18N
        backLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backLabelMouseClicked(evt);
            }
        });
        jPanel1.add(backLabel);
        backLabel.setBounds(10, 10, 40, 40);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "First Name", "Last Name", "Position", "Team"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 102, 430, 380);

        RemoveButton.setText("Remove Player");
        RemoveButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RemoveButtonMouseClicked(evt);
            }
        });
        RemoveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveButtonActionPerformed(evt);
            }
        });
        jPanel1.add(RemoveButton);
        RemoveButton.setBounds(230, 500, 120, 30);

        AddButton.setText("Add Player");
        AddButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddButtonMouseClicked(evt);
            }
        });
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });
        jPanel1.add(AddButton);
        AddButton.setBounds(50, 500, 120, 30);

        TeamSelectionComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Team", "CRY", "WCF", "AVL", "MCI", "WOL", "BOU", "BUR", "SHU", "MUN", "EVE", "NOR", "ARS", "LEI", "NEW", "BHA", "LIV", "SOU", "TOT", "CHE", "WHU" }));
        jPanel1.add(TeamSelectionComboBox);
        TeamSelectionComboBox.setBounds(10, 70, 150, 20);

        PositionSelectionComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Position", "GK", "RB", "CB", "LB", "CM", "LW", "RW", "CF", "ST" }));
        jPanel1.add(PositionSelectionComboBox);
        PositionSelectionComboBox.setBounds(180, 70, 150, 20);

        SearchButton.setText("Search");
        SearchButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchButtonMouseClicked(evt);
            }
        });
        SearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButtonActionPerformed(evt);
            }
        });
        jPanel1.add(SearchButton);
        SearchButton.setBounds(340, 70, 110, 23);

        backGroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fantasysportsleague/StadiumBackground.jpg"))); // NOI18N
        jPanel1.add(backGroundLabel);
        backGroundLabel.setBounds(0, 0, 910, 580);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 910, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void redCrossLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_redCrossLabelMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_redCrossLabelMouseClicked

    private void minimizeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeLabelMouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizeLabelMouseClicked

    private void logOutLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutLabelMouseClicked
        // TODO add your handling code here:
        LoginPage lp=new  LoginPage();
        lp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logOutLabelMouseClicked

    private void backLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLabelMouseClicked
        // TODO add your handling code here:
        WelcomeAndSelect w=new WelcomeAndSelect(user_id);
        w.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backLabelMouseClicked

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddButtonActionPerformed

    private void RemoveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RemoveButtonActionPerformed

    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchButtonActionPerformed

    private void SearchButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchButtonMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        deleteAllRows(model);
        String selectedteam=(String)TeamSelectionComboBox.getSelectedItem();
        String selectedposition=(String)PositionSelectionComboBox.getSelectedItem();
        try 
            {
                Class.forName("oracle.jdbc.OracleDriver");
            try (Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","DBMSPROJECT","cannon47061")) {
                Statement stat=con.createStatement();
//                DefaultTableModel model1 = (DefaultTableModel) jTable1.getModel();
                ResultSet rs;
                
                if("Select Team".equals(selectedteam)&&"Select Position".equals(selectedposition))
                {
                    rs=stat.executeQuery("select f_player_fn,f_player_ln,team,position from football_players");
//                    System.out.println("Reached inisde if"+selectedposition+" "+selectedteam);
                }
                else
                    if("Select Team".equals(selectedteam))
                    {
//                        System.out.println("Reached inisde second if");
                        rs=stat.executeQuery("select f_player_fn,f_player_ln,team,position from football_players where position='"+selectedposition+"'");
                    }
                    else
                        if("Select Position".equals(selectedposition))
                        {
//                            System.out.println("Reached inisde third if");
                            rs=stat.executeQuery("select f_player_fn,f_player_ln,team,position from football_players where team='"+selectedteam+"'");
                        }
                        else
                        {
//                            System.out.println("Reached inisde else"+selectedposition+ " "+ selectedteam);
                            rs=stat.executeQuery("select f_player_fn,f_player_ln,team,position from football_players where team='"+selectedteam+"' and position='"+selectedposition+"'");
                        }
//                System.out.println("Reached before while");
                while(rs.next())
                {

                    String firstname = rs.getString("f_player_fn");
                    String lastName = rs.getString("f_player_ln");
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
    }//GEN-LAST:event_SearchButtonMouseClicked

    private void AddButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddButtonMouseClicked
        // TODO add your handling code here:
        try 
            {
                Class.forName("oracle.jdbc.OracleDriver");
                Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","DBMSPROJECT","cannon47061");
                Statement stat=con.createStatement();
                ResultSet rs=stat.executeQuery("select count(*) from football_team_selection where user_id='"+user_id+"'");
                rs.next();
                String countstr=rs.getString(1);
                int numberOfPlayersInTheDataBase=Integer.parseInt(countstr);
                if(numberOfPlayersInTheDataBase<11)
                {
                    String firstname=FirstName;
                    String lastname=LastName;
                    if(firstname.isEmpty())
                    {
                        JOptionPane.showMessageDialog(null,"Enter First Name Plz");
                    }
                    else
                    if(lastname.isEmpty())
                    {
                        JOptionPane.showMessageDialog(null,"Enter Last Name Plz");
                    }
                    else
                    {
                        try
                        {
                            ResultSet rs1=stat.executeQuery("select pl_id from football_players where f_player_fn='"+firstname+"' and f_player_ln='"+lastname+"'");
                            rs1.next();
                            String newPlayerId=rs1.getString("pl_id");
                            
                                numberOfPlayersInTheDataBase++;
                                try
                                {
                                    stat.executeUpdate("insert into football_team_selection values('"+user_id+"','"+newPlayerId+"',0)");
                                    JOptionPane.showMessageDialog(null,"Player Added");
//                                    FirstNameAddTextField.setText(null);
//                                    LastNameAddTextField.setText(null);
                                    String currentDir=System.getProperty("user.dir");
                                    ImageIcon icon;
                                    switch(numberOfPlayersInTheDataBase)
                                    {
                                        case 1:icon=new ImageIcon(currentDir+"\\src\\footballPlayerPics\\"+newPlayerId+".png");
                                               jLabel12.setIcon(icon);
                                               break;
                                        case 2:icon=new ImageIcon(currentDir+"\\src\\footballPlayerPics\\"+newPlayerId+".png");
                                               jLabel2.setIcon(icon);
                                               break;
                                        case 3:icon=new ImageIcon(currentDir+"\\src\\footballPlayerPics\\"+newPlayerId+".png");
                                               jLabel3.setIcon(icon);
                                               break;
                                        case 4:icon=new ImageIcon(currentDir+"\\src\\footballPlayerPics\\"+newPlayerId+".png");
                                               jLabel4.setIcon(icon);
                                               break;
                                        case 5:icon=new ImageIcon(currentDir+"\\src\\footballPlayerPics\\"+newPlayerId+".png");
                                               jLabel5.setIcon(icon);
                                               break;
                                        case 6:icon=new ImageIcon(currentDir+"\\src\\footballPlayerPics\\"+newPlayerId+".png");
                                               jLabel6.setIcon(icon);
                                               break;
                                        case 7:icon=new ImageIcon(currentDir+"\\src\\footballPlayerPics\\"+newPlayerId+".png");
                                               jLabel7.setIcon(icon);
                                               break;
                                        case 8:icon=new ImageIcon(currentDir+"\\src\\footballPlayerPics\\"+newPlayerId+".png");
                                               jLabel8.setIcon(icon);
                                               break;
                                        case 9:icon=new ImageIcon(currentDir+"\\src\\footballPlayerPics\\"+newPlayerId+".png");
                                               jLabel9.setIcon(icon);
                                               break;
                                        case 10:icon=new ImageIcon(currentDir+"\\src\\footballPlayerPics\\"+newPlayerId+".png");
                                               jLabel10.setIcon(icon);
                                               break;
                                        case 11:icon=new ImageIcon(currentDir+"\\src\\footballPlayerPics\\"+newPlayerId+".png");
                                               jLabel11.setIcon(icon);
                                               break;
                                    }
                                }
                                catch(Exception e)
                                {
                                    JOptionPane.showMessageDialog(null,"Player Is already in your team");
                                }
                                
                                
                            
                        }
                        catch(Exception e)
                        {
                            JOptionPane.showMessageDialog(null,"Player Doesnt Exist");
                        }
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"You can have a Maximum of 11 Players");
                }
                

                
                
            } 
            catch (ClassNotFoundException | SQLException ex) 
            {
                Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);

            }
    }//GEN-LAST:event_AddButtonMouseClicked

    private void RemoveButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RemoveButtonMouseClicked
        // TODO add your handling code here:
        try 
            {
                Class.forName("oracle.jdbc.OracleDriver");
                Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","DBMSPROJECT","cannon47061");
                Statement stat=con.createStatement();
                String firstname=FirstName;
                String lastname=LastName;
                if(firstname.isEmpty())
                {
                    JOptionPane.showMessageDialog(null,"Enter the first name");
                }
                else
                    if(lastname.isEmpty())
                    {
                        JOptionPane.showMessageDialog(null,"Enter the Last Name");
                    }
                    else{
                        try
                        {
                            ResultSet rs1=stat.executeQuery("select pl_id from football_players where f_player_fn='"+firstname+"' and f_player_ln='"+lastname+"'");
                            rs1.next();
                            String newPlayerId=rs1.getString("pl_id");
                            stat.executeUpdate("delete from football_team_selection where user_id='"+user_id+"' and f_pl_id='"+newPlayerId+"'");
                            FootBallPage cc=new FootBallPage(user_id);
                            cc.setVisible(true);
                            this.dispose();
                        }
                        catch(Exception e)
                        {
                            JOptionPane.showMessageDialog(null,"The player does not exist in your team");
                        }
                    }                
            } 
            catch (ClassNotFoundException | SQLException ex) 
            {
                Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);

            }
    }//GEN-LAST:event_RemoveButtonMouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel model=(DefaultTableModel) jTable1.getModel();
        int selectedRow=jTable1.getSelectedRow();
        FirstName=model.getValueAt(selectedRow, 0).toString();
        LastName=model.getValueAt(selectedRow, 1).toString();
    }//GEN-LAST:event_jTable1MouseClicked
    public static void deleteAllRows(final DefaultTableModel model) 
    {
        for( int i = model.getRowCount() - 1; i >= 0; i-- ) 
        {
            model.removeRow(i);
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
            java.util.logging.Logger.getLogger(FootBallPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FootBallPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FootBallPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FootBallPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FootBallPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JComboBox PositionSelectionComboBox;
    private javax.swing.JButton RemoveButton;
    private javax.swing.JButton SearchButton;
    private javax.swing.JComboBox TeamSelectionComboBox;
    private javax.swing.JLabel backGroundLabel;
    private javax.swing.JLabel backLabel;
    private javax.swing.JLabel footBallPitchLabel;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel logOutLabel;
    private javax.swing.JLabel minimizeLabel;
    private javax.swing.JLabel redCrossLabel;
    // End of variables declaration//GEN-END:variables
}
