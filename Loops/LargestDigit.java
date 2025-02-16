import java.util.Scanner;

class LargestDigit 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a number: ");
		int num = new Scanner(System.in).nextInt();
		int largest = 0;
		
		while (num>0)
		{
			int rem = num%10; 
			if (rem>largest)
			{
				largest = rem; 
			}
			num/=10;
		}

		System.out.println("Largest digit in the number: "+largest);
	}
}
