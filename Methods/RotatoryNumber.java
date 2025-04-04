class RotatoryNumber
{
	public static void main(String[] args) {
		System.out.println(rotate(1234));
	}

	public static int rotate(int num)
	{
		return (num%10)*power(count(num)-1) + num%power(count(num)); 
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

	public static int power(int cnt)
	{
		int pow = 1;
		for(int i=1;i<=cnt;i++)
		{
			pow*=10; 
		}

		return pow;
	}
}