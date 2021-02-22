
package game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Button_ViewM extends JButton implements ActionListener{
    
    int count=0;
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Frame.txt_shower.setText(""); //Отчищаем лог
        while(Main.orcs.length>count){
            
        Frame.txt_shower.append(
                " My name " + Main.orcs[count].name + 
                " My id: " + Main.orcs[count].id +
                " I have " + Main.orcs[count].hp + " health!\n");
                count++;
        if(count>=Main.orcs.length){
            count=0;
            break;
            }
        } ///Конец цикла
    } /// Конец метода
    
    Button_ViewM(int x,int y,int w,int h,String name){
        
        super(name);
        
        setBounds(x,y,w,h);
        
        setFocusPainted(false);
        
        addActionListener(this);
        
    }
    
}
