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

    }
    public void renderujText(Graphics2D gra){

    }
}
