package arrays;

//15mins
public class MissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(missing(new int[] {5,4,2,1}));
		System.out.println(missing(new int[] {1,2,3,5}));
		                                    //0 1 2 3 
	}
	
	public static int missing(int[] arr) {
		for(int i =0; i<arr.length-1;i++) { //1
			if(arr[i+1] - arr[i]<-1 ) { // arr[1] - arr[2] > 1 // 2 - 4 = 2
				return arr[i]-1; 
			}
			else if(arr[i+1] - arr[i]>1) {
				return arr[i]+1;
			}
		}
		
		return -1;
	}
}
