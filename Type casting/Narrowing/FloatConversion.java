class FloatConversion 
{
	public static void main(String[] args) 
	{
		float f = 122.0f;
		byte b = (byte) f;
		char c = (char) f;
		int i = (int) f;
		long l = (long)f;
		short s = (short)f;
		double d = (double) f;

		System.out.println(b);
		System.out.println(c);
		System.out.println(i);
		System.out.println(l);
		System.out.println(s);
		System.out.println(d);
	}
}
