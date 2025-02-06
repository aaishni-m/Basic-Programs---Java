import java.util.Scanner;

class SumOfEvenOddDigits 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");;
		int num = sc.nextInt();
		int even = 0;
		int odd = 0;
		
		while (num>0)
		{
			int rem = num%10; 
			if (rem%2==0)
			{
				even+= rem; 
			}
			else{
				odd+=rem;
			}
			num/=10;
		}

		System.out.println(odd+"\n"+even);
		
	}
}
