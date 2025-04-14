package PrinciplesOfOOP;

public class GooglePay {
	String upiID; 
	int upiPin; 
	long accno; 
	String bank; 
	int bankPin; 
	long phno; 
	long cardNo; 
	int cvv; 
	String expireDate; 
	String email; 
	UPI upi;
	BankAcc ref; 
	public GooglePay() {
	}
	public GooglePay(String upiID, int upiPin, long accno, String bank, int bankPin, long phno, long cardNo, int cvv,
			String expireDate, String email) {
		this.upiID = upiID;
		this.upiPin = upiPin;
		this.accno = accno;
		this.bank = bank;
		this.bankPin = bankPin;
		this.phno = phno;
		this.cardNo = cardNo;
		this.cvv = cvv;
		this.expireDate = expireDate;
		this.email = email;
		
		if (validate(ref,bank, bankPin,phno, accno)) {
			upi = new UPI(upiID, upiPin,accno, bank, bankPin, phno, ref); 
		}
		else {
			System.out.println("Invalid bank details");
		}
	} 
	
	public void displayGooglePay() {
		System.out.println("UPI ID: "+upiID);
		System.out.println("Account number: "+accno);
		System.out.println("Bank: "+bank);
		System.out.println("Card no.: "+cardNo);
		System.out.println("Phno: "+phno);
		System.out.println("-----------------------------------------------------------------------");
	}
	
	public boolean validate(BankAcc ref, String bank, int pin, long phno, long accno) {
		if(ref.getAccno()==accno && ref.getBankName() == bank && ref.getPin() == pin && ref.getPhno() == phno) {
			return true; 
		}
		return false; 
	}
	
	
}

