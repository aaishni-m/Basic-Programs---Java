public class Doctor {
    String name; 
    int exp; 
    String hospital; 

    public Doctor(){
        super(); 
    }
    public Doctor(String name, int exp, String hospital){
        this.name = name; 
        this.exp = exp; 
        this.hospital = hospital; 
    }
    public static void staticMethod(){
        System.out.println("from static method");
    }

    public void display(){
        System.out.println(name);
        System.out.println(exp);
        System.out.println(hospital);
    }
}
