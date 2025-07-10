package arrays;

import java.util.Arrays;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(arrange(new int[] {1,2,3,4})));
	}
	
	public static int[] arrange(int[] arr) {
		int ans [] = new int[arr.length]; 
		int j=0; 
		int k=ans.length-1; 
		
		for (int i = 0; i < ans.length; i++) {
			if(arr[i]%2==0) {
				ans[j]=arr[i]; 
				j++; 
			}
			else {
				ans[k]=arr[i];
				k--; 
			}
		}
		return ans; 
	}

}
