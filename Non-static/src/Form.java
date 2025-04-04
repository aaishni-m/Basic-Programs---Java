// constructor overloading and constructor chaining

class Form
{
	String name; 
	long phone; 
	String email ;
	char gender; 
	String dob; 
	long tel; 
	String blood;

	Form() {

	}

	Form(String name, long phone, char gender, String dob)
	{
		this.name = name; 
		this.phone = phone; 
		this.gender = gender; 
		this.dob = dob; 
	}

	Form(String name, long phone, char gender, String dob,String email)
	{
		this(name,phone, gender, dob);
		this.email = email; 
	}

	Form(String name, String blood, char gender, String dob, long phone)
	{
		this(name, phone, gender,dob);
		this.blood = blood;
	}

	Form(String name, long phone, char gender, String dob, long tel)
	{
		this(name, phone,gender, dob);
		this.tel =tel; 
	}

	public void display()
	{
		System.out.println("name: "+name);
		System.out.println("phone: "+phone);
		System.out.println("gender: "+gender);
		System.out.println("date of birth: "+dob);
		System.out.println("tel: "+tel);
		System.out.println("email: "+email);
		System.out.println("blood group: "+blood);
	}
}