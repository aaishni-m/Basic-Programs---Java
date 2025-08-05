package Strings;

import java.util.Arrays;

public class StringToCharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aaishni"; 
		System.out.println(Arrays.toString(toCharArray(s)));

	}
	
	public static char[] toCharArray(String s) {
		char[] arr = new char[s.length()]; 
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.charAt(i);
		}
		
		return arr;
	}

}
