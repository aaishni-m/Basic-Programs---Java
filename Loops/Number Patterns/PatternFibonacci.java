class PatternFibonacci 
{
	public static void main(String[] args) 
	{
        int a = 0, b = 1;

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(a + " ");
                int next = a + b;
                a = b;
                b = next;
            }
		}
	}
}
