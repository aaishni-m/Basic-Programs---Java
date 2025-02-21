//1
//2 9 
//3 8 10
//4 7 11 14
//5 6 12 13 15

class Pattern10
{
	public static void main(String[] args) 
	{
		int n=5;
		int even = 7;
		int odd = 1;

		for(int i=1;i<=n;i++)
		{
			int temp = i;
			for(int j=1;j<=n;j+ +)
			{
				if(j%2==0)
				{
					temp+=even; 
					System.out.print(temp+" ");
				}
				else
				{
					temp+=odd;
					System.out.print(temp+" ");
				}
			}
			System.out.println();
		}
	}
}	



