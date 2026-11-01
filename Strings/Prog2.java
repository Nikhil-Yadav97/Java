public class Prog2 {
    public static void main(String[] args) {
        String s1 = "ja" + "va";
        // at compile time in string pool

        String s2 = "java";
        // same in string pool

        System.out.println(s1 == s2);


        String s3="Hello";
        String s4=s3+"World";//heap
        String s5="Hello World";//String pool
        
        System.out.println(s4==s5);

        String s6="Hello";
        String s7=s6;

        System.out.println(s7==s6);

        String s9="Hello";
        s9="World";

        System.out.println(s9);

        String s8="Hello";//Literal in string pool
        String s10=new String("Hello");//new in heap

        System.out.println(s8==s10);
    }
}
