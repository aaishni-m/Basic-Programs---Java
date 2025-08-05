package Strings;

public class IndexOfFirstOcc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(returnIndex("dfhzza", 'z'));
	}
	
	public static int returnIndex(String s,char ch) {
		boolean check =false; 
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)==ch && !check) {
				check = true; 
				return i; 
			}
		}
		return -1;
	}

}
