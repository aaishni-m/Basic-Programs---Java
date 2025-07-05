package exception;
import java.util.Scanner; 
import java.lang.Thread;

public class Throws {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Hi, What's your name?");
		String name = sc.next(); 
		
		Thread.sleep(2000); 
		System.out.println("OOOH Fancy name! Nice to meet you "+name+"!"); 

	}

}
