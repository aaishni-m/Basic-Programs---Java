package arrays;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {10,9,8,7,6,5,4,3,2,1}; 
		quickSort(arr);

	}
	
	public static void quickSort(int[] arr, int start, int end) {
		if(start<end) {
			int pos = partition(arr,start,end); 
			quickSort(arr,start,pos-1); 
			quickSort(arr, pos+1, end);
		}
	}
	
	public static int partition(int arr[], int start, int end) {
		int ref = arr[start]; 
		int i=start, j=end; 
		while(i<j) {
			while(i<=end && arr[i]<=ref) {
//				System.out.println(i);
				i++; 
			}
			while(j>start && arr[j]>=ref) {
//				System.out.println(j);
				j--; 
			}
			if(i<j) {
				swap(arr,i,j); 
			}
		}
		swap(arr,start,j); 
		System.out.println(Arrays.toString(arr));
		return j; 
	}
	
	public static void swap(int[] arr,int i , int j) {
		int temp = arr[i]; 
		arr[i] = arr[j]; 
		arr[j] = temp; 
	}
	
	public static void quickSort(int[] arr) {
		quickSort(arr, 0, arr.length-1);
	}

}
