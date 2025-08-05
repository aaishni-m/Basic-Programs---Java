package Strings;

public class Reverse {
	public static void main(String[] args) {
		String s = "aaishni"; 
		System.out.println(reverse(s));
	}
	
	public static String reverse(String s) {
		String rev = "";
		for (int i = 0; i < s.length(); i++) {
			rev=s.charAt(i)+rev;
		}
		return rev; 
	}
}
