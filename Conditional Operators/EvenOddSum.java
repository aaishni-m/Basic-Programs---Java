class EvenOddSum 
{
	public static void main(String[] args) 
	{
		int num = 7264; 
		int evenSum = 0;
		int oddSum = 0;
		int temp = 0;

		int index3 = (num%10);
		temp =(index3%2==0)?(evenSum=evenSum+index3):(oddSum=oddSum+index3);

		int index2 = (num/10)%10;
		temp = (index2%2==0)?(evenSum=evenSum+index2):(oddSum=oddSum+index2);

		int index1 = ((num/10)/10)%10;
		temp = (index1%2==0)?(evenSum=evenSum+index1):(oddSum=oddSum+index1);

		int index0 = ((((num/10)/10)/10)%10);
		temp = (index0%2==0)?(evenSum=evenSum+index0):(oddSum=oddSum+index0);

		System.out.println("Even sum is "+evenSum);
		System.out.println("Odd sum is "+oddSum);
	}
}
