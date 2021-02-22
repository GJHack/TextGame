
package game;

import javax.swing.JList;
import javax.swing.JScrollPane;

public class Scroll_Pane extends JScrollPane {
    
    Scroll_Pane(int x,int y,int w,int h,JList l){
        
        super(l);
        setBounds(x,y,w,h);        
    }
    
}
