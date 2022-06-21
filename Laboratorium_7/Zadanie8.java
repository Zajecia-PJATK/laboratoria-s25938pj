package com.company;

import java.io.File;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

class Person{
    int number;
    String name;
    String surname;
    String email;
    int salary;
    String currency;

    public Person(int no, String name, String surname, String email, int sal, String cur){
        this.number = no;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.salary = sal;
        this.currency = cur;
    }
    public int getNumber() {
        return number;
    }
    public int getSalary() {
        return salary;
    }
    public String getCurrency() {
        return currency;
    }
    public String getEmail() {
        return email;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
}



public class Main {


    public static void main(String[] args){
        int i;
        String temp;
        String  tna, tsu, tem;
        int tno,tsa;
        ArrayList<Person> baza = new ArrayList<>();
        Map<String, Integer> salaryTable = new TreeMap<>();
        try{
            File file = new File("data.csv");
            Scanner reader = new Scanner(file);
            i=0;
            while(reader.hasNext()){
                if(i==0) {
                    reader.nextLine();
                    i++;
                }
                else{
                    temp = reader.nextLine();
                    tno = Integer.parseInt(temp.substring(0, temp.indexOf(",")));
                    temp = temp.substring(temp.indexOf(",")+1);
                    tna = temp.substring(0, temp.indexOf(","));
                    temp = temp.substring(temp.indexOf(",")+1);
                    tsu = temp.substring(0, temp.indexOf(","));
                    temp = temp.substring(temp.indexOf(",")+1);
                    tem = temp.substring(0, temp.indexOf(","));
                    temp = temp.substring(temp.indexOf(",")+1);
                    tsa = Integer.parseInt(temp.substring(0, temp.indexOf(",")));
                    temp = temp.substring(temp.indexOf(",")+1);
                    baza.add(new Person(tno,tna,tsu,tem,tsa,temp));
                }
            }
        }catch (Exception e){
            System.out.println(e);
            System.exit(-1);
        }
        int z;
        try{
            for(Person x : baza){
                if(!salaryTable.containsKey(x.currency)){
                    salaryTable.put(x.currency,1);
                }else{
                    z = salaryTable.get(x.currency);
                    salaryTable.replace(x.currency,++z);
                }
            }
            int emailCount=0;
            for(Person x : baza){
                if(x.getEmail().substring(x.getEmail().indexOf(".")+1).equals("com"))emailCount++;
            }
            System.out.println("Waluta i ilość osób w niej zarabiających: ");
            System.out.println(salaryTable);
            System.out.println("Ilość emaili kończących sie na \"com\" = " + emailCount);

        }catch (Exception e){
            System.out.println(e);
            System.exit(-2);
        }
    }
}