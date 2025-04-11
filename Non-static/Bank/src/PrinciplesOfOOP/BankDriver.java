package PrinciplesOfOOP;
import java.util.Scanner;

public class BankDriver {
	
	static String username; 
	static int pin ;
	static String ifsc; 
	static long accno ;
	static String bankName ;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;  
		
		while(flag) {
			System.out.println("1. Create account \n2. Login to an existing account\n3. Quit"); 
			int ch = sc.nextInt();
			switch(ch) {
			case 1: 
					createAcc(sc);
					break; 
				
			case 2:{
				if (accno == 0l) {
					System.out.println("First create an account!");
					createAcc(sc); 
					break; 
				}
				else {
				login(sc); 
				break; 
				}
			}
			case 3: 
			{
				flag = false; 
				break;
			}
			default: 
			{
				System.out.println("Invalid input"); 
				break; 
			}
		}
		}
	}
	
	public static void createAcc(Scanner sc)
	{
		System.out.print("Enter username: ");
		username = sc.next(); 
		System.out.print("Enter account number: ");
		accno = sc.nextLong();
		System.out.print("Enter pin: ");
		pin = sc.nextInt(); 
		System.out.print("Enter bank name: ");
		bankName = sc.next(); 
		System.out.print("Enter ifsc : "); 
		ifsc = sc.next();
		
		login(sc); 
	}
	public static void login(Scanner sc)
	{
		System.out.println("------------------------------------------------------------------------------------------------------------");
		System.out.println("LOGIN PAGE"); 
		Bank b1 = new Bank(username, bankName, pin, ifsc, accno);
		
		System.out.print("Enter account number: ");
		long accountno = sc.nextLong();
		System.out.print("Enter pin: "); 
		int pincode = sc.nextInt(); 
		
		if (pincode == pin && accno == accountno)
		{
			boolean flag = true;
			while(flag) {
				System.out.println("1. Check balance\n2. Credit money \n3. Debit money \n4. Display user credentials \n5. Change pin \n6. Quit");
				int ch = sc.nextInt();
				switch(ch) {
				case 1: {
					System.out.println(b1.getBalance());
					break;
				}
				case 2: {
					System.out.print("Enter amount: ");
					int amt = sc.nextInt();
					System.out.println(b1.credit(amt));
					break; 
				}
				case 3: {
					System.out.print("Enter account number: ");
					accountno = sc.nextLong();
					System.out.print("Enter pin: "); 
					pincode = sc.nextInt(); 
					System.out.print("Enter amount: ");
					int amt = sc.nextInt();
					b1.debit(accountno,pincode,amt);
					break; 
				}
				case 4: {
					System.out.println("Username: "+b1.getUsername());
					System.out.println("Account number: "+b1.getAccno());
					System.out.println("Bank name: "+b1.getBankName()); 
					break;
				}
				case 5: {
					accountno = sc.nextLong();
					pincode = sc.nextInt(); 
					int newpin = sc.nextInt(); 
					b1.setPin(accountno, pincode, newpin);
					System.out.println("Pincode changed successfully!");
				}
				case 6: {
					flag = false;
					break;
				}
				default : {
					System.out.println("Invalid input");
				}
				
			}
		}
	}
	}
}
