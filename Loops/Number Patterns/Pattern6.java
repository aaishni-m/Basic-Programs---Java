class Pattern6 
{
	public static void main(String[] args) 
	{
		// 1 3 9 33 153 873
		//  2 6 24 120
		System.out.println("Hello World!");
		int num = 1;
		int var = 2; 
		int i =3;

		for (int a=1;a<=6 ;a++ )
		{
			System.out.println(num);// 3
			num += var;//3+(6*1)=9
			var*=i;//6
			i++;
		}
	}
}
