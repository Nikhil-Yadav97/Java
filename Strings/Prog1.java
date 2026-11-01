public class Prog1 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";// Literal
        // comparing ref var not values
        System.out.println(s1 == s2);

        String s3=new String("Nikhil");
        String s4=new String("Nikhil");

        System.out.println(s3==s4);
    }
}
