import java.util.*;

class Hamster {
    String name;
    private int hamsterNumber;
    Hamster(int i) { hamsterNumber = i; }
    public String hamsterNumber() {
        return "This is Hamster #" + hamsterNumber;
    }

    public int getHamsterNumber() {
        return hamsterNumber;
    }
}

class Printer {
    static void printAll(List <Hamster> hl) {
        for(Hamster x : hl){
            System.out.println(x.hamsterNumber());
        }
    }
}

class HamsterMaze {
    public static void main(String[] args) {
        ArrayList<Hamster> v = new ArrayList<Hamster>();
        Map<Integer, String> map = new HashMap<>();
        ListIterator<Hamster> dupa = v.listIterator();
        for(int i = 0; i < 3; i++) {
                dupa.add(new Hamster(i));
        }
        Scanner x = new Scanner(System.in);
        String temp;
        int numer;
        try{

            while(x.hasNext()){
                numer = x.nextInt();
                temp = x.nextLine();
                if(numer<0) throw new Exception("ujemny indeks");
                map.put(numer, temp);
            }
        }catch (Exception e){
            temp = x.nextLine();
            numer = x.nextInt();
            map.put(numer, temp);
        }
        Printer.printAll(v);
        System.out.println(map.keySet());
    }
}