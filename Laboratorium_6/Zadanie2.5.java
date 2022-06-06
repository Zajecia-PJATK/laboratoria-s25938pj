import java.util.*;

public class Main{
}


class Hamster implements Comparable<Hamster>{
    String name;
    private int hamsterNumber;
    Hamster(int i) { hamsterNumber = i; }
    public String hamsterNumber() {
        return "This is Hamster #" + hamsterNumber;
    }

    public int getHamsterNumber() {
        return hamsterNumber;
    }

    @Override
    public int compareTo(Hamster o) {
        if(hamsterNumber<o.getHamsterNumber()) return -1;
        else if(hamsterNumber>o.getHamsterNumber()) return 1;
        else return 0;
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
    ArrayList<Hamster> removeHomik(int numer, ArrayList<Hamster> fal){
        ListIterator<Hamster> dupa = fal.listIterator();
        for(int i = 0; i < numer; i++){
            dupa.remove();
        }
        return fal;
    }



    public static void main(String[] args) {
        ArrayList<Hamster> v = new ArrayList<Hamster>();
        Map<Integer, String> map = new HashMap<>();
        ListIterator<Hamster> dupa = v.listIterator();
        Random rand = new Random();
        for(int i = 0; i < 20; i++) {
                dupa.add(new Hamster(rand.nextInt(10)));
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
        Collections.sort(v);
        Printer.printAll(v);
        System.out.println(map.keySet());
    }
}