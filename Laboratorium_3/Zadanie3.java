class Author {

    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public void setGender() {
        this.gender = gender;
    }


    public String toString() {
        return "Author[name=" + getName() + ",email=" + getEmail() + ",gender=" + getGender() + "]";
    }

}

class Book {

    private String name;
    private Author[] author;
    private double price;
    private int qty = 0;

    public Book(String name, double price, Author[] author, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author[] getAuthor() {
        return author;
    }

    public void setAuthor(Author author[]) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public Author[] getAuthors() {
        return author;
    }

    public String getAuthorNames() {
        String a = "";
        int b = getAuthors().length;

        for (int i = 0; i < getAuthors().length; i++) {


            if (i < b - 1) {
                a += author[i] + ", ";
            } else {
                a += author[i];
            }
        }

        return a;
    }

    public String toString() {
        return "Book[name=" + getName() + ",price=" + getPrice() +
                ",authors=[" + getAuthorNames() + "],qty=" + getQty() + "]";
    }
}