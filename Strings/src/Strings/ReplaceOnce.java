package Strings;

public class ReplaceOnce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(replace("zzishni", 'z', 'a'));

	}
	
	public static String replace(String s, char old, char naya) {
		String ans=""; 
		boolean check=false; 
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==old && !check) {
				ans+=naya; 
				check = true; 
			}
			else
				ans+=s.charAt(i); 
		}
		return ans; 
	}

}
