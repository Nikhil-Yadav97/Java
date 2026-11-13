public class Demo2 {
    public static void main(String[] args) {

        Calculate c1 = (a,b) -> a + b;

        System.out.println(c1.sum(4,6));
    }

    // passing fn as parameter
    public void print(Calculate c1) {
        System.out.println();
    }
}

// must have only one fn to know lamda fn belong to that fn 
interface Calculate {
    int sum(int a, int b);
}