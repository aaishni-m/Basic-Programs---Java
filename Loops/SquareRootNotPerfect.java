import java.util.Scanner;

class SquareRootNotPerfect
{
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		int num = new Scanner(System.in).nextInt();
		float ans=0; 

		for(int i=num/2;i>=1;i--)
		{
			if(i*i <= num)
			{
				ans = i + (num - (i * i)) / (2.0f * i);
				break;
			}
		}
		System.out.println(ans);	
	}
}