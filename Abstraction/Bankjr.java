public class Bankjr extends Bank {
    public void deposit(int amount){
        balance += amount; 
        display();  
    }

    public void withdraw(int amount){
        if ((balance- amount) <=0)
            System.out.println("Insufficient balance");
        
        else{
            balance-=amount; 
            display();
        }
            
    }
}
