class StudentDriver
{
	public static void main(String[] args) {
		Student s1 = new Student("Aaishni",21,"SPPU","BE",39);
		s1.display(); 
		System.out.println("-----------------------------------------------");
		Student s2 = new Student();
		s2.name = "avni";
		s2.age = 16; 
		s2.coll = "zeal"; 
		s2.degree = "commerce"; 
		s2.rollno = 21; 
		s2.display();
	}
}