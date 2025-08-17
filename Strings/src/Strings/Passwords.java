package Strings;

import java.util.Arrays;

public class Passwords {
	
	static String[] dict = {"coffee", "coding","happy"};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] passwords = {"iliketoCOdE","teaMAKEsMEHappy", "abracaDabra","password","blackCoffeeISthebest"};
		System.out.println(Arrays.toString(checkPassword(passwords)));
	}
	
	public static String[] checkPassword(String[] passwords) {
		String [] ans = new String[passwords.length]; 
		boolean flag = false; 
		
		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < dict.length; j++) {
				if (passwords[i].toLowerCase().contains(dict[j].toLowerCase())) {				
					ans[i] = "Weak"; 
					flag = true; 
					
				}
			}
			if(!flag) {
				ans[i] = "Strong";
			}
			flag = false; 
		}
		return ans; 
	}

}
