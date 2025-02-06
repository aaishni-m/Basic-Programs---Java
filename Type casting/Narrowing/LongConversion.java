class ShortConversion 
{
	public static void main(String[] args) 
	{
		long l = 122;
		byte b = (byte) l;
		char c = (char) l;
		int i = (int) l;
		short s = (short)l;
		float f = (float)l;
		double d = (double) l;

		System.out.println(b);
		System.out.println(c);
		System.out.println(i);
		System.out.println(s);
		System.out.println(f);
		System.out.println(d);
	}
}
