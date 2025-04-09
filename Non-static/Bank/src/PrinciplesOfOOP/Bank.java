package PrinciplesOfOOP;

public class Bank {
	private String username; 
	private String bankName; 
	private int pin; 
	private String ifsc; 
	private long accno; 
	private int balance;
	
	public Bank(String username, String bankName, int pin, String ifsc, long accno)
	{
		this.username = username; 
		this.bankName = bankName; 
		this.pin = pin; 
		this.ifsc = ifsc; 
		this.accno = accno; 
	}
	
	public String getUsername() {
		return username; 
	}
	
	public String getBankName() {
		return bankName; 
	}
	
	public void setPin(long accno, int oldpin, int newpin) {
		if(this.accno == accno && pin == oldpin && newpin != oldpin) {
			this.pin = newpin ; 
		}
		else
			System.out.println("Invalid credentials"); 
	}
	
	public String getIFSC() {
		return ifsc;
	}
	
	public long getAccno() {
		return accno;
	}
	
	public double credit(int amt) {
		if(amt>0) {
			this.balance += amt;
			return this.balance; 
		}
		else {
			System.out.println("Invalid credentials"); 
			return 0 ;
		}
	}
	
	public double debit (long accno, int pin, int amt)
	{
		if (this.accno == accno && this.pin == pin) {
			if(this.balance - amt > 0) {
				this.balance -= amt; 
				return this.balance;
			}
			else
			{
				System.out.println("Insufficient balance");
				return 0;
			}
		}
		else {
			System.out.println("Invalid credentials"); 
			return 0;
		}
	}
	
	public double getBalance()
	{
		return this.balance; 
	}
}
