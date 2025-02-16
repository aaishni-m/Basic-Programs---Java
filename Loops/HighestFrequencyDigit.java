import java.util.Scanner;

class HighestFrequencyDigit 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter number: ");
		int num = new Scanner(System.in).nextInt(); 
		int max=0;
		int maxCnt = 0;


		for (int j=0;j<=9;j++)
		{
			int cnt=0; 
			for (int i =num;i>0 ;i/=10 )
			{
				int rem = i%10;
				if (rem==j)
				{
					cnt++; 
				}
				//System.out.println(i+ " : "+cnt);
			}
			if (cnt>max)
			{
				maxCnt=cnt;
				max=j;
			}

			if (cnt!=0)
			{
				System.out.println(j+" : "+cnt);
			}
		}
		System.out.println("Digit with the highest frequency: " + max);
        System.out.println("Frequency of the digit: " + maxCnt);
	}
}
