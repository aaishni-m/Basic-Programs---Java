public class XYZdriver {
    public static void main(String[] args) {
        X x1 = new Y(); 
        x1.displayX();

        X x2 = new Z(); 
        x2.displayX();

        Y y = (Y) x1;
        y.displayX();
        y.displayY();

        Z z = (Z) x2; 
        z.displayX();
        z.displayZ();

        y = (Z) x2; 
        y.displayX();
        y.displayY();
        // incompatible type error
    }
}
