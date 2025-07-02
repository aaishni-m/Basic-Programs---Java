package pack2;
import pack1.A;

public class B extends A{
	public static void main(String [] args) {
		A a = new A(); 
		B b = new B(); 
		
		//a.test(); 
		b.test();
		
		//System.out.println(a.a);
		System.out.println(b.a);
	}
}
