package arrays;

import java.util.Arrays;

public class SetDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1 [] = {1,6,2,4,9,5,3,7,8,2,1};
		int arr2 [] = {1,6,3,2}; 
		System.out.println(Arrays.toString(diff(arr1,arr2)));
	}
	
	public static int[] diff(int[] arr1, int[] arr2) {
		boolean[] b = new boolean[arr1.length]; // 11 
		int cnt=0;
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i]==arr2[j]) {
					b[i]=true; 
					cnt++; 
					continue; 
				}
			}
		}
		// f f f f f f f f f f f
		int[] ans= new int[arr1.length-cnt];
		int j=0; 
		System.out.println(ans.length);
		
		for (int i = 0; i < b.length; i++) {
			if(b[i]==false) {
				ans[j++]=arr1[i]; 
			}
		}
		return ans; 
	}

}
