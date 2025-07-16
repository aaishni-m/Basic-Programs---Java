package arrays;

import java.util.Arrays;

public class SingleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {2,2,1};
		System.out.println(singleNumber(arr));
		System.out.println(singleNumber2(arr));

	}
	
	public static int singleNumber(int[] nums) {
        int[] count = new int[nums.length]; 
        for(int i=0;i<nums.length;i++){
            if(count[i]!=-1){
            	int ct=0;
                for(int j=0;j<nums.length;j++){
                    if(nums[i]==nums[j]){
                        count[j]=-1;
                        ct++; 
                    }
                    count[i]=ct;
                }
            }
        }
        int ans=0;

        for(int i=0;i<count.length;i++){
            if(count[i]==1){
                 ans=nums[i];  
            }
        } return ans;
    }
	
	public static int singleNumber2(int[] nums) {
        int size = nums.length; //3
        int res = nums[0]; //16
        for(int i = 1; i < size; i++){ // 2 - 3
        	System.out.println(res);
            res= res ^ nums[i]; // any number xor with itself is 0
        }
        return res;
    }

}
