package arrays;

public class PrefixSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,4,6,8,10};
		System.out.println(subarraySum(arr,1,3)); 
		System.out.println(subarrayPrefixSum(arr,1,3)); 

	}
	
	public static int subarraySum(int[] arr, int start, int end) {
		int sum=0; 
		for (int i = start; i <= end; i++) {
			sum+=arr[i]; 
		}
		return sum; 
	}
	
	public static int subarrayPrefixSum(int [] arr, int start, int end) {
		int [] prefix = new int[arr.length]; 
		prefix[0] = arr[0]; 
		for (int i = 1; i < arr.length; i++) {
			prefix[i] = prefix[i-1] + arr[i]; 
		}
		
		return prefix[end] - (start > 0 ? prefix[start-1] : 0); 
		
	}

}
