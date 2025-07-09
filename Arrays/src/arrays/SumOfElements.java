package arrays;
import java.util.Arrays; 

public class SumOfElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum(new int[]{1,1,1})); 		
	}
	
	public static int sum(int[] arr) {
		int sum = 0; 
		for(int i=0;i<arr.length; i++) {
			sum += arr[i]; 
		}
		return sum; 
	}

}
