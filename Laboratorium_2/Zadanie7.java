package com.company;

import jdk.jshell.Snippet;

public class Main {

    public static void main(String[] args) {

        Card karta1 = new Card("Kier", 12);
        Card karta2 = new Card("Pik", 11);
        Card karta3 = new Card("Karo", 15);

        System.out.println(karta1.pobierzWartosc() + " " + karta1.pobierzKolor());
        System.out.println(karta2.pobierzWartosc() + " " + karta2.pobierzKolor());
        System.out.println(karta3.pobierzWartosc() + " " + karta3.pobierzKolor());
        System.out.println();

        testWaletKier();
        testDamaKier();
        testKrolKier();
        testAsKier();
        testJokerKier();

    }

    //Można skrócić to pisząc jedną metodę która by pomagała w każdym tekście żeby nie duplikowac kodu
    //Oraz można tak naprawdę napisać 52 testy do każdej karty

    public static void testWaletKier(){
        Card karta1 = new Card("Kier", 11);
        String spodziewanyWynik = "Walet Kier";
        String prawdziwyWynik = karta1.pobierzWartosc() + " " + karta1.pobierzKolor();
        if(spodziewanyWynik.equals(prawdziwyWynik)){
            System.out.println("testWaletKier: ✓");
        }
        else{
            System.out.println("testWaletKier: x");
            System.out.println("Spodziewany wynik: " + spodziewanyWynik);
            System.out.println("Prawdziwy wynik: " + prawdziwyWynik);
        }
    }
    public static void testDamaKier(){
        Card karta1 = new Card("Kier", 12);
        String spodziewanyWynik = "Dama Kier";
        String prawdziwyWynik = karta1.pobierzWartosc() + " " + karta1.pobierzKolor();
        if(spodziewanyWynik.equals(prawdziwyWynik)){
            System.out.println("testDamaKier: ✓");
        }
        else{
            System.out.println("testDamaKier: x");
            System.out.println("Spodziewany wynik: " + spodziewanyWynik);
            System.out.println("Prawdziwy wynik: " + prawdziwyWynik);
        }
    }
    public static void testKrolKier(){
        Card karta1 = new Card("Kier", 13);
        String spodziewanyWynik = "Król Kier";
        String prawdziwyWynik = karta1.pobierzWartosc() + " " + karta1.pobierzKolor();
        if(spodziewanyWynik.equals(prawdziwyWynik)){
            System.out.println("testKrolKier: ✓");
        }
        else{
            System.out.println("testKrolKier x");
            System.out.println("Spodziewany wynik: " + spodziewanyWynik);
            System.out.println("Prawdziwy wynik: " + prawdziwyWynik);
        }
    }
    public static void testAsKier(){
        Card karta1 = new Card("Kier", 14);
        String spodziewanyWynik = "As Kier";
        String prawdziwyWynik = karta1.pobierzWartosc() + " " + karta1.pobierzKolor();
        if(spodziewanyWynik.equals(prawdziwyWynik)){
            System.out.println("testAsKier: ✓");
        }
        else{
            System.out.println("testAsKier: x");
            System.out.println("Spodziewany wynik: " + spodziewanyWynik);
            System.out.println("Prawdziwy wynik: " + prawdziwyWynik);
        }
    }
    public static void testJokerKier(){
        Card karta1 = new Card("Kier", 15);
        String spodziewanyWynik = "Joker Kier";
        String prawdziwyWynik = karta1.pobierzWartosc() + " " + karta1.pobierzKolor();
        if(spodziewanyWynik.equals(prawdziwyWynik)){
            System.out.println("testJokerKier: ✓");
        }
        else{
            System.out.println("testJokerKier: x");
            System.out.println("Spodziewany wynik: " + spodziewanyWynik);
            System.out.println("Prawdziwy wynik: " + prawdziwyWynik);
        }
    }
}
enum Kolor{
    Kier,Karo,Pik,Trefl;
}
class Card {

    private String kolor;
    private String wartosc;

    public Card(String kolor, int wartosc){
        this.ustawKolor(kolor);
        this.ustawWartosc(wartosc);
    }

    public void ustawKolor(String kolor){

        switch (kolor){
            case "Kier":
                this.kolor = Kolor.Kier.toString();
                break;
            case "Karo":
                this.kolor = Kolor.Karo.toString();
                break;
            case "Pik":
                this.kolor = Kolor.Pik.toString();
                break;
            case "Trefl":
                this.kolor = Kolor.Trefl.toString();
                break;
            default:
                this.kolor = "Nieprawidłowy kolor";
                break;
        }

    }
    public void ustawWartosc(int wartosc){
        if(wartosc >= 2 && wartosc <=15){
            if(wartosc <=10){
                this.wartosc = Integer.toString(wartosc);
            }
            else {
                switch (wartosc) {
                    case 11:
                        this.wartosc = "Walet";
                        break;
                    case 12:
                        this.wartosc = "Dama";
                        break;
                    case 13:
                        this.wartosc = "Król";
                        break;
                    case 14:
                        this.wartosc = "As";
                        break;
                    case 15:
                        this.wartosc = "Joker";
                        break;
                    default:
                        this.wartosc = "Nieprawidłowa wartość";
                        break;
                }
            }
        }
        else{
            this.wartosc = "Nieprawidłowa wartość";
        }
    }
    public String pobierzKolor(){

        return kolor;

    }
    public String pobierzWartosc(){

        return wartosc;
    }
}