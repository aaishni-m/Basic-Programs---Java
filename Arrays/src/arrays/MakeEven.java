package arrays;

import java.util.Arrays;

public class MakeEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(makeEven(new int[] {1,2,3,4,5,6})));

	}
	
	public static int[] makeEven(int [] arr) { 
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				arr[i]++; 
			}
		}
		return arr; 
	}

}
