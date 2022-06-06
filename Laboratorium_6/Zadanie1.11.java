class MojWyjatek extends Exception{

    public MojWyjatek(String komunikat){
        super();
    }
    public MojWyjatek() {

    }
}

class Main {
    public static void main(String[] args) {
        int liczba = -1;
        try{
            if(liczba <= 0){
                throw new MojWyjatek();
            }
        }
        catch (MojWyjatek e){
            System.out.println("Argument nie może być wartością ujemną");
        }
    }
}