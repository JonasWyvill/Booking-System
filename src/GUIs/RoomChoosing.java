package GUIs;

public class RoomChoosing extends javax.swing.JFrame {

    private static boolean disabledCheck = false;

    public RoomChoosing() {
        initComponents();
        InvalidPeople.setVisible(false);
        Room1.setVisible(false);
        Room2.setVisible(false);
        Room3.setVisible(false);
        Room4.setVisible(false);
        Room5.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DisabledAccess = new javax.swing.JCheckBox();
        PeopleCount = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Room1 = new javax.swing.JCheckBox();
        Room2 = new javax.swing.JCheckBox();
        Room3 = new javax.swing.JCheckBox();
        Room4 = new javax.swing.JCheckBox();
        Room5 = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        InvalidPeople = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        DisabledAccess.setText("Disabled Access Needed?");
        DisabledAccess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisabledAccessActionPerformed(evt);
            }
        });

        PeopleCount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PeopleCountActionPerformed(evt);
            }
        });

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Seats needed");

        Room1.setText("Room 1:      2 people");
        Room1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Room1ActionPerformed(evt);
            }
        });

        Room2.setText("Room 2:      4 people");

        Room3.setText("Room 3:      8 people");

        Room4.setText("Room 4:      15 people + disabled access");

        Room5.setText("Room 5:      50 people");
        Room5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Room5ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Room No.");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Capacity");

        InvalidPeople.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        InvalidPeople.setForeground(new java.awt.Color(250, 0, 0));
        InvalidPeople.setText("Invalid Number of people entered");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Room5)
                            .addComponent(Room4)
                            .addComponent(Room3)
                            .addComponent(Room2)
                            .addComponent(Room1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(PeopleCount))
                                .addGap(18, 18, 18)
                                .addComponent(DisabledAccess)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(InvalidPeople)))
                .addContainerGap(128, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PeopleCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DisabledAccess, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InvalidPeople)
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Room1)
                .addGap(18, 18, 18)
                .addComponent(Room2)
                .addGap(18, 18, 18)
                .addComponent(Room3)
                .addGap(18, 18, 18)
                .addComponent(Room4)
                .addGap(18, 18, 18)
                .addComponent(Room5)
                .addContainerGap(141, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PeopleCountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PeopleCountActionPerformed

    }//GEN-LAST:event_PeopleCountActionPerformed

    private void Room1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Room1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Room1ActionPerformed

    private void Room5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Room5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Room5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int peopleNum = Integer.parseInt(PeopleCount.getText());
        Room1.setVisible(false);
        Room2.setVisible(false);
        Room3.setVisible(false);
        Room4.setVisible(false);
        Room5.setVisible(false);

        if (DisabledAccess.isSelected()) {
            disabledCheck = true;
        } else {
            disabledCheck = false;
        }

        if (peopleNum <= 50 && peopleNum > 0) {
            InvalidPeople.setVisible(false);

            if (peopleNum == 1 || peopleNum == 2 && disabledCheck == false) {
                Room1.setVisible(true);
                if (Room1.isSelected()) {
                    GUIs.Room1 l = new GUIs.Room1();
                    l.setVisible(true);
                    this.dispose();
                }
            }
            if (peopleNum <= 4 && disabledCheck == false) {
                Room2.setVisible(true);
            }
            if (peopleNum <= 8 && disabledCheck == false) {
                Room3.setVisible(true);
            }
            if (!(peopleNum > 15)) {
                if (peopleNum <= 15 || disabledCheck == true) {
                    Room4.setVisible(true);
                }
            }
            if (peopleNum <= 50 && disabledCheck == false) {
                Room5.setVisible(true);
            }

        } else {
            InvalidPeople.setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void DisabledAccessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisabledAccessActionPerformed

    }//GEN-LAST:event_DisabledAccessActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RoomChoosing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RoomChoosing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RoomChoosing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RoomChoosing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RoomChoosing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox DisabledAccess;
    private javax.swing.JLabel InvalidPeople;
    private javax.swing.JTextField PeopleCount;
    private javax.swing.JCheckBox Room1;
    private javax.swing.JCheckBox Room2;
    private javax.swing.JCheckBox Room3;
    private javax.swing.JCheckBox Room4;
    private javax.swing.JCheckBox Room5;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
