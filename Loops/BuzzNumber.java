// divisible by 7 or last digit is 7

class BuzzNumber
{
	public static void main(String[] args) {
		int num = 2347; 

		if(num%7==0 || num%10==7)
			System.out.println("BuzzNumber");
		else
			System.out.println("Not BuzzNumber");
	}
}