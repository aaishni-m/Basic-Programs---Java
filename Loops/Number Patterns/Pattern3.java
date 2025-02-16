class Pattern3 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		// 2 6 22 278
		int num = 2;
		int square = 4;
		int var = 4;

		for (int i=1;i<=5 ;i++ )
		{
			System.out.println(num);
			num+=square;
			//System.out.println(square);//4//16
			
			square*=var; //4*4//16
			
			//System.out.println(var);//6
			var = square;
		}
	}
}
