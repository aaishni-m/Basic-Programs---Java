import java.util.Scanner;

class PoundsToKilogram
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter weight in pounds: ");
		float pounds = sc.nextFloat();

		float kilograms = pounds*0.45f;
		System.out.println(pounds+" pounds is "+kilograms+"kg");
	}
}
