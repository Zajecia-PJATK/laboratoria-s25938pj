package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException{

        String fileName;
        String message;
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Podaj nazwę pliku: ");
        fileName = scanner1.nextLine();
        System.out.println("Podaj wiadomość: ");
        message = scanner1.nextLine();
        try {
            FileWriter writer = new FileWriter(fileName, true);
            PrintWriter blig = new PrintWriter(writer);
            blig.println(message);
            blig.close();
        }catch (IOException e) {
            e.printStackTrace();
        }

    }
}
