class Author{
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public char getGender(){
        return gender;
    }
    public void setGender(char gender){
        this.gender=gender;
    }
    public String toString(){
        return "Author[name="+getName()+",email="+getEmail()+",gender="+getGender()+"]";
    }
}
class Book{

    private String name;
    private Author author;
    private double price;
    private int qty;

    public Book(String name, double price, Author author){
        this.name = name;
        this.price = price;
        this.author = author;
    }
    public Book(String name, double price, Author author, int qty){
        this.name = name;
        this.price = price;
        this.author = author;
        this.qty=qty;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public Author getAuthor(){
        return author;
    }
    public void setAuthor(Author author){
        this.author=author;
    }
    public int getQty(){
        return qty;
    }
    public void setQty(int qty){
        this.qty=qty;
    }
    public String toString(){
        return "Book[name="+getName()+
                ",author="+author.toString()+
                ",price="+getPrice()+
                ",qty="+getQty()+"]";
    }
}