//1
//1 2
//1 2 3
//1 2 3 4

class Pattern11
{
	public static void main(String[] args) {
		for (int i=1;i<=4;i++)
		{
			int num = 1;
			for(int j=1;j<=i;j++)
			{
				System.out.print(num++ + " ");
			}
			System.out.println();
		}
	}
}