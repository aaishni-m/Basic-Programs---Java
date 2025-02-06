import java.util.Scanner;

class CurrencyConverter 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount in INR: ");
		float inr = sc.nextFloat();

		System.out.println("In which currency do you wish to convert in: \n1. USD \n2. YEN \n3.Dirham \n4.WON");
		String ch = sc.next().toUpperCase();

		if(ch.equals("USD")){
			float usd = inr * 0.012f;
			System.out.println("Currency in "+ch+" is "+usd+" usd");
		}

		else if(ch.equals("YEN")){
			float yen = inr * 1.80f;
			System.out.println("Currency in "+ch+" is "+yen+" yen");
		}

		else if(ch.equals("DIRHAM")){
			float dirham = inr * 0.042f;
			System.out.println("Currency in "+ch+" is "+dirham+" dirham");
		}

		else if(ch.equals("WON")){
			float won = inr * 16.70f;
			System.out.println("Currency in "+ch+" is "+won+" won");
		}

		else{
			System.out.println("Invalid input");
		}

	}
}

