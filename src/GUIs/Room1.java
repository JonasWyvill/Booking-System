package GUIs;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Room1 extends javax.swing.JFrame {

    public String result;
    public Date today;
    public Calendar c;

    public Room1() {
        initComponents();
        setResizable(false);
        Book1.setVisible(false);
        Book2.setVisible(false);
        Book3.setVisible(false);
        Book4.setVisible(false);
        Book5.setVisible(false);
        Book6.setVisible(false);
        Book7.setVisible(false);
        confirmButton.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ini = new javax.swing.JButton();
        Day1 = new javax.swing.JLabel();
        Day2 = new javax.swing.JLabel();
        Day3 = new javax.swing.JLabel();
        Day4 = new javax.swing.JLabel();
        Day5 = new javax.swing.JLabel();
        Day6 = new javax.swing.JLabel();
        Day7 = new javax.swing.JLabel();
        confirmButton = new javax.swing.JButton();
        Book7 = new javax.swing.JCheckBox();
        Book6 = new javax.swing.JCheckBox();
        Book4 = new javax.swing.JCheckBox();
        Book2 = new javax.swing.JCheckBox();
        Book1 = new javax.swing.JCheckBox();
        Book3 = new javax.swing.JCheckBox();
        Book5 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ini.setText("Initialize");
        ini.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniActionPerformed(evt);
            }
        });

        Day1.setText("Day 1");

        Day2.setText("Day2");

        Day3.setText("Day3");

        Day4.setText("Day4");

        Day5.setText("Day5");

        Day6.setText("Day6");

        Day7.setText("Day7");

        confirmButton.setText("Confirm");

        Book7.setText("Book");

        Book6.setText("Book");

        Book4.setText("Book");

        Book2.setText("Book");
        Book2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Book2ActionPerformed(evt);
            }
        });

        Book1.setText("Book");
        Book1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Book1ActionPerformed(evt);
            }
        });

        Book3.setText("Book");

        Book5.setText("Book");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Day1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(55, 55, 55))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Book1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Day2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(55, 55, 55))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Book2)
                        .addGap(40, 40, 40)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(ini)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(confirmButton)
                        .addGap(15, 15, 15))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Day3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(55, 55, 55))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Book3)
                                .addGap(40, 40, 40)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Day4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(55, 55, 55))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Book4)
                                .addGap(40, 40, 40)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Book5)
                            .addComponent(Day5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Day6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(55, 55, 55))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Book6)
                        .addGap(40, 40, 40)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Book7)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Day7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(80, 80, 80))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Day1)
                    .addComponent(Day2)
                    .addComponent(Day3)
                    .addComponent(Day4)
                    .addComponent(Day5)
                    .addComponent(Day6)
                    .addComponent(Day7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Book6)
                    .addComponent(Book4)
                    .addComponent(Book2)
                    .addComponent(Book3)
                    .addComponent(Book1)
                    .addComponent(Book5)
                    .addComponent(Book7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ini)
                    .addComponent(confirmButton))
                .addGap(66, 66, 66))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void iniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniActionPerformed
        Book1.setVisible(true);
        Book2.setVisible(true);
        Book3.setVisible(true);
        Book4.setVisible(true);
        Book5.setVisible(true);
        Book6.setVisible(true);
        Book7.setVisible(true);
        confirmButton.setVisible(true);

        int future = 7;
        SimpleDateFormat format = new SimpleDateFormat("dd-MM");
        for (int i = 0; i < future; i++) {
            switch (i) {
                case 1:
                    today = new Date();
                    result = format.format(today);
                    System.out.println(result);
                    Day1.setText(result);
                case 2:
                    today = new Date();
                    c = Calendar.getInstance();
                    c.setTime(today);
                    c.add(Calendar.DATE, 1);
                    today = c.getTime();
                    result = format.format(today);
                    Day2.setText(result);
                case 3:
                    today = new Date();
                    c = Calendar.getInstance();
                    c.setTime(today);
                    c.add(Calendar.DATE, 2);
                    today = c.getTime();
                    result = format.format(today);
                    Day3.setText(result);
                case 4:
                    today = new Date();
                    c = Calendar.getInstance();
                    c.setTime(today);
                    c.add(Calendar.DATE, 3);
                    today = c.getTime();
                    result = format.format(today);
                    Day4.setText(result);
                case 5:
                    today = new Date();
                    c = Calendar.getInstance();
                    c.setTime(today);
                    c.add(Calendar.DATE, 4);
                    today = c.getTime();
                    result = format.format(today);
                    Day5.setText(result);
                case 6:
                    today = new Date();
                    c = Calendar.getInstance();
                    c.setTime(today);
                    c.add(Calendar.DATE, 5);
                    today = c.getTime();
                    result = format.format(today);
                    Day6.setText(result);
                case 7:
                    today = new Date();
                    c = Calendar.getInstance();
                    c.setTime(today);
                    c.add(Calendar.DATE, 6);
                    today = c.getTime();
                    result = format.format(today);
                    Day7.setText(result);

            }
        }
    }//GEN-LAST:event_iniActionPerformed

    private void Book1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Book1ActionPerformed

    }//GEN-LAST:event_Book1ActionPerformed

    private void Book2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Book2ActionPerformed

    }//GEN-LAST:event_Book2ActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Room1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Room1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Room1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Room1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Room1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Book1;
    private javax.swing.JCheckBox Book2;
    private javax.swing.JCheckBox Book3;
    private javax.swing.JCheckBox Book4;
    private javax.swing.JCheckBox Book5;
    private javax.swing.JCheckBox Book6;
    private javax.swing.JCheckBox Book7;
    private javax.swing.JLabel Day1;
    private javax.swing.JLabel Day2;
    private javax.swing.JLabel Day3;
    private javax.swing.JLabel Day4;
    private javax.swing.JLabel Day5;
    private javax.swing.JLabel Day6;
    private javax.swing.JLabel Day7;
    private javax.swing.JButton confirmButton;
    private javax.swing.JButton ini;
    // End of variables declaration//GEN-END:variables
}
