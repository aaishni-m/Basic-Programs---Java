import java.util.Scanner;

class KrishNumber
{
	public static void main(String[] args) 
	{
		System.out.println("Enter number: ");
		int num = new Scanner(System.in).nextInt();
		int dup = num;
		int sum=0;

		while (num>0)
		{
			int fact=1;
			int rem = num%10;
			for (int i=1;i<=rem ;i++ )
			{
				fact*=i;
			}
			sum+=fact;
			num/=10;
		}
		if (dup==sum)
		{
			System.out.println("Krish number");
		}
	}
}
