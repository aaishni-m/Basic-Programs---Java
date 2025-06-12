package PrinciplesOfOOP;

public class BankAcc {
	private String username; 
	private String bankName; 
	private long accno; 
	private int pin; 
	private String ifsc; 
	private double balance; 
	private long phno; 
	private long aadhar; 
	UPI upi;
	BankAcc acc = new BankAcc(); 
	
	
	public BankAcc() {

	}
	public BankAcc(String username, String bankName, long accno, int pin, String ifsc, double balance, long phno,
			long aadhar) {
		this.username = username;
		this.bankName = bankName;
		this.accno = accno;
		this.pin = pin;
		this.ifsc = ifsc;
		this.balance = balance;
		this.phno = phno;
		this.aadhar = aadhar;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public long getAccno() {
		return accno;
	}
	public void setAccno(long accno) {
		this.accno = accno;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public String getIfsc() {
		return ifsc;
	}
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	public double getBalance(long accno, int pin) {
		if (this.accno == accno && this.pin == pin) {
			return balance; 
		}
		else {
			System.out.println("Invalid credentials");
			return 0;
		}
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	public long getAadhar() {
		return aadhar;
	}
	public void setAadhar(long aadhar) {
		this.aadhar = aadhar;
	}
	
	public void setPin(long accno, int oldpin, int newpin) {
		if(this.accno == accno && pin==oldpin) {
			pin = newpin; 
			System.out.println("Pin updated");
		}
		else {
			System.out.println("Invalid Credentials");
		}
	}
	
	public void credit(long accno, int pin, double amt)
	{
		if (this.accno == accno && this.pin == pin) {
			if(amt>0) {
				balance+=amt;
				System.out.println("Amount credited");
			}
			else {
				System.out.println("Invalid amount");
			}
		}
		else {
			System.out.println("Invalid credentials");
		}
	}
	
	public void debit(long accno, int pin, double amt)
	{
		if (this.accno == accno && this.pin == pin) {
			if(balance-amt>1000) {
				balance-=amt;
				System.out.println("Amount debited");
			}
			else {
				System.out.println("Insuffucient balance");
			}
		}
		else {
			System.out.println("Invalid credentials");
		}
	}
	
	public void setPhno(long aadhar, long newPhno) {
		if (this.aadhar == aadhar)
		{
			phno = newPhno; 
			System.out.println("Phone number updated");
		}
		else {
			System.out.println("Invalid aadhar number");
		}
	}
	
	public void registerUPI(String upiID, int upiPin) {
		upi = new UPI(upiID,upiPin,accno,bankName,pin,phno,acc);
		System.out.println("UPI successfully registered");
	}
}

