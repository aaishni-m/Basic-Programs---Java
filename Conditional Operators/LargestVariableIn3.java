import java.util.Scanner;

class LargestVariableIn3
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("a: ");
		int a = sc.nextInt();
		System.out.print("b: ");
		int b = sc.nextInt();
		System.out.print("c: ");
		int c = sc.nextInt();

		// a = 5 b = 1 c = 4
		int largest = (a>b)?((a>c)?(a):(c)):((b>c)?(b):(c));
		System.out.println("Largest element: "+largest);
	}
}
