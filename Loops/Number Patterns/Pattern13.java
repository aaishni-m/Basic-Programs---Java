//1
//2 3
//4 5 6
//7 8 9 10

class Pattern8 
{
	public static void main(String[] args) 
	{
		int n=10;
		int a=1;
		int b=1;
		char ch = 'a';

		for (int i=1;i<=5 ;i++ )
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch+" "); 
				ch++; 
			}
			System.out.println();
		}
	}
}
