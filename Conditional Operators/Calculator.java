import java.util.Scanner;

class Calculator 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		boolean flag = false;
		System.out.print("Enter operand1: ");
		float a = sc.nextFloat();
		System.out.print("Enter operand2: ");
		float b = sc.nextFloat();

		System.out.print("Enter operator: ");
		char op = sc.next().charAt(0);

		float ans = (op=='+')?(a+b):((op=='-')?(a-b):((op=='*')?(a*b):((op=='/')?(a/b):((op=='%')?(a%b):(0.000001f)))));
		if (ans==0.000001f)
		{
			System.out.println("Invalid operator!");
		}
		else {
			System.out.println(op+" of two operands is "+ans);
		}
	}
}
