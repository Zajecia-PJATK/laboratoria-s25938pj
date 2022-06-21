package com.company;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.File;

public class Main {

    public static void main(String[] args) {
        String fileName1, fileName2;
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Podaj nazwę pliku nr.1: ");
        fileName1 = scanner1.nextLine();
        System.out.println("Podaj nazwę pliku nr.2: ");
        fileName2 = scanner1.nextLine();

        try{
            File jeden = new File(fileName1);
            Scanner fileScanner = new Scanner(jeden);
            FileWriter writer = new FileWriter(fileName2,true);
            PrintWriter dwa = new PrintWriter(writer);
            while(fileScanner.hasNext())   dwa.println(fileScanner.nextLine());
            dwa.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}