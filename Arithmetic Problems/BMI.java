import java.util.Scanner;

class BMI
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter weight in pounds: ");
		float weightPounds = sc.nextFloat();
		System.out.print("Enter height in inches: ");
		float heightInches = sc.nextFloat();
	
		float weightKg = weightPounds * 0.45359237f;
		float heightMeters = heightInches * 0.0254f;

		float bmi = (weightKg/(heightMeters*heightMeters));

		String health = (bmi>50.0f)?("You are obese"):("Please eat");

		System.out.println("Your BMI is "+bmi);
		System.out.println(health);

	}
}
