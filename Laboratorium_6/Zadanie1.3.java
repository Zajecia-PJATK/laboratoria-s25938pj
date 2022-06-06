import java.util.*;

class Main {
    public static void main(String[] argv) {
        SortedSet<Integer> listaLiczb = new TreeSet<>();
        Scanner scan1 = new Scanner(System.in);
        while (scan1.hasNext()) {
            listaLiczb.add(scan1.nextInt());
        }
        System.out.println(listaLiczb);
    }
}
