import java.util.Scanner; 

class Armstrong 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter number: ");
		int num = new Scanner(System.in).nextInt();
		int dup = num;
		int len =0;

		while (num>0)
		{
			num/=10;
			len++;
		}
		num = dup;
		int sum = 0;

		while (num>0)
		{
			int pow=1;
			int rem = num%10; 
			for (int i=1;i<=len ;i++ )
			{
				pow*=rem; 
			}
			sum+=pow; 
			num/=10;
		}

		if (sum==dup)
		{
			System.out.println(dup+" is an Armstrong number.");
			return;
		}
		System.out.println(dup+" is not an Armstrong number.");
	}
}
