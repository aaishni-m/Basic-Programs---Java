class SunnyNumber
{
	public static void main(String[] args) {
		int num = 32;
		int square = 0; 

		for(int i=2;i<=num/2;i++)
		{
			//System.out.println(i);
			if(((i*i)-num)==1)
			{
				System.out.println("SunnyNumber");
				break; 
			}
		}
	}
}