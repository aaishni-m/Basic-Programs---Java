public class DataEngineer extends Engineer{
    int exp ;
    String masters; 
    boolean certified; 

    public DataEngineer(){

    }

    public static void method(){
        System.out.println("from static method Data Engineer");
    }

    public DataEngineer(String name, String company, String clg, int exp, String masters, boolean certified){
        super(name, company, clg); 
        this.exp = exp; 
        this.masters = masters; 
        this.certified = certified; 
    }

    public void displayDataEngineer(){
        display();
        System.out.println(exp);
        System.out.println(masters);
        System.out.println(certified);
    }
}
