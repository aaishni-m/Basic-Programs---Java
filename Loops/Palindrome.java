import java.util.Scanner;

class PalindromeString
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word: ");
		String word = sc.next();

		String reverse = null; 

		for (int i = word.length()-1; i >= 0; i--)
		{
			System.out.println;
		}

		System.out.print(reverse);
	}
}
