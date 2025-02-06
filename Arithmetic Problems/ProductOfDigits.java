import java.util.Scanner;

class ProductOfDigits 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter 3 digit number: ");
		int digit = new Scanner(System.in).nextInt();

		int index2 = digit%10;
		int index1 = (digit/10)%10;
		int index0 = ((digit/10)/10)%10;

		int product = index1 * index2 * index0;
		System.out.println("Product: "+product);
	}
}
