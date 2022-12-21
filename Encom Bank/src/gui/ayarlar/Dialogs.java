
package gui.ayarlar;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Alperen
 */
public class Dialogs {
    
    public static void bosOlamazMesajiGoster(JFrame frame){
        JOptionPane.showMessageDialog(frame, "All fields must be filled!");
    }
    public static void ozelMesajGoster(JFrame frame, String message){
        JOptionPane.showMessageDialog(frame, message);
    }
    
}
