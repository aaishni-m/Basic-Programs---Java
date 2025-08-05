package arrays;

import java.util.Arrays;
import java.util.Iterator;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,4,3,2,1}; 
		System.out.println(Arrays.toString(sort(arr)));

	}
	
	public static int[] sort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j]; 
					arr[j] = arr[j+1]; 
					arr[j+1]=temp; 
				}
			}
		} return arr; 
	}

}
