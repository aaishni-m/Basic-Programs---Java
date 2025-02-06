import java.util.Scanner;

class PalindromeNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
		int num = number; 
		int count = 0; 

		for (;num>0 ;num/=10 )
		{ 
			//System.out.println(rem);
			count++;
		}
		//System.out.println(count); 

		int reverse = 0;
		int var = 1;
		num = number;

		while(num>0)
		{
			int rem = num%10; 
			for (int i =1;i<=(count-1);i++)
			{
				var*=10;
				//System.out.println(var);
			}

			int rev = var*rem; 
			//System.out.println(rev);
			reverse += (var*rem); 
			//System.out.println(reverse);
			num/=10;
			var=1;
			count--; 
		}

		if (reverse == number)
		{
			System.out.println("Is a palindrome");
		}
		else{
			System.out.println("Not a palindrome");
		}
	}
}