package arrays;

public class EvenOddCount {
	public static void main(String[] args) {
		evenOddCount(new int[] {1,2,3,4});
		
	}
	
	public static void evenOddCount(int [] arr) {
		int evenCnt = 0; 
		int oddCnt = 0; 
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				evenCnt++; 
			}
			else
				oddCnt++;
		}
		
		System.out.println("Even: "+evenCnt+" Odd: "+oddCnt);
	}
}
