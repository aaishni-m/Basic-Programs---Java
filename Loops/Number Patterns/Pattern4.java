class Pattern4 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		// 10 30 68 130 222
		//   20 38 62 92
		//     18 24 30

		int num = 10;
		int var = 20; 
		int i =3;

		for (int j=1;j<6 ;j++ )//j2
		{
			System.out.println(num); //30
			num+= var; //30+18=30

			var+=(6*i);//6*3=18
			i++;//i4
		}
	}
}
