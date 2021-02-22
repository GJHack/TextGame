
package game;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.*;


public class Frame extends JFrame{
    
    
    ////�������
    
    static Label_ViewM main_lbl;
    static TextShower_viewM txt_shower;
    static List_viewM monster_list;
    static Scroll_Pane panel_scroll;
    
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
        
       Panel_ViewM main_panel = new Panel_ViewM(10,10,600,420); ///������� ������
       
       monster_list = new List_viewM(90,90,300,300,Main.orcs);
            panel_scroll = new Scroll_Pane(10,10,200,200,monster_list); ///������ ���������
       
       main_lbl = new Label_ViewM(90,90,200,200,"��� ��� �������?"); ///����������� ����
       
       //txt_shower = new TextShower_viewM(90,90,300,300,"Well...");
       

        
       Button_ViewM button_m = new Button_ViewM((int)Math.round(main_panel.getWidth()/1.5),
                                                (int)Math.round(main_panel.getHeight()/2),200,30,"������");
       
       
       ///�������� �������� GUI
       add(main_panel);///������� ������
              main_panel.add(button_m);
       
              
       main_panel.add(panel_scroll); ///�������� ������ ���������
              

       //main_panel.add(main_lbl);  ///���� ��� ����� �� �����
       
       //main_panel.add(txt_shower);
       

      
        
        
        setVisible(true); ///������ ��� �������
    } ///����� ������������


    
} /// ����� ������
