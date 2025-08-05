package Strings;

public class Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "mynameisaaishni";
		System.out.println(substring(8,14,s));
	}
	
	public static String substring(int start,int end,String s) {
		String ans ="";
		for(int i=start;i<=end;i++) {
			ans=ans+s.charAt(i);
		}
		return ans; 
	}

}
