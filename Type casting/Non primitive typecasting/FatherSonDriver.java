public class FatherSonDriver {
    // Non primitive type casting : Downcasting and Upcasting

    public static void main(String[] args) {
        Father f = new Son(); // upcasting
        f.name();
        f.finance();

        Son s = (Son) f; // downcasting
        s.finance();
        s.name();

    }
}
