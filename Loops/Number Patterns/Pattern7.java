//1
//3 2
//6 5 4
//10 9 8 7
//15 14 13 12 11

class Pattern7
{
	public static void main(String[] args)
	{
		int n = 15;
		int a = 1;
		int b =1;
		int c = 1;
		int sum = 0; 

		for (int i=1;i<=n ;i+=a )
		{
			sum+=c;
			c++;
			int temp = sum;
			for (int j=b;j<=i ;j++ )
			{
				System.out.print(temp--+" ");
				b++;
			}
			System.out.println();
			a++;
		}
	}
}