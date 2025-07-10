package arrays;

import java.util.Arrays;

public class Merge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(merge(new int[] {1,2,3},new int[] {4,5,6,7}))); 
	}
	
	public static int [] merge(int arr1[], int arr2[]) {
		int res [] = new int [arr1.length + arr2.length]; 
		
		for (int i = 0; i < res.length; i++) {
			if(i<arr1.length) {
				res[i] = arr1[i]; 
			}
			else {
				res[i] = arr2[i-arr1.length]; 
			}
		}
		return res;
	}
}
