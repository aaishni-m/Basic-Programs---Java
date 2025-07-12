package arrays;

import java.util.Arrays;

// 21 mins
public class NegativePositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(arrange(new int[] {2,-2,-5,6,-77,3,-8})));
	}
	
	public static int[] arrange(int[] arr) { 
		int ans[] = new int[arr.length]; 
		int j=0; //2
		int k = arr.length-1; 
		for (int i = 0; i < ans.length; i++) { //3
			if(arr[i]<0) {//6<0
				ans[j]=arr[i]; 
				j++; 
			}
			else{
				ans[k] = arr[i];// 7-1-3;
				k--; 
				
				// -2 -5 0 0 0 0 2
	
			}
		}
		
		return ans;
	}

}
