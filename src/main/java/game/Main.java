//Пакеты
package game;

//Импорты

import java.util.Scanner;

public class Main {
    
    public static void main(String[] m) {
        
         boolean isExit=false;
         String input;
        
        
        Scanner in = new Scanner(System.in);
        
        Enemys orcs[];
        orcs=Create_Enemys.createEnemys("orcs",20);
        
       orcs[2].orc_say();
       orcs[2].hp-=20;
       orcs[2].orc_say();
     
       
       new Frame();
       
       /*
       while(!isExit) {
             input = in.readLine();
           
           if(input.equalsIgnoreCase("exit")){
               isExit = true;
           } else if(input.equalsIgnoreCase("who_is")){
               for(int i=0;i<orcs.length;i++){
                   System.out.println("["+orcs[i].id+"] "+"This monster have "+orcs[i].hp);
               }
           }
           
       }
        */
        
    }
    
}
