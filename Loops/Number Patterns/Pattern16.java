//1
//2 3
//4 5 6
//7 8 9 10

class Pattern8 
{
	public static void main(String[] args) 
	{
		int n=10;
		int a=1;
		int b=1;
		int num=1;
		char ch='a'; 

		for (int i=1;i<=n ;i+=a )
		{
			for(int j=b;j<=i;j++)
			{
				if (i%2==0)
				{
					System.out.print(num+" ");
					num++; 
				}
				else {
					System.out.print(ch+" ");
					ch++;
				}
				b++; 
			}
			System.out.println();
			a++;
		}
	}
}
