package arrays;
import java.util.*; 

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter the length for your array: "); 
		int length = sc.nextInt(); 
		int [] arr = new int[length]; 
		System.out.println("Enter elements: ");
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt(); 
		}
		System.out.println(Arrays.toString(arr)); 
		System.out.println(Arrays.toString(reverse(arr))); 
	}
	
	public static int [] reverse(int [] arr) {
		int [] rev = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			rev[i] = arr[arr.length-1-i]; 
		}
		return rev;
	}

}
