class TestScores {

    static double Srednia(double[] wyniki) {
        double suma = 0.0;
        int ilosc = wyniki.length;

        for (int i = 0; i < wyniki.length; i++) {
            suma += wyniki[i];
        }
        return suma / ilosc;
    }

    public static void main(String[] args) {

        double[] wyniki = {20, 50, 110};
        double sredniaWynikow = Srednia(wyniki);


        try {
            for(int i =0; i < wyniki.length; i++){
                if(wyniki[i] < 0 || wyniki [i] > 100){
                    throw new IllegalArgumentException();
                }
            }
            System.out.println(sredniaWynikow);
        } catch (IllegalArgumentException e) {
            System.out.println("Podałeś wynik spoza zakresu.");
        }

    }
}
