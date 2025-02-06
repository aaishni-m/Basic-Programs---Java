class CharWithCompound
{
	public static void main(String[] args) 
	{
		byte b = 10;
		b += 'a';
		System.out.println(b);
	
		short s = 10;
		s += 'a';
		System.out.println(s);

		int i = 10;
		i += 'a';
		System.out.println(i);

		long l = 10;
		l += 'a';
		System.out.println(l);

		char c = 'a';
		c += 'a';
		System.out.println(c);

		float f = 10.0f;
		f += 'a';
		System.out.println(f);

		double d = 10.0;
		d += 'a';
		System.out.println(d);

	}
}
