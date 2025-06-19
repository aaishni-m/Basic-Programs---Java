public abstract class Bank {
    int balance; 
    public abstract void deposit(int amount); 
    public abstract void withdraw(int amount); 

    public void display(){
        System.out.println("Balance: "+balance);
    }
}
