package Strings;

public class Contains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// System.out.println(contains("mayayo", "ayo"));
		System.out.println(contains("ssspss","sspss"));
		//                             012345

	}
	
	public static boolean contains(String s, String t) {
		int check=0; //1
		for(int i=0;i<s.length();i++) { //4
			System.out.println(i);
			if(s.charAt(i)==t.charAt(check)) { // a == y
				check++; 
			}
			else {
				if(check==t.length()) { // 2 = 3
					return true; 
				}
				else if(s.charAt(i)==t.charAt(0)) { // a == a
					// System.out.println(i);
					i--; 
					check=0; 
				}
				else {
					check=0; 
				}
			} 
			
		}
		return check==t.length(); 
	}

}
