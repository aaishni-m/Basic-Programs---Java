package arrays;

import java.util.Arrays;

public class MakePositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(makePositive(new int[] {-1,-45,3,-6,77})));
	}
	
	public static int[] makePositive(int [] arr) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<1) {
				arr[i]*=-1;
			}
		}
		return arr; 
	}
}
