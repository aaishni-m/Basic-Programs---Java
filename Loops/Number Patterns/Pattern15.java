//1
//3 5 
//7 9 11
//13 15 17 19

class Pattern8 
{
	public static void main(String[] args) 
	{
		int n=10;
		int a=1;
		int b=1;
		int num = 1;

		for (int i=1;i<=n ;i+=a )
		{
			for(int j=b;j<=i;j++)
			{
				System.out.print(num+" "); 
				num+=2; 
				b++;
			}
			System.out.println();
			a++;
		}
	}
}
