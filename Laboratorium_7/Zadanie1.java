package com.company;

import java.io.File;

public class Main {

    public static void main(String[] args){
        File file = new File("ushi.txt");
        if(!file.exists()){
            System.out.println("Plik nie istnieje");
        }else{
            System.out.println("Plik istnieje");
        }

    }
}