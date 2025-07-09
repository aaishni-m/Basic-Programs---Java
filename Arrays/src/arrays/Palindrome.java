package arrays;
import java.util.*;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome(new int[] {1,2,1,1})); 
	}

	public static boolean isPalindrome(int [] arr) { 
		int i = 0; 
		while(i<arr.length-1) {
			if(arr[i] != arr[arr.length-1-i]) {
				return false; 
			}
			else 
				i++; 
		}
		
		return i>=arr.length-1-i; 
	}
}
