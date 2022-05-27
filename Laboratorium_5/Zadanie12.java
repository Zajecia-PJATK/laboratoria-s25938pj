package com.company;

interface pierwszyInterfejs {
    void metodaPierwsza();

    void metodaDruga();
}

interface drugiInterfejs {
    void metodaTrzecia();

    void metodaCzwarta();
}

interface trzeciInterfejs extends pierwszyInterfejs, drugiInterfejs {
    void metodaPiata();
}

class KlasaNadrzedna {
    void metodaSzosta() {
        System.out.println("Metoda numer 6 ");
    }
}

class KlasaPodrzedna extends KlasaNadrzedna implements trzeciInterfejs {
    public void metodaPierwsza() {
        System.out.println("Metoda numer 1");
    }

    @Override
    public void metodaDruga() {
        System.out.println("Metoda numer 2");
    }

    @Override
    public void metodaTrzecia() {
        System.out.println("Metoda numer 3");
    }

    @Override
    public void metodaCzwarta() {
        System.out.println("Metoda numer 4");
    }

    @Override
    public void metodaPiata() {
        System.out.println("Metoda numer 5");
    }
}

class Main {
    public static void testPierwszegoInterfejsu(pierwszyInterfejs pierwszy) {
        pierwszy.metodaPierwsza();
    }

    public static void testDrugiegoInterfejsu(drugiInterfejs drugi) {
        drugi.metodaTrzecia();
    }

    public static void testTrzeciegoInterfejsu(trzeciInterfejs trzeci) {
        trzeci.metodaDruga();
        trzeci.metodaTrzecia();
        trzeci.metodaCzwarta();
        trzeci.metodaPiata();
    }

    public static void main(String[] argv) {
        KlasaPodrzedna klasa1 = new KlasaPodrzedna();
        testPierwszegoInterfejsu(klasa1);
        testDrugiegoInterfejsu(klasa1);
        testTrzeciegoInterfejsu(klasa1);

    }
}

