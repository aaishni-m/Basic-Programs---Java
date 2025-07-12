package arrays;

import java.util.Arrays;

public class InsertElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = new int[] {1,2,3,5,6};
		System.out.println(Arrays.toString(insert(4, 3, arr)));

	}
	public static int[] insert(int ele, int idx, int[] arr) {
		int [] ans = new int[arr.length+1]; 
		for (int i = 0; i < ans.length; i++) {
			if(i<idx) {
				ans[i]=arr[i]; 
			}
			else if(i==idx) {
				ans[i]=ele;
			}
			else {
				ans[i]=arr[i-1]; 
			}
		} return ans; 
	}
}
