package game;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
public class List_viewM extends JList implements ListSelectionListener {
    
    List_viewM(int x,int y,int w,int h,Enemys[] e){
        
        super(e);
        
        setBounds(x,y,w,h);
        
        setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        setSelectedIndex(0);
        
        addListSelectionListener(this);
        
        
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        
        System.out.println(getSelectedIndex());
        Main.orcs[getSelectedIndex()].target = true;
        Main.orcs[getSelectedIndex()].hp-=10;
        System.out.println(Main.orcs[getSelectedIndex()].target);
    }
    
}
