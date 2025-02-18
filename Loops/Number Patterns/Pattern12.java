//a
//a b
//a b c
//a b c d

class Pattern12
{
	public static void main(String[] args) {
		for (int i=1;i<=4;i++)
		{
			char num = 'a';
			for(int j=1;j<=i;j++)
			{
				System.out.print(num++ + " ");
			}
			System.out.println();
		}
	}
}