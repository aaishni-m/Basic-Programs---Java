package arrays;

import java.util.Arrays;

public class RetainOccurrences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,6,6}; 
		System.out.println(Arrays.toString(retain(arr)));
		
	}
	
	public static int[] retain(int[] arr) { 
		int[] count = count(arr); // 4
		int ct=0; 
		for (int i = 0; i < count.length; i++) {
			if (count[i]!=0) {
				ct++; 
			}
		}
		int ans[] = new int[ct]; //6 - 4 = 2
		int j=0; // 0 
		
		for (int i = 0; i < arr.length; i++) { // 0
			if(count[i]!=0) {
				ans[j++]=arr[i]; 
			}
		} return ans; 
		// 0 0 
	}
	
	
	public static int[] count(int arr[]) { 
		int count [] = new int[arr.length]; 
		for (int i = 0; i < count.length; i++) {
			int cnt=0; 
			if(count[i]!=-1) {
				for (int j = 0; j < count.length; j++) {
					if(arr[i]==arr[j] && i!=j) {
						count[j]=-1;
						cnt++; 
					}
					count[i] = cnt;
				}
			}
		} return count; 
	}
}
