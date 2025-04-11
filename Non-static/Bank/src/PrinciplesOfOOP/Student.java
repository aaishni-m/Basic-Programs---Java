package PrinciplesOfOOP;

public class Student {
	private String name; 
	private String institute = "Qspiders";
	private String branch; 
	private double fees; 
	private double cgpa; 
	private double cbse; 
	private double hsc;
	private String coupon = "PROMO50"; 
	
	public Student(String name, String branch, double fees, double cgpa, double cbse, double hsc) {
		super();
		this.name = name;
		this.branch = branch;
		this.fees = fees;
		this.cgpa = cgpa;
		this.cbse = cbse;
		this.hsc = hsc;
	} 
		
	public String getName () {
		return this.name; 
	}
	
	public String getBranch()
	{
		return this.branch;
	}
	
	public double getFees() {
		return this.fees;
	}
	public void setFees(String coupon) {
		if (this.coupon == coupon) {
			this.fees = this.fees * 0.5; 
			System.out.println("Coupon code applied successfully!");
		} else {
			System.out.println("Invalid coupon code!");
		}
	}
	
	public double getCGPA() {
		return this.cgpa; 
	}
	
	public double getCBSE() {
		return this.cbse; 
	}
	
	public double getHSC() {
		return this.hsc;
	}
	
	public void display() {
		System.out.println(getName());
		System.out.println(getBranch());
		System.out.println(getFees());
		System.out.println(getCGPA());
		System.out.println(getCBSE());
		System.out.println(getHSC());
		
	}
}
