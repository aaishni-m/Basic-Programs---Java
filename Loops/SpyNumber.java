// product and sum of the digits of a number are same

class SpyNumber
{
	public static void main(String[] args) {
		int num = 22;
		int prod=1;
		int sum=0;

		for(int i=num;i>0;i/=10){
			sum += (i%10);
			prod *= (i%10);
		}

		if(prod==sum)
			System.out.println("SpyNumber");
		else
			System.out.println("Not SpyNumber");
	}
}