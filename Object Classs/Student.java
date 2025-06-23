public class Student {
    String name; 
    int id;
    String branch; 
    int age; 
    long phno; 

    public Student(){
        super(); 
    }

    public Student(String name, int id, String branch, int age, long phno){
        this.name = name; 
        this.id = id; 
        this.branch = branch; 
        this.age = age;
        this.phno = phno;
    }

    @Override
    public String toString(){
        return "Name: "+name+", id: "+id;
    }

    @Override
    public boolean equals(Object a){
        return this.id == ((Student)a).id; 
    }

    // @Override
    // public boolean equals(Object a){
    //     return this.toString() == ((Student)a).toString(); 
    // }

    @Override
    public int hashCode(){
        return name.hashCode() + id + branch.hashCode() + age + (int)phno; 
    }
}
