
package gui;

import gui.ayarlar.ActionAyarlari;
import gui.ayarlar.ButtonAyarlari;
import gui.ayarlar.IDuzenleyici;
import gui.ayarlar.TextAyarlari;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JOptionPane;


public class ParaYatirmaEkrani extends javax.swing.JFrame implements IDuzenleyici{

    /**
     * Creates new form ParaYatirmaEkrani
     */
    private int yatirilacakMiktar = 0;
    public ParaYatirmaEkrani() {
        initComponents();
        getEdits();
    }

    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
        setFocusable(true);
        TextAyarlari.setOnlyNumber(yatirilacakMiktarText);
        TextAyarlari.setMaxLimit(yatirilacakMiktarText, 5);
        
    }
    
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paraYatirmaEkraniPanel = new javax.swing.JPanel();
        kullaniciAdSoyadLabel = new javax.swing.JLabel();
        limitUyariLabel = new javax.swing.JLabel();
        toplamBakiyenizLabel = new javax.swing.JLabel();
        bakiyeLabel = new javax.swing.JLabel();
        yatiracaginizMiktarLabel = new javax.swing.JLabel();
        yatirilacakMiktarText = new javax.swing.JTextField();
        paraYatirButton = new javax.swing.JButton();
        backIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Money Deposit - EncomBank");

        paraYatirmaEkraniPanel.setBackground(new java.awt.Color(204, 204, 255));

        kullaniciAdSoyadLabel.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        kullaniciAdSoyadLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        kullaniciAdSoyadLabel.setText("Hi, (KULLANICI AD SOYAD)");

        limitUyariLabel.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        limitUyariLabel.setText("You can deposit 10000$ and below in one go.");

        toplamBakiyenizLabel.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        toplamBakiyenizLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        toplamBakiyenizLabel.setText("Current Balance :");

        bakiyeLabel.setFont(new java.awt.Font("Calibri", 1, 28)); // NOI18N
        bakiyeLabel.setText("BAKİYE");

        yatiracaginizMiktarLabel.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        yatiracaginizMiktarLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        yatiracaginizMiktarLabel.setText("Enter Amount :");

        yatirilacakMiktarText.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        yatirilacakMiktarText.setForeground(new java.awt.Color(51, 153, 0));
        yatirilacakMiktarText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                yatirilacakMiktarTextKeyReleased(evt);
            }
        });

        paraYatirButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        paraYatirButton.setText("Deposit");
        paraYatirButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        paraYatirButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                paraYatirButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                paraYatirButtonMouseExited(evt);
            }
        });
        paraYatirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paraYatirButtonActionPerformed(evt);
            }
        });

        backIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/backIcon.png"))); // NOI18N
        backIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backIconMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout paraYatirmaEkraniPanelLayout = new javax.swing.GroupLayout(paraYatirmaEkraniPanel);
        paraYatirmaEkraniPanel.setLayout(paraYatirmaEkraniPanelLayout);
        paraYatirmaEkraniPanelLayout.setHorizontalGroup(
            paraYatirmaEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paraYatirmaEkraniPanelLayout.createSequentialGroup()
                .addGroup(paraYatirmaEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paraYatirmaEkraniPanelLayout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(limitUyariLabel))
                    .addGroup(paraYatirmaEkraniPanelLayout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(yatiracaginizMiktarLabel)
                        .addGap(18, 18, 18)
                        .addComponent(yatirilacakMiktarText, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(paraYatirmaEkraniPanelLayout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(toplamBakiyenizLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bakiyeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(paraYatirmaEkraniPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backIcon)
                        .addGap(28, 28, 28)
                        .addComponent(kullaniciAdSoyadLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(59, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paraYatirmaEkraniPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(paraYatirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(276, 276, 276))
        );
        paraYatirmaEkraniPanelLayout.setVerticalGroup(
            paraYatirmaEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paraYatirmaEkraniPanelLayout.createSequentialGroup()
                .addGroup(paraYatirmaEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paraYatirmaEkraniPanelLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(kullaniciAdSoyadLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(paraYatirmaEkraniPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backIcon)))
                .addGap(29, 29, 29)
                .addComponent(limitUyariLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(paraYatirmaEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paraYatirmaEkraniPanelLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(toplamBakiyenizLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paraYatirmaEkraniPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bakiyeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(paraYatirmaEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yatiracaginizMiktarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yatirilacakMiktarText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(paraYatirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        paraYatirmaEkraniPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {yatiracaginizMiktarLabel, yatirilacakMiktarText});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paraYatirmaEkraniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paraYatirmaEkraniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void yatirilacakMiktarTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_yatirilacakMiktarTextKeyReleased
        this.yatirilacakMiktar = TextAyarlari.checkTheKeyReleased(yatirilacakMiktarText, 10000);
        //System.out.println(cekilecekMiktar);
    }//GEN-LAST:event_yatirilacakMiktarTextKeyReleased

    private void paraYatirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paraYatirButtonActionPerformed
        JOptionPane.showMessageDialog(this, "CONFIRMED\n" + "Amount you deposit : " + this.yatirilacakMiktar + "$");
        ActionAyarlari.setVisible(this, new HesapEkrani());
    }//GEN-LAST:event_paraYatirButtonActionPerformed

    private void backIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backIconMouseClicked
        ActionAyarlari.setVisible(this, new HesapEkrani());
    }//GEN-LAST:event_backIconMouseClicked

    private void paraYatirButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paraYatirButtonMouseEntered
        this.setBgFg(evt.getComponent());
    }//GEN-LAST:event_paraYatirButtonMouseEntered

    private void paraYatirButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paraYatirButtonMouseExited
        this.setOriginalBgFg(evt.getComponent());
    }//GEN-LAST:event_paraYatirButtonMouseExited

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
            java.util.logging.Logger.getLogger(ParaYatirmaEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ParaYatirmaEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ParaYatirmaEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ParaYatirmaEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ParaYatirmaEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backIcon;
    private javax.swing.JLabel bakiyeLabel;
    private javax.swing.JLabel kullaniciAdSoyadLabel;
    private javax.swing.JLabel limitUyariLabel;
    private javax.swing.JButton paraYatirButton;
    private javax.swing.JPanel paraYatirmaEkraniPanel;
    private javax.swing.JLabel toplamBakiyenizLabel;
    private javax.swing.JLabel yatiracaginizMiktarLabel;
    private javax.swing.JTextField yatirilacakMiktarText;
    // End of variables declaration//GEN-END:variables
}
