	// 76 * 76 = 5776 last two dig = num

class Automorphic
{
	public static void main(String[] args) {
		int num = 76; 
		int div=1;

		for(int i = num; i>0; i/=10)
		{
			div*=10;
		}

		if(num==(num*num)%div)
			System.out.println(num+" is an Automorphic Number");
		else
			System.out.println(num+" is not an Automorphic Number");
	}
}