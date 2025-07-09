package arrays;

public class ElementChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(checker(2,new int[] {1,2,3,4})); 

	}
	
	public static boolean checker(int num, int[] arr) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == num) {
				return true; 
			}
		}
		return false; 
	}

}
