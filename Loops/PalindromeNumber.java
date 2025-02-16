import java.util.Scanner;

class PalindromeNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
		int num = number;  

		int rev = 0;

		while(num>0)
		{ 
			rev = rev*10 + num%10;
			num/=10; 
		}

		System.out.println(rev);

		if (rev == number)
		{
			System.out.println("Is a palindrome");
		}
		else{
			System.out.println("Not a palindrome");
		}
	}
}