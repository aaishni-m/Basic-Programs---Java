package Strings;

import java.util.Arrays;

public class DNA {
	public static void main(String[] args) {
		String code = "000001001011101010010110011";
		RNA(code); 
	}
	
	public static void RNA(String c) {
		String ans = ""; 
		String dna = ""; 
		int start = 0; 	
		while(start<c.length()) {
			for (int i = start; i < start+3; i++) {
				ans += c.charAt(i); 
			}
			start+=3; 
			if(ans.equals("001")) {
				dna+="C"; 
			}
			if(ans.equals("010")) {
				dna+="G"; 
			}
			if(ans.equals("011")) {
				dna+="A"; 
			}
			if(ans.equals("101")) {
				dna+="T"; 
			}
			if(ans.equals("110")) {
				dna+="C"; 
			}
			ans=""; 
		}
		
		System.out.println(dna);
	}
}
