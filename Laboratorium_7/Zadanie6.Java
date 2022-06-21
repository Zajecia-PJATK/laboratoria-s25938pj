package com.company;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String filename="";
        try {
            System.out.println("Podaj nazwę pliku: ");
            filename= s.nextLine();
            if(filename.contains(".")) filename = filename.substring(0,filename.indexOf("."));
        }catch(Exception e){
            System.out.println(e.getMessage());
            System.exit(-1);
        }
        File file1 = new File(filename + ".txt");
        try{
            Scanner fileReader = new Scanner(file1);
            FileOutputStream fstream = new FileOutputStream(filename + ".dat");
            DataOutputStream output = new DataOutputStream(fstream);
            while(fileReader.hasNext())output.writeChars(fileReader.nextLine());
        }catch (Exception e){
            System.out.println(e.getMessage());
            System.exit(-2);
        }
    }
}
