package PrinciplesOfOOP;
import java.util.*;

public class BookDriver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Library l1 = new Library(); 
		System.out.println("WELCOME TO GOOD READS");
		System.out.println("Little about our organisation!");
		l1.displayLibraryDetails();
		System.out.println("--------------------------------------------------------------");
		
		boolean flag = true; 
		while(flag)
		{
			System.out.println("1. Be a member\n2. Issue a book\n3. Return a book\n4. Display member details\n5. Display issued book details");
			int ch = sc.nextInt();
			switch(ch) {
			case 1: {
				if(l1.getMembership() == false)
				{
					l1.beMember(); 
					System.out.println("----------------------------------------------------------------------------");
					break;
				}
				else {
					System.out.println("Already a member");
					System.out.println("------------------------------------------------------------------------------");
					break;
				}
			}
			case 2: {
				if (l1.getMembership() == true) {
					System.out.print("Enter username: ");
					String username = sc.next();
					l1.m.issueBook(username);
					System.out.println("--------------------------------------------------------------------------------------");
					break;
				}
				else {
					System.out.println("First be a member!");
					l1.beMember();
					System.out.println("--------------------------------------------------------------------------------------");
					break;
				}
				
			}
			case 3: {
				if(l1.getMembership() == true) {
					if (l1.m.currIssued == true)
					{
						l1.m.returnBook();
						System.out.println("-----------------------------------------------------------------------------------------");
						break; 
					}
					else {
						System.out.println("No book to return!");
						System.out.println("--------------------------------------------------------------------------------------");
						break;
					}
				}
				else { 
					System.out.println("Not a member yet!");
					System.out.println("-----------------------------------------------------------------------------------------");
					break;
				}
			}
			case 4: {
				if(l1.getMembership() == true)
				{
					l1.m.displayMember();
					System.out.println("------------------------------------------------------------------------------------------");
					break;
				}
				else {
					System.out.println("You are not a member yet!");
					System.out.println("-----------------------------------------------------------------------------------------");
					break;
				}
			}
			case 5: {
				if(l1.getMembership()==true)
				{
					if(l1.m.currIssued == true)
					{
						l1.m.b.displayBookDetails();
						System.out.println("-----------------------------------------------------------------------------------");
						break; 
					}
					else {
						System.out.println("No book issued!");
						System.out.println("--------------------------------------------------------------------------------------");
						break; 
					}
				}
				else {
					System.out.println("Not a member yet!");
					System.out.println("-------------------------------------------------------------------------------------");
					break; 
				}
			}
			default : {
				System.out.println("Invalid input!");
				System.out.println("---------------------------------------------------------------------------------------------");
				break;
			}
			}
		}
	}
}
