import java.util.Scanner;

class HiTwoFive
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num: ");
		int num = sc.nextInt();

		System.out.println((num%2==0 && num%5==0)?("HiTwo HiFive"):((num%2==0)?("Hi Two"):((num%5==0)?("Hi Five"):(" "))));
	}
}
