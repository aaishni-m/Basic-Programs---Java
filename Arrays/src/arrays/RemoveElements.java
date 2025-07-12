package arrays;

import java.util.Arrays;

public class RemoveElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = new int[] {1,2,3,2,5,6};
		System.out.println(Arrays.toString(remove(2, arr)));

	}
	
	public static int[] remove(int num, int[] arr) {
		int [] ans = new int[arr.length-frequency(num, arr)];
		int j=0; 
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==num) {
				continue;
			} 
			else
				ans[j++]=arr[i]; 
						
		}return ans;
	}
	
	public static int frequency(int num, int[]arr) {
		int freq=0; 
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==num) {
				freq++; 
			}
		} return freq;
	}

}
