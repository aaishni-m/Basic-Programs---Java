import java.util.Scanner;

class PalindromeString
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word: ");
		String word = sc.next();

		String str = ""; 

		for (int i = word.length()-1; i >= 0; i--)
		{
			str =str+""+word.charAt(i);
		}

		System.out.println(str);
		if (str.equals(word))
		{
			System.out.println("String is a palindrome.");
		}
		else
		{
			System.out.println("String is not a palindrome.");
		}
	}
}
