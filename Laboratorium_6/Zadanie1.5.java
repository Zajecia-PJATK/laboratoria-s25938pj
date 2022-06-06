import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Collections;

class Main {
    public static void main(String[] args) {
        ArrayList<String> listaSlow = new ArrayList<String>();
        LinkedHashSet<String> listaSlow2 = new LinkedHashSet(listaSlow);
        Scanner scan1 = new Scanner(System.in);
        while (scan1.hasNext()) {
            for (String slowo : scan1.nextLine().split(" ")) {
                listaSlow.add(slowo);
            }
        }
        Collections.sort(listaSlow);
        for (String key : listaSlow) {
            listaSlow2.add(key + "=" + Collections.frequency(listaSlow, key));
        }
//        ArrayList<String> listaBezDuplikatow = new ArrayList<>(listaSlow2);
        System.out.println(listaSlow2.toString().replace("[","{").replace("]","}"));
    }
}