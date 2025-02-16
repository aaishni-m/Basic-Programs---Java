import java.util.Scanner;

class PrimesInRange 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter number: ");
		int num = new Scanner(System.in).nextInt(); 
		boolean flag = true;

		home:
		for (int i=2;i<num ;i++ )
		{
			int prime = 2;
			for (int j=2;j<i;j++ )
			{
				if (i%j==0)
				{
					continue home; 
				}
			}
			System.out.println(i);
		}
	}
}
