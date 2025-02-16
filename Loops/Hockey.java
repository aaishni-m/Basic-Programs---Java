import java.util.Scanner;

//EY code
class Hockey 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter String: ");
		String str = new Scanner(System.in).next();
		int cnt0=0;
		int cnt1=0;

		 for (int i = 0; i < str.length(); i++) {

			if (cnt0>=7||cnt1>=7)
			{
				System.out.println("Yes");
				break;
			}

			if (str.charAt(i)=='0')
			{
				cnt0++;
				cnt1=0;
			}
			if (str.charAt(i)=='1')
			{
				cnt1++;
				cnt0=0;
			}
		}
		System.out.println("NO");
	}
}
