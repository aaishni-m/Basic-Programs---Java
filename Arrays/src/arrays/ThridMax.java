package arrays;

public class ThridMax {
	public static void main(String[] args) {
		System.out.println(thirdMax(new int[] {5,2,8,5,9,54}));
	}
	
	public static int thirdMax(int [] arr) {
		int max = Integer.MIN_VALUE; 
		int secMax = Integer.MIN_VALUE;; 
		int thirdMax = Integer.MIN_VALUE; 
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>max) {
				thirdMax = secMax; 
				secMax = max; 
				max = arr[i]; 
			}
			else if(arr[i]>secMax) {
				thirdMax = secMax; 
				secMax = max; 
			}
			else if(arr[i]>thirdMax) {
				thirdMax = secMax; 
			}
		} return thirdMax; 
	}
}
