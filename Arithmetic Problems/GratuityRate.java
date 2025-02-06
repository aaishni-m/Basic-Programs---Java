import java.util.Scanner;

class GratuityRate 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the subtotal: ");
		float subtotal = sc.nextFloat();
		System.out.print("Enter the Tip Rate: ");
		float tipRate = sc.nextFloat();

		float tip = (tipRate*subtotal)/100;
		float total = tip + subtotal;

		System.out.println("The tip is "+tip+" and the total is "+total);

	}
}
