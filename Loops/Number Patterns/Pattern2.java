class Pattern2 
{
	public static void main(String[] args) 
	{
		int num = 12; 

		for (int a=1;a<=5 ;a++ )
		{
			int square = 1;
			int cube = 1;
			for (int i = 1;i<=2 ;i++ )
			{
				square*=num;
				//System.out.println(square);
			}
			num++;
			for (int j =1;j<=3 ;j++ )
			{
				cube*=num;
				//System.out.println(cube);
			}
			num++;
			System.out.print(" "+square+ " "+cube);
		}
	}
}
