import java.util.Scanner;

class Square 
{
	public static void main(String[] args) 
	{
		int n = new Scanner(System.in).nextInt();

		for (int i=0; i<=n;i++ )
		{
			for (int j=0;j<=n ;j++ )
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
}
