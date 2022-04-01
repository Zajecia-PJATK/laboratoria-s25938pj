package com.company;


public class Main {
    public static void main(String[] args) {

        Invoice Faktura1 = new Invoice("1","Intel Core i7 12700k", 10, 1500);
        Invoice Faktura2 = new Invoice("2","Samsung Odyssey G9", 2, 6500);
        Invoice Faktura3 = new Invoice("3","Logitech Craft", 5, 800);
        Invoice Faktura4 = new Invoice("4","X-Kom G4M3R", 5, 45399);
        Invoice Faktura5 = new Invoice("5","Szynka", -10, -1000);

        System.out.println("Cena brutto całej faktury to: " + Faktura1.Amount() + "zł");
        System.out.println("Cena brutto całej faktury to: " + Faktura2.Amount() + "zł");
        System.out.println("Cena brutto całej faktury to: " + Faktura3.Amount() + "zł");
        System.out.println("Cena brutto całej faktury to: " + Faktura4.Amount() + "zł");
        System.out.println("Cena brutto całej faktury to: " + Faktura5.Amount() + "zł");

    }
}
class Invoice{

    private String product_number;      //numer produktu
    private String product_description; //Opis produktu
    private int quantity;               //Ilość
    private double pricePerItem;        //Cena za 1 sztuke

    public Invoice(String product_number,String product_description,int quantity,double pricePerItem){
        this.product_number = product_number;
        this.product_description = product_description;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }
    public String getProductNumber(){
        return product_number;
    }
    public void setProductNumber(String product_number){
        this.product_number = product_number;
    }
    public String getProductDescription(){
        return product_description;
    }
    public void setProductDescription(String product_description){
        this.product_description = product_description;
    }
    public int getQuantity(){
        return quantity;
    }
    public void setQuantity(int quantity){
        this.quantity =quantity;
    }
    public double getPricePerItem(){
        return  pricePerItem;
    }
    public void setPricePerItem(double pricePerItem){
        this.pricePerItem = pricePerItem;
    }
    public double Amount(){
        if(pricePerItem<0){
            return 0;
        }
        if(quantity < 0){
            return 0;
        }
        return quantity * pricePerItem;
    }
}