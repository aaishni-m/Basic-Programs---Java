package PrinciplesOfOOP;

public class StudentDriver {
	public static void main(String[] args) {
		Student s1 = new Student("Aaishni", "JAVA", 1000000, 9.9, 92, 85);
		s1.display();
		
		s1.setFees("PROMO50");
		s1.display();
	}
}
