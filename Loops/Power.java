import java.util.Scanner;

class Power 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num: ");
		int num = sc.nextInt();
		System.out.println("Enter the exponent: ");
		int pow = sc.nextInt();
		int power = 1;

		for (int i =1;i<=pow ;i++ )
		{
			power *= num; 
		}

		System.out.println("Power: "+power);
	}
}
