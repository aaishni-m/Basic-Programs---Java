import java.util.Scanner; 

class Hockey2 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter string: ");
		String str = new Scanner(System.in).next();
		System.out.println((str.contains("0000000")||str.contains("1111111"))?("Yes"):("No"));
	}
}
