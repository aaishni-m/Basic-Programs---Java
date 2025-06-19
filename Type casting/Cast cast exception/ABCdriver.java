public class ABCdriver {
    public static void main(String[] args) {
        System.out.println("Upcasted to A from B");
        A a = new B(); // upcast to A from B
        // System.out.println(a.var); 
        a.displayA(); 
        // we can only use members of class A. 
        System.out.println("------------------------------------------------------------");
        
        System.out.println("downcast a which was upcasted from B");
        B b = (B) a; // downcast a which was upcasted from B
        b.displayA();
        b.displayB(); 
        // System.out.println(b.var);
        // we can use members of both A and B class
        System.out.println("------------------------------------------------------------");
        
        System.out.println("downcast a which was upcasted from B to C");
        C c = (C) a; // downcast a which was upcasted from B to C
        c.displayA();
        c.displayB();
        c.displayC();
        // System.out.println(c.var);
        // class cast exception 
        System.out.println("------------------------------------------------------------");
        

        System.out.println("Downcasted A to C without upcasting");
        A a1 = new A();
        C c1 = (C) a1; 
        c1.displayA();
        c1.displayB();
        c1.displayC();
        // class cast exception
        System.out.println("------------------------------------------------------------");
    }
}
