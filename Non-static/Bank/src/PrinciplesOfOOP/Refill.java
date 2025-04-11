package PrinciplesOfOOP;

public class Refill {
	String color; 
	double size; 
	String refillType; 
	
	public Refill() {
		
	}
	Refill(String color, double size, String refillType){
		this.color = color; 
		this.size = size;
		this.refillType = refillType; 
		System.out.println("Refill inserted!");
	}
	
	public void displayRefill() {
		System.out.println("Color: "+color);
		System.out.println("Size: "+size);
		System.out.println("Refill Type: "+refillType);
	}
}
