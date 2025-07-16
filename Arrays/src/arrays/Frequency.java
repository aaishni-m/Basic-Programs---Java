package arrays;

import java.util.Arrays;

public class Frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,1,2,3,4,2,2}; 
		System.out.println(Arrays.toString(count(arr)));

	}
	
	public static int[] count(int[] arr) {
		int count [] = new int[arr.length]; 
		for (int i = 0; i < arr.length; i++) { //0
			int ct =-1; //0
			if(count[i]!=-1) { 
				for (int j = 0; j < arr.length; j++) { //0
					if(arr[i]==arr[j]) { 
						count[j]=-1;
						ct++; 
					} 
					count[i]=ct;
				}
			} 
		} return count; 
		// 0 0 0 0 0 0 0 
	}

}
