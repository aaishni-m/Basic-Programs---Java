package PrinciplesOfOOP;
import java.util.*;

public class Library {
	Scanner sc = new Scanner(System.in); 
	private String libraryName = "Good reads";
	private int noBooks; 
	private int issuedBooks; 
	private int genre; 
	private boolean membership = false;
	Member m ; 
	
	public Library () {
		
	}
	
	public void displayLibraryDetails() {
		System.out.println("Library  name: "+libraryName);
		System.out.println("Number of books currently in library: "+noBooks);
		System.out.println("Number of books issued from library till date: "+issuedBooks);
		System.out.println("Total genre (currently): "+genre);
	}
	
	public boolean getMembership() {
		return membership; 
	}
	
	public void beMember()
	{
		System.out.print("Enter a username: ");
		String username = sc.next();
		System.out.print("Enter phone number: ");
		long phno = sc.nextLong();
		m = new Member(username, phno); 
		this.membership = true; 
		m.membership = true; 
		System.out.println("Hey! Congrats on being a part of our reading community!");
	}
}
