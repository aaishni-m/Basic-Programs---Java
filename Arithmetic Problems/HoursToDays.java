import java.util.Scanner;

class HoursToDays 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Hours: ");
		int hrs = sc.nextInt();
		System.out.println(hrs/24.0f);
	}
}
