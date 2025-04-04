class FormDriver
{
	public static void main(String[] args) {
		// no argument constructor
		Form f1 = new Form(); 
		f1.display(); 

		System.out.println("------------------------------------------------------");
		
		Form f2 = new Form("Aaishni",9607733033l,'F',"26/09/03");
		f2.display();
	}
}