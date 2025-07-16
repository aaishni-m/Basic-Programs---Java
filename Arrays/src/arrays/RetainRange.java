package arrays;

import java.util.Arrays;

public class RetainRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,6,3,8,3,5,1,7}; 
		           //0 1 2 3 4 5 6 7
		System.out.println(Arrays.toString(retain(2,5,arr)));

	}
	
	public static int[] retain(int start, int end, int[] arr) { 
		int [] ans = new int[arr.length-1-(end-start)]; 
		int j=0;
		for (int i = 0; i < arr.length; i++) {
			if(i<start || i>end) {
				ans[j++]=arr[i]; 
			}
		} return ans;
		
	}

}
