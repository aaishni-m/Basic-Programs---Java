import java.util.Scanner;

class SumOfDigits 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");;
		int num = sc.nextInt();
		int sum = 0;
		
		while (num>0)
		{
			int rem = num%10; 
			sum += rem;
			num/=10;
		}

		System.out.println("Sum: "+sum);

		int var = 1;
		int count = 3;
		for (int i =1;i<=(count-1);i++)
			{
				var*=10;
				//System.out.println(var);
			}
		System.out.println(var);
		
	}
}
