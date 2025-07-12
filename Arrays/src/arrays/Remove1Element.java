package arrays;
import java.util.*;
import java.util.Arrays;

public class Remove1Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = new int[] {5,2,77,44,1,66,3,9,4,65,1,4,6,7,4,2,87,23,56,98,32,51,7}; 
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Do you want to remove element by index or value: \n1.Index\n2.Value\n");
		int ch = sc.nextInt(); 
		switch(ch) {
		case 1: 
			System.out.println("Enter index to be eliminated: ");
			int idx = sc.nextInt(); 
			if(idx>=0 && idx<arr.length) {
				System.out.println("Element removed!");
				System.out.println(Arrays.toString(remove(arr,idx)));
			}
			else {
				System.out.println("Bad Request");
			}
			break; 
		
		case 2: 
			System.out.println("Enter value to be eliminated: ");
			int ele = sc.nextInt(); 
			if(isPresent(ele, arr)) {
				System.out.println("Element removed!");
				System.out.println(Arrays.toString(remove(ele, arr)));
			}
			else 
				System.out.println("Element not present in array");
			break; 
		
		default: 
			System.out.println("Bad Request");
			break; 
		
		}
	}
	
	public static int[] remove(int num, int[] arr) {
		int [] ans = new int[arr.length-1]; 
		int j =0; 
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==num) {
				continue; 
			}else {
				ans[j]= arr[i]; 
				j++; 
			}
		}return ans; 
	}
	
	public static int[] remove(int[] arr,int idx) {
		int []ans = new int[arr.length-1]; 
		for(int i=0;i<arr.length;i++) {
			if(i<idx) {
				ans[i]=arr[i]; 
			} else if(i>idx){
				ans[i-1]=arr[i]; 
			}
		} return ans; 
	}
	
	public static boolean isPresent(int ele,int []arr) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==ele) {
				System.out.println("Element is at index: "+i);
				return true;
			}
		} return false;
	}

}
