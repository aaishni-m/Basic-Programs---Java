import java.util.Scanner;

class Emirp 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter number: ");
		int num = new Scanner(System.in).nextInt();
		int dup = num;
		int rev = 0;
		boolean flag = true;

		while (num>0)
		{
			rev = rev*10 + num%10;
			num/=10;
		}

		//System.out.println(dup+" "+rev);

		for (int i=2; i<rev;i++ )//i2
		{

			if (dup%i==0 || rev%i==0)//13%2 || 31%2 
			{
				if (dup==i ||rev==i)
				{
					continue;
				}
				flag = false;
				System.out.println("Not an emirp");
				break;
			}
		}
		if (flag)
		{
			System.out.println("Is an emirp!");
		}
	}
}
