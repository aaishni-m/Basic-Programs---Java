import java.util.Scanner;

class ISBN 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter your ISBN number: ");
		long num = new Scanner(System.in).nextInt();
		int sum=0;
		//International Standard Book Number. The sum of the (number*pos) should be divisible by 11

		for (long i=num,j=1;i>0 ;i/=10,j++ )
		{
			long rem = i%10;
			sum+=(rem*j);
		}
		System.out.println((sum%11==0)?("Valid"):("Not valid"));
	}
}
