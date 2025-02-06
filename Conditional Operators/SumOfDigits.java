import java.util.Scanner;

class SumOfDigits
{
	public static void main(String[] args) 
	{
		System.out.print("Enter a digit between 0 and 1000: ");
		int digit = new Scanner(System.in).nextInt();

		int index3 = (digit%10!=0)?(digit%10):(0);
		int index2 = ((digit/10)%10!=0)?((digit/10)%10):(0);
		int index1 = (((digit/10)/10)%10!=0)?((digit/100)%10):(0);
		int index0 = ((((digit/10)/10)/10)%10!=0)?((digit/1000)%10):(0);

		int sum = index3 + index2 + index1 + index0;

		System.out.print(sum);
	}
}
