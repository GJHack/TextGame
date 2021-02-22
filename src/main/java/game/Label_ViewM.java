/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import javax.swing.*;

/**
 *
 * @author Java Kit
 */
public class Label_ViewM extends JLabel{
    
    Label_ViewM(int x,int y,int w,int h,String text){
        
        super(text);
        setBounds(x,y,w,h);
        setBorder(BorderFactory.createEtchedBorder());
        
        
    }
    
}
