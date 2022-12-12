package gui.ayarlar;

import javax.swing.JFrame;

/**
 *
 * @author mert.altuntas
 */
public class ActionAyarlari {
    
    public static void setVisible(JFrame oldFrame, JFrame newFrame) {
        oldFrame.setVisible(false);
        newFrame.setVisible(true);
    }
    
}
