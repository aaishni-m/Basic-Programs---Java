public class Neuro extends Doctor {
    String spc; 
    String organ; 
    
    public Neuro(){

    }

    public Neuro(String name, int exp, String hospital, String spc, String organ){
        super(name, exp, hospital); 
        this.spc = spc; 
        this.organ = organ; 
    }

    public void displayNeuro(){
        display();
        System.out.println(spc);
        System.out.println(organ);
    }

    public void fromNeuro(){
        staticMethod();
    }
}
