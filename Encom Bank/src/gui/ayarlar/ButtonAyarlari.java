
package gui.ayarlar;

import java.awt.Color;
import javax.swing.JButton;


public class ButtonAyarlari {
    
    private static Color originalBackgroundColor;
    
    public static void setBg(JButton ButtonAyarlari, Color bgColor){
        originalBackgroundColor = ButtonAyarlari.getBackground();
        ButtonAyarlari.setBackground(bgColor);
    }
    
    public static void setOriginalBg(JButton button) {
        button.setBackground(originalBackgroundColor);
    }
}
