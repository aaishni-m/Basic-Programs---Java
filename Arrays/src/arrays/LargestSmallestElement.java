package arrays;

public class LargestSmallestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(largest(new int[] {2,4,6}));
		System.out.println(smallest(new int[] {2,4,6}));
	}
	
	public static int largest(int [] arr) {
		int large = 0; 
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>large) {
				large = arr[i]; 
			}
		}
		return large; 
	}
	
	public static int smallest(int [] arr) {
		int small = largest(arr); 
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<small) {
				small = arr[i]; 
			}
		}
		return small; 
	}

}
