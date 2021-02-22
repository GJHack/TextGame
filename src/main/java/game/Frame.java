
package game;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.*;
import javax.swing.*;


public class Frame extends JFrame{
    
    
    ////�������
    
    static Label_ViewM main_lbl;
    
    Dimension screenSize  = Toolkit.getDefaultToolkit().getScreenSize();
    int w = screenSize.width;
    int h = screenSize.height;
    int w_window = 640;
    int h_window = 480;
    
    ///�������� ����� GUI 
    
    Frame(){
        
        super("Game"); ///������� ����
        
        setBounds((int)(w/3),(int)(h/4),w_window,h_window); ///��������� �������� � ������� ����
        setDefaultCloseOperation(EXIT_ON_CLOSE);//��������� ������� �������� ������
        setResizable(false); ///������ �� ��������� ������� ����
        setLayout(null); ///���������� ����-����������
                
        ////�������� GUI
        
       Panel_ViewM main_panel = new Panel_ViewM();
       
       main_lbl = new Label_ViewM(90,90,200,200,"��� ��� �������?"); ///����������� ����
        
       Button_ViewM button_m = new Button_ViewM(250,240,200,30,"������");

       add(main_panel);
       
       main_panel.add(button_m);
       
       main_panel.add(main_lbl);
       
       button_m.addActionListener(e->{main_lbl.setText("C�����!");});
        
        
        setVisible(true); ///������ ��� �������
    } ///����� ������������


    
} /// ����� ������
