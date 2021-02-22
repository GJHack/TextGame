
package game;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.*;


public class Frame extends JFrame{
    
    
    ////Статики
    
    static Label_ViewM main_lbl;
    static TextShower_viewM txt_shower;
    static List_viewM monster_list;
    static Scroll_Pane panel_scroll;
    
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
        
       Panel_ViewM main_panel = new Panel_ViewM(10,10,600,420); ///Главная панель
       
       monster_list = new List_viewM(90,90,300,300,Main.orcs);
            panel_scroll = new Scroll_Pane(10,10,200,200,monster_list); ///панель прокрутки
       
       main_lbl = new Label_ViewM(90,90,200,200,"Где все монстры?"); ///Статическое поле
       
       //txt_shower = new TextShower_viewM(90,90,300,300,"Well...");
       

        
       Button_ViewM button_m = new Button_ViewM((int)Math.round(main_panel.getWidth()/1.5),
                                                (int)Math.round(main_panel.getHeight()/2),200,30,"Нажать");
       
       
       ///Иерархия создания GUI
       add(main_panel);///Главная панель
              main_panel.add(button_m);
       
              
       main_panel.add(panel_scroll); ///Созадние панели прокрутки
              

       //main_panel.add(main_lbl);  ///Пока эта метка не нужна
       
       //main_panel.add(txt_shower);
       

      
        
        
        setVisible(true); ///Делаем Все видимым
    } ///Конец конструктора


    
} /// Конец класса
