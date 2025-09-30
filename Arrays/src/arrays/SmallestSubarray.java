package arrays;

public class SmallestSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,1,5,2,3,2}; 
		System.out.println(subarrayy(arr, 7)); 

	}
	
	public static int subarrayy(int[] arr,int target) {
		int left=0; 
		int sum=0; 
		int min=Integer.MAX_VALUE; 
		
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i]; 
			while(sum>=target) {
				min = Math.min(min,i-left+1);
				sum-=arr[left]; 
				left++; 
			}
		} return (min == Integer.MAX_VALUE) ? 0 : min; 
	}

}
