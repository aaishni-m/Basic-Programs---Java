import java.util.Scanner; 

class TechNumberRange
{
	public static void main(String[] args) 
	{
		for (int i=1;i<1000000 ;i++ )
		{
			int div = 10;
			int len=0;
			int dup = i;
			while (dup>0)
			{
				dup/=10; 
				len++;
			}

			if (len%2==0)
			{
				for (int k=1;k<=len/2-1 ;k++ )
				{
					div*=10; 
				}
				int dig1 = i%div; 
				int dig2 = i/div;

				if (((dig1+dig2)*(dig1+dig2))==i)
				{
					System.out.println(i);
				}
			}
		}
	}
}
