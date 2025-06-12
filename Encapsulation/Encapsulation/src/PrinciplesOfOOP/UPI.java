package PrinciplesOfOOP;

public class UPI {
	String upiID; 
	int upiPin; 
	long accno; 
	String bank; 
	int bankPin; 
	long phno; 
	BankAcc acc;
	public UPI() {
		
	}
	public UPI(String upiID, int upiPin, long accno, String bank, int bankPin, long phno,BankAcc acc) {

		this.upiID = upiID;
		this.upiPin = upiPin;
		this.accno = accno;
		this.bank = bank;
		this.bankPin = bankPin;
		this.phno = phno;
		acc = new BankAcc();
	}  
};
