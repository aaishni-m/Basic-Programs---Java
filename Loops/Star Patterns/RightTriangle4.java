class RightTriangle4
{
	public static void main(String[] args) 
	{
		int n=5;
		for (int i=0;i<n ;i++ )//i0
		{
			for (int space=0;space<n-i-1 ;space++)//space5 5<0 
			{
				System.out.print(" ");
			}
			for(int star=0; star<i;star++ )
			{
				System.out.print("*");
			}

			System.out.println();
		}
	}
}
