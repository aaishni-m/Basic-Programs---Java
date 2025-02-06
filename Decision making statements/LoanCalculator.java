import java.util.Scanner;

class LoanCalculator 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the principal amount: ");
		float pcpAmt = sc.nextFloat();

		System.out.println("Enter the interest: ");
		float interest = sc.nextFloat();

 		System.out.println("Enter months: ");
		int months = sc.nextInt();
		String str = months/12+"."+months%12;
		float mnths = Float.parseFloat(str);
		//System.out.println(mnths);
		float intRate = pcpAmt*0.1f;

		System.out.println("Principal amount: "+pcpAmt+" Rs");
		System.out.println("Interest rate: "+interest+"%");
		System.out.println("Interest amount: "+(intRate)+" Rs");
		System.out.println("Interest per month: "+(intRate/months));
		System.out.println("Total Amount to be paid: "+(intRate + pcpAmt)+" Rs");
		System.out.println("EMI: "+((intRate/months) + (pcpAmt/months))+" Rs");
		System.out.println("Total interest: "+(pcpAmt*0.1f)*mnths  );

	}
}

