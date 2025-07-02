public class StudentDriver {
    public static void main(String[] args) throws InterruptedException {
        Student s1 = new Student("Aaishni",1234,"CS",21,987654321);
        System.out.println(s1.toString());
        Student s2 = new Student("Aaishni",1234,"CS",21,987654321);
        System.out.println(s2.toString());

        System.out.println("s1.equals(s2): "+(s1.equals(s2)));

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println("s1.hashCode() == s2.hashCode(): "+(s1.hashCode() == s2.hashCode()));
        System.out.println("s1.toString() == s2.toString(): "+(s1.toString() == s2.toString()));

        String a = s1.toString(); 
        System.out.println(a);
        String b = s2.toString();
        System.out.println(b);
        Thread.sleep(1000); 
        System.out.println("s1 == s2: "+(a==b));
    }
}
