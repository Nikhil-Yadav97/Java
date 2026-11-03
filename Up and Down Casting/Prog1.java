
public class Prog1 {
    public static void main(String[] args) {
        // Upcasting
        String s="Hello";
        Object obj=s;
        System.out.println(obj);

        //Downcasting
        Object obj2="Nikhil";

        String s2=(String)obj2;
        // String s2=obj2; gives error
        System.out.println(s2);
    }    
}
