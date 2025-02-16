class Cat 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		int n=20;
		for (int i =0;i<n ;i++ )
		{
			for (int j=0;j<n ;j++ )
			{
				if (i==3&&j==n/4||i==3&&j==(7*n/8)-2)
				{
					System.out.print("/");
				}
				if (i==3&&j==(n/4)+1||i==3&&j==(7*n/8)-1)
				{
					System.out.print("\\");
				}
				if (i==3&&(j==(n/4)+2||j==(n/4)+3||j==(n/4)+3||j==(n/4)+4||j==(n/4)+5||j==(n/4)+6||j==(n/4)+7||j==(n/4)+8||j==(n/4)+9))
				{
					System.out.print("_");
				}
				if (i==n/4&&j==n/2||i==n/4&&j==(7*n/8)+2||j==n/4&&(i==4||i==5||i==6||i==7||i==8)||i==8&&(j==n/2+5||j==n/2+6)||i==6&&j==n/2+5)
				{
					System.out.print("*");
				}
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
