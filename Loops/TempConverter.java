class TempConverter 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		float deg = 123;
		float temp = 0.0f; 
		int ch = 1;

		switch(ch)
		{
			case 1:
				temp = deg;
				System.out.println("The temperature is already in celcius. Doofus!");
				break;
			
			case 2:
				temp = deg + 273.15f;
				break;
			
			case 3 :
				temp = (deg * (9.0f/5.0f)+32.0f);
				break;

			case 4:
				temp = (deg + 275.15f) * (9.0f/5.0f);
				break;

		}
		System.out.println("The temperature is temp: "+temp);

	}
}
