public class Test2 {
    int a = 10; 
    public static void main(String[] args) {
        Test2 t1 = new Test2(); 
        Test2 t2 = new Test2(); 

        t1.a = 20; 
        System.err.println(t2.a);
    }
}
