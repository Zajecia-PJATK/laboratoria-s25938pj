ackage com.company;


public class Main {
    public static void main(String[] args) {

        Numbers liczba1 = new Numbers(10, 20, 30);

        System.out.println("Suma liczb wynosi: " + liczba1.sum());
        System.out.println("Średnia arytmetyczna wynosi: " + liczba1.average());
        System.out.println("Najmniejsza liczba to: " + liczba1.min());
        System.out.println("Największa liczba to: " + liczba1.max());
        System.out.println("Średnia geometryczna wynosi: " + liczba1.gemoetric());

    }
}

class Numbers {
    private int liczba1, liczba2, liczba3;

    public Numbers(int liczba1, int liczba2, int liczba3) {
        this.liczba1 = liczba1;
        this.liczba2 = liczba2;
        this.liczba3 = liczba3;
    }

    public int sum() {
        return liczba1 + liczba2 + liczba3;
    }

    public double average() {
        return (double) (liczba1 + liczba2 + liczba3) / 3;
    }

    public int min() {
        int najmniejszaLiczba = liczba1;
        if (liczba1 > liczba2)
            najmniejszaLiczba = liczba2;
        if (liczba2 > liczba3)
            najmniejszaLiczba = liczba3;
        return najmniejszaLiczba;
    }

    public int max() {
        int najwiekszaLiczba = liczba1;
        if (liczba1 < liczba2)
            najwiekszaLiczba = liczba2;
        if (liczba2 < liczba3)
            najwiekszaLiczba = liczba3;
        return najwiekszaLiczba;
    }

    public double gemoetric() {
        return Math.cbrt(liczba1 * liczba2 * liczba3);
    }
}