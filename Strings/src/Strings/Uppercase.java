package Strings;

public class Uppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(toUpper("aaishni"));
	}
	
	public static String toUpper(String s) {
		String ans = ""; 
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)>='a' && s.charAt(i)<='z') {
				ans+=(char)(s.charAt(i)-32); 
			}
			else
				ans+=s.charAt(i); 
		}
		return ans; 
	}

}
