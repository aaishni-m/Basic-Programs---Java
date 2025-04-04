import java.util.Scanner;

class DecreasingNumber
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in); 
		int num = sc.nextInt();
		//321
		
		while(num>0)// 321>0
		{

			int num1 = num%10; //3
			int num2 = num%100; //0

			if(length(num)==1)
			{
				System.out.println("DecreasingNumber");
			}

			if(num2< num1)//3<2
				System.out.println("Not a DecreasingNumber");

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