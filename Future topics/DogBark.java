import java.util.*;

class DogBar {
	public static void main(String[] args) {
		String str = "B..B.BBB...BB";
		String[] arr = str.split("\\.");
		Set<String> resultSet = new HashSet<>(Arrays.asList(arr));
		System.out.println(resultSet);
		int cnt =0;

		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=" "||arr[i]!=""){
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}