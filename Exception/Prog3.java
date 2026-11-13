public class Prog3 {
    public static void main(String[] args) {
        // Exception handling

        System.out.println("Step 1");

        try {
            int a = 5;
            int b = 0;

            System.out.println(a / b); //illegal --> new ArithmeticException("/ by zero")
        }
        finally {
            // this alwasys runs
            System.out.println("Heyyyy");

            // cleanup code (optional)
            // resources close
            // logging
        }
//this will not run due to exception but finally will run 
        System.out.println("Step 2");
    }
}