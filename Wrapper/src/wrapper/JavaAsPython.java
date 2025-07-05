package wrapper;

public class JavaAsPython {
	public static void main(String [] args) {
		Object a = 10; 
		Object b = "aaishni"; 
		Object c = 10.123; 
		
		Object ans = (Integer)a + (Double)c; // performing downcasting and auto-unboxing is done implicity
		System.out.println(ans); 
		
		System.out.println(Integer.valueOf(10)); 
	}
}
