
package gui.ayarlar;

import java.awt.Color;
import javax.swing.JButton;


public class ButtonAyarlari {
    
    private static Color originalBackgroundColor;
    private static Color originalForegroundColor;
    
    public static void setBg(JButton ButtonAyarlari, Color bgColor){
        originalBackgroundColor = ButtonAyarlari.getBackground();
        ButtonAyarlari.setBackground(bgColor);
    }
    
    public static void setBgFg(JButton ButtonAyarlari, Color bgColor, Color fgColor) {
        originalBackgroundColor = ButtonAyarlari.getBackground();
        originalForegroundColor = ButtonAyarlari.getForeground();
        ButtonAyarlari.setBackground(bgColor);
        ButtonAyarlari.setForeground(fgColor);
    }
    
    public static void setOriginalBg(JButton button) {
        button.setBackground(originalBackgroundColor);
    }
    
    public static void setOriginalBgFg(JButton button) {
        button.setBackground(originalBackgroundColor);
        button.setForeground(originalForegroundColor);
    }
}
