class A 
{
	public static void main(String[] args) 
	{
		int n = 20;
		for (int i=0;i<n ;i++ )
		{
			for (int j=0;j<n ;j++ )
			{
				if (j==n/4&&i<=3*n/4&&i>=n/4+1||i==n/4&&j<=3*n/4-1&&j>=n/4+1||j==3*n/4&&i>=n/4+1&&i<=3*n/4||i==n/2&&j>=n/4&&j<=3*n/4)
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
