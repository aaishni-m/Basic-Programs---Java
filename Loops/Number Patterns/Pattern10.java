//1
//2 9 
//3 8 10
//4 7 11 14
//5 6 12 13 15

class Pattern10 
{
	public static void main(String[] args) 
	{
		int n=15;
		int a=1;
		int b=1;
		int step = 9;
		int c=-2;
		
		for (int i=1;i<=n ;i+=a )//i1+2=3
		{
			//int step =4;
			int var=0;
			int temp = a;//2
			System.out.print(a+" ");//2
			temp+=step;//2+7=9
			for (int j=a;j<a+a-1 ;j++ )//2<2+2-1=3
			{
				//temp+=step;//4+3
				System.out.print(temp+var+" ");//7+2=9
				var+=c;//0+2
				//step--;
			}
			System.out.println();
			c+=2;//4
			a++;//a2
			step-=2;//7
		}
	}
}
