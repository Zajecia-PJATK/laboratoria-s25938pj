package com.company;

@FunctionalInterface
interface VoidNicNieZwracajacy {
    void nic();
}
@FunctionalInterface
interface obliczanieProstopadloscianu {
    int oblicz(int a, int b, int c);
}
@FunctionalInterface
interface voidZJednymParametrem{
    void jedenParametr(String slowo);
}
@FunctionalInterface
interface wieleInstrukcji{
    int wiele(int a, int b, int c, int d);
}




class Main {
    public static void main(String[] argv) {

        //(20%) metodę typu void bez parametrów
        VoidNicNieZwracajacy zad1 = () -> System.out.println("\nWyrażenie lambda typu void nie zwracające nic");
        zad1.nic();


        //(20%) metodę typu int z trzema parametrami
        obliczanieProstopadloscianu zad2 = (int a,int b,int c) -> a*b*c;
        System.out.printf("Wyrażenie lambda typu int zwracające 3 parametry (Pole Prostopadloscianu): "
        +zad2.oblicz(10,5,6)+"\n");

        //(20%) metodę typu void z jednym parametrem
        voidZJednymParametrem zad3 = (String slowo) -> System.out.println("Wyrażenie lambda typu void z jednym parametrm:  " + slowo);
        zad3.jedenParametr("Może to być jedynie ciąg znaków");

        //(40%) wyrażenie zawierające wiele instrukcji
        wieleInstrukcji zad4 = (int a, int b, int c, int d) -> {
            int wynikDodawania = a+b+c+d;
            return wynikDodawania;
        };
        System.out.println("Wyrażenie lambda z wieloma instrukcjami(Dodawanie liczb): " + zad4.wiele(5,6,8,13)+ "\n");
    }
}

