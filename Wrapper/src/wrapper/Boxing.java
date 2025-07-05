package wrapper;

public class Boxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i = new Integer(10); //boxing
		System.out.println(i); 
		
		int ans = i.intValue(); //un-boxing
		System.out.println(i.getClass().getSimpleName());
		
		String s = "Aaishni";
		System.out.println(s.toString());
		System.out.println(s.hashCode());

	}

}
