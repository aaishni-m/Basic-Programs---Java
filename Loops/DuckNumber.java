// if first digit is not 0 and there is 0 in other position in the number it's a duck number

class DuckNumber
{
	public static void main(String[] args) {
		String num = "01023"; 

		if(num.charAt(0)!='0' && num.contains("0"))
			System.out.println("DuckNumber");
		else
			System.out.println("Not DuckNumber");
	}
}