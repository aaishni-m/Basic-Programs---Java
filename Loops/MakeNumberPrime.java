import java.util.Scanner;

class MakeNumberPrime 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a number: ");
		int num = new Scanner(System.in).nextInt(); 
		boolean flag = true; 

		for (int i=2;i<num ;i++ )
		{
			if (num%i==0)
			{
				flag = false; 
				num++;
				i=2;
			}
		}
		System.out.println(num);

		if (flag)
		{
			System.out.println("Prime");
		}
	}
}
