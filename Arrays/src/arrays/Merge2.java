package arrays;

import java.util.Arrays;

public class Merge2 {
		public static void main(String[] args) {
			System.out.println(Arrays.toString(Merge.merge(new int[] {1,2,3,4}, reverse(new int[] {1,2,3}))));
		}
		
		public static int [] reverse(int [] arr) {
			int [] rev = new int[arr.length]; 
			for (int i = 0; i < rev.length; i++) {
				rev[i] = arr[arr.length-1-i]; 
			}
			return rev; 
		}
}
