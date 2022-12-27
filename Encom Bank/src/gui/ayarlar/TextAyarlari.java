package gui.ayarlar;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class TextAyarlari {
    
    private static String originalText;
    private static Color originalFgColor;
    
    public static void checkTheTextFocusGained(JTextField textField, String org) {
        originalText = org;
        if (textField.getText().trim().equals(org)) {
            originalFgColor = textField.getForeground();
            textField.setText("");
        }
        
        textField.setForeground(Color.BLUE);
    }
    
    public static void checkTheTextFocusLost(JTextField textField) {
        if (textField.getText().trim().equals("")) {
            textField.setText(originalText);
            textField.setForeground(originalFgColor);
        } else {
            textField.setForeground(Color.BLACK);
        }
    }
    
    public static void setOnlyNumber(JTextField textField) { //eğer numara dışında karakter girilirse
        textField.addKeyListener(new KeyAdapter() {

            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if(!Character.isDigit(c)){
                    e.consume();
                }
            }
        
        });
    }
    
        public static void setOnlyAlphabetic(JTextField textField) { //eğer harf dışında karakter girilirse
        textField.addKeyListener(new KeyAdapter() {

            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if(!Character.isAlphabetic(c)){
                    e.consume();
                }
            }
        
        });
    }
        
        private static int limit;
        public static void setMaxLimit(JTextField textField, int lim) {
        limit = lim;
        textField.setDocument(new PlainDocument(){

            @Override
            public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
                if (str == null)
                    return;
                if ((getLength() + str.length()) <= limit){
                    super.insertString(offs, str, a); 
                }
                
            }
            
        });
    }
        
    public static int checkTheKeyReleased(JTextField textField, int moneyLimit) {
                //kullanıcı 9999 girerse 5000 yap
        String text = textField.getText();
        if(!text.equals("")){
           int amount = Integer.valueOf(text);
           if(amount > moneyLimit){
               amount = moneyLimit;
               textField.setText(String.valueOf(amount));
           }
           return amount;
        }
        return 0;
    }
    
    public static boolean textAlanlariDolumu(JPanel panel){
        Component[] componets = panel.getComponents();
        for (Component c:componets){
            if(c instanceof JTextField){
                JTextField textField = (JTextField)c;
                if(textField.getText().trim().equals("") && textField.isEnabled()){
                    return false;
                }
            }
        }
        
        return true;
    }
    
    
}
