import java.util.Scanner;

class CelciusToFahrenheit 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a degree in celcius: ");
		float celcius = sc.nextFloat();
		float fahrenheit = (9.0f/5.0f) * celcius + 32.0f;
		System.out.println(celcius+" Celcius is "+fahrenheit+" Fahrenheit.");
	}
}
