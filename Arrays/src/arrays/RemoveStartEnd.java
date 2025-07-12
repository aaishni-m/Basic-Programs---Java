package arrays;

import java.util.Arrays;

//15 mins
public class RemoveStartEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = new int[] {10,20,30,40,50,60,70};
		                     //  0  1  2  3  4  5  6
		System.out.println(Arrays.toString(remove(2,4, arr))); // 10 20 60 70
		System.out.println(Arrays.toString(remove(1,4, arr))); // 10 60 70

	}
	
	public static int[] remove(int start, int end, int[] arr) { // 0 1 2 3 4 5 ; 2 -> 4 
		int ans [] = new int[arr.length-(end-start+1)]; // 4
		
		for (int i = 0; i < arr.length; i++) { // 6
			if(i<start) { // 6 < 2
				ans[i]=arr[i]; 
			}
			else if(i>end) { // 6 > 4
				ans[i-(end-start+1)] = arr[i]; // 6 - 3 [3] = [6]
			}
		}
		// 10 20 60 70
		//  0  1  2 3
		
		return ans; 
	}

}
