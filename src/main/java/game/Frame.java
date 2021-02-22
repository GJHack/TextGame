
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
    
    ///Создание полей GUI 
    
    JLabel new_text; ///Метка с текстом
    JButton get_monsters; ///Кнопка показывающая следующего монстра
    
    Frame(){
        
        super("Game"); ///Навание окна
        
        setBounds((int)(w/3),(int)(h/4),w_window,h_window); ///Установка размеров и позиции окна
        setDefaultCloseOperation(EXIT_ON_CLOSE);//Обработка события закрытия кнопки
        setResizable(false); ///Запрет на изменение размера окна
        setLayout(null); ///Отключение авто-сортировки
                
        ////Создание GUI
        
        new_text = new JLabel("Где все монстры?");
        new_text.setBounds((int)(w_window/2),(int)(h_window/2),280,50);
        
        get_monsters = new JButton("Нажми чтобы увидеть орка");
        get_monsters.setBounds((int)(w_window/1.2),(int)(h_window/1.2),200,30);
        
        add(new_text); ///Добавление метки в окно
        
        GetMonsters_Button taptap = new GetMonsters_Button(); /// Создание объекта обработчика событий
        get_monsters.addActionListener(taptap);
        
        add(get_monsters);
        
        
        
        setVisible(true); ///Делаем Все видимым
    } ///Конец конструктора
    
} /// Конец класса
