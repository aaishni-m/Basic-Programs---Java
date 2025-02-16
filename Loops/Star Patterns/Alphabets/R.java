class R
{
	public static void main(String[] args) 
	{
		int n = 20;
		for (int i=0;i<n ;i++ )
		{
			for (int j=0;j<n ;j++ )
			{
				if (j==n/2 && i>=n/4 && i<=3*n/4||
					j==3*n/4 && i>=n/4+1 && i<=n/2-1||
					i==n/4 && j>=n/2 && j<=3*n/4-1||
					i==n/2 && j>=n/2 && j<=3*n/4-1||
					i==j&&i>=n/2&&i<=n-5)
				{
					System.out.print("*"+" ");
				}
				else{
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
	}
}
