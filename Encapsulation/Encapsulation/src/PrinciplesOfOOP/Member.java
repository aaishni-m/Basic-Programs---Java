package PrinciplesOfOOP;
import java.util.*;

public class Member {
	Scanner sc = new Scanner(System.in);
	String username; 
	long phno;  
	int issuedBooks; 
	boolean membership; 
	boolean currIssued; 
	Book b;
	
	public Member(String username, long phno, int books, int issuedBooks,boolean membership) {
		this.username = username; 
		this.phno = phno; 
		this.issuedBooks = issuedBooks; 
		this.membership = membership; 
	}
	
	public Member(String username, long phno)
	{
		this.username = username; 
		this.phno = phno;
	}
	

	public void issueBook(String username)
	{
		if(this.membership == true && this.username.equals(username)) 
		{
			if(this.currIssued==false) 
			{
				System.out.print("Enter title of book: ");
				String title = sc.next();
				System.out.print("Enter author of book: ");
				String author = sc.next();
				System.out.print("Enter genre of book: ");
				String genre = sc.next();
				b = new Book(title, author, genre); 
				this.issuedBooks+=1;
				this.currIssued = true; 
				System.out.println("Have a good read");
				return;
			}
			else {
				System.out.println("First return book");
				return;
			}
		}
		else
//			System.out.println(this.username);
			System.out.println("Not a member!");
	}
	
	public void returnBook() {
		System.out.print("Enter title of book you have issued: ");
		String title = sc.next();
		if(b.title.equals(title)) {
			this.currIssued = false; 
			System.out.println("Thank you!");			
		}
		else {
			System.out.println("Uh oh book title does not match with the book you issued!");
		}
	}
	
	public void displayMember()
	{
		System.out.println("Username: "+username);
		System.out.println("Phone number: "+phno);
		System.out.println("Number of books you issued till date: "+issuedBooks);
	}
}
