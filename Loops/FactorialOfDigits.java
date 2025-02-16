import java.util.Scanner;

class FactorialOfDigits 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int sum = 0;

		while (num>0)
		{
			int rem = num%10;
			int fact = 1;
			//System.out.println(rem);

			for (int i=rem;i>=1 ;i-- )
			{
				//int fact = 1;
				fact*=i;
				//System.out.println()
			}
			sum+=fact;
			//System.out.println(fact);

			num/=10; 
		}
		System.out.println(sum);

	}
}
