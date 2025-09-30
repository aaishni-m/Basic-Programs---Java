package arrays;

import java.util.Arrays;

public class DecimalRepresentation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] cnt = decimalRepresentation(102);
		System.out.println(Arrays.toString(cnt)); 
//		System.out.println(537%10); 

	}
	
	public static int[] sorting(int[] arr) {
		for(int j=0;j<=arr.length/2;j++) {
			for(int i=0;i<arr.length-1;i++) {
				if(arr[i]<arr[i+1]) {
					int temp = arr[i]; 
					arr[i]=arr[i+1]; 
					arr[i+1]=temp; 
				}
			}
		}
		
		return arr; 
	}
	
	public static int[] decimalRepresentation(int n) {
		int temp = n; 
		int cnt=0;
		int pow = 1;
		while (temp > 0) {
		    int digit = temp % 10;  
		    if (digit != 0) cnt++;
		    temp /= 10;              
		}
		int [] arr = new int[cnt]; 
		int idx=0; 
		
		while (n > 0) { 
		    int val = (n % 10) * pow;
		    if (val != 0) {
		        arr[idx++] = val;
		    }
		    pow *= 10;
		    n /= 10;
		}
		arr = sorting(arr); 
		
		return arr; 
        
    }

}
