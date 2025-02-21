// 7,4,2,(7+4+2)13, (4+2+13)19,.......till number is 742; 

class KeithNumber
{
	public static void main(String[] args) {
		int num=742;
		int dup=num;
		int sum=0;
		int len=0;

		for(int i=num;i>0;i/=10)
			len++;

		int [] arr = new int[len]; 

		for(int i=len-1;i>=0;i--)
		{
			int rem=num%10; 
			arr[i] = rem; 
			num/=10;
		} 
		System.out.println(toString(arr));
	}
}