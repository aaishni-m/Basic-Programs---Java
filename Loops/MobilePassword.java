import java.util.Scanner;

class MobilePassword 
{
	public static void main(String[] args) throws InterruptedException
	{
		int pass = 1234; 
		int second = 5000;

		unlock:
		for (; ; )
		{
			int attempts = 3;
			do
			{
				System.out.print("Enter password: ");
				int password = new Scanner(System.in).nextInt();

				if (password==pass)
				{
					System.out.println("PHONE UNLOCKED!");
					break unlock;
				}
				else{
					System.out.println();
					System.out.println("INVALID PASSWORD \nAttempt left: "+(attempts-1));
				}
					attempts--; 
			}
			while (attempts>=1);

			System.out.println("PHONE LOCKED FOR "+second/1000+" secs");

			Thread.sleep(second);
			second*=2;
			System.out.println();
		}
	}
}
