package arrays;

import java.util.Arrays; 

public class SplitDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,3,2}; 
		System.out.println(splitArray(arr));

	}
	
	public static long splitArray(int[] nums) {
        int prefix [] = new int[nums.length]; 
        prefix[0] = nums[0]; 

        for(int i=1;i<nums.length;i++){
            prefix[i] = prefix[i-1]+nums[i]; 
        }

        long least_diff = Long.MAX_VALUE;
        System.out.println(Arrays.toString(prefix)); // 1, 4, 6

        int left = Integer.MIN_VALUE; 
        int right = Integer.MAX_VALUE;
        for(int i=0;i<prefix.length;i++){ //1
        	if ((nums[i] < left) || (nums[nums.length-1-i] > right) && left != right && nums.length-1-i>i) { // nums[1] = 3 < 1 || nums[2] = 2 > 0 
        		return -1;
        	}
        	left = nums[i]; // 1
        	right = nums[nums.length-1-i]; // 2
        	System.out.println(left + " " + right + " " + i);
            int diff = Math.abs(prefix[i] - (prefix[prefix.length-1] - prefix[i]));
            if (diff < least_diff){
                least_diff = diff; 
            }
        }
        return least_diff;
    }

}
