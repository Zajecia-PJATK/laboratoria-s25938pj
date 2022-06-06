import java.util.NoSuchElementException;
import java.util.Scanner;

 class Main {
     public static void main(String[] args) {

         int[] liczby = {1,2,3,4,5};
         int index = 5;

         try {
                 System.out.println("Liczba o podanym indexie to: " + liczby[index]);

         }
         catch (Exception e) {
             System.out.println("Elementu nie znaleziono.");
         }
     }
 }