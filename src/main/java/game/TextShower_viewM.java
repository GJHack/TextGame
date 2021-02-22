package game;

import javax.swing.*;
import javax.swing.text.BadLocationException;
import javax.swing.text.*;

public class TextShower_viewM extends JTextArea {
        
    TextShower_viewM(int x,int y,int w,int h,String txt) {
        
        setText(txt);
        setBounds(x,y,w,h);
        setBorder(BorderFactory.createEtchedBorder());
        setEditable(false);
        
    }
    
}
