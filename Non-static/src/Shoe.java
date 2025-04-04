public class Shoe
{
	String brand="Reebok";
	String type; 
	int price; 
	int size;
	String color;

	{
		System.out.println("Non static block start");
		display();
		if (brand.charAt(0) == 'N')
			price = 1000; 
		else
			price = 500; 
		System.out.println("Non static block end");
	}

	public Shoe(String brand, String type, int price, int size, String color)
	{
		System.out.println("Start of constructor");
		this.brand = brand;
		this.type = type;
		this.price= price;
		this.size = size; 
		this.color = color; 
		System.out.println("End of the constructor");
	}

	public void display()
	{
		System.out.println("brand: "+brand);
		System.out.println("type: "+type);
		System.out.println("price: "+price);
		System.out.println("size: "+size);
		System.out.println("color: "+color);
	}
}