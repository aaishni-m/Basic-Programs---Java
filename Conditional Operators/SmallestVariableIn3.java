import java.util.Scanner;

class SmallestVariableIn3
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("a: ");
		int a = sc.nextInt();
		System.out.println("b: ");
		int b = sc.nextInt();
		System.out.println("c: ");
		int c = sc.nextInt();

		int smallest = (a>b)?((b>c)?(c):(b)):((a>c)?(c):(a));

		System.out.println("Smallest element : "+smallest);
	}
}
