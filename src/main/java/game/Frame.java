
package game;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.*;
import javax.swing.*;


public class Frame extends JFrame{
    
    
    ////Статики
    
    static Label_ViewM main_lbl;
    
    Dimension screenSize  = Toolkit.getDefaultToolkit().getScreenSize();
    int w = screenSize.width;
    int h = screenSize.height;
    int w_window = 640;
    int h_window = 480;
    
    ///Создание полей GUI 
    
    Frame(){
        
        super("Game"); ///Навание окна
        
        setBounds((int)(w/3),(int)(h/4),w_window,h_window); ///Установка размеров и позиции окна
        setDefaultCloseOperation(EXIT_ON_CLOSE);//Обработка события закрытия кнопки
        setResizable(false); ///Запрет на изменение размера окна
        setLayout(null); ///Отключение авто-сортировки
                
        ////Создание GUI
        
       Panel_ViewM main_panel = new Panel_ViewM();
       
       main_lbl = new Label_ViewM(90,90,200,200,"Где все монстры?"); ///Статическое поле
        
       Button_ViewM button_m = new Button_ViewM(250,240,200,30,"Нажать");

       add(main_panel);
       
       main_panel.add(button_m);
       
       main_panel.add(main_lbl);
       
       button_m.addActionListener(e->{main_lbl.setText("Cмотри!");});
        
        
        setVisible(true); ///Делаем Все видимым
    } ///Конец конструктора


    
} /// Конец класса
