package game;

public class Create_Enemys {
    
     static  Enemys[] createEnemys(String name,int count) {
         
        Enemys[] enemys = new Enemys[count];
        
        for(int x=0;x<count;x++){
            
            enemys[x] = new Enemys(name,100);
            
        }
        
     return enemys;   
    }
    
    
}
