package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        File file = new File("plik.txt");
        Scanner s = new Scanner(System.in);
        ArrayList<String> data = new ArrayList<>();
        System.out.println("Podaj n: ");
        int n = s.nextInt();
        try {
            Scanner inputData = new Scanner(file);
            while(inputData.hasNext())  data.add(inputData.nextLine());
            inputData.close();
        } catch (FileNotFoundException e) {
            System.out.println("Problem z otwarciem pliku");
        }
        try{
            for(int i = n; i > 0; i--)    System.out.println(data.get(data.size()-i));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}