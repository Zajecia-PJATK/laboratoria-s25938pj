package com.company;

public class Renderowanie {
    public static int szerokosc = Main.SZEROKOSC, wysokosc = Main.WYSOKOSC;
    public static int[] pixele = new int[szerokosc * wysokosc];

    public static void renderujTlo() {
        for (int i = 0; i < wysokosc; i++) {
            for (int j = 0; j < szerokosc; j++) {
                pixele[i + j * szerokosc] = 0xfff4f4f4; // Wyświetlanie kafelków planszy (4x4)

                if (i % 100 < 3 || i % 100 > 97 || j % 100 < 3 || j % 100 > 97) {
                    pixele[i + j * szerokosc] = 0xffcccccc; // Wyświetlanie ramki planszy
                }
            }
        }
    }

    public static void renderujKafelek(Kafelek kafelek, int punktI, int punktJ) {
        if (punktI < -kafelek.szerokosc || punktI > szerokosc || punktJ < -kafelek.wysokosc || punktJ > wysokosc)
            return;

        for (int j = 0; j < kafelek.wysokosc; j++) {
            int jTemp = j + punktJ;
            if (jTemp < 0 || jTemp > wysokosc) continue;
            for (int i = 0; i < kafelek.szerokosc; i++) {
                int iTemp = i + punktI;
                if (iTemp < 0 || iTemp > szerokosc) continue;
                int kolor = kafelek.pixele[i + j * kafelek.szerokosc];
                if (kolor == 0xffff00ff) continue;
                else pixele[iTemp + jTemp * szerokosc] = kolor;
            }
        }
    }
}
