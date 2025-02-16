class RightTriangle3
{
	public static void main(String[] args) 
	{
		int n=5;
		for (int i=0;i<=n ;i++ )//i0
		{
			for (int space=0;space<=i ;space++ )//0<0
			{
				System.out.print(" ");
			}
			for (int star=0;star<n-i ;star++ )//0<5
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
