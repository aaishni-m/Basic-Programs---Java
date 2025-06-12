class Example1 { 
    public static void main(String [] args) {
        Father f = new Son(); 
        f.finance(); 
        f.name();
    }
}

class Father {
    public void finance() {
        System.out.println("Rich");
    }

    public void name() {
        System.out.println("Criminal");
    }
}

class Son extends Father { 
    public void name() {
        System.out.println("Good boy");
    }
}