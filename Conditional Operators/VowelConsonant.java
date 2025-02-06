import java.util.Scanner;

class VowelConsonant 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter an alphabet: ");
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);

		System.out.println((ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')?("Vowel"):("Consonant"));
	}
}
