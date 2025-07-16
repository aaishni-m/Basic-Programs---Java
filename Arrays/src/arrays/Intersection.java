package arrays;

import java.util.Arrays;

public class Intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr1 = {1,3,2,3,7,9,2}; 
		int [] arr2 = {2,7,6}; 
		System.out.println(Arrays.toString(intersect(arr1,arr2)));
	}
	
	public static int[] intersect(int[] arr1, int[] arr2) {
		boolean[] count = new boolean[arr1.length]; 
		int ele=0;
		int rptCnt=0;
		
		for (int i = 0; i < arr2.length; i++) {
			if(count[i]!=true) {
				for (int j = 0; j < arr1.length; j++) {
					
					if(arr1[j]==arr2[i]) {
						count[j]=true; 
						ele++; 
					}
				}
			} else if(count[i]==true) {
				rptCnt++; 
			}
		}
		int [] ans = new int[arr1.length-1-ele-rptCnt];
		int j=0; // 0
		// f f t f t f t
		// 0 1 2 3 4 5 6
		
		for (int i = 0; i < count.length; i++) { // 5
			if(count[i]==true && j<ans.length) { // f
				ans[j++]=arr1[i]; 
			}
		}
		//  2 0 
		return ans; 
	}

}
