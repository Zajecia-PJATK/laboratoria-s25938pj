package com.company;

class porownanie implements  Comparable<porownanie>{
    int liczba;
    public int compareTo(porownanie a){
        if(liczba==a.liczba){
            return 0;
        }
        if(liczba>a.liczba){
            return 1;
        }
        return -1;
    }
    public int getLiczba(){
        return liczba;
    }
    public void setLiczba(int liczba){
        this.liczba=liczba;
    }
    public porownanie(int liczba){
        this.liczba=liczba;
    }
}

class Main {
    public static void main(String[] argv) {
        porownanie por1 = new porownanie(10);
        porownanie por2 = new porownanie(20);
        porownanie por3 = new porownanie(30);
        porownanie por4 = new porownanie(40);
        porownanie por5 = new porownanie(50);
        System.out.println(por1.compareTo(por2));
        System.out.println(por2.compareTo(por3));
        System.out.println(por1.compareTo(por4));
        System.out.println(por3.compareTo(por5));
        System.out.println(por5.compareTo(por1));
    }
}

