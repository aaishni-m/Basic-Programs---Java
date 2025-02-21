class FascinatingNumber2
{
	public static void main(String[] args) {
		int num = 327;
		int dup=num; 
		boolean flag= true; 

		for(int i=2;i<=3;i++)
			num = (num*1000) + dup*i;
		System.out.println(num);
		
		for(int i=1;i<=9;i++)
		{
			int cnt=0;
			for(int j=num;j>0;j/=10)
			{
				if(i==j)
					cnt++;
			}
			if(cnt!=1)
			{
				flag = false; 
				break; 
			}
		}

		if(flag)
			System.out.println("FascinatingNumber");
		else 
			System.out.println("Not FascinatingNumber");
	}
}