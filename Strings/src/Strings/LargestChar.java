package Strings;

public class LargestChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(largest("hmhyrrfef"));

	}
	
	public static char largest(String s) {
		char max = Character.MIN_VALUE; 
		for(int i =0;i<s.length();i++) {
			if(s.charAt(i)>max) {
				max = s.charAt(i); 
			}
		}
		return max; 
	}

}
