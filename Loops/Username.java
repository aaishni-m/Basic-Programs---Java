import java.util.Scanner;

class Username
{
	public static void main(String[] args) throws InterruptedException
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");

		String name = sc.nextLine().toUpperCase();

		for(int i=0;i<=(name.length()-1);i++)
		{
			System.out.print(name.charAt(i)+" ");
			Thread.sleep(1000);
		}
	}
}
