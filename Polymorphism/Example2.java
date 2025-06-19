public class Example2 { 
    public static void main(String [] args) {
        A a = new B(); 
        a.demoA();
        
    }
}

class A {
    public void demoA() {
        System.out.println("From A");
    }
}

class B extends A { 
    public void demoB() {
        System.out.println("From B");
    }
} 

class C extends A { 
    public void demoC() {
        System.out.println("From C");
    }
} 


