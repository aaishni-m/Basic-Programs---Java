import java.util.Scanner; 

class TechNumber 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter number: ");
		int num = new Scanner(System.in).nextInt(); 
		int dup = num;
		int div = 10;
		int len=0;
		while (dup>0)
		{
			dup/=10; 
			len++;
		}

		if (len%2==0)
		{
			for (int i=1;i<=len/2-1 ;i++ )
			{
				div*=10; 
			}
		}
		int dig1 = num%div; 
		int dig2 = num/div;

		System.out.println((((dig1+dig2)*(dig1+dig2))==num)?("Tech number"):("Not Tech number"));
	}
}
