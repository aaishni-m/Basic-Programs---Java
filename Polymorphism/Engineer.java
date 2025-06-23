public class Engineer {
    String name; 
    String company; 
    String clg; 

    public Engineer(){

    }

    public Engineer(String name, String company, String clg) {
        this.name = name; 
        this.company = company; 
        this.clg = clg; 
    }

    public static void method(){
        System.out.println("from static method Engineer");
    }

    public void display(){
        System.out.println(name);
        System.out.println(company);
        System.out.println(clg);
    }
}
