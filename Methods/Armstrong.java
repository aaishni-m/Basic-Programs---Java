import java.util.Scanner; 

class Armstrong
{
	public static void main(String[] args) {

		System.out.print("Enter a range: ");
		int range = new Scanner(System.in).nextInt();

		for(int i=1;i<=range;i++)
		{
			if(armstrong(i))
				System.out.println(i);
		}
	}

	public static boolean armstrong(int num)
	{
		int sum=0;
		int cnt = count(num);
		for(int i=num;i!=0;i/=10)
		{
			sum += power(i%10, cnt); 
		}

		return sum==num; 
	}

	public static int count(int num)
	{
		int cnt = 0; 
		while(num>0)
		{
			num/=10; 
			cnt++;
		}
		return cnt; 
	}

	public static int power(int num, int cnt)
	{
		int power = 1;
		for(int i=1;i<=cnt;i++)
		{
			power*=num; 
		}

		return power; 
	}
}