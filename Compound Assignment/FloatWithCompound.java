class FloatWithCompound
{
	public static void main(String[] args) 
	{
		byte b = 10;
		b += 10.0f;
		System.out.println(b);
	
		short s = 10;
		s += 10.0f;
		System.out.println(s);

		int i = 10;
		i += 10.0f;
		System.out.println(i);

		long l = 10;
		l += 10.0f;
		System.out.println(l);

		char c = 'a';
		c += 10.0f;
		System.out.println(c);

		float f = 10.0f;
		f += 10.0f;
		System.out.println(f);

		double d = 10.0;
		d += 10.0f;
		System.out.println(d);

	}
}
