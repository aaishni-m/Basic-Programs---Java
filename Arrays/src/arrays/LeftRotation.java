package arrays;

import java.util.Arrays;

public class LeftRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5}; 
		// 2,3,4,5,1
		
		System.out.println(Arrays.toString(rotate(3,arr)));
	}
	
	public static int[] rotate(int step, int[] arr) {
		int [] ans = new int[arr.length]; 
		int i=0; ;
		while(i<step) { //0<1
			for ( int j=0 ; j < arr.length; j++) {//0
				if (j<step) {
					ans[arr.length-step+j]=arr[j];
				} else{
					ans[j-step] = arr[j]; 
				} 
			} 
			i++; 
		} 
		return ans; 
	}

}
