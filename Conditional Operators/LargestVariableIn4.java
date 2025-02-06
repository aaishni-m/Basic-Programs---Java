import java.util.Scanner;

class LargestVariableIn4
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
		System.out.print("d: ");
		int d = sc.nextInt();

		// a = 4 b = 1 c = 2 d= 3 
		int largest = (a>b)?((a>c)?(a):(c)):((b>c)?(b):(c));
		largest = (largest>d)?(largest):(d);
		System.out.println("Largest element: "+largest);

	}
}
