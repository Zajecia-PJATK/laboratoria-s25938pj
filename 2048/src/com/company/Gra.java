package com.company;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Gra {
    public Gra(){
        init();
    }
    public void init(){

    }
    public void aktualizuj(){
        if(Klawiatura.klawisz(KeyEvent.VK_A)){
            System.out.println("Dół A");
        }
        if(Klawiatura.klawisz(KeyEvent.VK_A)){
            System.out.println("A");
        }
        if(Klawiatura.klawisz(KeyEvent.VK_A)){
            System.out.println("Góra A");
        }

    }
    public void renderuj(){
        Renderowanie.renderujTlo();
        Renderowanie.renderujKafelek(new Kafelek(100,100,0xffffff00),100,100 );
        for(int i=0; i< Main.pixele.length; i++){
            Main.pixele[i] = Renderowanie.pixele[i];
        }
    }
    public void renderujText(Graphics2D gra){

    }
}
