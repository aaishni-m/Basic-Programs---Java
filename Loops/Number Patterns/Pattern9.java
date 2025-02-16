// 1
// 2 6 
// 3 7 10
// 4 8 11 13 
// 5 9 12 14 15

class Pattern9 
{
	public static void main(String[] args) 
	{
		int n = 15;
		int a = 1;
		int b= 1; 

		for (int i=1;i<=15 ;i+=a )//i3+3=6
		{
			int temp = a;//4
			int step=4;
			System.out.print(a+" ");//4
			for (int j=a;j<a+a-1 ;j++ )//j4<4+4-1=7
			{

				temp += step; //7+3=10
				System.out.print(temp+" ");//7 10

				step--;//2
			}
			System.out.println();
			a++; //a4
			//b++; //b4
		}
	}
}
//a i  a+a-1
//1 1   1 
//2 3   3 2 
//3 6   5 3 4 
//4 10  7 4 6 7 
//5 15  9 5 6 7 8