package Strings;

public class CharToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch [] = {'a','a','i','s','h','n','i'}; 
		System.out.println(toString(ch));
	}
	
	public static String toString(char[] ch) {
		String s = ""; 
		for (int i = 0; i < ch.length; i++) {
			s=s+ch[i]; 
		}
		return s; 
	}

}
