//2
//4 6
//8 10 12
//14 16 18 20

class Pattern14 
{
	public static void main(String[] args) 
	{
		int n=10;
		int a=1;
		int num = 2;

		for (int i=1;i<=4 ;i++ )
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(num+" "); 
				num+=2; 
			}
			System.out.println();
		}
	}
}
