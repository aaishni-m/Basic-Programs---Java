package Strings;

import java.util.Arrays;

public class SortChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sort("fjghjbsdja"));
	}
	
	public static String sort(String s) {
		char ch [] = s.toCharArray(); 
		for (int i = 0; i < s.length()-1; i++) {
			for (int j = 0; j < s.length()-1-i; j++) {
				if(ch[j]>ch[j+1]) {
					char temp = ch[j]; 
					ch[j]=ch[j+1]; 
					ch[j+1]=temp; 
				}
			}
		}
		return String.valueOf(ch); 
	}

}
