/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import gui.ayarlar.ActionAyarlari;
import gui.ayarlar.ButtonAyarlari;
import gui.ayarlar.IDuzenleyici;
import gui.ayarlar.TextAyarlari;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

/**
 *
 * @author mertf
 */
public class SifreYenilemeEkrani extends javax.swing.JFrame implements IDuzenleyici{

    /**
     * Creates new form SifreYenilemeEkrani
     */
    public SifreYenilemeEkrani() {
        initComponents();
        getEdits();
    }

    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
        sifreYenilemePanel.setFocusable(true);
        TextAyarlari.setOnlyNumber(tcNoText);
        TextAyarlari.setOnlyNumber(telefonNoText);
        TextAyarlari.setMaxLimit(tcNoText, 11);
        TextAyarlari.setMaxLimit(telefonNoText, 11);
    }

    public JPasswordField getEskiSifreText() {
        return eskiSifreText;
    }
    
    private boolean isEskiSifreTextEnabled(){
        return this.getEskiSifreText().isEnabled();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sifreYenilemePanel = new javax.swing.JPanel();
        backIcon = new javax.swing.JLabel();
        sifreYenilemeLabel = new javax.swing.JLabel();
        tcNoLabel = new javax.swing.JLabel();
        tcNoText = new javax.swing.JTextField();
        telefonNoLabel = new javax.swing.JLabel();
        telefonNoText = new javax.swing.JTextField();
        eskiSifreLabel = new javax.swing.JLabel();
        guvenlikCevapLabel = new javax.swing.JLabel();
        guvenlikCevapText = new javax.swing.JTextField();
        yeniSifreLabel = new javax.swing.JLabel();
        sifreTekrarLabel = new javax.swing.JLabel();
        eskiSifreText = new javax.swing.JPasswordField();
        yeniSifreText = new javax.swing.JPasswordField();
        sifreTekrarText = new javax.swing.JPasswordField();
        sifreyiYenileButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Password Renew - EncomBank");

        sifreYenilemePanel.setBackground(new java.awt.Color(153, 204, 255));

        backIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/backIcon.png"))); // NOI18N
        backIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backIconMouseClicked(evt);
            }
        });

        sifreYenilemeLabel.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        sifreYenilemeLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        sifreYenilemeLabel.setText("Password Renew Settings");

        tcNoLabel.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        tcNoLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        tcNoLabel.setText("TC Identity :");

        tcNoText.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        tcNoText.setForeground(new java.awt.Color(0, 102, 102));
        tcNoText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tcNoTextKeyReleased(evt);
            }
        });

        telefonNoLabel.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        telefonNoLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        telefonNoLabel.setText("Phone Number :");

        telefonNoText.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        telefonNoText.setForeground(new java.awt.Color(0, 102, 102));
        telefonNoText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                telefonNoTextKeyReleased(evt);
            }
        });

        eskiSifreLabel.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        eskiSifreLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        eskiSifreLabel.setText("Old Password :");

        guvenlikCevapLabel.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        guvenlikCevapLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        guvenlikCevapLabel.setText("Answer of  Security Question :");

        guvenlikCevapText.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        guvenlikCevapText.setForeground(new java.awt.Color(0, 102, 102));
        guvenlikCevapText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                guvenlikCevapTextKeyReleased(evt);
            }
        });

        yeniSifreLabel.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        yeniSifreLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        yeniSifreLabel.setText("New Password :");

        sifreTekrarLabel.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        sifreTekrarLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        sifreTekrarLabel.setText("New Password Again :");

        sifreyiYenileButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sifreyiYenileButton.setText("Confirm");
        sifreyiYenileButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sifreyiYenileButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sifreyiYenileButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sifreyiYenileButtonMouseExited(evt);
            }
        });
        sifreyiYenileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sifreyiYenileButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sifreYenilemePanelLayout = new javax.swing.GroupLayout(sifreYenilemePanel);
        sifreYenilemePanel.setLayout(sifreYenilemePanelLayout);
        sifreYenilemePanelLayout.setHorizontalGroup(
            sifreYenilemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sifreYenilemePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sifreyiYenileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(345, 345, 345))
            .addGroup(sifreYenilemePanelLayout.createSequentialGroup()
                .addGroup(sifreYenilemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sifreYenilemePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backIcon)
                        .addGap(28, 28, 28)
                        .addComponent(sifreYenilemeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(sifreYenilemePanelLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(sifreYenilemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(sifreYenilemePanelLayout.createSequentialGroup()
                                .addComponent(telefonNoLabel)
                                .addGap(18, 18, 18)
                                .addComponent(telefonNoText, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(sifreYenilemePanelLayout.createSequentialGroup()
                                .addComponent(tcNoLabel)
                                .addGap(18, 18, 18)
                                .addComponent(tcNoText, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(sifreYenilemePanelLayout.createSequentialGroup()
                                .addComponent(guvenlikCevapLabel)
                                .addGap(18, 18, 18)
                                .addComponent(guvenlikCevapText, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(sifreYenilemePanelLayout.createSequentialGroup()
                                .addComponent(eskiSifreLabel)
                                .addGap(18, 18, 18)
                                .addComponent(eskiSifreText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(sifreYenilemePanelLayout.createSequentialGroup()
                                .addComponent(yeniSifreLabel)
                                .addGap(18, 18, 18)
                                .addComponent(yeniSifreText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(sifreYenilemePanelLayout.createSequentialGroup()
                                .addComponent(sifreTekrarLabel)
                                .addGap(18, 18, 18)
                                .addComponent(sifreTekrarText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(114, Short.MAX_VALUE))
        );

        sifreYenilemePanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {eskiSifreText, guvenlikCevapText, sifreTekrarText, yeniSifreText});

        sifreYenilemePanelLayout.setVerticalGroup(
            sifreYenilemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sifreYenilemePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sifreYenilemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sifreYenilemePanelLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(sifreYenilemeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(backIcon))
                .addGap(27, 27, 27)
                .addGroup(sifreYenilemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tcNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tcNoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(sifreYenilemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefonNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefonNoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(sifreYenilemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guvenlikCevapLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guvenlikCevapText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(sifreYenilemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eskiSifreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eskiSifreText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(sifreYenilemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yeniSifreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yeniSifreText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(sifreYenilemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sifreTekrarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sifreTekrarText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(sifreyiYenileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        sifreYenilemePanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {eskiSifreText, guvenlikCevapText, sifreTekrarText, yeniSifreText});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sifreYenilemePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sifreYenilemePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backIconMouseClicked
        if (isEskiSifreTextEnabled()) {
            ActionAyarlari.setVisible(this, new AyarlarEkrani());
        }
        else{
            ActionAyarlari.setVisible(this, new GirisEkrani());
        }
        
    }//GEN-LAST:event_backIconMouseClicked

    private void tcNoTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tcNoTextKeyReleased

    }//GEN-LAST:event_tcNoTextKeyReleased

    private void telefonNoTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefonNoTextKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_telefonNoTextKeyReleased

    private void guvenlikCevapTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_guvenlikCevapTextKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_guvenlikCevapTextKeyReleased

    private void sifreyiYenileButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sifreyiYenileButtonMouseEntered
        this.setBgFg(evt.getComponent());
    }//GEN-LAST:event_sifreyiYenileButtonMouseEntered

    private void sifreyiYenileButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sifreyiYenileButtonMouseExited
        this.setOriginalBgFg(evt.getComponent());
    }//GEN-LAST:event_sifreyiYenileButtonMouseExited

    private void sifreyiYenileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sifreyiYenileButtonActionPerformed
        JOptionPane.showMessageDialog(this, "New Password set.");
        if (isEskiSifreTextEnabled()) {
            ActionAyarlari.setVisible(this, new HesapEkrani());
        }
        else{
            ActionAyarlari.setVisible(this, new GirisEkrani());
        }
    }//GEN-LAST:event_sifreyiYenileButtonActionPerformed

    private void setBgFg(Component c){
        ButtonAyarlari.setBgFg((JButton)c, Color.BLACK, Color.WHITE);
    }
    
    private void setOriginalBgFg(Component c){
        ButtonAyarlari.setOriginalBgFg((JButton)c);
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
            java.util.logging.Logger.getLogger(SifreYenilemeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SifreYenilemeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SifreYenilemeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SifreYenilemeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SifreYenilemeEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backIcon;
    private javax.swing.JLabel eskiSifreLabel;
    private javax.swing.JPasswordField eskiSifreText;
    private javax.swing.JLabel guvenlikCevapLabel;
    private javax.swing.JTextField guvenlikCevapText;
    private javax.swing.JLabel sifreTekrarLabel;
    private javax.swing.JPasswordField sifreTekrarText;
    private javax.swing.JLabel sifreYenilemeLabel;
    private javax.swing.JPanel sifreYenilemePanel;
    private javax.swing.JButton sifreyiYenileButton;
    private javax.swing.JLabel tcNoLabel;
    private javax.swing.JTextField tcNoText;
    private javax.swing.JLabel telefonNoLabel;
    private javax.swing.JTextField telefonNoText;
    private javax.swing.JLabel yeniSifreLabel;
    private javax.swing.JPasswordField yeniSifreText;
    // End of variables declaration//GEN-END:variables
}
