import java.util.Scanner; 

class RemoveDuplicates 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter number: ");
		int num = new Scanner(System.in).nextInt(); 

		for (int i=0;i<=9 ;i++ )
		{
			int cnt = 0;
			for (int j= num;j>0 ;j/=10 )
			{
				int rem = j%10;
				if (i==rem)
				{
					cnt++;
				}
			}
			if (cnt>=1)
			{
				System.out.print(i);
			}
		}
	}
}
