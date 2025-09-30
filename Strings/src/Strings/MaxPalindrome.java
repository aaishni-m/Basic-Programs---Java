package Strings;

public class MaxPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(maxPalindrome("abaabc"));

	}
	
	public static String maxPalindrome(String str) {
		String max=""; 
		String ans = ""; 
		int i=0; 
		int j=str.length()-1; // 3
		while(i<str.length()-1) { //0 < 5
			if(str.charAt(i)==str.charAt(j)) { // 0 == 4 a == b
				
					ans += str.charAt(i);
					if (i == j) { // reacghed middle
	                    if (ans.length() > max.length()) {
	                        max = ans;
	                    }
	                    ans = "";
	                    i++;
	                    j = str.length() - 1;
	                    continue;
	                }

	                i++;
	                j--;
	                continue;
	            }
			if(j<=i) { /  4 < 0 
				if (ans.length() > max.length()) {
                    max = ans;
                    i=0;
                }
                ans = "";
                j--;
            } else {
                j--;
            }
		}
		return max; 
	}
}
