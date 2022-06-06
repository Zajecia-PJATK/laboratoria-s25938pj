import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

class Main {

    public static void main(String[] args) {
        Set<Integer> lista1 = new TreeSet<>();
        Scanner scan1 = new Scanner(System.in);
        while(scan1.hasNextInt())
        {
            Integer temp = scan1.nextInt();
            if(!lista1.contains(temp)){
                lista1.add(temp);
            }
            else{
                lista1.remove(temp);
            }
        }
        System.out.println(lista1);
    }
}