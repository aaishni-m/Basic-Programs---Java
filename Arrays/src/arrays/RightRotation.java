package arrays;

import java.util.Arrays;

public class RightRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr =  {1,2,3,4,5}; 
		 			// 0 1 2 3 4
					// 3,1,,1,2
		System.out.println(Arrays.toString(rotate(2,arr)));
	}
	
	public static int[] rotate(int step, int[] arr) {
		int [] ans = new int[arr.length]; 
		for (int i = 0; i < ans.length; i++) { //4
			if(i+step<=arr.length-1) { // 3+1 <=4
				ans[i+step]=arr[i]; // ans[3+1] = arr[3] 
			}
			else {
				ans[arr.length-1-i]=arr[i]; // 
			}
		} return ans; // 0 1 2 3 4
					  // 0 1 2 3 4
	}

}
