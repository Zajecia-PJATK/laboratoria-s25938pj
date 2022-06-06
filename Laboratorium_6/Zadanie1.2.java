
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

class Main {
    public static void main(String[] argv) {
        ArrayList<String> listaSlow = new ArrayList<String>();
        Scanner scan1 = new Scanner(System.in);
        while (scan1.hasNext()) {
            for (String slowo : scan1.nextLine().split(" ")
            ) {
                listaSlow.add(slowo.toUpperCase());
            }
        }
        System.out.println(listaSlow.toString());
    }
}