import java.util.Scanner;

class Season 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter month: ");

		String month = sc.nextLine().toLowerCase();

		String season = (month.equals("jan") || month.equals("oct")|| month.equals("nov")|| month.equals("dec"))?("Winter"):
			((month.equals("feb")||month.equals("mar")||month.equals("apr")||month.equals("may"))?("Summer"):
			((month.equals("jun")||month.equals("jul")||month.equals("aug")||month.equals("nov"))?("Monsoon"):
			("Invalid input")));

		System.out.println(season);

	}
}
