package Strings;

import java.util.Arrays;

public class StringToByte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "0269"; 
		System.out.println(Arrays.toString(toByte(s)));

	}
	
	public static byte [] toByte(String s) {
		byte [] b = new byte[s.length()]; 
		for (int i = 0; i < b.length; i++) {
			b[i] = (byte)(s.charAt(i)-'0'); 
		}
		return b; 
	}

}
