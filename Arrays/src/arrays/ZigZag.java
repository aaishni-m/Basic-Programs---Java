package arrays;

import java.util.Arrays;

public class ZigZag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(zigzag(new int[] {1,2,3,4,5,6}, new int[] {10,20,30})));

	}
	
	public static int[] zigzag(int[] arr1, int[] arr2) { 
		int idx = arr1.length < arr2.length ? arr1.length : arr2.length; //4
		int ans[] = new int[arr1.length + arr2.length];  
		int j=2*idx;
//		System.out.println(j+" "+idx);
		for (int i = 0; i < ans.length; i++) { //4
			if(i<idx) { //4<4
				ans[2*i] = arr1[i]; // ans[2*3] = arr1[3]
				ans[(2*i)+1] = arr2[i]; // ans[2*3 + 1] = arr2[3]
			}
			else if(j<ans.length){				
				ans[j++] = arr1.length < arr2.length ? arr2[idx++] : arr1[idx++];  
			}
		}
		return ans;
	}
	
//	1 10 2 20 3 30 4 40 0 0
//	0 1  2 3  4  5 6  7 8 9

}
