import java.util.Scanner;

class AreaPerimeterOfRectangle 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the width of rectangle: ");
		float width = sc.nextFloat();
		System.out.print("Enter the height of rectangle: ");
		float height = sc.nextFloat();
		float area = width * height; 
		float perimeter = 2 * (width + height);
		System.out.println("Area of rectangle: "+area);
		System.out.println("Perimeter of rectangle: "+perimeter);
	}
}
