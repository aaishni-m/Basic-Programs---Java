package arrays;

import java.util.Arrays;

// 26 mins
public class ReverseSameArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(reverse(new int[] {40,30,20,10})));

	}
	
	public static int[] reverse(int arr[]) {
		int j=0;
		for (int i = arr.length-1; i >arr.length/2-1; i--) {
			arr[i] = arr[i]+arr[j]; 
			arr[j] = arr[i] - arr[j]; 
			arr[i] = arr[i] - arr[j]; 
			j++; 
		}
		return arr;
	}

}
