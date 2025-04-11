package PrinciplesOfOOP;

public class Pen {
	String brand; 
	double price; 
	String type; 
	Refill rf;
	
	public Pen() {
		
	}
	
	Pen(String brand, double price, String type, String color, double size, String refillType) {
		rf = new Refill(color, size, refillType);
		this.brand = brand;
		this.price = price;
		this.type = type;
		System.out.println("Pen created!");
	} 
	
	public void displayPen() {
		System.out.println("Brand: "+brand);
		System.out.println("Pricce: "+price);
		System.out.println("Type: "+type);
	}
}
