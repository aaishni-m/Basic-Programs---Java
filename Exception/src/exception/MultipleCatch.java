package exception;
import java.util.Scanner;

public class MultipleCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//Scanner sc = null; 
			//Object o = new Object(); 
			//Scanner sc = (Scanner)o;
			Scanner sc = new Scanner(System.in); 
			
			int a = sc.nextInt(); 
			int b = sc.nextInt(); 
			int c = a/b; 
			System.out.println(c); 
		}
		catch(ArithmeticException e){
			System.out.println("Do not divide by 0"); 			
		}
		catch(NullPointerException e) {
			System.out.println("You tried to call an object with a null reference"); 
		}
		catch(ClassCastException e) {
			System.out.println("Respective class does not have the specific members"); 
		}
		catch(Throwable e) {
			System.out.println("An exception has occurred"); 
		}
		finally {
			System.out.println("Thank you"); 
		}
	}

}
