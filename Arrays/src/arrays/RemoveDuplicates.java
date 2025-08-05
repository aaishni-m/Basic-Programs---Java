package arrays;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,2,6,3,8,6,2}; 
		System.out.println(Arrays.toString(remove(arr)));

	}
	
	public static int[] remove(int[] arr) {
		int [] count=new int[arr.length]; 
		int ele=0; 
		for (int i = 0; i < arr.length; i++) {
			if(count[i]!=-1) {
				int cnt=0;
				for (int j = 0; j < count.length; j++) {
					if(arr[i]==arr[j] &&i!=j) {
						count[j]=-1;
						cnt++;
					}
					count[i]=cnt; 
				}
			} if(count[i]==-1) {
				ele++; 
			}
		} 
		
		int[] ans = new int[arr.length-ele];
		int j=0; 
//		System.out.println(Arrays.toString(count));
		
		for (int i = 0; i < count.length; i++) { // 0
			if(count[i]>=0) { // 0
				ans[j++]=arr[i]; 
			}
		} return ans; 
	}

}
