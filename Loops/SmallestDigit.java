import java.util.Scanner;

class SmallestDigit 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a number: ");
		int num = new Scanner(System.in).nextInt();
		int small = 9;
		
		while (num>0)
		{
			int rem = num%10; 
			if (rem<small)
			{
				small = rem; 
			}
			num/=10;
		}

		System.out.println("Smallest digit in the number: "+small);
	}
}
