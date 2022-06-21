package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String fileName;
        int fileSize=0;
        try {
            System.out.println("Podaj nazwę pliku: ");
            fileName = s.nextLine();
            DataInputStream input = new DataInputStream(new FileInputStream(fileName));
            while(true){
                fileSize++;
                input.readByte();
            }
        }catch (Exception e){
            if(fileSize==0) System.out.println(e.getMessage());
            else   System.out.println(fileSize - 1);
        }
    }
}