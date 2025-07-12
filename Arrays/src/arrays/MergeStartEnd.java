package arrays;

import java.util.Arrays;

public class MergeStartEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr1 = new int[] {10,20,30,40,50,60};
		
		int [] arr2 = new int[] {100,200,300,400};
		System.out.println(Arrays.toString(merge(2, arr1,arr2)));

	}
	
	public static int[] merge(int idx, int[] arr1, int [] arr2) { // idx = 2
		int [] ans = new int[arr1.length+arr2.length]; //10
		int j=0; // 4
		for (int i = 0; i < ans.length; i++) { // 6
			if(i<idx) {  // 6 < 2
				ans[i]=arr1[i]; 
			}
			else if(j>=arr2.length) { // 4 >= 4
				ans[i]=arr1[i-j];
			}
			else{ // 3 < 4
					ans[i]=arr2[j++]; 
				}
			} return ans; 
	}
		// 10 20 100 200 300 400 0 0 0 0
		//  0  1   2   3   4   5 6 7 8 9 

}
