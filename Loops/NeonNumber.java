// 9 * 9 = 81 if 8+1 = 9

class NeonNumber
{
	public static void main(String[] args) {
		int num = 9;  
		int sum=0;

		for(int i=(num*num);i>0;i/=10)
			sum+= (i%10);
		
		if(num==sum)
			System.out.println(num+ " is a NeonNumber");
		else
			System.out.println(num+" is not a NeonNumber");
	}
}