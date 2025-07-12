package arrays;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(secondMax(new int[] {1,2,3,10,7}));
	}
	
	public static int secondMax(int[] arr) {
		int max=Integer.MIN_VALUE; 
		int secMax = Integer.MIN_VALUE; 
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>max) {
				secMax = max;
				max = arr[i]; 
			}
			else if(arr[i]>secMax && arr[i]!=max) {
				secMax = arr[i]; 
			}
		} return secMax; 
	}

}
