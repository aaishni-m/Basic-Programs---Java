class LowestFrequencyDigit 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		int num = 11223;
		int minCnt = 9;
		int min = 9;

		for (int j=0;j<=9;j++)//j0
		{
			int cnt=0; 
			for (int i =num;i>0 ;i/=10 )//i11223
			{
				int rem = i%10;//3
				if (rem==j)//3==0
				{
					cnt++; 
				}
				//System.out.println(i+ " : "+cnt);
			}

			if (cnt!=0)
			{
				if (cnt<min)
			    {
					minCnt=cnt;
					min=j;
				}
				System.out.println(j+" : "+cnt);
			}
		}
		System.out.println("Digit with lowest frequency: "+min+" with frequency: "+minCnt);
	}
}
