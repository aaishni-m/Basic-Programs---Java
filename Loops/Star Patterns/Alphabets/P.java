class P 
{
	public static void main(String[] args) 
	{
		int n = 20;
		for (int i=0;i<n ;i++ )
		{
			for (int j=0;j<n ;j++ )
			{
				if (j==n/4&&i>=n/4&&i<=3*n/4||i==n/4&&j>=n/4&&j<=n/2-2||j==n/2+1&&i>=n/4&&i<=n/2-1||i==n/2&&j>=n/4&&j<=n/2-2)
				{
					System.out.print("*"+" ");
				}
				System.out.print(" "+" ");
			}
			System.out.println();	
		}
	}
}
