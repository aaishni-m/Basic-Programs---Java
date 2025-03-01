import java.util.ArrayList;

class IncreasingNumber
{
	public static void main(String[] args) {
		int num = 642;
		int len=0; 
		int [] arr = new int[len]; 

		for(int i=num;i>0;i/=10)
		{
			len++;
		} 

		for(int i=0;i<len;i++)
		{
			int rem = num%10; 
			arr.add(rem); 
			num/=10; 
		}
		System.out.println(Arrays.toString(arr));
	}
}