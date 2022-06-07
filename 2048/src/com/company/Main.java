package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.io.BufferedReader;

public class Main extends Canvas implements Runnable {

    public static final int SZEROKOSC = 400, WYSOKOSC = 400;
    public static float skala = 2.0f;

    public JFrame ramka;
    public Thread watek;
    public Gra gra;
    public boolean uruchomionaGra = false;

    public static BufferedImage obraz = new BufferedImage(SZEROKOSC, WYSOKOSC, BufferedImage.TYPE_INT_RGB);
    public static int[] pixele = ((DataBufferInt) obraz.getRaster().getDataBuffer()).getData();

    public Main() {
        //UStawiamy preferowany rozmiar
        setPreferredSize(new Dimension((int) (SZEROKOSC * skala), (int) (WYSOKOSC * skala)));
        ramka = new JFrame();
        gra = new Gra();
    }

    public void start() {
        //Uruchamiamy gre/watki
        uruchomionaGra = true;
        watek = new Thread(this, "Pętla wątku");
        watek.start();

    }

    public void zatrzymaj() {
        //Zatrzymujemy naszą gre/watki
        try {
            watek.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void run() {
        long ostatniCzasWNanoSekundzie = System.nanoTime();
        long stoper = System.currentTimeMillis();
        double nanoSekundaNaAktualizacje = 1000000000.0 / 60.0;
        double aktualizacjaDoWykonania = 0.0;
        int ramki = 0;
        int aktualizacje = 0;
        requestFocus();
        while (uruchomionaGra) {
            long obecnyCzasWNanoSekundach = System.nanoTime();
            aktualizacjaDoWykonania += (obecnyCzasWNanoSekundach - ostatniCzasWNanoSekundzie) / nanoSekundaNaAktualizacje;
            if (aktualizacjaDoWykonania >= 1) {
                aktualizuj();
                aktualizacje++;
                aktualizacjaDoWykonania--;
            }
            obecnyCzasWNanoSekundach = ostatniCzasWNanoSekundzie;
            renderuj();
            ramki++;
            if (System.currentTimeMillis() - stoper > 1000) {
                ramka.setTitle("2048 PJATK" + aktualizacje + "aktualizacje, " + ramki + "ramki");
                aktualizacje = 0;
                ramki = 0;
            }
        }
    }

    public void aktualizuj() {
        gra.aktualizuj();
    }

    public void renderuj() {
        BufferStrategy strategiaBufora = getBufferStrategy();
        if (strategiaBufora == null) {
            createBufferStrategy(3);
            return;
        }
        gra.renderuj();
        Graphics2D grafika = (Graphics2D) strategiaBufora.getDrawGraphics();
        grafika.drawImage(obraz, 0, 0, (int) (SZEROKOSC * skala), (int) (WYSOKOSC * skala), null);
        gra.renderujText(grafika);
        strategiaBufora.show();
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.ramka.setResizable(false);
        m.ramka.setTitle("2048 PJATK");
        m.ramka.add(m);
        m.ramka.pack();
        m.ramka.setVisible(true);
        m.ramka.setLocationRelativeTo(null);
        m.ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Zamykanie okna
        m.ramka.setAlwaysOnTop(true);
        m.start();
    }
}
