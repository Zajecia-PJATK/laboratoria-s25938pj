package com.company;


public class Main {
    public static void main(String[] args) {

        MyDate data1 = new MyDate(29,3,1981);
        MyDate data2 = new MyDate(25,5,2008);
        MyDate data3= new MyDate(23,12,1980);
        MyDate data4 = new MyDate(51,22,3000);

        System.out.println();
        data1.displayDate();
        data2.displayDate();
        data3.displayDate();
        data4.displayDate();
    }
}

class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.ustawMiesiac(month);
        this.ustawDzien(day);
        this.ustawRok(year);
    }

    public MyDate() {
        this(1, 1, 1990);
    }


    public void ustawMiesiac(int month) {
        this.month = (month > 0 && month <= 12) ? month : 1; //Skrócony zapis instrukcji warunkowej
    }

    public void ustawDzien(int day) {
        this.day = (day > 0 && day <= 31) ? day : 1; //Skrócony zapis instrukcji warunkowej
    }

    public void ustawRok(int year) {
        this.year = (year >= 1990 && year <= 2050) ? year : 1990; //Skrócony zapis instrukcji warunkowej
    }

    public int pobierzMiesiac() {
        return month;
    }

    public int pobierzDzien() {
        return day;
    }

    public int pobierzRok() {
        return year;
    }

    public void displayDate() {

        String day = this.day >= 10 ? Integer.toString(this.day) : "0" + this.day;              //Skrócony zapis instrukcji warunkowej
        String month = this.month >= 10 ? Integer.toString(this.month) : "0" + this.month;      //Skrócony zapis instrukcji warunkowej

        System.out.println(day+ "/" + month + "/" + this.year);
    }
}