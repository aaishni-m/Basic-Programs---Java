class DoubleConversion 
{
	public static void main(String[] args) 
	{
		double d = 122.0;
		byte b = (byte) d;
		char c = (char) d;
		int i = (int) d;
		long l = (long)d;
		float f = (float)d;
		short s = (short) d;

		System.out.println(b);
		System.out.println(c);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(s);
	}
}
