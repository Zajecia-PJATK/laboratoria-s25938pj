package com.company;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Klawiatura implements KeyListener {

    public static boolean[] klawisze = new boolean[120];
    public static boolean[] ostatnieKlawisze = new boolean[120];

    //Metoda aktualizujaca nasze klucze

    public void aktualizuj(){
        for(int i=0; i< klawisze.length; i++){
            ostatnieKlawisze[i] = klawisze[i];
        }
    }
    //Pomocnicze metoda
    public static boolean klawisz(int klawisz){
        return klawisze[klawisz];
    }
    public static boolean klawiszWDol(int klawisz){
        return klawisze[klawisz] && !ostatnieKlawisze[klawisz];
    }
    public static boolean klawiszWGore(int klawisz){
        return !klawisze[klawisz] && ostatnieKlawisze[klawisz];
    }
    public void keyTyped(KeyEvent e) {
        //Wpisany klawisz
    }


    public void keyPressed(KeyEvent e) {
        //Wcisniety klawisz
        klawisze[e.getKeyCode()] = true;
    }


    public void keyReleased(KeyEvent e) {
        //Zwolniony klawisz
        klawisze[e.getKeyCode()] = false;
    }
}
