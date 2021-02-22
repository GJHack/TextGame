
package game;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.*;


public class Frame extends JFrame{
    
    Dimension screenSize  = Toolkit.getDefaultToolkit().getScreenSize();
    int w = screenSize.width;
    int h = screenSize.height;
    int w_window = 640;
    int h_window = 480;
    
    ///�������� ����� GUI 
    
    JLabel new_text; ///����� � �������
    JButton get_monsters; ///������ ������������ ���������� �������
    
    Frame(){
        
        super("Game"); ///������� ����
        
        setBounds((int)(w/3),(int)(h/4),w_window,h_window); ///��������� �������� � ������� ����
        setDefaultCloseOperation(EXIT_ON_CLOSE);//��������� ������� �������� ������
        setResizable(false); ///������ �� ��������� ������� ����
        setLayout(null); ///���������� ����-����������
                
        ////�������� GUI
        
        new_text = new JLabel("��� ��� �������?");
        new_text.setBounds((int)(w_window/2),(int)(h_window/2),280,50);
        
        get_monsters = new JButton("����� ����� ������� ����");
        get_monsters.setBounds((int)(w_window/1.2),(int)(h_window/1.2),200,30);
        
        add(new_text); ///���������� ����� � ����
        
        GetMonsters_Button taptap = new GetMonsters_Button(); /// �������� ������� ����������� �������
        get_monsters.addActionListener(taptap);
        
        add(get_monsters);
        
        
        
        setVisible(true); ///������ ��� �������
    } ///����� ������������
    
} /// ����� ������
