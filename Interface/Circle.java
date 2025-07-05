public class Circle implements I1 {
    double radius; 

    Circle(){

    }

    Circle(double radius){
        this.radius = radius; 
    }

    @Override
    public double perimeter(double radius){ 
        return 2*pi*radius; 
    }

    @Override
    public double area(double radius){
        return pi*radius*radius; 
    }
}
