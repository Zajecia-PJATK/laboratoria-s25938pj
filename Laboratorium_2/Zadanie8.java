package com.company;

import jdk.jshell.Snippet;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Damian", "Leszczyński", "25395", 85, 4);
        Student student2 = new Student("Karol", "Szmajda", "52375", 1000, 500);
        Student student3 = new Student("Piotr", "Maciejewski", "32314", -23, 3);
        Student student4 = new Student("Jan", "Wolski", "21695", 250, 5);
        Student student5 = new Student("18325", 80, 4);

        wypisywanieStudentow(student1);
        wypisywanieStudentow(student2);
        wypisywanieStudentow(student3);
        wypisywanieStudentow(student4);
        wypisywanieStudentow(student5);
    }

    public static void wypisywanieStudentow(Student student) {
        System.out.println(" Imię i nazwisko " +student.pobierzImie() + " " + student.pobierzNazwisko() + "\n Indeks: " + student.pobierzIndeks() + "\n Obecność w procentach" + student.pobierzObecnosc() + " \n Ocena z Programowania Obiektowego w Javie: " + student.pobierzOceneZPOJ()+"\n\n");
    }
}
    class Student {

        private String imie;
        private String nazwisko;
        private String indeks;
        private double obecnosc;
        private int ocenaZPOJ;

        public Student(String imie, String nazwisko, String indeks, double obecnosc, int ocenaZPOJ) {    //Utawianie w przypadku podania wszystkich danych

            ustawImie(imie);
            ustawNazwisko(nazwisko);
            ustawIndeks(indeks);
            ustawObecnosc(obecnosc);
            ustawOceneZPOJ(ocenaZPOJ);
        }

        public Student(String indeks, double obecnosc, int ocenaZPOJ) {  //Ustawienie w przypadku niepodania imienia i nazwiska
            this("Unknown", "Unknown", indeks, obecnosc, ocenaZPOJ);
        }

        public void ustawImie(String imie) {
            this.imie = imie;
        }

        public void ustawNazwisko(String nazwisko) {
            this.nazwisko = nazwisko;
        }

        public void ustawIndeks(String indeks) {
            this.indeks = indeks;
        }

        public void ustawObecnosc(double obecnosc) {
            if (obecnosc < 0) {
                this.obecnosc = 0; //Nie może być mniejsza obecność od 0
            } else if (obecnosc > 100) {
                this.obecnosc = 100; //nie może bycć większa obecność od 100
            }
            else{
                this.obecnosc = obecnosc;
            }
        }

        public void ustawOceneZPOJ(int ocenaZPOJ) {
            if(ocenaZPOJ > 5){  //Najwyższa ocena to 5, więc nie może być wieksza
                this.ocenaZPOJ = 5;
            }
            else if(ocenaZPOJ<2){
                this.ocenaZPOJ=2;   //Najmniejsza ocena to 2, więc nie może być mniejsza
            }
            else{
                if (this.pobierzObecnosc() < 50) {
                    this.ocenaZPOJ = 2;
                } else {
                    this.ocenaZPOJ = ocenaZPOJ;
                }
            }
        }

        public String pobierzImie() {
            return imie;
        }

        public String pobierzNazwisko() {
            return nazwisko;
        }

        public String pobierzIndeks() {
            return indeks;
        }

        public double pobierzObecnosc() {
            return obecnosc;
        }

        public int pobierzOceneZPOJ() {
            return ocenaZPOJ;
        }
    }