class ByteConversion 
{
	public static void main(String[] args) 
	{
		byte b = 122;
		short s = (short)b;
		char c = (char)b;
		int i = (int)b;
		long l = (long)b;
		float f = (float)b;
		double d = (double)b;

		System.out.println(s);
		System.out.println(c);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);

	}
}
