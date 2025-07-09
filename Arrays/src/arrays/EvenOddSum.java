package arrays;

public class EvenOddSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(evenOddSum(new int [] {1,1,2})); 
	}
	
	public static boolean evenOddSum(int[] arr) {
		int even = 0; 
		int odd = 0; 
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				even+=arr[i]; 
			}
			else {
				odd+=arr[i]; 
			}
		}
		System.out.println("Even: "+even+" Odd: "+odd); 
		
		return even==odd; 
	}

}
