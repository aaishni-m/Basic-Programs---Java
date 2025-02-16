import java.util.Scanner;

class FactorsPrimeOfNum
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int count = 0;

		for (int i=2;i<num ;i++ )
		{
			if (num%i==0)
			{
				System.out.print(i+" ");
				count++;
			}
		}
		System.out.println();
		System.out.println("Factors of "+num+" : "+count);

		if (count==0)
		{
			System.out.println("Number is a prime number!");
		}
	}
}
