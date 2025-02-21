// if a binary number of a user given number has even number of 1's

import java.util.Scanner;

class EvilNumber
{
	public static void main(String[] args) {

		System.out.print("Enter a number: ");
		int num = new Scanner(System.in).nextInt();
		String bin ="";
		int cnt=0;

		for(int i=num;i>0;i/=2)
		{
			bin = (i%2)+bin;
		}
		System.out.println(bin);

		for(int i=0;i<bin.length();i++)
		{
			if(bin.charAt(i)=='1')
				cnt++; 
		}

		if(cnt%2==0)
			System.out.println("EvilNumber");
		else 
			System.out.println("Not EvilNumber");
	}
}