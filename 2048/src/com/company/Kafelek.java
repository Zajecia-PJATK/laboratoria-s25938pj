package com.company;

public class Kafelek {
    public int szerokosc, wysokosc;
    public int pixele[];

    public Kafelek(int szerokosc, int wysokosc, int color){
        this.szerokosc=szerokosc;
        this.wysokosc=wysokosc;
        this.pixele=new int[szerokosc*wysokosc];

        for(int i=0; i< wysokosc; i++){
            for(int j=0; j<szerokosc; j++){
                pixele[i+j*szerokosc]=color;
                if(i%100 < 3 || i%100 > 97 || j%100 < 3 || j%100 > 97){
                    pixele[i+j*szerokosc] = 0xffff00ff;
                }
            }
        }
    }

}
