import java.util.Scanner;

class FactorialSumOfEvenOddDigits 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int evenSum = 0;
		int oddSum = 0;

		while (num>0)
		{
			int rem = num%10;
			int fact = 1;
			for (int i = rem;i>=1 ;i-- )
			{
				fact*=i;
			}
			//System.out.println(fact);
			if (rem%2==0)
			{
				evenSum+=fact;
			}
			else{
				oddSum+=fact;
			}

			num/=10;
		}

		System.out.println("Even sum: "+evenSum);
		System.out.println("Odd sum: "+oddSum);
	}
}
