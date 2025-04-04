class Student
{
	String name; 
	int age;
	String coll; 
	String degree; 
	int rollno; 

	Student()
	{
		System.out.println("From no arguments constructor");
		System.out.println(this);
	}

	Student(String name, int age, String coll, String degree, int rollno)
	{
		this.name = name; 
		this.age = age; 
		this.coll = coll; 
		this.degree = degree; 
		this.rollno =rollno; 
	}

	public void display()
	{
		System.out.println("name: "+name);
		System.out.println("age: "+age);
		System.out.println("college: "+coll);
		System.out.println("degree: "+degree);
		System.out.println("roll number: "+rollno);
	}
}