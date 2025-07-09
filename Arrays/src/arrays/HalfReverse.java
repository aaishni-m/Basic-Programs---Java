package arrays;
import java.util.*;

public class HalfReverse {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(halfReverse(new int[] {3,2,1,4,3,2,1})));
	}
	
	public static int [] halfReverse(int [] arr) {
		int [] rev = new int[arr.length]; 
		for(int i=0;i<arr.length/2;i++) {
			rev[i] = arr[i]; 
		}
		for(int i = arr.length/2; i < arr.length ; i++) {
			rev[i] = arr[arr.length-1-i]; 
		}
		return rev;
	}
}
