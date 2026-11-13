public class Prog2 {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;

        methodA(a,b);
    }

    private static void methodA(int a, int b) {
        methodB(a,b);
    }
    private static void methodB(int a, int b) {
        //print stacktrace form exception to upper parent methods
        System.out.println(a / b);
    }
}