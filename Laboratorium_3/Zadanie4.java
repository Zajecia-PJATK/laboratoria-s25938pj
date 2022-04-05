package com.company;

import javax.sound.midi.Soundbank;
import java.util.Scanner;
import java.util.regex.*;

class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(RandomNumbers.randomElement());
    }
}
class RandomNumbers{
    static int[] elementyTablicy = {1,2,3,4,5,6,7,8,9};
    static int randomElement(){
        int wynik = (int) Math.floor(Math.random()*elementyTablicy.length);
        return elementyTablicy[wynik];
    }
}