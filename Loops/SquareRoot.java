import java.util.Scanner;

class SquareRoot 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt(); 

		// in built method = math.sqrt()
		for (int i=1; ;i++ )
		{
			if ((i*i)==num) 
			{
				System.out.println("Square root: "+i);
				break;
			}
			else if ((i*i)>num)
			{
				System.out.println("Not a perfect square");
				break;
			}
		} 
	}
}
