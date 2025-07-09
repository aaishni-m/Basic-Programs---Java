package arrays;

public class PrimeCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(primeCount(new int [] {12,3,7})); 
		System.out.println(isPrime(23));
		
	}
	
	public static int primeCount(int[] arr) {
		int count = 0;
		for(int i=0; i<arr.length;i++) {
			if(isPrime(arr[i])){
				count++; 
			}
		}
		return count; 
	}
	
	public static boolean isPrime(int num) { 
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				return false; 
			}
		}
		return true; 
	}

}
