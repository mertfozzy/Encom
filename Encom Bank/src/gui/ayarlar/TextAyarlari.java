
package gui.ayarlar;

import javax.swing.JTextField;


public class TextAyarlari {
    
    private static String originalText;
    
    public static void checkTheTextFocusGained(JTextField textField, String org){
        originalText = org;
        if(textField.getText().trim().equals(org)){
            textField.setText("");
        }
    }
    
    public static void checkTheTextFocusLost(JTextField textField) {
        if (textField.getText().trim().equals("")){
            textField.setText(originalText);
        }
    }
    
}
