package wrapper;

public class Autowrap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Boolean b = true; //auto-boxing
		System.out.println(b);
		boolean b1 = b;  //auto-unboxing
		System.out.println(b1);
		
		Character c = 'q'; 
		
		System.out.println(b.equals(c));
	}

} 