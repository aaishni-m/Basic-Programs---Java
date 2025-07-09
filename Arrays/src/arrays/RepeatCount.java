package arrays;

import java.util.Iterator;

public class RepeatCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(repeatCount(1, new int [] {1,1,2}));
	}
	
	public static int repeatCount(int num, int [] arr) {
		int cnt = 0; 
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==num) {
				cnt++; 
			}
		}
		return cnt; 
	}

}
