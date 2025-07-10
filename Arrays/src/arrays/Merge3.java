package arrays;

import java.util.Arrays;

public class Merge3 {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(Merge.merge(Merge2.reverse(new int[] {1,2,3,4}), Merge2.reverse(new int[] {1,2,3}))));
	}
}
