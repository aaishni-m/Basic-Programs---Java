package PrinciplesOfOOP;

public class PenDriver {
	public static void main(String[] args) {
		Pen p1 = new Pen("Reynolds", 10, "Stick pen", "Black", 0.5, "Ink"); 
		
		p1.displayPen();
		p1.rf.displayRefill();
	}
}
