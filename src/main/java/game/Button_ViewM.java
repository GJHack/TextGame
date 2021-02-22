
package game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Button_ViewM extends JButton implements ActionListener{
    
    int count=0;
    
    @Override
    public void actionPerformed(ActionEvent e) {
        while(Main.orcs.length>count){
        count++;
        Frame.main_lbl.setText(Main.orcs[count].name + " My id: " + Main.orcs[count].id);
        
        }
    }
    
    Button_ViewM(int x,int y,int w,int h,String name){
        
        super(name);
        
        setBounds(x,y,w,h);
        
        setFocusPainted(false);
        
        addActionListener(this);
        
    }
    
}
