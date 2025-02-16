import java.util.Scanner; 

class PrimeFactorial 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = sc.nextInt(); 

		home:
		for (int i=2;i<num ;i++ ) 
		{
			int prime = 2; 
			if (num%i==0)
			{
				for (int j=2;j<i ;j++ ) 
				{
					if (i%j==0)
					{
						continue home;
					}
				}
				prime = i;
			}
			else
			{
				continue;
			}
			System.out.println(prime);
		}
	}
}
