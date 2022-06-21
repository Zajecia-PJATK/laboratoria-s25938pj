package com.company;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args){


        String fileName, data;
        char temp;
        int lineCount = 0, letterCount = 0, numberCount = 0, spaceCount = 0;
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Podaj nazwę pliku: ");
        fileName = scanner1.nextLine();
        try {
            File file = new File(fileName);
            Scanner fileScanner = new Scanner(file);
            while(fileScanner.hasNext()){
                data = fileScanner.nextLine();
                lineCount++;
                for(int i = 0; i < data.length();i++){
                    temp = data.toCharArray()[i];
                    if(temp ==' ') spaceCount++;
                    else if(((int)temp>=48)&&((int)temp<=57))numberCount++;
                    else if(((int)temp)>=65&&((int)temp<=90)||(((int)temp)>=97)&&((int)temp<=122)) letterCount++;
                }
            }
            System.out.println("Ilość linii: " + lineCount + "\nIlość liter: " + letterCount +
                    "\nIlość cyfr: " + numberCount + "\nIlość białych znaków: " + spaceCount);
        }catch (FileNotFoundException e) {
            System.out.println("Plik nie istnieje");
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}