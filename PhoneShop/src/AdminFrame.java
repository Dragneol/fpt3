
import java.awt.CardLayout;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nguyenhongphat0
 */
public class AdminFrame extends javax.swing.JFrame {
    PhonesPanel phonePanel;
    AccountPanel accountPanel;
    CardLayout cardLayout;
    JFrame parent;

    public AdminFrame(UserDTO admin, JFrame parent) {
        initComponents();
        this.parent = parent;
        drawingStuff(admin);
    }
    
    public static void main(String[] args) {
        new AdminFrame(new UserDTO("phatias", "phatias", "phatias", "phatias", "phatias", "phatias"), null).setVisible(true);
    }

    private void drawingStuff(UserDTO admin) {
        ImageLoader.smartAttaching(admin.avatar, logoLabel);
        usernameLabel.setText(admin.fullname);
        phonePanel = new PhonesPanel(admin);
        contentPanel.add(phonePanel, "Phones");
        accountPanel = new AccountPanel(admin, logoLabel);
        contentPanel.add(accountPanel, "Account");
        cardLayout = (CardLayout) contentPanel.getLayout();
        cardLayout.show(contentPanel, "Phones");
        phonesTabMouseClicked(null);
    }
    
    /**
     * Creates new form AdminFrame
     * @param label
     */
    
    public void unFocus(JLabel label) {
        label.setBackground(new Color(21, 21, 21));
    }
    
    public void setFocus(JLabel label) {
        unFocus(phonesTab);
        unFocus(usersTab);
        unFocus(accountTab);
        unFocus(logoutTab);
        label.setBackground(new Color(184, 7, 1));
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
        phonesTab = new javax.swing.JLabel();
        usersTab = new javax.swing.JLabel();
        accountTab = new javax.swing.JLabel();
        logoutTab = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        logoLabel = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        contentPanel = new javax.swing.JPanel();
        userPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(748, 510));

        jPanel1.setBackground(new java.awt.Color(21, 21, 21));

        phonesTab.setBackground(new java.awt.Color(21, 21, 21));
        phonesTab.setFont(new java.awt.Font("Cantarell", 0, 12)); // NOI18N
        phonesTab.setForeground(new java.awt.Color(255, 255, 255));
        phonesTab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        phonesTab.setText("PHONES");
        phonesTab.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        phonesTab.setOpaque(true);
        phonesTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                phonesTabMouseClicked(evt);
            }
        });

        usersTab.setBackground(new java.awt.Color(21, 21, 21));
        usersTab.setFont(new java.awt.Font("Cantarell", 0, 12)); // NOI18N
        usersTab.setForeground(new java.awt.Color(255, 255, 255));
        usersTab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usersTab.setText("USERS");
        usersTab.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        usersTab.setOpaque(true);
        usersTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usersTabMouseClicked(evt);
            }
        });

        accountTab.setBackground(new java.awt.Color(21, 21, 21));
        accountTab.setFont(new java.awt.Font("Cantarell", 0, 12)); // NOI18N
        accountTab.setForeground(new java.awt.Color(255, 255, 255));
        accountTab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        accountTab.setText("ACCOUNT");
        accountTab.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        accountTab.setOpaque(true);
        accountTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                accountTabMouseClicked(evt);
            }
        });

        logoutTab.setBackground(new java.awt.Color(21, 21, 21));
        logoutTab.setFont(new java.awt.Font("Cantarell", 0, 12)); // NOI18N
        logoutTab.setForeground(new java.awt.Color(255, 255, 255));
        logoutTab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoutTab.setText("LOGOUT");
        logoutTab.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutTab.setOpaque(true);
        logoutTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutTabMouseClicked(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(40, 40, 40));

        logoLabel.setPreferredSize(new java.awt.Dimension(40, 40));

        usernameLabel.setBackground(new java.awt.Color(40, 40, 40));
        usernameLabel.setFont(new java.awt.Font("Cantarell", 1, 20)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(255, 255, 255));
        usernameLabel.setText("username");

        jLabel7.setBackground(new java.awt.Color(40, 40, 40));
        jLabel7.setFont(new java.awt.Font("Cantarell", 0, 10)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("ADMIN");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(logoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usernameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(0, 120, Short.MAX_VALUE)))
                        .addGap(20, 20, 20))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(logoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(phonesTab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(usersTab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(accountTab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(logoutTab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(phonesTab, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usersTab, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(accountTab, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logoutTab, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(298, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.LINE_START);

        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel4.setLayout(new java.awt.CardLayout());
        jPanel3.add(jPanel4, java.awt.BorderLayout.PAGE_START);

        contentPanel.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout userPanelLayout = new javax.swing.GroupLayout(userPanel);
        userPanel.setLayout(userPanelLayout);
        userPanelLayout.setHorizontalGroup(
            userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 902, Short.MAX_VALUE)
        );
        userPanelLayout.setVerticalGroup(
            userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 573, Short.MAX_VALUE)
        );

        contentPanel.add(userPanel, "card2");

        jPanel3.add(contentPanel, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void phonesTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_phonesTabMouseClicked
        // TODO add your handling code here:
        setFocus(phonesTab);
        cardLayout.show(contentPanel, "Phones");
        ArrayList<PhoneDTO> list = PhoneDAO.getAllPhones();
        phonePanel.showPhones(list);
    }//GEN-LAST:event_phonesTabMouseClicked

    private void usersTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersTabMouseClicked
        // TODO add your handling code here:
        setFocus(usersTab);
    }//GEN-LAST:event_usersTabMouseClicked

    private void accountTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountTabMouseClicked
        // TODO add your handling code here:
        setFocus(accountTab);
        cardLayout.show(contentPanel, "Account");
        accountPanel.loadLogs();
        accountPanel.distriveUserInfo();
    }//GEN-LAST:event_accountTabMouseClicked

    private void logoutTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutTabMouseClicked
        // TODO add your handling code here:
        setFocus(logoutTab);
        if (JOptionPane.showConfirmDialog(this, "Are you sure you want to log out?") == JOptionPane.OK_OPTION) {
            this.setVisible(false);
            parent.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_logoutTabMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accountTab;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JLabel logoutTab;
    private javax.swing.JLabel phonesTab;
    private javax.swing.JPanel userPanel;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JLabel usersTab;
    // End of variables declaration//GEN-END:variables
}
