class Main {
    public static void main(String[] args) {
        //Jeżeli wynik będzie mniejszy niż 0 wyrzuci wyjątek
        //Jeżeli będzie większy to wypisze po prostu liczbę
        int wynik = -1;
        try{
            if(wynik < 0){
                throw new IllegalArgumentException();
            }
            else{
                System.out.println(wynik);
            }
        }
        catch (IllegalArgumentException e){
            System.out.println("Argument nie może być wartością ujemną");
        }
    }
}