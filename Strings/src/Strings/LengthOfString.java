package Strings;

public class LengthOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		length("aaishni");
	}
	
	public static void length(String s) {
		int i = 0; //0
		int cnt=0; //0
		boolean flag=true; 
		while(flag) {
			try {
				s.charAt(i); 
				i++; 
				cnt++; 
			}
			catch(StringIndexOutOfBoundsException ref) {
				flag = false; 
				System.out.println(cnt);; 
			}
		}
	}

}
