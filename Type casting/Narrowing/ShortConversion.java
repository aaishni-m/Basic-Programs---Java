class ShortConversion 
{
	public static void main(String[] args) 
	{
		short s = 122;
		byte b = (byte) s;
		char c = (char) s;
		int i = (int) s;
		long l = (long)s;
		float f = (float)s;
		double d = (double) s;

		System.out.println(b);
		System.out.println(c);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
	}
}
