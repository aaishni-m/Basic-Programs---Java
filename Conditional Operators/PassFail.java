import java.util.Scanner;

class PassFail 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter marks: ");
		
		float marks = sc.nextFloat();
		float percent = (marks/600.0f)*100.0f;

		System.out.println("Marks: "+percent+"%");
		System.out.println((percent<=35.0)?("Fail: Hope your dad's fucking rich"):((percent<=100 && percent>=75)?("A: Nerd"):((percent<75 && percent>=60)?("B: Wanna be nerd"):("C: Why do you even try"))));

	}
}
