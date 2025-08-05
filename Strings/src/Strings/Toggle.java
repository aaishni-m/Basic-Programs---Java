package Strings;

public class Toggle {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println(toggle("aaISHNI"));
		}
		
		public static String toggle(String s) {
			String ans = ""; 
			for (int i = 0; i < s.length(); i++) {
				if(s.charAt(i)>='A' && s.charAt(i)<='Z') {
					ans+=toLower(s.charAt(i));
				}
				else
					ans+=toUpper(s.charAt(i));
			}
			return ans; 
		}
			
		public static char toLower(char ch) {
			ch = (char)(ch+32);
			return ch; 

		}
		public static char toUpper(char ch) {
			ch = (char)(ch-32);
			return ch; 

		}

}


