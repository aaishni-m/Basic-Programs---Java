package arrays;

import java.util.Arrays;

// 4mins 
public class InsertLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = new int[] {10,20,30,40,50,60,70};
		System.out.println(Arrays.toString(insert(80, arr)));
	}
	
	public static int[] insert(int num, int[] arr) {
		int ans[] = new int[arr.length+1]; 

		for (int i = 0; i < ans.length; i++) {
			if(i==ans.length-1) {
				ans[i]=num; 
			}
			else
				ans[i]=arr[i]; 
		} 
		return ans; 
	} 

}
