import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String str;
        int number;
        Scanner scan1=new Scanner(System.in);
        str = scan1.next();
        try
        {
            number = Integer.parseInt(str);
        }
        catch (NumberFormatException e)
        {
            System.out.println(str + " nie jest liczbą.");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("Błędny format liczby.");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}