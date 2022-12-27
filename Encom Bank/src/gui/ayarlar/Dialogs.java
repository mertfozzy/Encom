package gui.ayarlar;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author mert.altuntas
 */
public class Dialogs {

    public static void bosOlamazMesajiGoster(JFrame frame) {
        JOptionPane.showMessageDialog(frame, "All areas must be filled!");
    }
    
    public static void ozelMesajGoster(JFrame frame, String message) {
        JOptionPane.showMessageDialog(frame, message);
    }
    
}
