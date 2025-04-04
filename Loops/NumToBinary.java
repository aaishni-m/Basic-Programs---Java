import java.util.Scanner;

class NumToBinary
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in); 
		int num = sc.nextInt();
		String bin = "";  

		while(num>0)
		{
			bin = num%2+""+bin; 
			num/=2; 
		}
		System.out.println(bin);

	}
}