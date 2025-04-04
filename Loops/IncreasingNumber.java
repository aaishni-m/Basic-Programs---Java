import java.util.Scanner;

class IncreasingNumber
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in); 
		int num = sc.nextInt();
		//123
		
		while(num>0)// 123>0
		{

			int num1 = num%10; //3
			int num2 = num%100; //2

			if(length(num)==1)
			{
				System.out.println("IncreasingNumber");
			}

			if(num2 < num1)//2<3
				System.out.println("Not a IncreasingNumber");

			num/=10; //3
		}	
	}

	public static int length(int num)
	{
		int len=0;
		while(num>0)
		{
			num/=10;
			len++;
		}
		return len; 
	}
}