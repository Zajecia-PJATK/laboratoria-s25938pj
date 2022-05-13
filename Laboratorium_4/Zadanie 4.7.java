package com.company;

class Main {
    public static void main(String[] args) {
       Kosiarka kos = new Kosiarka("Bosch","M500",1.0,silnik.Diesel,true,true,15);
       kos.wyswietl();
    }
}

enum silnik{
    Diesel,Benzyna,Hybryda,Elektryczny;
}
abstract class Maszyna {
    protected String marka;
    protected String nazwa;
    protected double pojemnoscSilnika;
    protected silnik rodzajSilnika;
}
 class Kosiarka extends Maszyna{
    private boolean czyMelekser;
    private boolean czyNaped;
    private int liczbaOstrzy;

    public Kosiarka(String marka, String nazwa, double pojemnoscSilnika, silnik rodzajSilnika, boolean czyMelekser, boolean czyNaped, int liczbaOstrzy){
        super.marka = marka;
        super.nazwa = nazwa;
        super.pojemnoscSilnika = pojemnoscSilnika;
        super.rodzajSilnika = rodzajSilnika;
        this.czyMelekser = czyMelekser;
        this.czyNaped = czyNaped;
        this.liczbaOstrzy = liczbaOstrzy;
    }

    public int getLiczbaOstrzy() {
        return liczbaOstrzy;
    }
    public void setLiczbaOstrzy(int liczbaOstrzy) {
        this.liczbaOstrzy = liczbaOstrzy;
    }
    public void setCzyMelekser(boolean czyMelekser) {
        this.czyMelekser = czyMelekser;
    }
    public void setCzyNaped(boolean czyNaped) {
        this.czyNaped = czyNaped;
    }

    public void wyswietl(){
        String wynik = "Czy melekser: ";
        String name = "";
        if(rodzajSilnika==silnik.Diesel) name = "Diesel";
        else if(rodzajSilnika==silnik.Benzyna) name = "Benzynowy";
        else if(rodzajSilnika==silnik.Hybryda) name = "Hybrydowy";
        else if(rodzajSilnika==silnik.Elektryczny) name = "Elektryczny";
        if(czyMelekser)wynik+="tak\n";
        else wynik+="nie\n";
        wynik+="Czy napęd: ";
        if(czyNaped) wynik+="tak\n";
        else wynik+="nie\n";

        System.out.println("Marka: " + super.marka + "\nNazwa: " + super.nazwa + "\nPojemność silnika: " + super.pojemnoscSilnika + "\nRodzaj silnika: "
                + name + "\n" + wynik + "Liczba ostrzy: " + this.liczbaOstrzy);
    }

}