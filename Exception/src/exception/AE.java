package exception;
import java.util.Scanner;

public class AE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		int a = sc.nextInt(); 
		int b = sc.nextInt();
		try {
			int c = a/b; 
			System.out.println(c); 
		} catch (ArithmeticException e) {
		    System.out.println("Do not divide by 0"); 
		    System.out.println(e.getClass().getName()); 
		}
	}

}
