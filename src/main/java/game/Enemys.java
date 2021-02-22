package game;

public class Enemys {
    
    String name;
    int hp,id;
    boolean target = false;
    
    Config cfg = new Config();
    
    void orc_say(){
        
        System.out.println("My hp "+hp);
        
    }
    
    Enemys(String name,int hp) {
        
        this.name = name;
        this.hp = hp;
        cfg.id_enemys++;
        id = cfg.id_enemys;
        
        System.out.println("I'm A " + name + "! And my id: " + id + "! My Health " + hp);

    }
    
}
