class Account{

    private String id;
    private String name;
    private int balance = 0;

    public Account(String id, String name){

        this.id = id;
        this.name = name;
    }
    public Account(String id, String name, int balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    public String getID(){
        return id;
    }
    public void setID(String id){
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getBalance(){
        return balance;
    }
    public void setBalance(int balance){
        this.balance=balance;
    }

    public void credit(int amount){
        this.balance = this.balance + amount;
    }
    public void debit(int amount){
        if(amount <= getBalance()){
            this.balance = this.balance - amount;
        }
    }
    public String  toString(){
         return "Account[id="+getID()+",name="+getName()+",balance="+getBalance()+"]";
    }
}