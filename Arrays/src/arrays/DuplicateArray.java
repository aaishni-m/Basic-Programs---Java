package arrays;
import java.util.Arrays;

public class DuplicateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {2,4,6,8,10};
		System.out.println(Arrays.toString(duplicate(arr))); 
		
	}
	
	public static int [] duplicate(int [] arr) {
		int [] dup = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			dup[i] = arr[arr.length-1-i]; 
		}
		return dup; 
	}

}
