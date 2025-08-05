package Strings;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aacbaa"; 
		System.out.println(checkPalindrome(s));

	}
	
	public static boolean checkPalindrome(String s) {
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)!=s.charAt(s.length()-1-i)) {
				return false; 
			}
		}
		return true; 
	}

}
